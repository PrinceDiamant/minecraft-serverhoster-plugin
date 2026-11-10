[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[BackupOptions]] › [[BackupOptions.BackupOptions]]

# BackupOptions.BackupOptions

`BackupOptions.BackupOptions()` [src/main/java/de/aichele/childlauncher/BackupOptions.java:6–20](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/BackupOptions.java#L6-L20)

```mermaid
flowchart TD
  n1["if Z.7 (paths == null // paths.isEmpty() // paths.size()…"]
  n2["throw Z.8 throw new IllegalArgumentException('Bitte 1 bis 5…"]
  n3["for Z.9 (String path : paths)"]
  n4["if Z.10 (path == null // path.isBlank() // path.length() …"]
  n5["throw Z.13 throw new IllegalArgumentException('Backup-Pfade …"]
  n6["for Z.14 (String segment : path.replace('//', '/…"]
  n7["if Z.15 ('..'.equals(segment))"]
  n8["throw Z.15 throw new IllegalArgumentException('Backup-Pfade …"]
  n9["if Z.18 (keep ( 0 // keep ) 10000)"]
  n10["throw Z.19 throw new IllegalArgumentException('Anzahl der Ba…"]
  n1 -->|"ja"| n2
  n4 -->|"ja"| n5
  n7 -->|"ja"| n8
  n6 -->|"wiederholen"| n7
  n5 --> n6
  n4 --> n6
  n3 -->|"wiederholen"| n4
  n2 --> n3
  n1 --> n3
  n9 -->|"ja"| n10
  n8 --> n9
  n7 --> n9
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `BackupOptions` in `src/main/java/de/aichele/childlauncher/BackupOptions.java`
