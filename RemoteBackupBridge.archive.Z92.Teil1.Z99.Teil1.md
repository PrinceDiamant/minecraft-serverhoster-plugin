[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]] › [[RemoteBackupBridge.Teil1]] › [[RemoteBackupBridge.archive]] › [[RemoteBackupBridge.archive.Z92.Teil1.Z99.Teil1]]

# RemoteBackupBridge.archive.Z92.Teil1.Z99.Teil1

```mermaid
flowchart TD
  n1["if Z.101 (transfer == null)"]
  n2["RemoteBackupBridge.replyError"]:::internal-link
  n3["throw Z.101 throw replyError(client, 'start remote …"]
  n4["RemoteBackupBridge.CountingOutputStream.CountingOutputStream"]:::internal-link
  n5["RemoteBackupBridge.archive.Z92.Teil1.Z99.Teil1.Z104"]:::internal-link
  n2 --> n3
  n1 -->|"ja"| n2
  n3 --> n4
  n1 --> n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.101 (transfer == null)
  Zeile 101: prüft `(transfer == null)`.
RemoteBackupBridge.replyError
  Antwortet `replyError`.
throw Z.101 throw replyError(client, 'start remote …
  Zeile 101: Abbruch `throw replyError(client, 'start remote …`.
RemoteBackupBridge.CountingOutputStream.CountingOutputStream
  `CountingOutputStream` in `RemoteBackupBridge.java`.
RemoteBackupBridge.archive.Z92.Teil1.Z99.Teil1.Z104
  Fortsetzung des Ablaufs ab Zeile 104.
```

- Fortsetzung von `RemoteBackupBridge.archive.Z92.Teil1.Z99`, Quellreihenfolge.
