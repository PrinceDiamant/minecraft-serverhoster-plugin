[[00 Start]] › [[Dashboard-HTTP]] › [[API-Dateien]] › [[Dashboard.fsUpload]] › [[Dashboard.fsUpload.Teil2.Z882]]

# Dashboard.fsUpload.Teil2.Z882

```mermaid
flowchart TD
  n1["try Z.882"]
  n2["while Z.884 ((r = in.read(buf)) ) 0)"]
  n3["if Z.884 (n ) MAX_UPLOAD)"]
  n4["throw Z.884 throw new IOException('Upload zu groß (max 1 GB)'…"]
  n5["catch Z.885 (IOException e)"]
  n6["Schritt Z.885 Files.deleteIfExists(tmp);"]
  n7["throw Z.885 throw e;"]
  n3 -->|"ja"| n4
  n2 -->|"wiederholen"| n3
  n1 --> n2
  n1 -->|"Fehler"| n5
  n6 --> n7
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `Dashboard.fsUpload.Teil2`, Quellreihenfolge.
