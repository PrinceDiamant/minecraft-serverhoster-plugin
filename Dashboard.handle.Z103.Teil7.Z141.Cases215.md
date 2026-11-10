[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil7.Z141.Cases215]]

# Dashboard.handle.Z103.Teil7.Z141.Cases215

```mermaid
flowchart TD
  n1["case Z.215 'GET /api/fs/read'"]
  n2["Dashboard.fsRead"]:::internal-link
  n3["case Z.216 'GET /api/fs/download'"]
  n4["Dashboard.fsDownload"]:::internal-link
  n5["case Z.217 'POST /api/fs/write'"]
  n6["Dashboard.fsWrite"]:::internal-link
  n7["case Z.218 'POST /api/fs/upload'"]
  n8["Dashboard.fsUpload"]:::internal-link
  n9["case Z.219 'POST /api/fs/rename'"]
  n10["Dashboard.fsRename"]:::internal-link
  n1 --> n2
  n3 --> n4
  n5 --> n6
  n7 --> n8
  n9 --> n10
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `Dashboard.handle.Z103.Teil7.Z141`, Quellreihenfolge.
