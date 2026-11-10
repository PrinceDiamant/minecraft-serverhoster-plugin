[[00 Start]] › [[Server-Anlage]] › [[Versionen]]

# Versionen

```mermaid
flowchart TD
  n1["VersionCatalog"]:::internal-link
  n2["Upstream"]:::internal-link
  n3["FabricLauncherPlugin.versions"]:::internal-link
  n4["FabricLauncherPlugin.firstStable"]:::internal-link
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
VersionCatalog
  Liest Vanilla, Fabric und Paper und vergleicht Versionen.
Upstream
  HTTP-Abruf der Versionslisten.
FabricLauncherPlugin.versions
  `versions` in `FabricLauncherPlugin.java`. Ruft `fetch`.
FabricLauncherPlugin.firstStable
  `firstStable` in `FabricLauncherPlugin.java`.
```


