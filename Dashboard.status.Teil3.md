[[00 Start]] › [[Dashboard-HTTP]] › [[API-Status]] › [[Dashboard.status]] › [[Dashboard.status.Teil3]]

# Dashboard.status.Teil3

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.dashboardTls"]:::internal-link
  n2["ChildSlot.msptHistory"]:::internal-link
  n3["Dashboard.status.Teil3.Z517"]:::internal-link
  n4["Dashboard.spigotStats"]:::internal-link
  n5["FabricLauncherPlugin.hostMemoryView"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.dashboardTls
  `dashboardTls` in `FabricLauncherPlugin.java`. Ruft `tls`.
ChildSlot.msptHistory
  Liefert die Tickzeiten `msptHistory`.
Dashboard.status.Teil3.Z517
  Fortsetzung des Ablaufs ab Zeile 517.
Dashboard.spigotStats
  `spigotStats` in `Dashboard.java`. Ruft `rssMb`.
FabricLauncherPlugin.hostMemoryView
  Betrifft den Host `hostMemoryView`. Ruft `view`, `cgroupUsePercent`, `emergencyStopStarted`.
```

- Fortsetzung von `Dashboard.status`, Quellreihenfolge.
