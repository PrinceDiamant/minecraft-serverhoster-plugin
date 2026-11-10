[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Aufraeumen]] › [[FabricLauncherPlugin.legacyDataToPreserve]]

# FabricLauncherPlugin.legacyDataToPreserve

`FabricLauncherPlugin.legacyDataToPreserve(Path oldData)` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:425–441](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L425-L441)

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.addLegacyDataToPreserve"]:::internal-link
  n2["FabricLauncherPlugin.addLegacyDataToPreserve"]:::internal-link
  n3["FabricLauncherPlugin.addLegacyDataToPreserve"]:::internal-link
  n4["Schritt Z.432 String configuredBackup = getConfig().getString('…"]
  n5["FabricLauncherPlugin.legacyDataToPreserve.Z433"]:::internal-link
  n6["return Z.440 return Set.copyOf(preserved);"]
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `legacyDataToPreserve` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
