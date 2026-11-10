[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil7.Z141.Cases255]]

# Dashboard.handle.Z103.Teil7.Z141.Cases255

```mermaid
flowchart TD
  n1["case Z.255 'GET /api/backup'"]
  n2["Dashboard.handle.Z103.Teil7.Z141.Case255"]:::internal-link
  n3["case Z.262 'GET /api/backup/download'"]
  n4["Dashboard.backupDownload"]:::internal-link
  n5["case Z.263 'POST /api/backup'"]
  n6["Dashboard.handle.Z103.Teil7.Z141.Case263"]:::internal-link
  n7["case Z.264 'POST /api/backup/delete'"]
  n8["Dashboard.backupMutate"]:::internal-link
  n9["case Z.265 'POST /api/backup/restore'"]
  n10["Dashboard.backupMutate"]:::internal-link
  n1 --> n2
  n3 --> n4
  n5 --> n6
  n7 --> n8
  n9 --> n10
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n4 fill:#f88,stroke:#900
```

- Fortsetzung von `Dashboard.handle.Z103.Teil7.Z141`, Quellreihenfolge.
