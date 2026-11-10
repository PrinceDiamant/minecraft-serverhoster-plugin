[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Klassen]] › [[LogQuery]] › [[LogQuery.query]] › [[LogQuery.query.Teil2.Z56]]

# LogQuery.query.Teil2.Z56

```mermaid
flowchart TD
  n1["for Z.56 (String line : data.split('/n', -1))"]
  n2["if Z.57 (!levelOk(line, lv) // (!needle.isEmpty() && !lin…"]
  n3["LogQuery.levelOk"]:::internal-link
  n4["if Z.59 (keep.size() ) limit)"]
  n2 -->|"Z.57"| n3
  n3 --> n4
  n3 --> n4
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `LogQuery.query.Teil2`, Quellreihenfolge.
