[[00 Start]] › [[Plugin-Kern]] › [[Fokus]] › [[FabricLauncherPlugin.workDir()]]

# FabricLauncherPlugin.workDir()

`FabricLauncherPlugin.workDir()` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:859–859](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L859-L859)

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.profile"]:::internal-link
  n2["ServerProfile.directory"]:::internal-link
  n3["return Z.859 return profile(focus).directory();"]
  n1 -->|"Z.859"| n2
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.profile
  `profile` in `FabricLauncherPlugin.java`.
ServerProfile.directory
  `directory` in `ServerProfile.java`.
return Z.859 return profile(focus).directory();
  Zeile 859: Rückgabe `return profile(focus).directory();`.
```

- `workDir` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
- Befund: toter Code, wahrscheinlich. src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:859–859 kein Produktionsaufruf im Aufrufgraph
