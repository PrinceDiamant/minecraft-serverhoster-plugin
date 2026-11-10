[[00 Start]] › [[Dashboard-HTTP]] › [[API-Zeit]]

# API-Zeit

```mermaid
flowchart TD
  n1["Dashboard.schedulesApi"]:::internal-link
  n2["Dashboard.parseSchedule"]:::internal-link
  n3["Dashboard.parseJsonObject"]:::internal-link
  n4["Dashboard.scheduleJson"]:::internal-link
  n5["Dashboard.scheduleIndex"]:::internal-link
  n6["Dashboard.taskJson"]:::internal-link
  n1 -->|"Zeile 351"| n4
  n1 -->|"Zeile 355"| n2
  n1 -->|"Zeile 385"| n3
  n1 -->|"Zeile 393"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Dashboard.schedulesApi
  Nimmt Aufträge zu den Zeitplänen an.
Dashboard.parseSchedule
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liest den [[Glossar#Zeitplan|Zeitplan]].
Dashboard.parseJsonObject
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liest die Antwort den Inhalt.
Dashboard.scheduleJson
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] plant die Antwort.
Dashboard.scheduleIndex
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] plant die Position.
Dashboard.taskJson
  Liefert eine [[Glossar#Aufgabe|Aufgabe]] als Antwort an die [[Glossar#Bedienseite|Bedienseite]].
```

> [!knoten] Was die Blöcke tun
> - **Dashboard.schedulesApi**: Nimmt Aufträge zu den Zeitplänen an.
> - **Dashboard.parseSchedule**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liest den [[Glossar#Zeitplan|Zeitplan]].
> - **Dashboard.parseJsonObject**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liest die Antwort den Inhalt.
> - **Dashboard.scheduleJson**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] plant die Antwort.
> - **Dashboard.scheduleIndex**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] plant die Position.
> - **Dashboard.taskJson**: Liefert eine [[Glossar#Aufgabe|Aufgabe]] als Antwort an die [[Glossar#Bedienseite|Bedienseite]].

- Liefert und ändert Zeitpläne und die ältere Aufgabenliste.
