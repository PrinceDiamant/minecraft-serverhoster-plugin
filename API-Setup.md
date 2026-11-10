[[00 Start]] › [[Dashboard-HTTP]] › [[API-Setup]]

# API-Setup

```mermaid
flowchart TD
  n1["Dashboard.setup"]:::internal-link
  n2["Dashboard.hostMinimize"]:::internal-link
  n3["Dashboard.requiredString"]:::internal-link
  n4["Dashboard.optionalString"]:::internal-link
  n5["Dashboard.saveProps"]:::internal-link
  n6["Dashboard.saveConfig"]:::internal-link
  n7["Dashboard.saveSettings"]:::internal-link
  n8["Dashboard.requiredInt"]:::internal-link
  n9["Dashboard.requiredLong"]:::internal-link
  n10["Dashboard.guard"]:::internal-link
  n1 -->|"Zeile 536"| n3
  n1 -->|"Zeile 538"| n4
  n2 -->|"Zeile 574"| n3
  n2 -->|"Zeile 575"| n4
  n7 -->|"Zeile 783"| n8
  n7 -->|"Zeile 784"| n9
  n7 -->|"Zeile 787"| n3
  n8 -->|"Zeile 797"| n9
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Dashboard.setup
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer.
Dashboard.hostMinimize
  Nimmt von der [[Glossar#Bedienseite|Bedienseite]] den Auftrag an, den [[Glossar#Host|Host]] zu verkleinern oder das zurückzunehmen.
Dashboard.requiredString
  Liest einen Text, der in der Anfrage dabei sein muss.
Dashboard.optionalString
  Liest einen Text, der in der Anfrage fehlen darf.
Dashboard.saveProps
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] speichert die Eigenschaften.
Dashboard.saveConfig
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] speichert die [[Glossar#Einstellungen|Einstellungen]].
Dashboard.saveSettings
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] speichert die [[Glossar#Einstellungen|Einstellungen]].
Dashboard.requiredInt
  Liest eine Zahl, die in der Anfrage dabei sein muss.
Dashboard.requiredLong
  Liest eine große Zahl, die in der Anfrage dabei sein muss.
Dashboard.guard
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer.
```

> [!knoten] Was die Blöcke tun
> - **Dashboard.setup**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer.
> - **Dashboard.hostMinimize**: Nimmt von der [[Glossar#Bedienseite|Bedienseite]] den Auftrag an, den [[Glossar#Host|Host]] zu verkleinern oder das zurückzunehmen.
> - **Dashboard.requiredString**: Liest einen Text, der in der Anfrage dabei sein muss.
> - **Dashboard.optionalString**: Liest einen Text, der in der Anfrage fehlen darf.
> - **Dashboard.saveProps**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] speichert die Eigenschaften.
> - **Dashboard.saveConfig**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] speichert die [[Glossar#Einstellungen|Einstellungen]].
> - **Dashboard.saveSettings**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] speichert die [[Glossar#Einstellungen|Einstellungen]].
> - **Dashboard.requiredInt**: Liest eine Zahl, die in der Anfrage dabei sein muss.
> - **Dashboard.requiredLong**: Liest eine große Zahl, die in der Anfrage dabei sein muss.
> - **Dashboard.guard**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer.

- Die [[Glossar#Einrichtung|Einrichtung]] über die [[Glossar#Bedienseite|Bedienseite]], inklusive Übernehmen einer älteren Anlage.
