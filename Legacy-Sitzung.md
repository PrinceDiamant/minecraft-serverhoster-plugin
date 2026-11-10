[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Sitzung]]

# Legacy-Sitzung

```mermaid
flowchart TD
  n1["index.$"]:::internal-link
  n2["index.toast"]:::internal-link
  n3["index.scoped"]:::internal-link
  n4["index.api"]:::internal-link
  n5["index.post"]:::internal-link
  n6["index.esc"]:::internal-link
  n7["index.showLogin"]:::internal-link
  n8["index.doLogin"]:::internal-link
  n9["index.logout"]:::internal-link
  n10["index.tab"]:::internal-link
  n11["index.start"]:::internal-link
  n2 -->|"Zeile 76"| n1
  n4 -->|"Zeile 78"| n3
  n4 -->|"Zeile 79"| n7
  n4 -->|"Zeile 81"| n2
  n5 -->|"Zeile 82"| n4
  n7 -->|"Zeile 84"| n1
  n8 -->|"Zeile 85"| n1
  n8 -->|"Zeile 86"| n11
  n9 -->|"Zeile 87"| n5
  n9 -->|"Zeile 87"| n7
  n10 -->|"Zeile 88"| n1
  n11 -->|"Zeile 220"| n1
  n11 -->|"Zeile 220"| n10
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n3 fill:#f88,stroke:#900
  style n11 fill:#f88,stroke:#900
```

```knoten
index.$
  Sucht auf der älteren [[Glossar#Bedienseite|Bedienseite]] ein einzelnes Element.
index.toast
  Zeigt in der älteren [[Glossar#Bedienseite|Bedienseite]] einen kurzen Hinweis.
index.scoped
  Gibt einen Dateipfad unverändert zurück. Der Name klingt nach einer Prüfung, es ist aber keine. Auffällig: ein alter Weg läuft noch mit. Das nennt man [[Glossar#Altlast|Altlast]].
index.api
  Schickt von der älteren [[Glossar#Bedienseite|Bedienseite]] eine Anfrage an die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]].
index.post
  Schickt von der älteren [[Glossar#Bedienseite|Bedienseite]] einen Auftrag, der etwas ändert.
index.esc
  Macht einen Text so ungefährlich, dass die Seite ihn anzeigen kann.
index.showLogin
  Die ältere [[Glossar#Bedienseite|Bedienseite]] zeigt die [[Glossar#Anmeldung|Anmeldung]].
index.doLogin
  Die ältere [[Glossar#Bedienseite|Bedienseite]] führt aus die [[Glossar#Anmeldung|Anmeldung]].
index.logout
  Meldet von der älteren [[Glossar#Bedienseite|Bedienseite]] ab.
index.tab
  Wechselt in der älteren [[Glossar#Bedienseite|Bedienseite]] den sichtbaren Bereich.
index.start
  Die ältere [[Glossar#Bedienseite|Bedienseite]] fragt ab jetzt alle drei Sekunden nach dem Zustand. Auffällig: derselbe Teil ist zweimal vorhanden. Das nennt man [[Glossar#Doppelt gebaut|Doppelt gebaut]].
```

> [!knoten] Was die Blöcke tun
> - **index.$**: Sucht auf der älteren [[Glossar#Bedienseite|Bedienseite]] ein einzelnes Element.
> - **index.toast**: Zeigt in der älteren [[Glossar#Bedienseite|Bedienseite]] einen kurzen Hinweis.
> - **index.scoped**: Gibt einen Dateipfad unverändert zurück. Der Name klingt nach einer Prüfung, es ist aber keine. Auffällig: ein alter Weg läuft noch mit. Das nennt man [[Glossar#Altlast|Altlast]].
> - **index.api**: Schickt von der älteren [[Glossar#Bedienseite|Bedienseite]] eine Anfrage an die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]].
> - **index.post**: Schickt von der älteren [[Glossar#Bedienseite|Bedienseite]] einen Auftrag, der etwas ändert.
> - **index.esc**: Macht einen Text so ungefährlich, dass die Seite ihn anzeigen kann.
> - **index.showLogin**: Die ältere [[Glossar#Bedienseite|Bedienseite]] zeigt die [[Glossar#Anmeldung|Anmeldung]].
> - **index.doLogin**: Die ältere [[Glossar#Bedienseite|Bedienseite]] führt aus die [[Glossar#Anmeldung|Anmeldung]].
> - **index.logout**: Meldet von der älteren [[Glossar#Bedienseite|Bedienseite]] ab.
> - **index.tab**: Wechselt in der älteren [[Glossar#Bedienseite|Bedienseite]] den sichtbaren Bereich.
> - **index.start**: Die ältere [[Glossar#Bedienseite|Bedienseite]] fragt ab jetzt alle drei Sekunden nach dem Zustand. Auffällig: derselbe Teil ist zweimal vorhanden. Das nennt man [[Glossar#Doppelt gebaut|Doppelt gebaut]].

- [[Glossar#Anmeldung|Anmeldung]] und Abmeldung in der älteren [[Glossar#Bedienseite|Bedienseite]].
