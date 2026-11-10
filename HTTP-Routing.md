[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]]

# HTTP-Routing

```mermaid
flowchart TD
  n1["Dashboard.handle"]:::internal-link
  n2["Dashboard.isDashboardPage"]:::internal-link
  n3["Dashboard.serveIndex"]:::internal-link
  n4["Dashboard.serveWebAsset"]:::internal-link
  n5["Dashboard.serveThirdPartyNotices"]:::internal-link
  n1 -->|"Zeile 110"| n2
  n1 -->|"Zeile 110"| n3
  n1 -->|"Zeile 111"| n4
  n1 -->|"Zeile 112"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Dashboard.handle
  Nimmt eine Anfrage des Browsers an und verteilt sie an [[Glossar#Anmeldung|Anmeldung]], Zustand, Dateien oder die anderen Aufträge.
Dashboard.isDashboardPage
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] prüft die [[Glossar#Bedienseite|Bedienseite]] die Seite.
Dashboard.serveIndex
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liefert die Position.
Dashboard.serveWebAsset
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liefert die Seite eine Datei der Seite.
Dashboard.serveThirdPartyNotices
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liefert fremde Bausteine die Hinweise.
```

> [!knoten] Was die Blöcke tun
> - **Dashboard.handle**: Nimmt eine Anfrage des Browsers an und verteilt sie an [[Glossar#Anmeldung|Anmeldung]], Zustand, Dateien oder die anderen Aufträge.
> - **Dashboard.isDashboardPage**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] prüft die [[Glossar#Bedienseite|Bedienseite]] die Seite.
> - **Dashboard.serveIndex**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liefert die Position.
> - **Dashboard.serveWebAsset**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liefert die Seite eine Datei der Seite.
> - **Dashboard.serveThirdPartyNotices**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liefert fremde Bausteine die Hinweise.

- Sieht nach, welche Adresse der Browser aufgerufen hat, und gibt den Auftrag an den passenden Teil weiter.
