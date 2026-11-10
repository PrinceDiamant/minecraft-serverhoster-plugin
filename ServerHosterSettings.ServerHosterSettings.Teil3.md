[[00 Start]] › [[Plugin-Kern]] › [[Konfiguration]] › [[ServerHosterSettings]] › [[ServerHosterSettings.ServerHosterSettings]] › [[ServerHosterSettings.ServerHosterSettings.Teil3]]

# ServerHosterSettings.ServerHosterSettings.Teil3

```mermaid
flowchart TD
  n1["for Z.38 (String segment : backupDirectory.repla…"]
  n2["if Z.39 ('..'.equals(segment))"]
  n3["throw Z.39 throw new IllegalArgumentException('FTP directory…"]
  n4["if Z.40 ('remote'.equals(backupStorage) && backupHost.isB…"]
  n5["throw Z.41 throw new IllegalArgumentException('FTP host is r…"]
  n2 -->|"ja"| n3
  n1 -->|"wiederholen"| n2
  n4 -->|"ja"| n5
  n3 --> n4
  n2 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `ServerHosterSettings.ServerHosterSettings`, Quellreihenfolge.
