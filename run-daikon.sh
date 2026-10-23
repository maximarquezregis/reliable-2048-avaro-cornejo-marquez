#!/usr/bin/env bash

set -euo pipefail

ROOT_DIR=$(cd "$(dirname "$0")" && pwd)
TRACE_DIR=${TRACE_DIR:-"$ROOT_DIR/daikon-traces-expanded"}
OUTPUT_FILE=${OUTPUT_FILE:-"$ROOT_DIR/daikon-output-expanded.txt"}
DAIKON_JAVA_OPTS=${DAIKON_JAVA_OPTS:--Xmx4g}
FUZZ_LENGTH=${FUZZ_LENGTH:-1000}

cd "$ROOT_DIR"

command -v mise >/dev/null 2>&1 || {
    echo "Error: mise no esta instalado o no esta en PATH." >&2
    exit 1
}

[ -f lib/daikon.jar ] || {
    echo "Error: no se encontro lib/daikon.jar." >&2
    exit 1
}

run_java() {
    mise exec java -- "$@"
}

echo "[1/4] Compilando tests..."
run_java mvn -q clean test-compile

echo "[2/4] Ejecutando DaikonTestTrace..."
run_java mvn -q -Dtest=DaikonTestTrace test

echo "[3/4] Generando traza de Chicory..."
rm -rf "$TRACE_DIR"
mkdir -p "$TRACE_DIR"

TEST_CLASSPATH=$(run_java mvn -q dependency:build-classpath -DincludeScope=test -DforceStdout)
run_java java -cp "lib/daikon.jar:target/classes:target/test-classes:$TEST_CLASSPATH" \
    daikon.Chicory \
    --output-dir="$TRACE_DIR" \
    --ppt-select-pattern='ar.edu.unrc.game2048.Board|ar.edu.unrc.game2048.Cell' \
    org.junit.runner.JUnitCore \
    ar.edu.unrc.game2048.DaikonTestTrace

echo "[3b/4] Agregando una partida larga generada por fuzzer.py..."
python3 -c "from fuzzer import RandomFuzzer; print(RandomFuzzer($FUZZ_LENGTH, $FUZZ_LENGTH).fuzz(), end='')" \
    | run_java java -cp "lib/daikon.jar:target/classes" \
        daikon.Chicory \
        --output-dir="$TRACE_DIR" \
        --ppt-select-pattern='ar.edu.unrc.game2048.Board|ar.edu.unrc.game2048.Cell' \
        ar.edu.unrc.game2048.MainCLI

TRACE_FILE="$TRACE_DIR/JUnitCore.dtrace.gz"
[ -f "$TRACE_FILE" ] || {
    echo "Error: Chicory no genero $TRACE_FILE." >&2
    exit 1
}

echo "[4/4] Ejecutando Daikon..."
run_java java $DAIKON_JAVA_OPTS -cp lib/daikon.jar \
    daikon.Daikon "$TRACE_DIR"/*.dtrace.gz > "$OUTPUT_FILE"

echo
echo "Listo."
echo "Traza: $TRACE_FILE"
echo "Salida: $OUTPUT_FILE"
echo
echo "Invariantes espurios encontrados en la salida:"
grep -E \
    'this\.size one of|DEFAULT_SIZE >= size\(this\.grid\[\]\)-1|WINNING_VALUE > this\.size|WINNING_VALUE != this\.score|this\.score % this\.size' \
    "$OUTPUT_FILE" || echo "Ninguno"