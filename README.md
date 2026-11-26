# Java Fundamentals

A collection of Java programming practice examples covering console applications, methods, arrays, collections, file processing, and object-oriented design. Collaborative examples retain co-author attribution; this collection does not assert exclusive authorship.

## Topics

| Directory | Examples |
| --- | --- |
| `basics/` | Arithmetic, unit conversions, payroll, strings, and alternative versions |
| `conditionals/` | Input validation, branching, loan eligibility, divisibility |
| `loops/` | Iteration, sentinel values, nested loops, numerical tables |
| `methods/` | Method calls, return values, arithmetic and volume calculations |
| `arrays/` | One- and two-dimensional arrays, matrix statistics, medal totals |
| `collections/` | ArrayList operations and reversal |
| `file-processing/` | Integer and text file processing, music catalog, original sample data and example output |
| `object-oriented/` | Tally counter, car and rectangle classes and demos |
| `mixed-examples/` | Coin values, geometry and string operations |
| `applications/pizza-order/` | Two versions of a collaborative ordering application, including a Swing input dialog in the later version |

## Compile and run

Use a JDK with `javac` and `java` on PATH. Compile individual examples separately, because alternative versions intentionally retain the same class names.

```sh
javac -d build basics/HourConverter.java
java -cp build HourConverter
```

For related classes, compile the group together:

```sh
javac -d build object-oriented/car/*.java
java -cp build CarDemo
```

File processing examples use relative paths. Run them with `file-processing/` as the working directory so sample files can be found. Generated output is ignored by Git; historical sample output is under `example-output/`. The pizza application may need a graphical desktop for Swing dialogs; demonstration discount names are placeholders rather than personal names.

## Verification and scope

Retains 73 original Java source files, including alternative versions and one empty program scaffold. Class and file names were made descriptive where needed, personal/course metadata removed, six hardcoded absolute file-path references converted to relative filenames, and pizza owner names replaced with demonstration values. Algorithms and examples were otherwise preserved. Generated IDE caches, compiled classes, and duplicate binary-directory data were omitted. No Eclipse workspace or project configuration is required; the examples can be compiled directly with a JDK.

Compilation: 69/69 independent source groups compiled with the installed JDK. Compilation does not establish correctness; interactive behavior, GUI operation, and all edge cases have not been independently tested. Obtain permission before redistributing collaborative or third-party material.
