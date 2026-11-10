[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[Host-Minimieren.Teil1]] › [[FabricLauncherPlugin.writeHostMinimizeState]]

# FabricLauncherPlugin.writeHostMinimizeState

`FabricLauncherPlugin.writeHostMinimizeState(String status, String lobbyName, String backup, boolean restartRequired, String heapPrevious)` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:2189–2194](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L2189-L2194)

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.hostMinimizeStateFile"]:::internal-link
  n2["if Z.2192 (Files.isSymbolicLink(file))"]
  n3["throw Z.2192 throw new SecurityException('host minimization st…"]
  n4["HostMinimize.stateText"]:::internal-link
  n2 -->|"ja"| n3
  n1 --> n2
  n3 --> n4
  n2 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.hostMinimizeStateFile
  Betrifft den Host `hostMinimizeStateFile`.
if Z.2192 (Files.isSymbolicLink(file))
  Zeile 2192: prüft `(Files.isSymbolicLink(file))`.
throw Z.2192 throw new SecurityException('host minimization st…
  Zeile 2192: Abbruch `throw new SecurityException('host minimization st…`.
HostMinimize.stateText
  Liefert den Zustand `stateText`.
```

- `writeHostMinimizeState` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
