[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]]

# RemoteBackupBridge

```mermaid
flowchart TD
  n1["Session"]:::internal-link
  n2["CountingOutputStream"]:::internal-link
  n3["RemoteBackupBridge.Teil1"]:::internal-link
  n4["RemoteBackupBridge.Teil2"]:::internal-link
  n5["RemoteBackupBridge.Teil3"]:::internal-link
  n1 -->|"Quelltext"| n2
  n2 -->|"Quelltext"| n3
  n3 -->|"Quelltext"| n4
  n4 -->|"Quelltext"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Session
  FTP-Sitzung der Fern-Brücke. close schließt den Client.
CountingOutputStream
  Zählt die Bytes, die ins Backup geschrieben werden.
RemoteBackupBridge.Teil1
  Abschnitt 1 dieses Ablaufs, in Quellreihenfolge.
RemoteBackupBridge.Teil2
  Abschnitt 2 dieses Ablaufs, in Quellreihenfolge.
RemoteBackupBridge.Teil3
  Abschnitt 3 dieses Ablaufs, in Quellreihenfolge.
```


