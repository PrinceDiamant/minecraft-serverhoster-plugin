[[00 Start]] › [[Dashboard-UI]] › [[UI-App]]

# UI-App

```mermaid
flowchart TD
  n1["App.tabFromPath"]:::internal-link
  n2["App.readLegacyDashboard"]:::internal-link
  n3["App.App"]:::internal-link
  n3 -->|"Zeile 147"| n1
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n2 fill:#f88,stroke:#900
```

```knoten
App.tabFromPath
  Die [[Glossar#Bedienseite|Bedienseite]] wechselt zu aus den Pfad.
App.readLegacyDashboard
  Liest die ältere [[Glossar#Bedienseite|Bedienseite]] und schneidet die Bereiche heraus, die die neuere Seite selbst übernimmt. Auffällig: derselbe Teil ist zweimal vorhanden. Das nennt man [[Glossar#Doppelt gebaut|Doppelt gebaut]].
App.App
  Baut die [[Glossar#Bedienseite|Bedienseite]] zusammen, wenn sie im Browser erscheint.
```

> [!knoten] Was die Blöcke tun
> - **App.tabFromPath**: Die [[Glossar#Bedienseite|Bedienseite]] wechselt zu aus den Pfad.
> - **App.readLegacyDashboard**: Liest die ältere [[Glossar#Bedienseite|Bedienseite]] und schneidet die Bereiche heraus, die die neuere Seite selbst übernimmt. Auffällig: derselbe Teil ist zweimal vorhanden. Das nennt man [[Glossar#Doppelt gebaut|Doppelt gebaut]].
> - **App.App**: Baut die [[Glossar#Bedienseite|Bedienseite]] zusammen, wenn sie im Browser erscheint.

- Die neuere [[Glossar#Bedienseite|Bedienseite]]. Sie übernimmt die ältere Seite, schneidet alte Bereiche heraus und hängt die neuen Abläufe ein.
