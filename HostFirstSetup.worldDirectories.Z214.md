[[00 Start]] › [[Host-Betrieb]] › [[Host-Ersteinrichtung]] › [[HostFirstSetup]] › [[HostFirstSetup.Teil2]] › [[HostFirstSetup.worldDirectories]] › [[HostFirstSetup.worldDirectories.Z214]]

# HostFirstSetup.worldDirectories.Z214

```mermaid
flowchart TD
  n1["try Z.214"]
  n2["for Z.215 (Path entry : entries.toList())"]
  n3["if Z.216 (!Files.isDirectory(entry, LinkOption.NOFOLLOW_LI…"]
  n4["if Z.218 (Files.isRegularFile(level, LinkOption.NOFOLLOW_L…"]
  n3 --> n4
  n3 --> n4
  n2 -->|"wiederholen"| n3
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HostFirstSetup.worldDirectories`, Quellreihenfolge.
