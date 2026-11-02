# Repository review — 2026-11-02

## Verified

- Root Maven reactor builds all 17 lesson modules on OpenJDK 17.
- Six JUnit regression tests pass for linked-list operations, tree-set duplicate/null/root deletion behavior and bounded-stack behavior.
- Four console demonstrations were run: linked list, tree set, a stream example and a lambda example.

## Changes

Added the root README, module-independent Maven reactor and missing module POMs. Standardized source compatibility to Java 17 after checking the complete source set on that toolchain. Pinned compiler/Surefire/JUnit versions and removed floating dependency versions. Existing source-directory layouts are configured explicitly.

Fixed Stack1 size/contains/remove methods, which previously returned dummy values, and rejected nonpositive capacity. Tree-set contains(null) now agrees with its add/remove null policy. Added regression tests and ignored generated outputs. Removed already-tracked compiled out/target artifacts from the current tree; Git history retains prior versions.

## Limits

The stack remains a restricted teaching adapter, not a complete Deque implementation. Most older exercises have no business-rule tests. Network downloads, benchmark-sized jobs, arbitrary file inputs and every interactive path were not exercised. The large historical generated text/HTML examples were not regenerated. Compiler success and selected test cases do not imply every exercise is correct.
