[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[HostMinimize]] › [[HostMinimize.Teil2]] › [[HostMinimize.apply]] › [[HostMinimize.apply.Teil4]]

# HostMinimize.apply.Teil4

```mermaid
flowchart TD
  n1["for Z.172 (Path file : files)"]
  n2["if Z.174 (Files.isSymbolicLink(destination))"]
  n3["throw Z.174 throw new SecurityException('backup target must n…"]
  n4["Schritt Z.175 Files.copy(file, destination, StandardCopyOption.…"]
  n5["HostMinimize.apply.Teil4.Z177"]:::internal-link
  n6["return Z.188 return new ApplyResult(backupDirectory, files.str…"]
  n2 -->|"ja"| n3
  n3 --> n4
  n2 --> n4
  n1 -->|"wiederholen"| n2
  n4 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HostMinimize.apply`, Quellreihenfolge.
