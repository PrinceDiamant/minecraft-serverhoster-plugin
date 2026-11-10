[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[HostMinimize]] › [[HostMinimize.Teil2]] › [[HostMinimize.apply]] › [[HostMinimize.apply.Teil3]]

# HostMinimize.apply.Teil3

```mermaid
flowchart TD
  n1["HostMinimize.assertEditable"]:::internal-link
  n2["if Z.168 (!backupDirectory.toAbsolutePath().normalize().st…"]
  n3["throw Z.169 throw new SecurityException('host minimization ba…"]
  n4["Schritt Z.170 Files.createDirectories(backupDirectory);"]
  n5["if Z.171 (!whitelistExisted)"]
  n6["Schritt Z.171 Files.writeString(backupDirectory.resolve(WHITELI…"]
  n2 -->|"ja"| n3
  n1 --> n2
  n3 --> n4
  n2 --> n4
  n5 -->|"ja"| n6
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HostMinimize.apply`, Quellreihenfolge.
