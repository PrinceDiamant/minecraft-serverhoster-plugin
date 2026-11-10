[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]] › [[RemoteBackupBridge.Teil2]] › [[RemoteBackupBridge.enterBaseDirectory]]

# RemoteBackupBridge.enterBaseDirectory

`RemoteBackupBridge.enterBaseDirectory(FTPClient client, String directory)` [src/main/java/de/aichele/childlauncher/RemoteBackupBridge.java:265–277](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/RemoteBackupBridge.java#L265-L277)

```mermaid
flowchart TD
  n1["if Z.267 (hasControlCharacter(path))"]
  n2["RemoteBackupBridge.hasControlCharacter"]:::internal-link
  n3["throw Z.267 throw new IOException('backup.remote.directory is…"]
  n4["if Z.268 (path.startsWith('/') && !client.changeWorkingDir…"]
  n5["RemoteBackupBridge.replyError"]:::internal-link
  n6["throw Z.268 throw replyError(client, 'change to FTP…"]
  n7["RemoteBackupBridge.enterBaseDirectory.Z269"]:::internal-link
  n1 -->|"Z.267"| n2
  n2 -->|"ja"| n3
  n5 --> n6
  n4 -->|"ja"| n5
  n3 --> n4
  n2 --> n4
  n6 --> n7
  n4 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `enterBaseDirectory` in `src/main/java/de/aichele/childlauncher/RemoteBackupBridge.java`
