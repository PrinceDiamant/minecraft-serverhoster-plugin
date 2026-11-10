[[00 Start]] › [[Dashboard-HTTP]] › [[API-Setup]] › [[Dashboard.saveSettings]] › [[Dashboard.saveSettings.Teil1.Calls42317]]

# Dashboard.saveSettings.Teil1.Calls42317

```mermaid
flowchart TD
  n1["ServerHosterSettings.ServerHosterSettings"]:::internal-link
  n2["Dashboard.requiredInt"]:::internal-link
  n3["Dashboard.requiredLong"]:::internal-link
  n4["Dashboard.requiredLong"]:::internal-link
  n5["Dashboard.requiredLong"]:::internal-link
  n6["Dashboard.requiredString"]:::internal-link
  n1 -->|"Z.783"| n2
  n2 -->|"Z.784"| n3
  n3 -->|"Z.785"| n4
  n4 -->|"Z.786"| n5
  n5 -->|"Z.787"| n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
ServerHosterSettings.ServerHosterSettings
  Dieser Teil kümmert sich um das [[Glossar#Plugin|Plugin]] die [[Glossar#Einstellungen|Einstellungen]]. `ServerHosterSettings` in `ServerHosterSettings.java`. Ruft `maxAttempts`, `enumValue`, `hasUnsafeHostCharacter`.
Dashboard.requiredInt
  Liest eine Zahl, die in der Anfrage dabei sein muss. Liest verpflichtend `requiredInt`. Ruft `requiredLong`.
Dashboard.requiredLong
  Liest eine große Zahl, die in der Anfrage dabei sein muss. Liest verpflichtend `requiredLong`.
Dashboard.requiredString
  Liest einen Text, der in der Anfrage dabei sein muss. Liest verpflichtend `requiredString`.
```

> [!knoten]- Was die Blöcke tun
> - **ServerHosterSettings.ServerHosterSettings**: Dieser Teil kümmert sich um das [[Glossar#Plugin|Plugin]] die [[Glossar#Einstellungen|Einstellungen]]. `ServerHosterSettings` in `ServerHosterSettings.java`. Ruft `maxAttempts`, `enumValue`, `hasUnsafeHostCharacter`.
> - **Dashboard.requiredInt**: Liest eine Zahl, die in der Anfrage dabei sein muss. Liest verpflichtend `requiredInt`. Ruft `requiredLong`.
> - **Dashboard.requiredLong**: Liest eine große Zahl, die in der Anfrage dabei sein muss. Liest verpflichtend `requiredLong`.
> - **Dashboard.requiredString**: Liest einen Text, der in der Anfrage dabei sein muss. Liest verpflichtend `requiredString`.

- Weitere [[Glossar#Funktion|Funktionen]], die ab [[Glossar#Zeile|Zeile]] 42317 aufgerufen werden.
- Fortsetzung von `Dashboard.saveSettings.Teil1`.
