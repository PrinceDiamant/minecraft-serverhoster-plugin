[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]] › [[RemoteBackupBridge.Teil2]] › [[RemoteBackupBridge.connect]] › [[RemoteBackupBridge.connect.Teil3.Z188.Teil2]]

# RemoteBackupBridge.connect.Teil3.Z188.Teil2

```mermaid
flowchart TD
  n1["RemoteBackupBridge.warnPlainFtp"]:::internal-link
  n2["RemoteBackupBridge.login"]:::internal-link
  n3["return Z.200 return new Session(probe, false);"]
  n1 --> n2
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
RemoteBackupBridge.warnPlainFtp
  Warnt `warnPlainFtp`.
RemoteBackupBridge.login
  Meldet an `login`. Ruft `replyError`.
return Z.200 return new Session(probe, false);
  Zeile 200: Rückgabe `return new Session(probe, false);`.
```

- Fortsetzung von `RemoteBackupBridge.connect.Teil3.Z188`, Quellreihenfolge.
