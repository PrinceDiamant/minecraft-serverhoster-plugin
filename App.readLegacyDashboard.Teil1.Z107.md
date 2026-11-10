[[00 Start]] › [[Dashboard-UI]] › [[UI-App]] › [[App.readLegacyDashboard]] › [[App.readLegacyDashboard.Teil1.Z107]]

# App.readLegacyDashboard.Teil1.Z107

```mermaid
flowchart TD
  n1["for Z.107 ( ('t-players', 'player-workflow-root')…"]
  n2["if Z.114 !section"]
  n3["throw Z.114 throw new Error('Dashboard section $(sectionId) i…"]
  n2 -->|"ja"| n3
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `App.readLegacyDashboard.Teil1`, Quellreihenfolge.
