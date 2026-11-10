[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[Host-Minimieren.Teil1]] › [[FabricLauncherPlugin.restoreHostHeap]]

# FabricLauncherPlugin.restoreHostHeap

`FabricLauncherPlugin.restoreHostHeap(String encoded)` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:2206–2220](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L2206-L2220)

```mermaid
flowchart TD
  n1["if Z.2207 (encoded == null // encoded.isBlank())"]
  n2["return Z.2207 return;"]
  n3["HostHeapTune.hotspot"]:::internal-link
  n4["FabricLauncherPlugin.restoreHostHeap.Z2209"]:::internal-link
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `restoreHostHeap` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
