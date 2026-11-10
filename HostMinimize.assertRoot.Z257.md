[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[HostMinimize]] › [[HostMinimize.Teil3]] › [[HostMinimize.assertRoot]] › [[HostMinimize.assertRoot.Z257]]

# HostMinimize.assertRoot.Z257

```mermaid
flowchart TD
  n1["for Z.257 (Path protectedPath : protectedPaths)"]
  n2["if Z.258 (protectedPath == null)"]
  n3["Schritt Z.261 Path realProtected = Files.exists(candidate, Link…"]
  n4["if Z.263 (realProtected.equals(realRoot))"]
  n5["throw Z.264 throw new SecurityException('a protected director…"]
  n2 --> n3
  n2 --> n3
  n4 -->|"ja"| n5
  n3 --> n4
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HostMinimize.assertRoot`, Quellreihenfolge.
