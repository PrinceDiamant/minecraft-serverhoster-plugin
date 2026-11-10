[[00 Start]] › [[Plugin-Kern]] › [[Befehle]] › [[FabricLauncherPlugin.onCommand]] › [[FabricLauncherPlugin.onCommand.Z2401.Case2417.Z2418]]

# FabricLauncherPlugin.onCommand.Z2401.Case2417.Z2418

```mermaid
flowchart TD
  n1["if Z.2418 (a.length )= 2 && a(1).equalsIgnoreCase('list'))"]
  n2["try Z.2419"]
  n3["for Z.2419 (var e : backupFiles(focus))"]
  n4["FabricLauncherPlugin.backupFiles"]:::internal-link
  n5["catch Z.2420 (IOException e)"]
  n6["FabricLauncherPlugin.onCommand.Z2401.Case2417.Z2418.Z2421"]:::internal-link
  n3 -->|"Z.2419"| n4
  n2 --> n3
  n2 -->|"Fehler"| n5
  n1 -->|"ja"| n2
  n1 -->|"nein"| n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.2418 (a.length )= 2 && a(1).equalsIgnoreCase('list'))
  Zeile 2418: prüft `(a.length )= 2 && a(1).equalsIgnoreCase('list'))`.
try Z.2419
  Zeile 2419: Versuch. Der Fehlerpfad geht in catch.
for Z.2419 (var e : backupFiles(focus))
  Zeile 2419: Schleife `(var e : backupFiles(focus))`.
FabricLauncherPlugin.backupFiles
  Sichert `backupFiles`. Ruft `remoteBackupSelected`, `backupCredentials`, `list`.
catch Z.2420 (IOException e)
  Zeile 2420: fängt (IOException e).
FabricLauncherPlugin.onCommand.Z2401.Case2417.Z2418.Z2421
  Fortsetzung des Ablaufs ab Zeile 2421.
```

- Fortsetzung von `FabricLauncherPlugin.onCommand.Z2401.Case2417`, Quellreihenfolge.
