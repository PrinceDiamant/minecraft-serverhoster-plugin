[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]] › [[RemoteBackupBridge.Teil1]] › [[RemoteBackupBridge.download]]

# RemoteBackupBridge.download

`RemoteBackupBridge.download(Settings settings, String username, String password, String serverId, String name, OutputStream output)` [src/main/java/de/aichele/childlauncher/RemoteBackupBridge.java:150–158](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/RemoteBackupBridge.java#L150-L158)

```mermaid
flowchart TD
  n1["BackupBridge.safeId"]:::internal-link
  n2["if Z.153 (!BackupBridge.named(safe, name))"]
  n3["BackupBridge.named"]:::internal-link
  n4["throw Z.153 throw new IllegalArgumentException('backup name');"]
  n5["try Z.154"]
  n6["RemoteBackupBridge.connect"]:::internal-link
  n7["RemoteBackupBridge.enterDirectory"]:::internal-link
  n8["if Z.156 (!session.client().retrieveFile(name, output))"]
  n9["RemoteBackupBridge.replyError"]:::internal-link
  n10["throw Z.156 throw replyError(session.client(), 'dow…"]
  n2 -->|"Z.153"| n3
  n3 -->|"ja"| n4
  n1 --> n2
  n5 -->|"Z.154"| n6
  n9 --> n10
  n8 -->|"ja"| n9
  n7 --> n8
  n6 --> n7
  n4 --> n5
  n3 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `download` in `src/main/java/de/aichele/childlauncher/RemoteBackupBridge.java`
