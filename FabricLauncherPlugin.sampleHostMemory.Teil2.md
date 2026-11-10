[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Probe]] › [[FabricLauncherPlugin.sampleHostMemory]] › [[FabricLauncherPlugin.sampleHostMemory.Teil2]]

# FabricLauncherPlugin.sampleHostMemory.Teil2

```mermaid
flowchart TD
  n1["RuntimeLimits.memory"]:::internal-link
  n2["FabricLauncherPlugin.warnOnce"]:::internal-link
  n3["if Z.1036 (use )= 0)"]
  n4["FabricLauncherPlugin.warnHeapBudget"]:::internal-link
  n1 --> n2
  n3 -->|"ja"| n4
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
RuntimeLimits.memory
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Betrifft den Speicher `memory`. Ruft `percent`.
FabricLauncherPlugin.warnOnce
  Schreibt eine Warnung nur ein einziges Mal, damit das Protokoll nicht vollläuft. Warnt `warnOnce`.
if Z.1036 (use )= 0)
  Zeile 1036: prüft `(use )= 0)`.
FabricLauncherPlugin.warnHeapBudget
  Das [[Glossar#Plugin|Plugin]] warnt vor den Programmspeicher die Grenze. Warnt `warnHeapBudget`. Ruft `parseMemoryBytes`, `notifyNtfy`.
```

> [!knoten]- Was die Blöcke tun
> - **RuntimeLimits.memory**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Betrifft den Speicher `memory`. Ruft `percent`.
> - **FabricLauncherPlugin.warnOnce**: Schreibt eine Warnung nur ein einziges Mal, damit das Protokoll nicht vollläuft. Warnt `warnOnce`.
> - **if Z.1036 (use )= 0)**: Zeile 1036: prüft `(use )= 0)`.
> - **FabricLauncherPlugin.warnHeapBudget**: Das [[Glossar#Plugin|Plugin]] warnt vor den Programmspeicher die Grenze. Warnt `warnHeapBudget`. Ruft `parseMemoryBytes`, `notifyNtfy`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `FabricLauncherPlugin.sampleHostMemory`.
