[[00 Start]] › [[Plugin-Kern]] › [[Properties]] › [[FabricLauncherPlugin.prepareFiles]] › [[FabricLauncherPlugin.prepareFiles.Z2531.Case2543]]

# FabricLauncherPlugin.prepareFiles.Z2531.Case2543

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.isWindows"]:::internal-link
  n2["SpigotBuilder.build"]:::internal-link
  n3["return Z.2545 return SpigotBuilder.build(upstream, ge…"]
  n2 --> n3
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.isWindows
  Prüft `isWindows`.
SpigotBuilder.build
  Baut `build`. Ruft `assertRev`, `download`, `commandExists`.
return Z.2545 return SpigotBuilder.build(upstream, ge…
  Zeile 2545: Rückgabe `return SpigotBuilder.build(upstream, ge…`.
```

- Fortsetzung von `FabricLauncherPlugin.prepareFiles.Z2531`, Quellreihenfolge.
