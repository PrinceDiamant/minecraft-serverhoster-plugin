[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Probe]] › [[FabricLauncherPlugin.sampleHostMemory]] › [[FabricLauncherPlugin.sampleHostMemory.Teil1]]

# FabricLauncherPlugin.sampleHostMemory.Teil1

```mermaid
flowchart TD
  n1["HostMemoryProbe.snapshot()"]:::internal-link
  n2["FabricLauncherPlugin.sampleHostMemory.Teil1.Z1008"]:::internal-link
  n3["sync Z.1019"]
  n4["while Z.1022 (memoryHistory.size() ) 240)"]
  n5["HostMemoryProbe.Snapshot.cgroupUsePercent"]:::internal-link
  n1 --> n2
  n3 --> n4
  n2 --> n3
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
HostMemoryProbe.snapshot()
  `snapshot` in `HostMemoryProbe.java`. Ruft `snapshot`.
FabricLauncherPlugin.sampleHostMemory.Teil1.Z1008
  Fortsetzung des Ablaufs ab Zeile 1008.
sync Z.1019
  Zeile 1019: synchronisierter Block.
while Z.1022 (memoryHistory.size() ) 240)
  Zeile 1022: Schleife `(memoryHistory.size() ) 240)`.
HostMemoryProbe.Snapshot.cgroupUsePercent
  `cgroupUsePercent` in `HostMemoryProbe.java`.
```

- Fortsetzung von `FabricLauncherPlugin.sampleHostMemory`, Quellreihenfolge.
