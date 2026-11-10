[[00 Start]] › [[Dashboard-HTTP]] › [[API-Zeit]] › [[Dashboard.schedulesApi]] › [[Dashboard.schedulesApi.Teil1.Z349.Z354]]

# Dashboard.schedulesApi.Teil1.Z349.Z354

```mermaid
flowchart TD
  n1["if Z.354 (method.equals('POST'))"]
  n2["Dashboard.parseSchedule"]:::internal-link
  n3["Dashboard.readBodyText"]:::internal-link
  n4["Dashboard.schedulesApi.Teil1.Z349.Z354.Z355"]:::internal-link
  n5["Dashboard.json"]:::internal-link
  n6["ScheduleDef.toJson"]:::internal-link
  n7["return Z.366 return;"]
  n2 -->|"Z.355"| n3
  n3 --> n4
  n5 -->|"Z.365"| n6
  n4 --> n5
  n6 --> n7
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.354 (method.equals('POST'))
  Zeile 354: prüft `(method.equals('POST'))`.
Dashboard.parseSchedule
  Wertet aus `parseSchedule`. Ruft `load`.
Dashboard.readBodyText
  Liest `readBodyText`.
Dashboard.schedulesApi.Teil1.Z349.Z354.Z355
  Fortsetzung des Ablaufs ab Zeile 355.
Dashboard.json
  Antwortet mit JSON `json`. Ruft `sendBytes`.
ScheduleDef.toJson
  `toJson` in `ScheduleDef.java`. Ruft `toConfig`, `cron`.
return Z.366 return;
  Zeile 366: Rückgabe `return;`.
```

- Fortsetzung von `Dashboard.schedulesApi.Teil1.Z349`, Quellreihenfolge.
