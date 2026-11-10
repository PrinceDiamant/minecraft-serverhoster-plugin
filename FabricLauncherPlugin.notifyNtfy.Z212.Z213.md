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

- Fortsetzung von `FabricLauncherPlugin.notifyNtfy.Z212`, Quellreihenfolge.
