[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil4]]

# Dashboard.handle.Z103.Teil4

```mermaid
flowchart TD
  n1["if Z.119 (path.equals('/api/login') && method.equals('POST…"]
  n2["Dashboard.login"]:::internal-link
  n3["return Z.119 return;"]
  n4["if Z.120 (!path.startsWith('/api/'))"]
  n5["Dashboard.send"]:::internal-link
  n6["return Z.120 return;"]
  n2 --> n3
  n1 -->|"ja"| n2
  n5 --> n6
  n4 -->|"ja"| n5
  n3 --> n4
  n1 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.119 (path.equals('/api/login') && method.equals('POST…
  Zeile 119: prüft `(path.equals('/api/login') && method.equals('POST…`.
Dashboard.login
  Meldet an `login`. Ruft `ip`, `json`, `body`.
return Z.119 return;
  Zeile 119: Rückgabe `return;`.
if Z.120 (!path.startsWith('/api/'))
  Zeile 120: prüft `(!path.startsWith('/api/'))`.
Dashboard.send
  Sendet `send`. Ruft `sendBytes`.
return Z.120 return;
  Zeile 120: Rückgabe `return;`.
```

- Fortsetzung von `Dashboard.handle.Z103`, Quellreihenfolge.
