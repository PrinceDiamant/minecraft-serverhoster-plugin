[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Probe]] › [[FabricLauncherPlugin.sampleHostMemory]]

# FabricLauncherPlugin.sampleHostMemory

`FabricLauncherPlugin.sampleHostMemory()` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:1005–1065](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L1005-L1065)

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.sampleHostMemory.Teil1"]:::internal-link
  n2["FabricLauncherPlugin.sampleHostMemory.Teil2"]:::internal-link
  n3["FabricLauncherPlugin.sampleHostMemory.Teil3"]:::internal-link
  n4["FabricLauncherPlugin.sampleHostMemory.Teil4"]:::internal-link
  n1 -->|"weiter"| n2
  n2 -->|"weiter"| n3
  n3 -->|"weiter"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.sampleHostMemory.Teil1
  Abschnitt 1 dieses Ablaufs, in Quellreihenfolge.
FabricLauncherPlugin.sampleHostMemory.Teil2
  Abschnitt 2 dieses Ablaufs, in Quellreihenfolge.
FabricLauncherPlugin.sampleHostMemory.Teil3
  Abschnitt 3 dieses Ablaufs, in Quellreihenfolge.
FabricLauncherPlugin.sampleHostMemory.Teil4
  Abschnitt 4 dieses Ablaufs, in Quellreihenfolge.
```

```mermaid
sequenceDiagram
  participant Mem as ServerhosterPlugin-Memory
  Mem->>Mem: Intervall max(15, sampleIntervalSeconds) s
  Note over Mem: Warnung hoechstens alle 300000 ms, Z.1037
  Note over Mem: recoveryCooldownSeconds Standard 180 s, Z.1046
  Mem->>Mem: warningDelaySeconds Standard 15 s, mindestens 5, Z.1166
```

- Ein Sample auf `ServerhosterPlugin-Memory`.
- Befund: Altlast, sicher. Z.1030–1031 liest memoryProtection.autoShutdown als Fallback
