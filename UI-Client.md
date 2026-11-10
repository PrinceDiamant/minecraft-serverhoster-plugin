[[00 Start]] › [[Dashboard-UI]] › [[UI-Client]]

# UI-Client

```mermaid
flowchart TD
  n1["hostApi.dashboardRequest"]:::internal-link
  n2["hostApi.jsonBody"]:::internal-link
  n3["hostApi.formatBytes"]:::internal-link
  n4["fileEditor.modeForPath"]:::internal-link
  n5["fileEditor.installFileEditors"]:::internal-link
  n1 -->|"Kapitel im Text"| n2
  n2 -->|"Kapitel im Text"| n3
  n3 -->|"Kapitel im Text"| n4
  n4 -->|"Kapitel im Text"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
hostApi.dashboardRequest
  Schickt von der [[Glossar#Bedienseite|Bedienseite]] eine Anfrage an das [[Glossar#Plugin|Plugin]].
hostApi.jsonBody
  Baut den Text, den die [[Glossar#Bedienseite|Bedienseite]] als Auftrag mitschickt.
hostApi.formatBytes
  Die [[Glossar#Bedienseite|Bedienseite]] macht lesbar die Größe.
fileEditor.modeForPath
  Wählt, wie eine Datei in der [[Glossar#Bedienseite|Bedienseite]] bearbeitet wird, je nach Art der Datei.
fileEditor.installFileEditors
  Die [[Glossar#Bedienseite|Bedienseite]] richtet ein die Datei die Editoren.
```

> [!knoten] Was die Blöcke tun
> - **hostApi.dashboardRequest**: Schickt von der [[Glossar#Bedienseite|Bedienseite]] eine Anfrage an das [[Glossar#Plugin|Plugin]].
> - **hostApi.jsonBody**: Baut den Text, den die [[Glossar#Bedienseite|Bedienseite]] als Auftrag mitschickt.
> - **hostApi.formatBytes**: Die [[Glossar#Bedienseite|Bedienseite]] macht lesbar die Größe.
> - **fileEditor.modeForPath**: Wählt, wie eine Datei in der [[Glossar#Bedienseite|Bedienseite]] bearbeitet wird, je nach Art der Datei.
> - **fileEditor.installFileEditors**: Die [[Glossar#Bedienseite|Bedienseite]] richtet ein die Datei die Editoren.

- Der Teil der [[Glossar#Bedienseite|Bedienseite]], der Aufträge an das [[Glossar#Plugin|Plugin]] schickt und Dateien bearbeitet.
