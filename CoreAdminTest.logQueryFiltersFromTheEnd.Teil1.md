[[00 Start]] › [[Tests]] › [[CoreAdminTest]] › [[CoreAdminTest.Teil3]] › [[CoreAdminTest.logQueryFiltersFromTheEnd]] › [[CoreAdminTest.logQueryFiltersFromTheEnd.Teil1]]

# CoreAdminTest.logQueryFiltersFromTheEnd.Teil1

```mermaid
flowchart TD
  n1["Schritt Z.256 Files.writeString(log, 'INFO start/nWARN disk/nER…"]
  n2["LogQuery.query"]:::internal-link
  n3["LogQuery.query"]:::internal-link
  n4["Schritt Z.264 Files.write(tmp.resolve('big.log'), big);"]
  n1 --> n2
  n2 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `CoreAdminTest.logQueryFiltersFromTheEnd`, Quellreihenfolge.
