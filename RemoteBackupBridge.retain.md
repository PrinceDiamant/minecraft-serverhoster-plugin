[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]] › [[RemoteBackupBridge.Teil3]] › [[RemoteBackupBridge.retain]]

# RemoteBackupBridge.retain

`RemoteBackupBridge.retain(FTPClient client, String server, int keep)` [src/main/java/de/aichele/childlauncher/RemoteBackupBridge.java:279–289](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/RemoteBackupBridge.java#L279-L289)

```mermaid
flowchart TD
  n1["if Z.280 (keep (= 0)"]
  n2["return Z.280 return;"]
  n3["for Z.282 (FTPFile file : client.listFiles())"]
  n4["if Z.283 (file != null && file.isFile() && BackupBridge.na…"]
  n5["BackupBridge.named"]:::internal-link
  n6["for Z.286 (int i = keep; i ( names.size(); i++)"]
  n7["if Z.287 (!client.deleteFile(names.get(i)))"]
  n8["RemoteBackupBridge.replyError"]:::internal-link
  n9["throw Z.287 throw replyError(client, 'retain remote…"]
  n1 -->|"ja"| n2
  n4 -->|"Z.283"| n5
  n3 -->|"wiederholen"| n4
  n2 --> n3
  n1 --> n3
  n8 --> n9
  n7 -->|"ja"| n8
  n6 -->|"wiederholen"| n7
  n5 --> n6
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `retain` in `src/main/java/de/aichele/childlauncher/RemoteBackupBridge.java`
