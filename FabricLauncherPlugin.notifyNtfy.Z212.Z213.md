[[00 Start]] › [[Plugin-Kern]] › [[Benachrichtigung]] › [[FabricLauncherPlugin.notifyNtfy]] › [[FabricLauncherPlugin.notifyNtfy.Z212.Z213]]

# FabricLauncherPlugin.notifyNtfy.Z212.Z213

```mermaid
flowchart TD
  n1["Schritt Z.213 exec.submit(() -) ( try ( BackupSecrets.Credentia…"]
  n2["try Z.214"]
  n3["FabricLauncherPlugin.backupCredentials"]:::internal-link
  n4["NtfyNotifier.send"]:::internal-link
  n5["catch Z.217 (Exception e)"]
  n3 --> n4
  n2 --> n3
  n2 -->|"Fehler"| n5
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Schritt Z.213 exec.submit(() -) ( try ( BackupSecrets.Credentia…
  Zeile 213: legt die Arbeit auf den Pool ServerhosterPlugin. `exec.submit(() -) ( try ( BackupSecrets.Credentia…`
try Z.214
  Zeile 214: Versuch. Der Fehlerpfad geht in catch.
FabricLauncherPlugin.backupCredentials
  Sichert `backupCredentials`. Ruft `load`.
NtfyNotifier.send
  Sendet `send`. Ruft `target`, `encodeHeader`, `validPriority`.
catch Z.217 (Exception e)
  Zeile 217: fängt (Exception e).
```

- Fortsetzung von `FabricLauncherPlugin.notifyNtfy.Z212`, Quellreihenfolge.
