[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]]

# UI-Workflows

```mermaid
flowchart TD
  n1["BackupSettings"]:::internal-link
  n2["BackupWorkflow"]:::internal-link
  n3["PlayerWorkflow"]:::internal-link
  n4["SettingsWorkflow"]:::internal-link
  n5["SetupWizard"]:::internal-link
  n6["SetupWorkflow"]:::internal-link
  n7["TaskWorkflow"]:::internal-link
  n8["VersionSelect"]:::internal-link
  n1 -->|"Quelltext"| n2
  n2 -->|"Quelltext"| n3
  n3 -->|"Quelltext"| n4
  n4 -->|"Quelltext"| n5
  n5 -->|"Quelltext"| n6
  n6 -->|"Quelltext"| n7
  n7 -->|"Quelltext"| n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
BackupSettings
  Felder der Backup-Config.
BackupWorkflow
  Backup anstoßen, Ziel prüfen, herunterladen. Hängt server= an #srv.
PlayerWorkflow
  Spieleraktionen im React-Dashboard.
SettingsWorkflow
  Einstellungen im React-Dashboard.
SetupWizard
  Geführte Einrichtung im React-Dashboard.
SetupWorkflow
  Einrichtungsseite im React-Dashboard.
TaskWorkflow
  Tasks und Zeitpläne im React-Dashboard.
VersionSelect
  Auswahl der Server-Version im React-Dashboard.
```


