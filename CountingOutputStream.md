[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]] › [[CountingOutputStream]]

# CountingOutputStream

```mermaid
flowchart TD
  n1["RemoteBackupBridge.CountingOutputStream.CountingOutputStream"]:::internal-link
  n2["RemoteBackupBridge.CountingOutputStream.write(int)"]:::internal-link
  n3["RemoteBackupBridge.CountingOutputStream.write(byteArray,int,int)"]:::internal-link
  n4["RemoteBackupBridge.CountingOutputStream.count"]:::internal-link
  n1 -->|"Quelltext"| n2
  n2 -->|"Quelltext"| n3
  n3 -->|"Quelltext"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
RemoteBackupBridge.CountingOutputStream.CountingOutputStream
  `CountingOutputStream` in `RemoteBackupBridge.java`.
RemoteBackupBridge.CountingOutputStream.write(int)
  Schreibt `write`.
RemoteBackupBridge.CountingOutputStream.write(byteArray,int,int)
  Schreibt `write`.
RemoteBackupBridge.CountingOutputStream.count
  Zählt `count`.
```


