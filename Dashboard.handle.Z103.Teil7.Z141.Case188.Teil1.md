[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil7.Z141.Case188.Teil1]]

# Dashboard.handle.Z103.Teil7.Z141.Case188.Teil1

```mermaid
flowchart TD
  n1["Dashboard.parseJsonObject"]:::internal-link
  n2["Dashboard.readBodyText"]:::internal-link
  n3["if Z.190 (!request.has('paths') // !request.get('paths').i…"]
  n4["throw Z.191 throw new IllegalArgumentException('Backup-Pfade …"]
  n5["for Z.193 (JsonElement element : request.getAsJso…"]
  n6["if Z.194 (!element.isJsonPrimitive() // !element.getAsJson…"]
  n7["throw Z.195 throw new IllegalArgumentException('Backup-Pfade …"]
  n1 -->|"Z.189"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n6 -->|"ja"| n7
  n5 -->|"wiederholen"| n6
  n4 --> n5
  n3 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `Dashboard.handle.Z103.Teil7.Z141.Case188`, Quellreihenfolge.
