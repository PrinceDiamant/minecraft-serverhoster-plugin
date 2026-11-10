[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil1]]

# Dashboard.handle.Z103.Teil1

```mermaid
flowchart TD
  n1["if Z.107 (tls)"]
  n2["if Z.110 (isDashboardPage(path) && method.equals('GET'))"]
  n3["Dashboard.isDashboardPage"]:::internal-link
  n4["Dashboard.serveIndex"]:::internal-link
  n5["return Z.110 return;"]
  n2 -->|"Z.110"| n3
  n4 --> n5
  n3 -->|"ja"| n4
  n1 --> n2
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.107 (tls)
  Zeile 107: prüft `(tls)`.
if Z.110 (isDashboardPage(path) && method.equals('GET'))
  Zeile 110: prüft `(isDashboardPage(path) && method.equals('GET'))`.
Dashboard.isDashboardPage
  Prüft `isDashboardPage`.
Dashboard.serveIndex
  Liefert `serveIndex`. Ruft `sendBytes`.
return Z.110 return;
  Zeile 110: Rückgabe `return;`.
```

- Fortsetzung von `Dashboard.handle.Z103`, Quellreihenfolge.
