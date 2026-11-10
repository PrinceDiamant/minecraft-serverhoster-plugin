[[00 Start]] › [[Server-Anlage]] › [[Versionen]] › [[Upstream]]

# Upstream

```mermaid
flowchart TD
  n1["Upstream.Upstream"]:::internal-link
  n2["Upstream.getText"]:::internal-link
  n3["Upstream.getJson"]:::internal-link
  n4["Upstream.download(String,Path)"]:::internal-link
  n5["Upstream.download(String,Path,String,String)"]:::internal-link
  n6["Upstream.checkHash"]:::internal-link
  n7["Upstream.digest"]:::internal-link
  n4 -->|"Z.43"| n5
  n5 -->|"Z.50"| n6
  n6 -->|"Z.57"| n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```


