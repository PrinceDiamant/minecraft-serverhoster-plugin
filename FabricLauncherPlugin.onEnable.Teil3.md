[[00 Start]] › [[Plugin-Kern]] › [[Lebenszyklus]] › [[FabricLauncherPlugin.onEnable]] › [[FabricLauncherPlugin.onEnable.Teil3]]

# FabricLauncherPlugin.onEnable.Teil3

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.recoverPendingSetupDirectories"]:::internal-link
  n2["FabricLauncherPlugin.loadMemoryRecoveryState"]:::internal-link
  n3["FabricLauncherPlugin.loadLatestMemoryIncidentReport"]:::internal-link
  n4["FabricLauncherPlugin.sampleHostMemory"]:::internal-link
  n5["FabricLauncherPlugin.onEnable.Teil3.Z128"]:::internal-link
  n6["RuntimeLimits.boundedSeconds"]:::internal-link
  n7["FabricLauncherPlugin.onEnable.Teil3.Z136"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n4 fill:#f88,stroke:#900
```

```knoten
FabricLauncherPlugin.recoverPendingSetupDirectories
  Hebt hängende Zustände auf `recoverPendingSetupDirectories`. Ruft `recover`, `getWorldRoot`, `cleanupLegacyDirectory`.
FabricLauncherPlugin.loadMemoryRecoveryState
  Lädt `loadMemoryRecoveryState`. Ruft `memoryRecoveryFile`.
FabricLauncherPlugin.loadLatestMemoryIncidentReport
  Lädt `loadLatestMemoryIncidentReport`.
FabricLauncherPlugin.sampleHostMemory
  Ein Sample auf `ServerhosterPlugin-Memory`. Befund: Altlast (sicher).
FabricLauncherPlugin.onEnable.Teil3.Z128
  Fortsetzung des Ablaufs ab Zeile 128.
RuntimeLimits.boundedSeconds
  Begrenzt `boundedSeconds`.
FabricLauncherPlugin.onEnable.Teil3.Z136
  Fortsetzung des Ablaufs ab Zeile 136.
```

- Fortsetzung von `FabricLauncherPlugin.onEnable`, Quellreihenfolge.
