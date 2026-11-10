[[00 Start]] › [[Dashboard-HTTP]]

# Dashboard-HTTP

```mermaid
flowchart TD
  n1["HTTP-Start"]:::internal-link
  n2["HTTP-Routing"]:::internal-link
  n3["HTTP-Auth"]:::internal-link
  n4["API-Zeit"]:::internal-link
  n5["API-Status"]:::internal-link
  n6["API-Setup"]:::internal-link
  n7["API-Backup"]:::internal-link
  n8["API-Spieler"]:::internal-link
  n9["API-Dateien"]:::internal-link
  n10["API-Antworten"]:::internal-link
  n11["HTTP-Klassen"]:::internal-link
  n1 -->|"Quelltext"| n2
  n2 -->|"Quelltext"| n3
  n3 -->|"Quelltext"| n4
  n4 -->|"Quelltext"| n5
  n5 -->|"Quelltext"| n6
  n6 -->|"Quelltext"| n7
  n7 -->|"Quelltext"| n8
  n8 -->|"Quelltext"| n9
  n9 -->|"Quelltext"| n10
  n10 -->|"Quelltext"| n11
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
HTTP-Start
  Startet den HTTP-Server, Port, TLS und den Pool ServerhosterPlugin-Web.
HTTP-Routing
  Verzweigt Methode und Pfad auf den passenden Handler.
HTTP-Auth
  Login, Cookie und Sitzung. SESSION_TTL ist 12 Stunden.
API-Zeit
  Tasks und Zeitpläne über HTTP.
API-Status
  Status, Konsole und Diagnose für das Dashboard.
API-Setup
  Einrichtung und Import über HTTP.
API-Backup
  Backup starten, herunterladen, löschen, Ziel prüfen.
API-Spieler
  Spielerliste und Spielerbefehle.
API-Dateien
  Verzeichnis lesen, Datei schreiben, umbenennen, löschen.
API-Antworten
  JSON, Text, Statuscode und Fehlerantwort.
HTTP-Klassen
  Passwort, TLS, Logfilter und Crash-Index.
```

- `HttpServer`-Kontext `/` zeigt auf `Dashboard.handle`.
