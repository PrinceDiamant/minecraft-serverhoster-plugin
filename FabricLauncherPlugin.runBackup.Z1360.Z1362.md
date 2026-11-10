[[00 Start]] › [[Backup]] › [[Backup-Lauf]] › [[FabricLauncherPlugin.runBackup]] › [[FabricLauncherPlugin.runBackup.Z1360.Z1362]]

# FabricLauncherPlugin.runBackup.Z1360.Z1362

```mermaid
flowchart TD
  n1["try Z.1362"]
  n2["if Z.1363 (s.running())"]
  n3["ChildSlot.running"]:::internal-link
  n4["FabricLauncherPlugin.send"]:::internal-link
  n5["Schritt Z.1365 Thread.sleep(Math.max(0, getConfig().getInt('back…"]
  n6["FabricLauncherPlugin.backupSpec"]:::internal-link
  n7["FabricLauncherPlugin.runBackup.Z1360.Z1362.Z1368"]:::internal-link
  n8["ConsoleBuffer.add"]:::internal-link
  n9["return Z.1385 return lastBackup;"]
  n10["catch Z.1386 (Exception e)"]
  n11["FabricLauncherPlugin.notifyNtfy"]:::internal-link
  n12["throw Z.1388 throw e;"]
  n2 -->|"Z.1363"| n3
  n4 --> n5
  n3 -->|"ja"| n4
  n5 --> n6
  n3 --> n6
  n6 --> n7
  n7 --> n8
  n8 --> n9
  n1 --> n2
  n1 -->|"Fehler"| n10
  n11 --> n12
  n10 --> n11
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.1362
  Zeile 1362: Versuch. Der Fehlerpfad geht in catch.
if Z.1363 (s.running())
  Zeile 1363: prüft `(s.running())`.
ChildSlot.running
  Sagt, ob der Prozess läuft `running`.
FabricLauncherPlugin.send
  Sendet `send`. Ruft `running`.
Schritt Z.1365 Thread.sleep(Math.max(0, getConfig().getInt('back…
  Zeile 1365: liest die Config. `Thread.sleep(Math.max(0, getConfig().getInt('back…`
FabricLauncherPlugin.backupSpec
  Sichert `backupSpec`.
FabricLauncherPlugin.runBackup.Z1360.Z1362.Z1368
  Fortsetzung des Ablaufs ab Zeile 1368.
ConsoleBuffer.add
  Fügt hinzu `add`.
return Z.1385 return lastBackup;
  Zeile 1385: Rückgabe `return lastBackup;`.
catch Z.1386 (Exception e)
  Zeile 1386: fängt (Exception e).
FabricLauncherPlugin.notifyNtfy
  Meldet `notifyNtfy`. Ruft `ntfySettings`, `backupCredentials`, `send`.
throw Z.1388 throw e;
  Zeile 1388: Abbruch `throw e;`.
```

- Fortsetzung von `FabricLauncherPlugin.runBackup.Z1360`, Quellreihenfolge.
