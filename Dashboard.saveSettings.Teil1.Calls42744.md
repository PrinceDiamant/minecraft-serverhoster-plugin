[[00 Start]] › [[Dashboard-HTTP]] › [[API-Setup]] › [[Dashboard.saveSettings]] › [[Dashboard.saveSettings.Teil1.Calls42744]]

# Dashboard.saveSettings.Teil1.Calls42744

```mermaid
flowchart TD
  n1["Dashboard.requiredString"]:::internal-link
  n2["Dashboard.requiredString"]:::internal-link
  n3["Dashboard.requiredInt"]:::internal-link
  n4["Dashboard.requiredString"]:::internal-link
  n1 -->|"Z.789"| n2
  n2 -->|"Z.790"| n3
  n3 -->|"Z.791"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Dashboard.requiredString
  Liest einen Text, der in der Anfrage dabei sein muss. Liest verpflichtend `requiredString`.
Dashboard.requiredInt
  Liest eine Zahl, die in der Anfrage dabei sein muss. Liest verpflichtend `requiredInt`. Ruft `requiredLong`.
```

> [!knoten]- Was die Blöcke tun
> - **Dashboard.requiredString**: Liest einen Text, der in der Anfrage dabei sein muss. Liest verpflichtend `requiredString`.
> - **Dashboard.requiredInt**: Liest eine Zahl, die in der Anfrage dabei sein muss. Liest verpflichtend `requiredInt`. Ruft `requiredLong`.

- Weitere [[Glossar#Funktion|Funktionen]], die ab [[Glossar#Zeile|Zeile]] 42744 aufgerufen werden.
- Fortsetzung von `Dashboard.saveSettings.Teil1`.
