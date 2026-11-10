[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]] › [[RemoteBackupBridge.Teil1]] › [[RemoteBackupBridge.delete]]

# RemoteBackupBridge.delete

`RemoteBackupBridge.delete(Settings settings, String username, String password, String serverId, String name)` [src/main/java/de/aichele/childlauncher/RemoteBackupBridge.java:160–168](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/RemoteBackupBridge.java#L160-L168)

```mermaid
flowchart TD
  n1["BackupBridge.safeId"]:::internal-link
  n2["if Z.163 (!BackupBridge.named(safe, name))"]
  n3["BackupBridge.named"]:::internal-link
  n4["throw Z.163 throw new IllegalArgumentException('backup name');"]
  n5["try Z.164"]
  n6["RemoteBackupBridge.connect"]:::internal-link
  n7["RemoteBackupBridge.enterDirectory"]:::internal-link
  n8["if Z.166 (!session.client().deleteFile(name))"]
  n9["RemoteBackupBridge.replyError"]:::internal-link
  n10["throw Z.166 throw replyError(session.client(), 'del…"]
  n2 -->|"Z.163"| n3
  n3 -->|"ja"| n4
  n1 --> n2
  n5 -->|"Z.164"| n6
  n9 --> n10
  n8 -->|"ja"| n9
  n7 --> n8
  n6 --> n7
  n4 --> n5
  n3 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `delete` in `src/main/java/de/aichele/childlauncher/RemoteBackupBridge.java`
