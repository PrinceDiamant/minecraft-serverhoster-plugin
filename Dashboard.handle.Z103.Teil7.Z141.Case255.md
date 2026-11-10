[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil7.Z141.Case255]]

# Dashboard.handle.Z103.Teil7.Z141.Case255

```mermaid
flowchart TD
  n1["Schritt Z.258 b.put('storage', pl.getConfig().getString('backup…"]
  n2["FabricLauncherPlugin.backupFiles"]:::internal-link
  n3["Dashboard.backupJson"]:::internal-link
  n4["Dashboard.json"]:::internal-link
  n2 -->|"Z.259"| n3
  n1 --> n2
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Schritt Z.258 b.put('storage', pl.getConfig().getString('backup…
  Zeile 258: liest die Config. `b.put('storage', pl.getConfig().getString('backup…`
FabricLauncherPlugin.backupFiles
  Sichert `backupFiles`. Ruft `remoteBackupSelected`, `backupCredentials`, `list`.
Dashboard.backupJson
  Sichert `backupJson`.
Dashboard.json
  Antwortet mit JSON `json`. Ruft `sendBytes`.
```

- Fortsetzung von `Dashboard.handle.Z103.Teil7.Z141`, Quellreihenfolge.
