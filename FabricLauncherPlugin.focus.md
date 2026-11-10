[[00 Start]] › [[Plugin-Kern]] › [[Fokus]] › [[FabricLauncherPlugin.focus]]

# FabricLauncherPlugin.focus

`FabricLauncherPlugin.focus(String id)` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:335–337](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L335-L337)

```mermaid
flowchart TD
  n1["if Z.336 (!focus.equals(id))"]
  n2["throw Z.336 throw new IllegalArgumentException('ServerHoster …"]
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.336 (!focus.equals(id))
  Zeile 336: prüft `(!focus.equals(id))`.
throw Z.336 throw new IllegalArgumentException('ServerHoster …
  Zeile 336: Abbruch `throw new IllegalArgumentException('ServerHoster …`.
```

- `focus` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
- Befund: toter Code, prüfen. src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:335–337 kein Produktionsaufruf im Aufrufgraph; Name kommt in UI, Config oder anderem Text vor
