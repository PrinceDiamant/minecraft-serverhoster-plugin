[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Klassen]] › [[DashboardPassword]] › [[DashboardPassword.create]] › [[DashboardPassword.create.Teil1]]

# DashboardPassword.create.Teil1

```mermaid
flowchart TD
  n1["if Z.27 (password == null // password.length() ( 12 // pa…"]
  n2["throw Z.29 throw new IllegalArgumentException('Das Passwort …"]
  n3["Schritt Z.31 Files.createDirectories(parent);"]
  n4["if Z.32 (Files.getFileStore(parent).supportsFileAttribute…"]
  n5["Schritt Z.33 Files.createFile(file, PosixFilePermissions.asFil…"]
  n6["Schritt Z.34 Files.createFile(file);"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n4 -->|"ja"| n5
  n4 -->|"nein"| n6
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `DashboardPassword.create`, Quellreihenfolge.
