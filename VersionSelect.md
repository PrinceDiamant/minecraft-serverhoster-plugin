[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[VersionSelect]]

# VersionSelect

```mermaid
flowchart TD
  n1["VersionSelect.useVersionCatalog"]:::internal-link
  n2["VersionSelect.versionIsValid"]:::internal-link
  n3["VersionSelect.VersionSelect"]:::internal-link
  n1 -->|"Quelltext"| n2
  n2 -->|"Quelltext"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
VersionSelect.useVersionCatalog
  Benutzt `useVersionCatalog`. Ruft `dashboardRequest`.
VersionSelect.versionIsValid
  `versionIsValid` in `VersionSelect.tsx`.
VersionSelect.VersionSelect
  `VersionSelect` in `VersionSelect.tsx`.
```


