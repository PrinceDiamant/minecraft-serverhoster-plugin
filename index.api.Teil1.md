[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Sitzung]] › [[index.api]] › [[index.api.Teil1]]

# index.api.Teil1

```mermaid
flowchart TD
  n1["index.scoped"]:::internal-link
  n2["if Z.79 r.status===401"]
  n3["index.showLogin"]:::internal-link
  n4["throw Z.79 throw new Error('Nicht angemeldet')"]
  n3 --> n4
  n2 -->|"ja"| n3
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n1 fill:#f88,stroke:#900
```

```knoten
index.scoped
  Gibt `path` unverändert zurück. Befund: Altlast (sicher).
if Z.79 r.status===401
  Zeile 79: prüft `r.status===401`.
index.showLogin
  Zeigt `showLogin`. Ruft `$`.
throw Z.79 throw new Error('Nicht angemeldet')
  Zeile 79: Abbruch `throw new Error('Nicht angemeldet')`.
```

- Fortsetzung von `index.api`, Quellreihenfolge.
