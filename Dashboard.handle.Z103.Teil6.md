[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil6]]

# Dashboard.handle.Z103.Teil6

```mermaid
flowchart TD
  n1["if Z.131 (csrfRejected(method, ex.getRequestHeaders().getF…"]
  n2["Dashboard.csrfRejected"]:::internal-link
  n3["Dashboard.json"]:::internal-link
  n4["return Z.133 return;"]
  n5["Dashboard.query"]:::internal-link
  n6["FabricLauncherPlugin.focusId"]:::internal-link
  n1 -->|"Z.131"| n2
  n3 --> n4
  n2 -->|"ja"| n3
  n4 --> n5
  n2 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.131 (csrfRejected(method, ex.getRequestHeaders().getF…
  Zeile 131: prüft `(csrfRejected(method, ex.getRequestHeaders().getF…`.
Dashboard.csrfRejected
  `csrfRejected` in `Dashboard.java`.
Dashboard.json
  Antwortet mit JSON `json`. Ruft `sendBytes`.
return Z.133 return;
  Zeile 133: Rückgabe `return;`.
Dashboard.query
  Fragt ab `query`.
FabricLauncherPlugin.focusId
  Liefert oder setzt den Fokus `focusId`.
```

- Fortsetzung von `Dashboard.handle.Z103`, Quellreihenfolge.
