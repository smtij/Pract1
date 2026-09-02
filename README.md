# Pract1 — Jenkins CI: JUnit + SonarQube

A small Jenkins pipeline (DevOps module, Practical 1) that compiles a Java
class, runs its JUnit unit tests, and runs a SonarQube static analysis pass
— on every build.

## What's here

**The code under test** (`Dec2Hex.java`) is a small utility that converts a
decimal integer to its hexadecimal string representation.

**The tests** (`Dec2HexTest.java`, JUnit 4) assert three conversions:
15 → `F`, 26 → `1A`, and 0 → `0`.

**The pipeline** runs in Jenkins (itself running in Docker, on an AWS EC2
instance) as a Freestyle project configured to, on every build:

1. Pull the latest commit from this repository.
2. Compile `Dec2Hex.java` and `Dec2HexTest.java` with `javac`.
3. Run the JUnit tests via the JUnit Platform Console Launcher and publish
   the results as a JUnit test report.
4. Run a SonarQube scan of the source (SonarQube also running in Docker, on
   the same EC2 instance) for static analysis.

The Jenkins build steps and SonarQube scanner configuration live in
Jenkins' own project configuration (a Freestyle project, not
pipeline-as-code), which is why there's no `Jenkinsfile` in this repo —
just the Java source and the JUnit/Hamcrest libraries it's compiled and
tested against.

This is the JUnit/static-analysis half of the module's CI/CD coursework;
the companion container-orchestration half (Docker + Ansible-provisioned
Kubernetes) is a separate repository:
[Pract_2](https://github.com/smtij/Pract_2).

## Stack

Java, JUnit 4, Jenkins, Docker, SonarQube, AWS EC2.

## Files

| File | Purpose |
|---|---|
| `Dec2Hex.java` | The class under test — decimal-to-hexadecimal conversion |
| `Dec2HexTest.java` | JUnit 4 unit tests for `Dec2Hex` |
| `lib/` | JUnit 4, Hamcrest and the JUnit Platform Console Launcher, used to compile and run the tests |
