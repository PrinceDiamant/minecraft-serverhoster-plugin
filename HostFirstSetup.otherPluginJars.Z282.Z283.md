[[00 Start]] › [[Host-Betrieb]] › [[Host-Ersteinrichtung]] › [[HostFirstSetup]] › [[HostFirstSetup.Teil3]] › [[HostFirstSetup.otherPluginJars]] › [[HostFirstSetup.otherPluginJars.Z282.Z283]]

# HostFirstSetup.otherPluginJars.Z282.Z283

```mermaid
flowchart TD
  n1["for Z.283 (Path entry : entries.toList())"]
  n2["if Z.285 (!name.toLowerCase(java.util.Locale.ROOT).endsWit…"]
  n3["if Z.287 (!Files.isRegularFile(entry, LinkOption.NOFOLLOW_…"]
  n4["for Z.289 (int attempt = 0; Files.exists(disabled…"]
  n5["if Z.290 (attempt )= 8)"]
  n6["throw Z.290 throw new IOException('Could not choose a safe di…"]
  n2 --> n3
  n2 --> n3
  n5 -->|"ja"| n6
  n4 -->|"wiederholen"| n5
  n3 --> n4
  n3 --> n4
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HostFirstSetup.otherPluginJars.Z282`, Quellreihenfolge.
