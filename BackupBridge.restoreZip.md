[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[BackupBridge]] › [[BackupBridge.Teil1]] › [[BackupBridge.restoreZip]]

# BackupBridge.restoreZip

`BackupBridge.restoreZip(Path work, Path zip)` [src/main/java/de/aichele/childlauncher/BackupBridge.java:79–110](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/BackupBridge.java#L79-L110)

```mermaid
flowchart TD
  n1["if Z.80 (!Files.isRegularFile(zip) // Files.isSymbolicLin…"]
  n2["throw Z.80 throw new IOException('invalid backup archive');"]
  n3["PathGuard.open"]:::internal-link
  n4["BackupBridge.restoreZip.Z84"]:::internal-link
  n5["if Z.108 (n == 0)"]
  n6["throw Z.108 throw new IOException('empty zip');"]
  n7["return Z.109 return n;"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n3 --> n4
  n5 -->|"ja"| n6
  n4 --> n5
  n6 --> n7
  n5 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `restoreZip` in `src/main/java/de/aichele/childlauncher/BackupBridge.java`
