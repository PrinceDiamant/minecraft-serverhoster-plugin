[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]] › [[RemoteBackupBridge.Teil3]] › [[RemoteBackupBridge.disconnectAfterFailure]]

# RemoteBackupBridge.disconnectAfterFailure

`RemoteBackupBridge.disconnectAfterFailure(FTPClient client, Exception failure)` [src/main/java/de/aichele/childlauncher/RemoteBackupBridge.java:323–326](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/RemoteBackupBridge.java#L323-L326)

```mermaid
flowchart TD
  n1["try Z.324"]
  n2["RemoteBackupBridge.disconnect"]:::internal-link
  n3["catch Z.325 (IOException closeError)"]
  n1 --> n2
  n1 -->|"Fehler"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `disconnectAfterFailure` in `src/main/java/de/aichele/childlauncher/RemoteBackupBridge.java`
