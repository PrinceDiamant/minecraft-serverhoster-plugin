[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Dateien]]

# Legacy-Dateien

```mermaid
flowchart TD
  n1["index.loadTxt"]:::internal-link
  n2["index.saveTxt"]:::internal-link
  n3["index.loadPropertiesPreview"]:::internal-link
  n4["index.jp"]:::internal-link
  n5["index.ls"]:::internal-link
  n6["index.openFile"]:::internal-link
  n7["index.saveFile"]:::internal-link
  n8["index.ren"]:::internal-link
  n9["index.del"]:::internal-link
  n10["index.mkdir"]:::internal-link
  n11["index.newFile"]:::internal-link
  n12["index.upload"]:::internal-link
  n2 -->|"Zeile 131"| n3
  n5 -->|"Zeile 135"| n4
  n7 -->|"Zeile 143"| n5
  n8 -->|"Zeile 144"| n5
  n9 -->|"Zeile 145"| n5
  n10 -->|"Zeile 146"| n4
  n10 -->|"Zeile 146"| n5
  n11 -->|"Zeile 147"| n4
  n11 -->|"Zeile 147"| n5
  n11 -->|"Zeile 147"| n6
  n12 -->|"Zeile 149"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
index.loadTxt
  Die ältere [[Glossar#Bedienseite|Bedienseite]] lädt den Text.
index.saveTxt
  Die ältere [[Glossar#Bedienseite|Bedienseite]] speichert den Text.
index.loadPropertiesPreview
  Die ältere [[Glossar#Bedienseite|Bedienseite]] lädt die Eigenschaften die Vorschau.
index.jp
  Baut in der älteren [[Glossar#Bedienseite|Bedienseite]] einen Dateipfad aus seinen Teilen.
index.ls
  Zeigt in der älteren [[Glossar#Bedienseite|Bedienseite]] den Inhalt eines Ordners.
index.openFile
  Die ältere [[Glossar#Bedienseite|Bedienseite]] öffnet die Datei.
index.saveFile
  Die ältere [[Glossar#Bedienseite|Bedienseite]] speichert die Datei.
index.ren
  Benennt in der älteren [[Glossar#Bedienseite|Bedienseite]] eine Datei um.
index.del
  Löscht in der älteren [[Glossar#Bedienseite|Bedienseite]] eine Datei.
index.mkdir
  Legt in der älteren [[Glossar#Bedienseite|Bedienseite]] einen Ordner an.
index.newFile
  Legt in der älteren [[Glossar#Bedienseite|Bedienseite]] eine neue Datei an.
index.upload
  Schickt eine Datei von der älteren [[Glossar#Bedienseite|Bedienseite]] an das [[Glossar#Plugin|Plugin]].
```

> [!knoten] Was die Blöcke tun
> - **index.loadTxt**: Die ältere [[Glossar#Bedienseite|Bedienseite]] lädt den Text.
> - **index.saveTxt**: Die ältere [[Glossar#Bedienseite|Bedienseite]] speichert den Text.
> - **index.loadPropertiesPreview**: Die ältere [[Glossar#Bedienseite|Bedienseite]] lädt die Eigenschaften die Vorschau.
> - **index.jp**: Baut in der älteren [[Glossar#Bedienseite|Bedienseite]] einen Dateipfad aus seinen Teilen.
> - **index.ls**: Zeigt in der älteren [[Glossar#Bedienseite|Bedienseite]] den Inhalt eines Ordners.
> - **index.openFile**: Die ältere [[Glossar#Bedienseite|Bedienseite]] öffnet die Datei.
> - **index.saveFile**: Die ältere [[Glossar#Bedienseite|Bedienseite]] speichert die Datei.
> - **index.ren**: Benennt in der älteren [[Glossar#Bedienseite|Bedienseite]] eine Datei um.
> - **index.del**: Löscht in der älteren [[Glossar#Bedienseite|Bedienseite]] eine Datei.
> - **index.mkdir**: Legt in der älteren [[Glossar#Bedienseite|Bedienseite]] einen Ordner an.
> - **index.newFile**: Legt in der älteren [[Glossar#Bedienseite|Bedienseite]] eine neue Datei an.
> - **index.upload**: Schickt eine Datei von der älteren [[Glossar#Bedienseite|Bedienseite]] an das [[Glossar#Plugin|Plugin]].

- Der Datei-Browser in der älteren [[Glossar#Bedienseite|Bedienseite]].
