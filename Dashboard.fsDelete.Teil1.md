[[00 Start]] › [[Dashboard-HTTP]] › [[API-Dateien]] › [[Dashboard.fsDelete]] › [[Dashboard.fsDelete.Teil1]]

# Dashboard.fsDelete.Teil1

```mermaid
flowchart TD
  n1["Dashboard.readBodyText"]:::internal-link
  n2["Dashboard.safe"]:::internal-link
  n3["if Z.911 (p.equals(root(sid)))"]
  n4["Dashboard.root"]:::internal-link
  n5["throw Z.911 throw new SecurityException('Wurzelordner kann ni…"]
  n6["if Z.912 (!o.has('confirm') // !o.get('confirm').getAsStri…"]
  n7["Dashboard.json"]:::internal-link
  n8["return Z.912 return;"]
  n9["Schritt Z.913 Files.delete(p);"]
  n1 --> n2
  n3 -->|"Z.911"| n4
  n4 -->|"ja"| n5
  n2 --> n3
  n7 --> n8
  n6 -->|"ja"| n7
  n5 --> n6
  n4 --> n6
  n8 --> n9
  n6 --> n9
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Dashboard.readBodyText
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liest den Text den Text. Liest `readBodyText`.
Dashboard.safe
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Prüft die Pfadgrenze `safe`. Ruft `guard`, `resolve`.
if Z.911 (p.equals(root(sid)))
  Zeile 911: prüft `(p.equals(root(sid)))`.
Dashboard.root
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Liefert die Wurzel `root`. Ruft `guard`, `root`.
throw Z.911 throw new SecurityException('Wurzelordner kann ni…
  Zeile 911: Abbruch `throw new SecurityException('Wurzelordner kann ni…`.
if Z.912 (!o.has('confirm') // !o.get('confirm').getAsStri…
  Zeile 912: prüft `(!o.has('confirm') // !o.get('confirm').getAsStri…`.
Dashboard.json
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.
return Z.912 return;
  Zeile 912: Rückgabe `return;`.
Schritt Z.913 Files.delete(p);
  Zeile 913: Dateioperation. `Files.delete(p);`
```

> [!knoten]- Was die Blöcke tun
> - **Dashboard.readBodyText**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liest den Text den Text. Liest `readBodyText`.
> - **Dashboard.safe**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Prüft die Pfadgrenze `safe`. Ruft `guard`, `resolve`.
> - **if Z.911 (p.equals(root(sid)))**: Zeile 911: prüft `(p.equals(root(sid)))`.
> - **Dashboard.root**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Liefert die Wurzel `root`. Ruft `guard`, `root`.
> - **throw Z.911 throw new SecurityException('Wurzelordner kann ni…**: Zeile 911: Abbruch `throw new SecurityException('Wurzelordner kann ni…`.
> - **if Z.912 (!o.has('confirm') // !o.get('confirm').getAsStri…**: Zeile 912: prüft `(!o.has('confirm') // !o.get('confirm').getAsStri…`.
> - **Dashboard.json**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.
> - **return Z.912 return;**: Zeile 912: Rückgabe `return;`.
> - **Schritt Z.913 Files.delete(p);**: Zeile 913: Dateioperation. `Files.delete(p);`

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `Dashboard.fsDelete`.
