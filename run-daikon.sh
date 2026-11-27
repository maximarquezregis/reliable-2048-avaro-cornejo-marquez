#!/usr/bin/env bash
# Collects expanded Chicory traces (DaikonTestTrace + multiple fuzzed CLI games)
# and runs Daikon invariant inference on Board and Cell.

set -euo pipefail

ROOT_DIR=$(cd "$(dirname "$0")" && pwd)
TRACE_DIR=${TRACE_DIR:-"$ROOT_DIR/daikon-traces-expanded"}
OUTPUT_FILE=${OUTPUT_FILE:-"$ROOT_DIR/daikon-output-expanded.txt"}
DAIKON_JAVA_OPTS=${DAIKON_JAVA_OPTS:--Xmx4g}
FUZZ_LENGTH=${FUZZ_LENGTH:-1000}
FUZZ_TRIALS=${FUZZ_TRIALS:-12}
PPT_PATTERN='^ar\.edu\.unrc\.game2048\.(Board|Cell)'

cd "$ROOT_DIR"

[ -f lib/daikon.jar ] || {
    echo "Error: lib/daikon.jar not found." >&2
    exit 1
}

# Use mise-managed Java if available, otherwise fall back to PATH
if command -v mise >/dev/null 2>&1; then
    run_java() {
        mise exec java -- "$@"
    }
else
    run_java() {
        "$@"
    }
fi

echo "[1/4] Compiling project and tests..."
run_java mvn -q clean test-compile

echo "[2/4] Verifying DaikonTestTrace..."
run_java mvn -q -Dtest=DaikonTestTrace test

echo "[3/4] Collecting JUnit trace with Chicory (DaikonTestTrace)..."
rm -rf "$TRACE_DIR"
mkdir -p "$TRACE_DIR"

TEST_CLASSPATH=$(run_java mvn -q dependency:build-classpath -DincludeScope=test -DforceStdout)
run_java java -cp "lib/daikon.jar:target/classes:target/test-classes:$TEST_CLASSPATH" \
    daikon.Chicory \
    --output-dir="$TRACE_DIR" \
    --dtrace-file="JUnitCore.dtrace.gz" \
    --ppt-select-pattern="$PPT_PATTERN" \
    org.junit.runner.JUnitCore \
    ar.edu.unrc.game2048.DaikonTestTrace

echo "[3b/4] Collecting $FUZZ_TRIALS long fuzzed CLI games across different board sizes..."
# Alternate between default 4x4 and explicit 4x4, 5x5, and 6x6 initial boards
INITIAL_BOARDS=(
    ""
    "[2,0,0,0,0,4,0,0,0,0,8,0,0,0,0,16] 4"
    "[2,0,0,0,0,0,4,0,0,0,0,0,8,0,0,0,0,0,16,0,0,0,0,0,32] 5"
    "[2,0,0,0,0,0,0,4,0,0,0,0,0,0,8,0,0,0,0,0,0,16,0,0,0,0,0,0,32,0,0,0,0,0,0,64] 6"
)

for i in $(seq 1 "$FUZZ_TRIALS"); do
    idx=$(( (i - 1) % ${#INITIAL_BOARDS[@]} ))
    board_args=${INITIAL_BOARDS[$idx]}

    # Save each run to a distinct dtrace file so Chicory does not overwrite previous games
    # shellcheck disable=SC2086
    python3 -c "from fuzzer import RandomFuzzer; print(RandomFuzzer($FUZZ_LENGTH, $FUZZ_LENGTH).fuzz(), end='')" \
        | run_java java -cp "lib/daikon.jar:target/classes" \
            daikon.Chicory \
            --output-dir="$TRACE_DIR" \
            --dtrace-file="MainCLI-${i}.dtrace.gz" \
            --ppt-select-pattern="$PPT_PATTERN" \
            ar.edu.unrc.game2048.MainCLI $board_args >/dev/null
done

TRACE_FILE="$TRACE_DIR/JUnitCore.dtrace.gz"
[ -f "$TRACE_FILE" ] || {
    echo "Error: Chicory did not generate $TRACE_FILE." >&2
    exit 1
}

echo "[4/4] Running Daikon across $(ls -1 "$TRACE_DIR"/*.dtrace.gz | wc -l | tr -d ' ') trace files..."
run_java java $DAIKON_JAVA_OPTS -cp lib/daikon.jar \
    daikon.Daikon "$TRACE_DIR"/*.dtrace.gz > "$OUTPUT_FILE"

echo
echo "Done."
echo "Traces: $TRACE_DIR/*.dtrace.gz"
echo "Output: $OUTPUT_FILE"
echo
echo "Inferred object invariants (Board:::OBJECT and Cell:::OBJECT):"
awk '
    /^ar\.edu\.unrc\.game2048\.(Board|Cell):::OBJECT$/ { printing=1; print "==========================================================================="; print; next }
    /^===========================================================================$/ && printing { printing=0 }
    printing { print }
' "$OUTPUT_FILE"
echo
echo "Spurious invariants found in Board:::OBJECT:"
awk '
    /^ar\.edu\.unrc\.game2048\.Board:::OBJECT$/ { in_obj=1; next }
    /^===========================================================================$/ && in_obj { in_obj=0 }
    in_obj { print }
' "$OUTPUT_FILE" | grep -E \
    'this\.size one of|DEFAULT_SIZE <= this\.size|DEFAULT_SIZE >= size\(this\.grid\[\]\)-1|WINNING_VALUE > this\.size|WINNING_VALUE != this\.score|WINNING_VALUE >= this\.score|this\.score % this\.size' \
    || echo "None"
