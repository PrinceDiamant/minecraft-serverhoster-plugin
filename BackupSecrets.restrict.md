[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[BackupSecrets]] › [[BackupSecrets.restrict]]

# BackupSecrets.restrict

`BackupSecrets.restrict(Path path)` [src/main/java/de/aichele/childlauncher/BackupSecrets.java:88–92](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/BackupSecrets.java#L88-L92)

```mermaid
flowchart TD
  n1["if Z.89 (Files.getFileStore(path).supportsFileAttributeVi…"]
  n2["Schritt Z.90 Files.setPosixFilePermissions(path, Set.of(PosixF…"]
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `restrict` in `src/main/java/de/aichele/childlauncher/BackupSecrets.java`
