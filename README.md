## Static Import Checker

[![DUB](https://img.shields.io/dub/l/vibe-d.svg)]()

Example code on a custom checkstyle rule checking non-static Mockito imports. This check brings consistency in terms of static imports.

Try to run a checkstyle task.
```bash
$ ./gradlew checkstyle
Parallel execution with configuration on demand is an incubating feature.

> Task :app:checkstyle FAILED
[ant:checkstyle] [ERROR] ExampleUnitTest.java:16: Use static imports of Mockito for better readability. [UseStaticImports]
[ant:checkstyle] [ERROR] ExampleUnitTest.java:21: Use static imports of Mockito for better readability. [UseStaticImports]

FAILURE: Build failed with an exception.
...
