[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Status]] › [[index.act]] › [[index.act.Z117]]

# index.act.Z117

```mermaid
flowchart TD
  n1["try Z.117"]
  n2["index.post"]:::internal-link
  n3["index.toast"]:::internal-link
  n4["finally Z.117"]
  n5["index.status"]:::internal-link
  n2 --> n3
  n1 --> n2
  n3 --> n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.117
  Zeile 117: Versuch. Der Fehlerpfad geht in catch.
index.post
  Schickt von der älteren [[Glossar#Bedienseite|Bedienseite]] einen Auftrag, der etwas ändert. Sendet POST `post`. Ruft `api`.
index.toast
  Zeigt in der älteren [[Glossar#Bedienseite|Bedienseite]] einen kurzen Hinweis. Zeigt eine Meldung `toast`. Ruft `$`.
finally Z.117
  Läuft danach immer, auch nach einem Fehler.
index.status
  Holt den Zustand und zeichnet ihn in die ältere [[Glossar#Bedienseite|Bedienseite]]. Liefert den Status `status`. Ruft `api`, `updateChildActions`, `$`.
```

> [!knoten]- Was die Blöcke tun
> - **try Z.117**: Zeile 117: Versuch. Der Fehlerpfad geht in catch.
> - **index.post**: Schickt von der älteren [[Glossar#Bedienseite|Bedienseite]] einen Auftrag, der etwas ändert. Sendet POST `post`. Ruft `api`.
> - **index.toast**: Zeigt in der älteren [[Glossar#Bedienseite|Bedienseite]] einen kurzen Hinweis. Zeigt eine Meldung `toast`. Ruft `$`.
> - **finally Z.117**: Läuft danach immer, auch nach einem Fehler.
> - **index.status**: Holt den Zustand und zeichnet ihn in die ältere [[Glossar#Bedienseite|Bedienseite]]. Liefert den Status `status`. Ruft `api`, `updateChildActions`, `$`.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 117 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `index.act`.
