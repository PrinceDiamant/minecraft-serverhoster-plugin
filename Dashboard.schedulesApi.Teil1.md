[[00 Start]] › [[Dashboard-HTTP]] › [[API-Zeit]] › [[Dashboard.schedulesApi]] › [[Dashboard.schedulesApi.Teil1]]

# Dashboard.schedulesApi.Teil1

```mermaid
flowchart TD
  n1["Dashboard.schedulesApi.Teil1.Z349"]:::internal-link
  n2["if Z.375 (id.isBlank() // !id.matches('(A-Za-z0-9_-)(1,64)…"]
  n3["throw Z.376 throw new IllegalArgumentException('Ungültige Sch…"]
  n4["if Z.378 (parts.length == 2 && parts(1).equals('run') && m…"]
  n5["FabricLauncherPlugin.runScheduleNow"]:::internal-link
  n6["Dashboard.json"]:::internal-link
  n7["return Z.381 return;"]
  n2 -->|"ja"| n3
  n1 --> n2
  n5 --> n6
  n6 --> n7
  n4 -->|"ja"| n5
  n3 --> n4
  n2 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Dashboard.schedulesApi.Teil1.Z349
  Fortsetzung des Ablaufs ab Zeile 349.
if Z.375 (id.isBlank() // !id.matches('(A-Za-z0-9_-)(1,64)…
  Zeile 375: prüft `(id.isBlank() // !id.matches('(A-Za-z0-9_-)(1,64)…`.
throw Z.376 throw new IllegalArgumentException('Ungültige Sch…
  Zeile 376: Abbruch `throw new IllegalArgumentException('Ungültige Sch…`.
if Z.378 (parts.length == 2 && parts(1).equals('run') && m…
  Zeile 378: prüft `(parts.length == 2 && parts(1).equals('run') && m…`.
FabricLauncherPlugin.runScheduleNow
  Führt aus `runScheduleNow`. Ruft `markManualScheduleRun`, `runSchedule`.
Dashboard.json
  Antwortet mit JSON `json`. Ruft `sendBytes`.
return Z.381 return;
  Zeile 381: Rückgabe `return;`.
```

- Fortsetzung von `Dashboard.schedulesApi`, Quellreihenfolge.
