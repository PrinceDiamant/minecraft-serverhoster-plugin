[[00 Start]] › [[Tests]] › [[LifecycleRobustnessTest]] › [[LifecycleRobustnessTest.Teil2]] › [[LifecycleRobustnessTest.invalidMemoryThresholdDisablesAutoStopWithoutRewritingHeap]] › [[LifecycleRobustnessTest.invalidMemoryThresholdDisablesAutoStopWithoutRewritingHeap.Teil2]]

# LifecycleRobustnessTest.invalidMemoryThresholdDisablesAutoStopWithoutRewritingHeap.Teil2

```mermaid
flowchart TD
  n1["RuntimeLimits.boundedSeconds"]:::internal-link
  n2["RuntimeLimits.boundedSeconds"]:::internal-link
  n3["Schritt Z.222 String config = Files.readString(Path.of('src/mai…"]
  n1 --> n2
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
RuntimeLimits.boundedSeconds
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Begrenzt `boundedSeconds`.
Schritt Z.222 String config = Files.readString(Path.of('src/mai…
  Zeile 222: liest Text aus einer Datei. `String config = Files.readString(Path.of('src/mai…`
```

> [!knoten]- Was die Blöcke tun
> - **RuntimeLimits.boundedSeconds**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Begrenzt `boundedSeconds`.
> - **Schritt Z.222 String config = Files.readString(Path.of('src/mai…**: Zeile 222: liest Text aus einer Datei. `String config = Files.readString(Path.of('src/mai…`

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `LifecycleRobustnessTest.invalidMemoryThresholdDisablesAutoStopWithoutRewritingHeap`.
