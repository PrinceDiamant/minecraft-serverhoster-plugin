[[00 Start]] › [[Tests]] › [[LifecycleRobustnessTest]] › [[LifecycleRobustnessTest.Teil2]] › [[LifecycleRobustnessTest.telemetryKeepsHeapRssHostAndCgroupDistinctAndRotates]] › [[LifecycleRobustnessTest.telemetryKeepsHeapRssHostAndCgroupDistinctAndRotates.Teil1]]

# LifecycleRobustnessTest.telemetryKeepsHeapRssHostAndCgroupDistinctAndRotates.Teil1

```mermaid
flowchart TD
  n1["MemoryTelemetry.line"]:::internal-link
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
MemoryTelemetry.line
  Die Messung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `line` in `MemoryTelemetry.java`. Ruft `usedMiB`, `committedMiB`, `maxMiB`.
```

> [!knoten]- Was die Blöcke tun
> - **MemoryTelemetry.line**: Die Messung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `line` in `MemoryTelemetry.java`. Ruft `usedMiB`, `committedMiB`, `maxMiB`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `LifecycleRobustnessTest.telemetryKeepsHeapRssHostAndCgroupDistinctAndRotates`.
