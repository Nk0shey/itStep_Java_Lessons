# Java Lessons Lab

**Java fundamentals, data structures and concurrency — 17 independent lesson modules.**

By [Nikita Kozchenko](https://github.com/Nk0shey) · Java 17 · Maven · JUnit 5

[Build](#build-and-run) · [Highlights](#highlights) · [Verification](docs/REVIEW.md)

This repository collects my IT STEP lesson exercises, from loops and strings to custom collections, streams and threads. Each dated folder is a separate Maven module, so repeated class names such as `Task01` compile independently.

## Highlights

- Custom singly linked list and binary-search-tree set: `itStep_Lesson7.5_LinkedList`.
- Bounded stack adapter: `itStep_Lesson9.1_Stack`.
- Lambdas and functional interfaces: `itStep_Lesson10.1_LambdaExpressions`, `itStep_Lesson10.2_LambdaExpressions`.
- Streams: `itStep_Lesson12_StreamAPI`.
- Threads and parallel tasks: `itStep_Lesson13.2_Threads`, `itStep_Lesson14_VersionControlSystems`.
- Earlier modules cover loops, strings, searching, methods, objects, files and exceptions.

These are academic exercises at different stages of development. For a quick code review, start with the custom collections and their regression tests.

## Build and run

Requires a JDK 17+ and Maven 3.9+. Run from the repository root:

```sh
mvn test
```

This builds all 17 modules and runs the available JUnit tests. The first build downloads Maven dependencies.

Run a linked-list demonstration after the build:

```sh
java -cp itStep_Lesson7.5_LinkedList/target/classes MyLinkedList.TestMyLinkedList
```

The example adds three elements, removes the middle and first elements, and finishes with `Size after removing first element: 1`.

Run the tree-set demonstration:

```sh
java -cp itStep_Lesson7.5_LinkedList/target/classes MyTreeSet.MyTreeSetTest
```

Build just one module, including its parent configuration:

```sh
mvn -pl itStep_Lesson7.5_LinkedList -am test
```

Most early modules use `src/`; later modules use `src/main/java/`. The module POMs configure the appropriate source directory. Open the root `pom.xml` in an IDE to import the complete collection.

## Validation and scope

Verified on Linux/OpenJDK 17: all 17 modules compile, six assertion-based collection/stack tests pass, and four selected console demonstrations complete successfully. Compilation does not establish the correctness of every exercise. File examples require their own input paths; some concurrency/network examples are deliberately larger and were not executed in this review.

The stack exposes a limited educational API; many inherited deque operations still throw `UnsupportedOperationException`. See [review notes](docs/REVIEW.md) for the tested behavior and remaining limits.

Generated classes, `target/`, `out/` and IDE files are ignored. Historic generated HTML/text data remains separate from the source modules' test coverage. Existing assignment comments and identifiers are retained; no blanket license is assigned to teaching scaffolds.
