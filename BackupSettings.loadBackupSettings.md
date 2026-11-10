[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[BackupSettings]] › [[BackupSettings.loadBackupSettings]]

# BackupSettings.loadBackupSettings

`BackupSettings.loadBackupSettings()` [ui/src/components/BackupSettings.tsx:26–33](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/ui/src/components/BackupSettings.tsx#L26-L33)

```mermaid
flowchart TD
  n1["hostApi.dashboardRequest"]:::internal-link
  n2["hostApi.dashboardRequest"]:::internal-link
  n3["hostApi.dashboardRequest"]:::internal-link
  n4["return Z.32 return ( settings, credentials: ( ...credentials,…"]
  n1 -->|"Z.29"| n2
  n2 -->|"Z.30"| n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `loadBackupSettings` in `ui/src/components/BackupSettings.tsx`
