[[00 Start]] › [[Child-Prozess]] › [[Startablauf]] › [[FabricLauncherPlugin.abandonFailedStart]] › [[FabricLauncherPlugin.abandonFailedStart.Teil2]]

# FabricLauncherPlugin.abandonFailedStart.Teil2

```mermaid
flowchart TD
  n1["try Z.2140"]
  n2["ChildProcessRecord.deleteIfMatch"]:::internal-link
  n3["FabricLauncherPlugin.processRecord"]:::internal-link
  n4["catch Z.2142 (IOException e)"]
  n2 -->|"Z.2141"| n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.2140
  Zeile 2140: Versuch. Der Fehlerpfad geht in catch.
ChildProcessRecord.deleteIfMatch
  Löscht `deleteIfMatch`. Ruft `read`.
FabricLauncherPlugin.processRecord
  `processRecord` in `FabricLauncherPlugin.java`.
catch Z.2142 (IOException e)
  Zeile 2142: fängt (IOException e).
```

- Fortsetzung von `FabricLauncherPlugin.abandonFailedStart`, Quellreihenfolge.
