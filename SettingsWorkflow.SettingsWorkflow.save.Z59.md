[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[SettingsWorkflow]] › [[SettingsWorkflow.SettingsWorkflow]] › [[SettingsWorkflow.SettingsWorkflow.save]] › [[SettingsWorkflow.SettingsWorkflow.save.Z59]]

# SettingsWorkflow.SettingsWorkflow.save.Z59

```mermaid
flowchart TD
  n1["try Z.59"]
  n2["BackupSettings.saveBackupSettings"]:::internal-link
  n3["BackupSettings.loadBackupSettings"]:::internal-link
  n4["catch Z.66 cause"]
  n5["finally Z.59"]
  n2 --> n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  n3 --> n5
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.59
  Zeile 59: Versuch. Der Fehlerpfad geht in catch.
BackupSettings.saveBackupSettings
  Speichert `saveBackupSettings`. Ruft `dashboardRequest`, `jsonBody`.
BackupSettings.loadBackupSettings
  Lädt `loadBackupSettings`. Ruft `dashboardRequest`.
catch Z.66 cause
  Zeile 66: fängt cause.
finally Z.59
  Läuft danach immer, auch nach einem Fehler.
```

- Fortsetzung von `SettingsWorkflow.SettingsWorkflow.save`, Quellreihenfolge.
