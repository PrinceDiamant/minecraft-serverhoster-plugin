[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil1]] › [[HosterTest.profilesKeepLegacyRootAndAddServers]] › [[HosterTest.profilesKeepLegacyRootAndAddServers.Teil4]]

# HosterTest.profilesKeepLegacyRootAndAddServers.Teil4

```mermaid
flowchart TD
  n1["Profiles.portClash"]:::internal-link
  n2["Profiles.load"]:::internal-link
  n1 -->|"Z.102"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n1 fill:#f88,stroke:#900
  style n2 fill:#f88,stroke:#900
```

```knoten
Profiles.portClash
  Wird vom Plugin-Kern nicht ausgewertet. Befund: angemeldet aber nicht umgesetzt (wahrscheinlich).
Profiles.load
  Lädt `load`. Ruft `one`, `str`, `copyId`. Befund: angemeldet aber nicht umgesetzt (sicher).
```

- Fortsetzung von `HosterTest.profilesKeepLegacyRootAndAddServers`, Quellreihenfolge.
