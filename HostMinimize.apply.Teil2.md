[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[HostMinimize]] › [[HostMinimize.Teil2]] › [[HostMinimize.apply]] › [[HostMinimize.apply.Teil2]]

# HostMinimize.apply.Teil2

```mermaid
flowchart TD
  n1["if Z.160 (Files.exists(root.resolve('spigot.yml'), LinkOpt…"]
  n2["Schritt Z.162 boolean whitelistExisted = Files.exists(whitelist…"]
  n3["if Z.163 (whitelistExisted)"]
  n4["for Z.164 (Path file : files)"]
  n5["HostMinimize.assertEditable"]:::internal-link
  n6["HostMinimize.assertEditable"]:::internal-link
  n1 --> n2
  n1 --> n2
  n2 --> n3
  n4 -->|"wiederholen"| n5
  n3 --> n4
  n3 --> n4
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HostMinimize.apply`, Quellreihenfolge.
