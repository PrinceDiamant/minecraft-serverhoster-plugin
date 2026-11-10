[[00 Start]] › [[Plugin-Kern]] › [[Diagnose]] › [[FabricLauncherPlugin.crashText]]

# FabricLauncherPlugin.crashText

`FabricLauncherPlugin.crashText(String id, String file)` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:857–857](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L857-L857)

```mermaid
flowchart TD
  n1["CrashIndex.read"]:::internal-link
  n2["FabricLauncherPlugin.profile"]:::internal-link
  n3["ServerProfile.directory"]:::internal-link
  n4["return Z.857 return CrashIndex.read(profile(id).dire…"]
  n1 -->|"Z.857"| n2
  n2 -->|"Z.857"| n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
CrashIndex.read
  Liest `read`. Ruft `open`, `resolve`, `query`.
FabricLauncherPlugin.profile
  `profile` in `FabricLauncherPlugin.java`.
ServerProfile.directory
  `directory` in `ServerProfile.java`.
return Z.857 return CrashIndex.read(profile(id).dire…
  Zeile 857: Rückgabe `return CrashIndex.read(profile(id).dire…`.
```

- `crashText` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
