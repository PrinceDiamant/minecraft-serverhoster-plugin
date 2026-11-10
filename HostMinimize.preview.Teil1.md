[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[HostMinimize]] › [[HostMinimize.Teil2]] › [[HostMinimize.preview]] › [[HostMinimize.preview.Teil1]]

# HostMinimize.preview.Teil1

```mermaid
flowchart TD
  n1["HostMinimize.assertRoot"]:::internal-link
  n2["HostMinimize.readProperties"]:::internal-link
  n3["for Z.139 (var entry : outerProperties().entrySet…"]
  n4["HostMinimize.outerProperties"]:::internal-link
  n5["for Z.141 (var entry : bukkitChanges().entrySet())"]
  n6["HostMinimize.bukkitChanges"]:::internal-link
  n1 --> n2
  n3 -->|"Z.139"| n4
  n2 --> n3
  n5 -->|"Z.141"| n6
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
HostMinimize.assertRoot
  Prüft `assertRoot`.
HostMinimize.readProperties
  Liest `readProperties`.
for Z.139 (var entry : outerProperties().entrySet…
  Zeile 139: Schleife `(var entry : outerProperties().entrySet…`.
HostMinimize.outerProperties
  `outerProperties` in `HostMinimize.java`.
for Z.141 (var entry : bukkitChanges().entrySet())
  Zeile 141: Schleife `(var entry : bukkitChanges().entrySet())`.
HostMinimize.bukkitChanges
  `bukkitChanges` in `HostMinimize.java`.
```

- Fortsetzung von `HostMinimize.preview`, Quellreihenfolge.
