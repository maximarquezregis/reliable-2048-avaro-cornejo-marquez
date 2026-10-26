# Cómo ejecutar Daikon

Estos son los comandos utilizados para generar las trazas y obtener los invariantes de las clases `Board` y `Cell`.

## 1. Compilar el proyecto

Desde la raíz del repositorio:

```bash
mvn clean compile
mvn test-compile
```

También se puede verificar la instalación de Daikon con:

```bash
java -cp lib/daikon.jar daikon.Daikon --version
```

## 2. Generar una traza con los tests

Primero se obtiene el classpath de las dependencias de test:

```bash
mvn dependency:build-classpath -q -DforceStdout
```

Luego se ejecuta Chicory sobre `DaikonTestTrace`, limitando la instrumentación a las clases del proyecto:

```bash
java -cp "lib/daikon.jar:target/classes:target/test-classes:$(mvn dependency:build-classpath -q -DforceStdout)" \
     daikon.Chicory \
     --output-dir=daikon-traces \
     --ppt-select-pattern="ar.edu.unrc.game2048.Board|ar.edu.unrc.game2048.Cell" \
     org.junit.runner.JUnitCore \
     ar.edu.unrc.game2048.DaikonTestTrace
```

Este comando genera archivos `.dtrace` dentro de `daikon-traces/`.

## 3. Generar una traza adicional con el fuzzer

Para obtener ejecuciones más variadas, se ejecuta el juego mediante Chicory y se le pasan movimientos generados por `fuzzer.py`:

```bash
python3 fuzzer.py | java -cp "lib/daikon.jar:target/classes" \
     daikon.Chicory \
     --output-dir=daikon-traces \
     --ppt-select-pattern="ar.edu.unrc.game2048.Board|ar.edu.unrc.game2048.Cell" \
     ar.edu.unrc.game2048.MainCLI
```

## 4. Inferir los invariantes

Con las trazas generadas, se ejecuta Daikon:

```bash
java -cp lib/daikon.jar daikon.Daikon daikon-traces/*.dtrace
```

Para guardar la salida en un archivo:

```bash
java -cp lib/daikon.jar daikon.Daikon \
     daikon-traces/*.dtrace \
     > daikon-output.txt
```

La salida contiene invariantes agrupados por punto de programa. Los puntos `OBJECT` representan invariantes de objetos, mientras que `ENTER` y `EXIT` corresponden, respectivamente, a condiciones observadas al entrar y salir de los métodos.

## 5. Guardar y mostrar los invariantes en formato Daikon

También se puede guardar el resultado en un archivo `.inv`:

```bash
java -cp lib/daikon.jar daikon.Daikon \
     --save_inv_to daikon-traces/output.inv \
     daikon-traces/*.dtrace
```

Para mostrar posteriormente los invariantes guardados:

```bash
java -cp lib/daikon.jar daikon.PrintInvariants daikon-traces/output.inv
```

## Script de ejecución

Además de ejecutar los comandos anteriores por separado, el repositorio incluye el script `run-daikon.sh`, que automatiza todo el proceso: compilación, ejecución de los tests, generación de trazas con Chicory, ejecución del fuzzer y obtención de los invariantes con Daikon.

Para ejecutarlo:

```bash
bash run-daikon.sh
```

El script guarda las trazas ampliadas en `daikon-traces-expanded/` y la salida de Daikon en `daikon-output-expanded.txt`.
