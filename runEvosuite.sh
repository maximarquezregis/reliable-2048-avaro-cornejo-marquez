#!/bin/bash
# generate_evosuite_tests.sh

set -euo pipefail

JAVA_BIN="${JAVA_BIN:-java}"
EVOSUITE_JAR="evosuite-1.0.6.jar"
EVOSUITE_URL="https://github.com/EvoSuite/evosuite/releases/download/v1.0.6/evosuite-1.0.6.jar"

BASE_PACKAGE="ar.edu.unrc.game2048"
OUTPUT_PACKAGE="evosuiteTests"
OUTPUT_DIR="src/test/java/${OUTPUT_PACKAGE}"
TMP_ROOT="target/evosuite-generated"

SEARCH_BUDGET="${SEARCH_BUDGET:-180}"
SEED="${SEED:-42}"
MAX_SIZE="${MAX_SIZE:-200}"
BOARD_MAX_INT="${BOARD_MAX_INT:-10}"
BOARD_MAX_DELTA="${BOARD_MAX_DELTA:-3}"
CELL_MAX_INT="${CELL_MAX_INT:-2048}"
CELL_MAX_DELTA="${CELL_MAX_DELTA:-20}"
PARALLEL="${PARALLEL:-true}"

CRITERION="LINE:BRANCH:EXCEPTION:WEAKMUTATION:OUTPUT:INPUT:METHOD:METHODNOEXCEPTION:CBRANCH"

# Resolve target classes (default: both Board and Cell, excluding interactive MainCLI)
if [ "$#" -eq 0 ]; then
    TARGETS=("${BASE_PACKAGE}.Board" "${BASE_PACKAGE}.Cell")
else
    TARGETS=()
    for arg in "$@"; do
        if [[ "$arg" == *.* ]]; then
            TARGETS+=("$arg")
        else
            TARGETS+=("${BASE_PACKAGE}.${arg}")
        fi
    done
fi

# Warn early if Java is not JDK 8 (EvoSuite 1.0.6 requires JDK 8 / tools.jar)
if ! "$JAVA_BIN" -version 2>&1 | grep -q 'version "1\.8\.'; then
    echo "WARNING: EvoSuite 1.0.6 requires JDK 8 (with tools.jar). Current $JAVA_BIN:" >&2
    "$JAVA_BIN" -version 2>&1 | head -n 1 >&2
    echo "Set JAVA_BIN=/path/to/jdk8/bin/java if generation fails." >&2
fi

# Download EvoSuite if not present
if [ ! -f "$EVOSUITE_JAR" ]; then
    echo "Downloading EvoSuite..."
    wget -O "$EVOSUITE_JAR" "$EVOSUITE_URL" || curl -L -o "$EVOSUITE_JAR" "$EVOSUITE_URL"
fi

# Build project first
mvn clean compile

CLASS_PATH="$(pwd)/target/classes"
rm -rf "$TMP_ROOT"
mkdir -p "$TMP_ROOT" "$OUTPUT_DIR"

generate_for_class() {
    local fqcn="$1"
    local short_name="${fqcn##*.}"
    local tmp_dir="${TMP_ROOT}/${short_name}"
    local report_dir="evosuite-report/${short_name}"
    local max_int="$CELL_MAX_INT"
    local max_delta="$CELL_MAX_DELTA"
    local restrict_pool="false"

    # Cap random/pooled integers and mutation delta for Board to avoid giant matrices (OOM / timeouts / loop-limit aborts)
    if [ "$short_name" = "Board" ]; then
        max_int="$BOARD_MAX_INT"
        max_delta="$BOARD_MAX_DELTA"
        restrict_pool="true"
    fi

    mkdir -p "$tmp_dir" "$report_dir"
    echo "[${short_name}] Generating EvoSuite tests (budget=${SEARCH_BUDGET}s, max_int=${max_int}, max_delta=${max_delta}, restrict_pool=${restrict_pool}, seed=${SEED})..."

    "$JAVA_BIN" -jar "$EVOSUITE_JAR" \
        -generateMOSuite \
        -projectCP "$CLASS_PATH" \
        -class "$fqcn" \
        -seed "$SEED" \
        -Dtest_dir="$tmp_dir" \
        -Dreport_dir="$report_dir" \
        -Dalgorithm=MOSA \
        -Dcriterion="$CRITERION" \
        -Dsearch_budget="$SEARCH_BUDGET" \
        -Dmax_size="$MAX_SIZE" \
        -Dmax_int="$max_int" \
        -Dmax_delta="$max_delta" \
        -Drestrict_pool="$restrict_pool" \
        -Dreplace_calls=true \
        -Dfilter_assertions=true \
        -Djunit_check=true \
        -Djunit_check_on_separate_process=true \
        -Dminimize=true \
        -Dminimize_values=false \
        -Dminimization_timeout=120 \
        -Dassertion_timeout=120 \
        -Djunit_check_timeout=120
}

install_generated_tests() {
    local fqcn="$1"
    local short_name="${fqcn##*.}"
    local pkg_path="${fqcn%.*}"
    pkg_path="${pkg_path//.//}"
    local src_dir="${TMP_ROOT}/${short_name}/${pkg_path}"

    local test_file="${src_dir}/${short_name}_ESTest.java"
    local scaffolding_file="${src_dir}/${short_name}_ESTest_scaffolding.java"

    if [ ! -f "$test_file" ] || [ ! -f "$scaffolding_file" ]; then
        echo "ERROR: Expected EvoSuite output not found in ${src_dir}" >&2
        return 1
    fi

    # Rewrite package to OUTPUT_PACKAGE and import BASE_PACKAGE classes in the test file
    awk -v src_pkg="package ${BASE_PACKAGE};" -v dst_pkg="package ${OUTPUT_PACKAGE};" -v imp="import ${BASE_PACKAGE}.*;" '
        $0 == src_pkg { print dst_pkg; print ""; print imp; next }
        { print }
    ' "$test_file" > "${OUTPUT_DIR}/${short_name}_ESTest.java"

    awk -v src_pkg="package ${BASE_PACKAGE};" -v dst_pkg="package ${OUTPUT_PACKAGE};" '
        $0 == src_pkg { print dst_pkg; next }
        { print }
    ' "$scaffolding_file" > "${OUTPUT_DIR}/${short_name}_ESTest_scaffolding.java"

    echo "[${short_name}] Installed tests into ${OUTPUT_DIR}/"
}

# Run generation (parallel by default when targeting multiple classes)
PIDS=()
if [ "$PARALLEL" = "true" ] && [ "${#TARGETS[@]}" -gt 1 ]; then
    for fqcn in "${TARGETS[@]}"; do
        generate_for_class "$fqcn" &
        PIDS+=("$!")
    done

    FAILED=0
    for pid in "${PIDS[@]}"; do
        if ! wait "$pid"; then
            FAILED=1
        fi
    done
    if [ "$FAILED" -ne 0 ]; then
        echo "ERROR: One or more EvoSuite generation jobs failed." >&2
        exit 1
    fi
else
    for fqcn in "${TARGETS[@]}"; do
        generate_for_class "$fqcn"
    done
fi

# Move generated suites into src/test/java/evosuiteTests/
for fqcn in "${TARGETS[@]}"; do
    install_generated_tests "$fqcn"
done

# Run only the generated EvoSuite test suite
mvn test -Dtest="${OUTPUT_PACKAGE}.*_ESTest"
