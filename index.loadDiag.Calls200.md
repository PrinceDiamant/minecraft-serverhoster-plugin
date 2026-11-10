[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Diag]] › [[index.loadDiag]] › [[index.loadDiag.Calls200]]

# index.loadDiag.Calls200

```mermaid
flowchart TD
  n1["index.loadDiag.row"]:::internal-link
  n2["index.loadDiag.metric"]:::internal-link
  n3["index.loadDiag.metric"]:::internal-link
  n4["index.loadDiag.metric"]:::internal-link
  n5["index.loadDiag.row"]:::internal-link
  n6["index.loadDiag.metric"]:::internal-link
  n1 -->|"Z.200"| n2
  n2 -->|"Z.200"| n3
  n3 -->|"Z.200"| n4
  n4 -->|"Z.201"| n5
  n5 -->|"Z.201"| n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
index.loadDiag.row
  Baut eine Tabellenzeile `row`. Ruft `esc`.
index.loadDiag.metric
  Formatiert einen Messwert `metric`.
```

- Fortsetzung von `index.loadDiag`, Quellreihenfolge.
