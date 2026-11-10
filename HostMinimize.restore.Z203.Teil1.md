[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[HostMinimize]] › [[HostMinimize.Teil2]] › [[HostMinimize.restore]] › [[HostMinimize.restore.Z203.Teil1]]

# HostMinimize.restore.Z203.Teil1

```mermaid
flowchart TD
  n1["if Z.205 (!Files.isRegularFile(source, LinkOption.NOFOLLOW…"]
  n2["HostMinimize.assertEditable"]:::internal-link
  n3["if Z.209 (Files.isSymbolicLink(temporary))"]
  n4["throw Z.209 throw new SecurityException('temporary restore fi…"]
  n5["Schritt Z.210 Files.copy(source, temporary, StandardCopyOption.…"]
  n1 --> n2
  n1 --> n2
  n3 -->|"ja"| n4
  n2 --> n3
  n4 --> n5
  n3 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HostMinimize.restore.Z203`, Quellreihenfolge.
