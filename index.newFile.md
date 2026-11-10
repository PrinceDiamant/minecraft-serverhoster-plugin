[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Dateien]] › [[index.newFile]]

# index.newFile

`index.newFile()` [src/main/resources/web/index.html:147–147](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/resources/web/index.html#L147-L147)

```mermaid
flowchart TD
  n1["if Z.147 !n"]
  n2["return Z.147 return;"]
  n3["index.post"]:::internal-link
  n4["index.jp"]:::internal-link
  n5["index.ls"]:::internal-link
  n6["index.openFile"]:::internal-link
  n7["index.jp"]:::internal-link
  n1 -->|"ja"| n2
  n3 -->|"Z.147"| n4
  n2 --> n3
  n1 --> n3
  n4 --> n5
  n6 -->|"Z.147"| n7
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.147 !n
  Hier fällt eine Entscheidung. Nur wenn sie zutrifft, geht es den Ja-Weg weiter. Das steht in [[Glossar#Zeile|Zeile]] 147.
return Z.147 return;
  Hier endet die [[Glossar#Funktion|Funktion]] und liefert ein Ergebnis zurück. Das steht in [[Glossar#Zeile|Zeile]] 147.
index.post
  Schickt von der älteren [[Glossar#Bedienseite|Bedienseite]] einen Auftrag, der etwas ändert. Im [[Glossar#Quelltext|Quelltext]] heißt das `post`.
index.jp
  Baut in der älteren [[Glossar#Bedienseite|Bedienseite]] einen Dateipfad aus seinen Teilen. Im [[Glossar#Quelltext|Quelltext]] heißt das `jp`.
index.ls
  Zeigt in der älteren [[Glossar#Bedienseite|Bedienseite]] den Inhalt eines Ordners. Im [[Glossar#Quelltext|Quelltext]] heißt das `ls`.
index.openFile
  Die ältere [[Glossar#Bedienseite|Bedienseite]] öffnet die Datei. Im [[Glossar#Quelltext|Quelltext]] heißt das `openFile`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.147 !n**: Hier fällt eine Entscheidung. Nur wenn sie zutrifft, geht es den Ja-Weg weiter. Das steht in [[Glossar#Zeile|Zeile]] 147.
> - **return Z.147 return;**: Hier endet die [[Glossar#Funktion|Funktion]] und liefert ein Ergebnis zurück. Das steht in [[Glossar#Zeile|Zeile]] 147.
> - **index.post**: Schickt von der älteren [[Glossar#Bedienseite|Bedienseite]] einen Auftrag, der etwas ändert. Im [[Glossar#Quelltext|Quelltext]] heißt das `post`.
> - **index.jp**: Baut in der älteren [[Glossar#Bedienseite|Bedienseite]] einen Dateipfad aus seinen Teilen. Im [[Glossar#Quelltext|Quelltext]] heißt das `jp`.
> - **index.ls**: Zeigt in der älteren [[Glossar#Bedienseite|Bedienseite]] den Inhalt eines Ordners. Im [[Glossar#Quelltext|Quelltext]] heißt das `ls`.
> - **index.openFile**: Die ältere [[Glossar#Bedienseite|Bedienseite]] öffnet die Datei. Im [[Glossar#Quelltext|Quelltext]] heißt das `openFile`.

- Legt in der älteren [[Glossar#Bedienseite|Bedienseite]] eine neue Datei an.
