[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Altlast]] › [[index.loadBackup]]

# index.loadBackup

`index.loadBackup()` [src/main/resources/web/index.html:214–215](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/resources/web/index.html#L214-L215)

```mermaid
flowchart TD
  n1["index.api"]:::internal-link
  n2["index.$"]:::internal-link
  n3["index.$"]:::internal-link
  n4["index.$"]:::internal-link
  n5["index.esc"]:::internal-link
  n6["index.fmtSize"]:::internal-link
  n1 --> n2
  n2 --> n3
  n4 -->|"Z.215"| n5
  n5 -->|"Z.215"| n6
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
index.api
  Schickt von der älteren [[Glossar#Bedienseite|Bedienseite]] eine Anfrage an die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]]. Im [[Glossar#Quelltext|Quelltext]] heißt das `api`.
index.$
  Sucht auf der älteren [[Glossar#Bedienseite|Bedienseite]] ein einzelnes Element. Im [[Glossar#Quelltext|Quelltext]] heißt das `$`.
index.esc
  Macht einen Text so ungefährlich, dass die Seite ihn anzeigen kann. Im [[Glossar#Quelltext|Quelltext]] heißt das `esc`.
index.fmtSize
  Die ältere [[Glossar#Bedienseite|Bedienseite]] macht lesbar die Größe. Im [[Glossar#Quelltext|Quelltext]] heißt das `fmtSize`.
```

> [!knoten]- Was die Blöcke tun
> - **index.api**: Schickt von der älteren [[Glossar#Bedienseite|Bedienseite]] eine Anfrage an die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]]. Im [[Glossar#Quelltext|Quelltext]] heißt das `api`.
> - **index.$**: Sucht auf der älteren [[Glossar#Bedienseite|Bedienseite]] ein einzelnes Element. Im [[Glossar#Quelltext|Quelltext]] heißt das `$`.
> - **index.esc**: Macht einen Text so ungefährlich, dass die Seite ihn anzeigen kann. Im [[Glossar#Quelltext|Quelltext]] heißt das `esc`.
> - **index.fmtSize**: Die ältere [[Glossar#Bedienseite|Bedienseite]] macht lesbar die Größe. Im [[Glossar#Quelltext|Quelltext]] heißt das `fmtSize`.

- Die ältere [[Glossar#Bedienseite|Bedienseite]] lädt die [[Glossar#Sicherungskopie|Sicherungskopie]].
