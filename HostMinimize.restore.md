[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[HostMinimize]] › [[HostMinimize.Teil2]] › [[HostMinimize.restore]]

# HostMinimize.restore

`HostMinimize.restore(Path root, Path backupDirectory, List<Path> protectedPaths)` [src/main/java/de/aichele/childlauncher/HostMinimize.java:191–219](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/HostMinimize.java#L191-L219)

```mermaid
flowchart TD
  n1["if Z.192 (Files.isSymbolicLink(backupDirectory) // !Files.…"]
  n2["throw Z.193 throw new IOException('host minimization backup i…"]
  n3["if Z.196 (!realBackup.startsWith(data))"]
  n4["throw Z.196 throw new SecurityException('backup is outside th…"]
  n5["HostMinimize.restore.Z197"]:::internal-link
  n6["HostMinimize.restore.Z203"]:::internal-link
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n4 --> n5
  n3 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `restore` in `src/main/java/de/aichele/childlauncher/HostMinimize.java`
