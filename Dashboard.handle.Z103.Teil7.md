[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil7]]

# Dashboard.handle.Z103.Teil7

```mermaid
flowchart TD
  n1["if Z.137 (path.equals('/api/schedules') // path.startsWith…"]
  n2["Dashboard.schedulesApi"]:::internal-link
  n3["return Z.139 return;"]
  n4["Dashboard.handle.Z103.Teil7.Z141"]:::internal-link
  n2 --> n3
  n1 -->|"ja"| n2
  n3 --> n4
  n1 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.137 (path.equals('/api/schedules') // path.startsWith…
  Zeile 137: prüft `(path.equals('/api/schedules') // path.startsWith…`.
Dashboard.schedulesApi
  `schedulesApi` in `Dashboard.java`. Ruft `json`, `schedules`, `scheduleJson`.
return Z.139 return;
  Zeile 139: Rückgabe `return;`.
Dashboard.handle.Z103.Teil7.Z141
  Fortsetzung des Ablaufs ab Zeile 141.
```

- Fortsetzung von `Dashboard.handle.Z103`, Quellreihenfolge.
