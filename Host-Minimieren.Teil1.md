[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[Host-Minimieren.Teil1]]

# Host-Minimieren.Teil1

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.hostMinimizeStateFile"]:::internal-link
  n2["FabricLauncherPlugin.readHostMinimizeState"]:::internal-link
  n3["FabricLauncherPlugin.writeHostMinimizeState"]:::internal-link
  n4["FabricLauncherPlugin.heapPrevious"]:::internal-link
  n5["FabricLauncherPlugin.restoreHostHeap"]:::internal-link
  n6["FabricLauncherPlugin.hostMinimizeView"]:::internal-link
  n7["FabricLauncherPlugin.hostMinimizeApply"]:::internal-link
  n8["FabricLauncherPlugin.hostMinimizeRollback"]:::internal-link
  n2 -->|"Z.2184"| n1
  n3 -->|"Z.2191"| n1
  n6 -->|"Z.2229"| n2
  n7 -->|"Z.2303"| n3
  n7 -->|"Z.2303"| n4
  n7 -->|"Z.2312"| n6
  n8 -->|"Z.2322"| n2
  n8 -->|"Z.2329"| n5
  n8 -->|"Z.2330"| n1
  n8 -->|"Z.2331"| n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.hostMinimizeStateFile
  Betrifft den Host `hostMinimizeStateFile`.
FabricLauncherPlugin.readHostMinimizeState
  Liest `readHostMinimizeState`. Ruft `hostMinimizeStateFile`, `readState`.
FabricLauncherPlugin.writeHostMinimizeState
  Schreibt `writeHostMinimizeState`. Ruft `hostMinimizeStateFile`, `stateText`.
FabricLauncherPlugin.heapPrevious
  Betrifft den Heap `heapPrevious`.
FabricLauncherPlugin.restoreHostHeap
  Stellt wieder her `restoreHostHeap`. Ruft `hotspot`.
FabricLauncherPlugin.hostMinimizeView
  Betrifft den Host `hostMinimizeView`. Ruft `readHostMinimizeState`, `configuredHostWorld`, `preview`.
FabricLauncherPlugin.hostMinimizeApply
  Betrifft den Host `hostMinimizeApply`. Ruft `focusSlot`, `running`, `stopBlocking`.
FabricLauncherPlugin.hostMinimizeRollback
  Betrifft den Host `hostMinimizeRollback`. Ruft `readHostMinimizeState`, `restore`, `getWorldRoot`.
```


