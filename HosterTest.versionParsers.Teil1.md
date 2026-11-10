[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil3]] › [[HosterTest.versionParsers]] › [[HosterTest.versionParsers.Teil1]]

# HosterTest.versionParsers.Teil1

```mermaid
flowchart TD
  n1["VersionCatalog.vanilla"]:::internal-link
  n2["VersionCatalog.fabric"]:::internal-link
  n3["VersionCatalog.paper"]:::internal-link
  n4["VersionCatalog.spigot"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
VersionCatalog.vanilla
  `vanilla` in `VersionCatalog.java`. Ruft `str`.
VersionCatalog.fabric
  `fabric` in `VersionCatalog.java`. Ruft `str`.
VersionCatalog.paper
  `paper` in `VersionCatalog.java`.
VersionCatalog.spigot
  `spigot` in `VersionCatalog.java`. Ruft `compare`.
```

- Fortsetzung von `HosterTest.versionParsers`, Quellreihenfolge.
