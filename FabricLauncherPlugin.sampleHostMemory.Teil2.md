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
  Betrifft den Speicher `memory`. Ruft `percent`.
FabricLauncherPlugin.warnOnce
  Warnt `warnOnce`.
if Z.1036 (use )= 0)
  Zeile 1036: prüft `(use )= 0)`.
FabricLauncherPlugin.warnHeapBudget
  Warnt `warnHeapBudget`. Ruft `parseMemoryBytes`, `notifyNtfy`.
```

- Fortsetzung von `FabricLauncherPlugin.sampleHostMemory`, Quellreihenfolge.
