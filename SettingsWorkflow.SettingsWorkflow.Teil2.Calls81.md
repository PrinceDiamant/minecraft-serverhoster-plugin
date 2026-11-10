[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[SettingsWorkflow]] › [[SettingsWorkflow.SettingsWorkflow]] › [[SettingsWorkflow.SettingsWorkflow.Teil2.Calls81]]

# SettingsWorkflow.SettingsWorkflow.Teil2.Calls81

```mermaid
flowchart TD
  n1["fileEditor.installFileEditors.refresh"]:::internal-link
  n2["SettingsWorkflow.SettingsWorkflow.save"]:::internal-link
  n3["SettingsWorkflow.SettingsWorkflow.update"]:::internal-link
  n4["SettingsWorkflow.SettingsWorkflow.update"]:::internal-link
  n5["SettingsWorkflow.SettingsWorkflow.update"]:::internal-link
  n6["SettingsWorkflow.SettingsWorkflow.update"]:::internal-link
  n1 -->|"Z.84"| n2
  n2 -->|"Z.99"| n3
  n3 -->|"Z.106"| n4
  n4 -->|"Z.110"| n5
  n5 -->|"Z.114"| n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
fileEditor.installFileEditors.refresh
  Die [[Glossar#Bedienseite|Bedienseite]] lädt neu das. Lädt neu `refresh`. Ruft `editorFor`.
SettingsWorkflow.SettingsWorkflow.save
  Die [[Glossar#Bedienseite|Bedienseite]] speichert das. Speichert `save`. Ruft `saveBackupSettings`, `loadBackupSettings`.
SettingsWorkflow.SettingsWorkflow.update
  Die [[Glossar#Bedienseite|Bedienseite]] ändert das. Aktualisiert `update`.
```

> [!knoten]- Was die Blöcke tun
> - **fileEditor.installFileEditors.refresh**: Die [[Glossar#Bedienseite|Bedienseite]] lädt neu das. Lädt neu `refresh`. Ruft `editorFor`.
> - **SettingsWorkflow.SettingsWorkflow.save**: Die [[Glossar#Bedienseite|Bedienseite]] speichert das. Speichert `save`. Ruft `saveBackupSettings`, `loadBackupSettings`.
> - **SettingsWorkflow.SettingsWorkflow.update**: Die [[Glossar#Bedienseite|Bedienseite]] ändert das. Aktualisiert `update`.

- Weitere [[Glossar#Funktion|Funktionen]], die ab [[Glossar#Zeile|Zeile]] 81 aufgerufen werden.
- Fortsetzung von `SettingsWorkflow.SettingsWorkflow.Teil2`.
