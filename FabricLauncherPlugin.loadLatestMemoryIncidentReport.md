[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Stopp]] › [[FabricLauncherPlugin.loadLatestMemoryIncidentReport]]

# FabricLauncherPlugin.loadLatestMemoryIncidentReport

`FabricLauncherPlugin.loadLatestMemoryIncidentReport()` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:986–999](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L986-L999)

```mermaid
flowchart TD
  n1["if Z.988 (!Files.isDirectory(reports))"]
  n2["return Z.988 return;"]
  n3["try Z.989"]
  n4["catch Z.996 (IOException e)"]
  n1 -->|"ja"| n2
  n3 -->|"Fehler"| n4
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.988 (!Files.isDirectory(reports))
  Zeile 988: prüft `(!Files.isDirectory(reports))`.
return Z.988 return;
  Zeile 988: Rückgabe `return;`.
try Z.989
  Zeile 989: Versuch. Der Fehlerpfad geht in catch.
catch Z.996 (IOException e)
  Zeile 996: fängt (IOException e).
```

- `loadLatestMemoryIncidentReport` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
