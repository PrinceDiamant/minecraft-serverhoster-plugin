[[00 Start]] › [[Dashboard-HTTP]] › [[API-Status]] › [[Dashboard.status]] › [[Dashboard.status.Teil2]]

# Dashboard.status.Teil2

```mermaid
flowchart TD
  n1["SupervisorHealth.dashboardState"]:::internal-link
  n2["ChildSlot.running"]:::internal-link
  n3["ChildSlot.uptimeMillis"]:::internal-link
  n4["Dashboard.formatBindAddress"]:::internal-link
  n5["FabricLauncherPlugin.childBindAddress"]:::internal-link
  n1 -->|"Z.503"| n2
  n2 --> n3
  n4 -->|"Z.511"| n5
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `Dashboard.status`, Quellreihenfolge.
