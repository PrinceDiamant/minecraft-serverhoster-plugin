[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Status]] › [[index.status]] › [[index.status.Z101.Teil1]]

# index.status.Z101.Teil1

```mermaid
flowchart TD
  n1["index.api"]:::internal-link
  n2["if Z.101 generation!==statusGeneration"]
  n3["return Z.101 return;"]
  n4["index.updateChildActions"]:::internal-link
  n5["if Z.101 $('host-connection')"]
  n6["index.$"]:::internal-link
  n7["index.$"]:::internal-link
  n2 -->|"ja"| n3
  n1 --> n2
  n3 --> n4
  n2 --> n4
  n5 -->|"Z.101"| n6
  n6 -->|"ja"| n7
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `index.status.Z101`, Quellreihenfolge.
