[[00 Start]] › [[Server-Anlage]] › [[Profile]] › [[ServerProfile]]

# ServerProfile

```mermaid
flowchart TD
  n1["ServerProfile.ServerProfile"]:::internal-link
  n2["ServerProfile.directory"]:::internal-link
  n3["ServerProfile.view"]:::internal-link
  n3 -->|"Z.57"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n3 fill:#f88,stroke:#900
```

```knoten
ServerProfile.ServerProfile
  `ServerProfile` in `ServerProfile.java`.
ServerProfile.directory
  `directory` in `ServerProfile.java`.
ServerProfile.view
  Liefert die Sicht `view`. Ruft `directory`. Befund: toter Code (wahrscheinlich).
```


