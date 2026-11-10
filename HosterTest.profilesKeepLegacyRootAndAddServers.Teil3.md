[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil1]] › [[HosterTest.profilesKeepLegacyRootAndAddServers]] › [[HosterTest.profilesKeepLegacyRootAndAddServers.Teil3]]

# HosterTest.profilesKeepLegacyRootAndAddServers.Teil3

```mermaid
flowchart TD
  n1["ServerProfile.directory"]:::internal-link
  n2["Profiles.focus"]:::internal-link
  n3["Profiles.portClash"]:::internal-link
  n1 --> n2
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n2 fill:#f88,stroke:#900
  style n3 fill:#f88,stroke:#900
```

```knoten
ServerProfile.directory
  `directory` in `ServerProfile.java`.
Profiles.focus
  Wird vom Plugin-Kern nicht für die laufende Auswahl benutzt. Befund: angemeldet aber nicht umgesetzt (wahrscheinlich).
Profiles.portClash
  Wird vom Plugin-Kern nicht ausgewertet. Befund: angemeldet aber nicht umgesetzt (wahrscheinlich).
```

- Fortsetzung von `HosterTest.profilesKeepLegacyRootAndAddServers`, Quellreihenfolge.
