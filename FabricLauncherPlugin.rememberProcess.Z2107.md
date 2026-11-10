[[00 Start]] › [[Child-Prozess]] › [[Startablauf]] › [[FabricLauncherPlugin.rememberProcess]] › [[FabricLauncherPlugin.rememberProcess.Z2107]]

# FabricLauncherPlugin.rememberProcess.Z2107

```mermaid
flowchart TD
  n1["try Z.2107"]
  n2["ChildProcessRecord.write"]:::internal-link
  n3["FabricLauncherPlugin.processRecord"]:::internal-link
  n4["ServerProfile.directory"]:::internal-link
  n5["FabricLauncherPlugin.javaBin"]:::internal-link
  n6["catch Z.2112 (IOException e)"]
  n2 -->|"Z.2108"| n3
  n3 -->|"Z.2110"| n4
  n4 -->|"Z.2111"| n5
  n1 --> n2
  n1 -->|"Fehler"| n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.2107
  Zeile 2107: Versuch. Der Fehlerpfad geht in catch.
ChildProcessRecord.write
  Schreibt `write`. Ruft `safe`.
FabricLauncherPlugin.processRecord
  `processRecord` in `FabricLauncherPlugin.java`.
ServerProfile.directory
  `directory` in `ServerProfile.java`.
FabricLauncherPlugin.javaBin
  Liefert das Java-Binary `javaBin`. Ruft `isWindows`.
catch Z.2112 (IOException e)
  Zeile 2112: fängt (IOException e).
```

- Fortsetzung von `FabricLauncherPlugin.rememberProcess`, Quellreihenfolge.
