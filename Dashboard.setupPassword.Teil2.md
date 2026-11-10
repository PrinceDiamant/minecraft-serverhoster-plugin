[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Auth]] › [[Dashboard.setupPassword]] › [[Dashboard.setupPassword.Teil2]]

# Dashboard.setupPassword.Teil2

```mermaid
flowchart TD
  n1["if Z.301 (until != null && until ) now)"]
  n2["Dashboard.json"]:::internal-link
  n3["return Z.301 return;"]
  n4["Dashboard.parseJsonObject"]:::internal-link
  n5["Dashboard.readBodyText"]:::internal-link
  n6["Dashboard.requiredString"]:::internal-link
  n7["Dashboard.requiredString"]:::internal-link
  n8["Dashboard.setupPassword.Teil2.Z304"]:::internal-link
  n2 --> n3
  n1 -->|"ja"| n2
  n4 -->|"Z.302"| n5
  n3 --> n4
  n1 --> n4
  n5 --> n6
  n6 --> n7
  n7 --> n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.301 (until != null && until ) now)
  Zeile 301: prüft `(until != null && until ) now)`.
Dashboard.json
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.
return Z.301 return;
  Zeile 301: Rückgabe `return;`.
Dashboard.parseJsonObject
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liest die Antwort den Inhalt. Wertet aus `parseJsonObject`.
Dashboard.readBodyText
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liest den Text den Text. Liest `readBodyText`.
Dashboard.requiredString
  Liest einen Text, der in der Anfrage dabei sein muss. Liest verpflichtend `requiredString`.
Dashboard.setupPassword.Teil2.Z304
  Der Ablauf geht in [[Glossar#Zeile|Zeile]] 304 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 304.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.301 (until != null && until ) now)**: Zeile 301: prüft `(until != null && until ) now)`.
> - **Dashboard.json**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.
> - **return Z.301 return;**: Zeile 301: Rückgabe `return;`.
> - **Dashboard.parseJsonObject**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liest die Antwort den Inhalt. Wertet aus `parseJsonObject`.
> - **Dashboard.readBodyText**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liest den Text den Text. Liest `readBodyText`.
> - **Dashboard.requiredString**: Liest einen Text, der in der Anfrage dabei sein muss. Liest verpflichtend `requiredString`.
> - **Dashboard.setupPassword.Teil2.Z304**: Der Ablauf geht in [[Glossar#Zeile|Zeile]] 304 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 304.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `Dashboard.setupPassword`.
