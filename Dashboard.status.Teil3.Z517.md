[[00 Start]] › [[Dashboard-HTTP]] › [[API-Status]] › [[Dashboard.status]] › [[Dashboard.status.Teil3.Z517]]

# Dashboard.status.Teil3.Z517

```mermaid
flowchart TD
  n1["if Z.517 (pid ) 0)"]
  n2["Dashboard.cpu"]:::internal-link
  n3["Dashboard.rssMb"]:::internal-link
  n4["Dashboard.procField"]:::internal-link
  n5["FabricLauncherPlugin.maybeQueryChildTick"]:::internal-link
  n6["if Z.520 (System.currentTimeMillis() - slot.tickAt ( 60_00…"]
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n2 fill:#f88,stroke:#900
```

```knoten
if Z.517 (pid ) 0)
  Zeile 517: prüft `(pid ) 0)`.
Dashboard.cpu
  Liest `/proc/<pid>/stat` und teilt durch 100. Befund: Logikrisiko (prüfen).
Dashboard.rssMb
  `rssMb` in `Dashboard.java`.
Dashboard.procField
  `procField` in `Dashboard.java`.
FabricLauncherPlugin.maybeQueryChildTick
  Führt nur aus, wenn die Sperrzeit um ist `maybeQueryChildTick`. Ruft `slot`, `running`, `send`.
if Z.520 (System.currentTimeMillis() - slot.tickAt ( 60_00…
  Zeile 520: prüft `(System.currentTimeMillis() - slot.tickAt ( 60_00…`.
```

- Fortsetzung von `Dashboard.status.Teil3`, Quellreihenfolge.
