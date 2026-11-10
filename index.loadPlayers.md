[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Altlast]] › [[index.loadPlayers]]

# index.loadPlayers

`index.loadPlayers()` [src/main/resources/web/index.html:128–129](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/resources/web/index.html#L128-L129)

```mermaid
flowchart TD
  n1["index.api"]:::internal-link
  n2["index.$"]:::internal-link
  n3["index.esc"]:::internal-link
  n4["index.esc"]:::internal-link
  n2 -->|"Z.129"| n3
  n3 -->|"Z.129"| n4
  n1 --> n2
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
```

> [!knoten]- Was die Blöcke tun
> - **index.api**: Schickt von der älteren [[Glossar#Bedienseite|Bedienseite]] eine Anfrage an die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]]. Im [[Glossar#Quelltext|Quelltext]] heißt das `api`.
> - **index.$**: Sucht auf der älteren [[Glossar#Bedienseite|Bedienseite]] ein einzelnes Element. Im [[Glossar#Quelltext|Quelltext]] heißt das `$`.
> - **index.esc**: Macht einen Text so ungefährlich, dass die Seite ihn anzeigen kann. Im [[Glossar#Quelltext|Quelltext]] heißt das `esc`.

- Die ältere [[Glossar#Bedienseite|Bedienseite]] lädt die [[Glossar#Spieler|Spieler]].
