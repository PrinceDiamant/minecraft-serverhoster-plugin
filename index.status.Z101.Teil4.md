[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Status]] › [[index.status]] › [[index.status.Z101.Teil4]]

# index.status.Z101.Teil4

```mermaid
flowchart TD
  n1["if Z.108 hm.lastIncidentReport"]
  n2["index.esc"]:::internal-link
  n3["index.$"]:::internal-link
  n4["index.status.Z101.Teil4.Calls111"]:::internal-link
  n5["index.status.Z101.Teil4.Calls111.2"]:::internal-link
  n6["index.status.Z101.Teil4.Calls111.3"]:::internal-link
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n4 -->|"weiter"| n5
  n5 -->|"weiter"| n6
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.108 hm.lastIncidentReport
  Zeile 108: prüft `hm.lastIncidentReport`.
index.esc
  Maskiert HTML `esc`.
index.$
  `$` in `index.html`.
index.status.Z101.Teil4.Calls111
  Weitere eigene Aufrufe ab Zeile 111.
index.status.Z101.Teil4.Calls111.2
  Seite `index.status.Z101.Teil4.Calls111.2`.
index.status.Z101.Teil4.Calls111.3
  Seite `index.status.Z101.Teil4.Calls111.3`.
```

- Fortsetzung von `index.status.Z101`, Quellreihenfolge.
