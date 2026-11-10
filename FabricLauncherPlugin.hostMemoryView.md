[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Probe]] › [[FabricLauncherPlugin.hostMemoryView]]

# FabricLauncherPlugin.hostMemoryView

`FabricLauncherPlugin.hostMemoryView()` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:911–918](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L911-L918)

```mermaid
flowchart TD
  n1["HostMemoryProbe.Snapshot.view"]:::internal-link
  n2["HostMemoryProbe.Snapshot.cgroupUsePercent"]:::internal-link
  n3["MemoryProtectionPolicy.emergencyStopStarted"]:::internal-link
  n4["return Z.917 return view;"]
  n1 --> n2
  n2 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `hostMemoryView` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
