[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Probe]] › [[FabricLauncherPlugin.warnHeapBudget]] › [[FabricLauncherPlugin.warnHeapBudget.Z1070.Teil2]]

# FabricLauncherPlugin.warnHeapBudget.Z1070.Teil2

```mermaid
flowchart TD
  n1["if Z.1088 (childXms ) 2L * 1024 * 1024 * 1024 && memoryBudg…"]
  n2["FabricLauncherPlugin.notifyNtfy"]:::internal-link
  n3["if Z.1094 (childXmx ) Long.MAX_VALUE - outerXmx)"]
  n4["if Z.1095 (childXmx + outerXmx ) cgroupLimit && memoryBudge…"]
  n5["FabricLauncherPlugin.notifyNtfy"]:::internal-link
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n4 -->|"ja"| n5
  n3 --> n4
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.1088 (childXms ) 2L * 1024 * 1024 * 1024 && memoryBudg…
  Zeile 1088: prüft `(childXms ) 2L * 1024 * 1024 * 1024 && memoryBudg…`.
FabricLauncherPlugin.notifyNtfy
  Meldet `notifyNtfy`. Ruft `ntfySettings`, `backupCredentials`, `send`.
if Z.1094 (childXmx ) Long.MAX_VALUE - outerXmx)
  Zeile 1094: prüft `(childXmx ) Long.MAX_VALUE - outerXmx)`.
if Z.1095 (childXmx + outerXmx ) cgroupLimit && memoryBudge…
  Zeile 1095: prüft `(childXmx + outerXmx ) cgroupLimit && memoryBudge…`.
```

- Fortsetzung von `FabricLauncherPlugin.warnHeapBudget.Z1070`, Quellreihenfolge.
