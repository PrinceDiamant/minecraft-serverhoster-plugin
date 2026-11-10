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
  Liest, ob die [[Glossar#Bedienseite|Bedienseite]] verschlüsselt erreichbar sein soll. `dashboardTls` in `FabricLauncherPlugin.java`. Ruft `tls`.
ChildSlot.msptHistory
  Dieser Teil kümmert sich um den Verlauf. Liefert die Tickzeiten `msptHistory`.
Dashboard.status.Teil3.Z517
  Der Ablauf geht in [[Glossar#Zeile|Zeile]] 517 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 517.
Dashboard.spigotStats
  Liefert eine kurze Statistik, die der [[Glossar#Spielserver|Spielserver]] anbietet. `spigotStats` in `Dashboard.java`. Ruft `rssMb`.
FabricLauncherPlugin.hostMemoryView
  Stellt die Speichermessung so zusammen, wie die [[Glossar#Bedienseite|Bedienseite]] sie zeigt. Betrifft den [[Glossar#Host|Host]] `hostMemoryView`. Ruft `view`, `cgroupUsePercent`, `emergencyStopStarted`.
```

> [!knoten]- Was die Blöcke tun
> - **FabricLauncherPlugin.dashboardTls**: Liest, ob die [[Glossar#Bedienseite|Bedienseite]] verschlüsselt erreichbar sein soll. `dashboardTls` in `FabricLauncherPlugin.java`. Ruft `tls`.
> - **ChildSlot.msptHistory**: Dieser Teil kümmert sich um den Verlauf. Liefert die Tickzeiten `msptHistory`.
> - **Dashboard.status.Teil3.Z517**: Der Ablauf geht in [[Glossar#Zeile|Zeile]] 517 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 517.
> - **Dashboard.spigotStats**: Liefert eine kurze Statistik, die der [[Glossar#Spielserver|Spielserver]] anbietet. `spigotStats` in `Dashboard.java`. Ruft `rssMb`.
> - **FabricLauncherPlugin.hostMemoryView**: Stellt die Speichermessung so zusammen, wie die [[Glossar#Bedienseite|Bedienseite]] sie zeigt. Betrifft den [[Glossar#Host|Host]] `hostMemoryView`. Ruft `view`, `cgroupUsePercent`, `emergencyStopStarted`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `Dashboard.status`.
