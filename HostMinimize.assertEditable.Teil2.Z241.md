[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[HostMinimize]] › [[HostMinimize.Teil3]] › [[HostMinimize.assertEditable]] › [[HostMinimize.assertEditable.Teil2.Z241]]

# HostMinimize.assertEditable.Teil2.Z241

```mermaid
flowchart TD
  n1["for Z.241 (Path protectedPath : protectedPaths)"]
  n2["if Z.242 (protectedPath == null)"]
  n3["if Z.244 (Files.exists(candidate, LinkOption.NOFOLLOW_LINK…"]
  n4["if Z.245 (Files.isSymbolicLink(candidate))"]
  n5["throw Z.245 throw new SecurityException('protected path must …"]
  n6["if Z.248 (real.equals(candidate) // real.startsWith(candid…"]
  n7["throw Z.249 throw new SecurityException('refusing to edit pro…"]
  n4 -->|"ja"| n5
  n3 -->|"ja"| n4
  n2 --> n3
  n2 --> n3
  n6 -->|"ja"| n7
  n5 --> n6
  n4 --> n6
  n3 --> n6
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HostMinimize.assertEditable.Teil2`, Quellreihenfolge.
