[[00 Start]] › [[Dashboard-HTTP]] › [[API-Antworten]]

# API-Antworten

```mermaid
flowchart TD
  n1["Dashboard.parseInt"]:::internal-link
  n2["Dashboard.readOr"]:::internal-link
  n3["Dashboard.readBodyText"]:::internal-link
  n4["Dashboard.body"]:::internal-link
  n5["Dashboard.query"]:::internal-link
  n6["Dashboard.json"]:::internal-link
  n7["Dashboard.text"]:::internal-link
  n8["Dashboard.send"]:::internal-link
  n9["Dashboard.sendBytes"]:::internal-link
  n4 -->|"Zeile 983"| n3
  n6 -->|"Zeile 996"| n9
  n7 -->|"Zeile 997"| n9
  n8 -->|"Zeile 998"| n9
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Dashboard.parseInt
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liest eine Zahl.
Dashboard.readOr
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liest oder den Ersatz.
Dashboard.readBodyText
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liest den Text den Text.
Dashboard.body
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer.
Dashboard.query
  Liest eine Angabe aus der Adresse der Anfrage.
Dashboard.json
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer.
Dashboard.text
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer.
Dashboard.send
  Schickt die Antwort an den Browser.
Dashboard.sendBytes
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] schickt die Größe.
```

> [!knoten] Was die Blöcke tun
> - **Dashboard.parseInt**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liest eine Zahl.
> - **Dashboard.readOr**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liest oder den Ersatz.
> - **Dashboard.readBodyText**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liest den Text den Text.
> - **Dashboard.body**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer.
> - **Dashboard.query**: Liest eine Angabe aus der Adresse der Anfrage.
> - **Dashboard.json**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer.
> - **Dashboard.text**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer.
> - **Dashboard.send**: Schickt die Antwort an den Browser.
> - **Dashboard.sendBytes**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] schickt die Größe.

- Wie eine Antwort an den Browser aussieht: Text, Zahlen oder eine Fehlermeldung.
