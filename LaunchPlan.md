[[00 Start]] › [[Server-Anlage]] › [[Startplan]] › [[LaunchPlan]]

# LaunchPlan

```mermaid
flowchart TD
  n1["LaunchPlan.LaunchPlan"]:::internal-link
  n2["LaunchPlan.jarName"]:::internal-link
  n3["LaunchPlan.jarPath"]:::internal-link
  n4["LaunchPlan.argv(String,ServerProfile)"]:::internal-link
  n5["LaunchPlan.argv(String,ServerProfile,Path)"]:::internal-link
  n6["LaunchPlan.text"]:::internal-link
  n7["LaunchPlan.fileName"]:::internal-link
  n2 -->|"Z.20"| n7
  n3 -->|"Z.27"| n2
  n4 -->|"Z.31"| n5
  n4 -->|"Z.31"| n3
  n6 -->|"Z.53"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
LaunchPlan.LaunchPlan
  Startet den Prozess `LaunchPlan`.
LaunchPlan.jarName
  Betrifft das Jar `jarName`. Ruft `fileName`.
LaunchPlan.jarPath
  Betrifft das Jar `jarPath`. Ruft `directory`, `jarName`.
LaunchPlan.argv(String,ServerProfile)
  `argv` in `LaunchPlan.java`. Ruft `argv`, `jarPath`.
LaunchPlan.argv(String,ServerProfile,Path)
  `argv` in `LaunchPlan.java`.
LaunchPlan.text
  Antwortet mit Text `text`. Ruft `argv`.
LaunchPlan.fileName
  Liefert die Datei `fileName`.
```


