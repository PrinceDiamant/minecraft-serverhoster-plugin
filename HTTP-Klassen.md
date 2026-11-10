[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Klassen]]

# HTTP-Klassen

```mermaid
flowchart TD
  n1["CrashIndex"]:::internal-link
  n2["LogQuery"]:::internal-link
  n3["DashboardPassword"]:::internal-link
  n4["HttpsSupport"]:::internal-link
  n1 -->|"Quelltext"| n2
  n2 -->|"Quelltext"| n3
  n3 -->|"Quelltext"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
CrashIndex
  Sucht Crash-Reports und liefert den Text.
LogQuery
  Filtert Logzeilen für die Ansicht.
DashboardPassword
  Prüft das Dashboard-Passwort und die Sitzung.
HttpsSupport
  TLS für den HTTP-Server.
```


