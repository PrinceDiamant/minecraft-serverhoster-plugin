[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[BackupBridge]] › [[BackupBridge.Teil2]] › [[BackupBridge.retain]]

# BackupBridge.retain

`BackupBridge.retain(Path dir, String server, int keep)` [src/main/java/de/aichele/childlauncher/BackupBridge.java:187–193](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/BackupBridge.java#L187-L193)

```mermaid
flowchart TD
  n1["if Z.188 (keep (= 0)"]
  n2["return Z.188 return;"]
  n3["try Z.190"]
  n4["for Z.190 (Path p : ds)"]
  n5["for Z.192 (int i = keep; i ( zips.size(); i++)"]
  n6["Schritt Z.192 Files.deleteIfExists(zips.get(i));"]
  n1 -->|"ja"| n2
  n3 --> n4
  n2 --> n3
  n1 --> n3
  n5 -->|"wiederholen"| n6
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `retain` in `src/main/java/de/aichele/childlauncher/BackupBridge.java`
