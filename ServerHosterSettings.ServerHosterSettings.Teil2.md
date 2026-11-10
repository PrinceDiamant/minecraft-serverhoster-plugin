[[00 Start]] › [[Plugin-Kern]] › [[Konfiguration]] › [[ServerHosterSettings]] › [[ServerHosterSettings.ServerHosterSettings]] › [[ServerHosterSettings.ServerHosterSettings.Teil2]]

# ServerHosterSettings.ServerHosterSettings.Teil2

```mermaid
flowchart TD
  n1["if Z.32 (backupPort ( 1 // backupPort ) 65_535)"]
  n2["throw Z.33 throw new IllegalArgumentException('FTP port must…"]
  n3["if Z.34 (backupHost.length() ) 253 // hasUnsafeHostCharac…"]
  n4["ServerHosterSettings.hasUnsafeHostCharacter"]:::internal-link
  n5["throw Z.35 throw new IllegalArgumentException('FTP host is i…"]
  n6["if Z.36 (backupDirectory.length() ) 512 // containsContro…"]
  n7["ServerHosterSettings.containsControlCharacter"]:::internal-link
  n8["throw Z.37 throw new IllegalArgumentException('FTP directory…"]
  n1 -->|"ja"| n2
  n3 -->|"Z.34"| n4
  n4 -->|"ja"| n5
  n2 --> n3
  n1 --> n3
  n6 -->|"Z.36"| n7
  n7 -->|"ja"| n8
  n5 --> n6
  n4 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `ServerHosterSettings.ServerHosterSettings`, Quellreihenfolge.
