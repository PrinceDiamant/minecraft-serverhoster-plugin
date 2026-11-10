[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[SettingsWorkflow]] › [[SettingsWorkflow.SettingsWorkflow]] › [[SettingsWorkflow.SettingsWorkflow.Teil1]]

# SettingsWorkflow.SettingsWorkflow.Teil1

```mermaid
flowchart TD
  n1["BackupSettings.loadBackupSettings"]:::internal-link
  n2["fileEditor.installFileEditors.refresh"]:::internal-link
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
BackupSettings.loadBackupSettings
  Lädt `loadBackupSettings`. Ruft `dashboardRequest`.
fileEditor.installFileEditors.refresh
  Lädt neu `refresh`. Ruft `editorFor`.
```

- Fortsetzung von `SettingsWorkflow.SettingsWorkflow`, Quellreihenfolge.
