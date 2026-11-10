[[00 Start]] › [[Dashboard-HTTP]] › [[API-Status]] › [[Dashboard.spigotStats]] › [[Dashboard.spigotStats.Teil1]]

# Dashboard.spigotStats.Teil1

```mermaid
flowchart TD
  n1["Schritt Z.639 Runtime rt = Runtime.getRuntime();"]
  n2["try Z.643"]
  n3["if Z.645 (os instanceof com.sun.management.OperatingSystem…"]
  n4["Schritt Z.647 o.put('cpu', l ( 0 ? -1 : Math.round(l * Runtime.…"]
  n5["catch Z.649 (Throwable ignored)"]
  n6["Schritt Z.651 long self = ProcessHandle.current().pid();"]
  n3 -->|"ja"| n4
  n2 --> n3
  n2 -->|"Fehler"| n5
  n1 --> n2
  n4 --> n6
  n3 --> n6
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `Dashboard.spigotStats`, Quellreihenfolge.
