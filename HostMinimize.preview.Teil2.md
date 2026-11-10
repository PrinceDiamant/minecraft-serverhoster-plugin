[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[HostMinimize]] › [[HostMinimize.Teil2]] › [[HostMinimize.preview]] › [[HostMinimize.preview.Teil2]]

# HostMinimize.preview.Teil2

```mermaid
flowchart TD
  n1["for Z.143 (var entry : spigotChanges().entrySet())"]
  n2["HostMinimize.spigotChanges"]:::internal-link
  n3["HostMinimize.preservedNotes"]:::internal-link
  n4["return Z.146 return new Preview(List.copyOf(changes)…"]
  n1 -->|"Z.143"| n2
  n3 --> n4
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HostMinimize.preview`, Quellreihenfolge.
