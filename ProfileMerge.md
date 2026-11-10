[[00 Start]] › [[Server-Anlage]] › [[Profile]] › [[ProfileMerge]]

# ProfileMerge

```mermaid
flowchart TD
  n1["ProfileMerge.ProfileMerge"]:::internal-link
  n2["ProfileMerge.inherit"]:::internal-link
  n3["ProfileMerge.mergeProps"]:::internal-link
  n4["ProfileMerge.nvl"]:::internal-link
  n5["ProfileMerge.safeId"]:::internal-link
  n2 -->|"Z.169"| n4
  n2 -->|"Z.176"| n5
  n2 -->|"Z.182"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
ProfileMerge.ProfileMerge
  `ProfileMerge` in `ServerProfile.java`.
ProfileMerge.inherit
  `inherit` in `ServerProfile.java`. Ruft `ServerProfile`, `nvl`, `safeId`.
ProfileMerge.mergeProps
  Mischt `mergeProps`.
ProfileMerge.nvl
  `nvl` in `ServerProfile.java`.
ProfileMerge.safeId
  Prüft die Pfadgrenze `safeId`.
```


