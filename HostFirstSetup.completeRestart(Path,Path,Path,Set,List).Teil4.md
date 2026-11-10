[[00 Start]] › [[Host-Betrieb]] › [[Host-Ersteinrichtung]] › [[HostFirstSetup]] › [[HostFirstSetup.Teil1]] › [[HostFirstSetup.completeRestart(Path,Path,Path,Set,List)]] › [[HostFirstSetup.completeRestart(Path,Path,Path,Set,List).Teil4]]

# HostFirstSetup.completeRestart(Path,Path,Path,Set,List).Teil4

```mermaid
flowchart TD
  n1["for Z.160 (Path world : removable)"]
  n2["HostFirstSetup.deleteTree"]:::internal-link
  n3["HostFirstSetup.writeMarker(Path,String,String,int)"]:::internal-link
  n4["HostFirstSetup.parseCount"]:::internal-link
  n5["return Z.166 return List.copyOf(removed);"]
  n1 -->|"wiederholen"| n2
  n3 -->|"Z.165"| n4
  n2 --> n3
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
for Z.160 (Path world : removable)
  Zeile 160: Schleife `(Path world : removable)`.
HostFirstSetup.deleteTree
  Die [[Glossar#Ersteinrichtung|Ersteinrichtung]] löscht hier einen Schritt. Eine Ebene tiefer steht er genauer. Löscht `deleteTree`. Ruft `visitFile`, `postVisitDirectory`.
HostFirstSetup.writeMarker(Path,String,String,int)
  Die [[Glossar#Ersteinrichtung|Ersteinrichtung]] schreibt die Merkdatei. Schreibt `writeMarker`. Ruft `writeMarker`.
HostFirstSetup.parseCount
  Die [[Glossar#Ersteinrichtung|Ersteinrichtung]] liest hier einen Schritt. Eine Ebene tiefer steht er genauer. Wertet aus `parseCount`.
return Z.166 return List.copyOf(removed);
  Zeile 166: Rückgabe `return List.copyOf(removed);`.
```

> [!knoten]- Was die Blöcke tun
> - **for Z.160 (Path world : removable)**: Zeile 160: Schleife `(Path world : removable)`.
> - **HostFirstSetup.deleteTree**: Die [[Glossar#Ersteinrichtung|Ersteinrichtung]] löscht hier einen Schritt. Eine Ebene tiefer steht er genauer. Löscht `deleteTree`. Ruft `visitFile`, `postVisitDirectory`.
> - **HostFirstSetup.writeMarker(Path,String,String,int)**: Die [[Glossar#Ersteinrichtung|Ersteinrichtung]] schreibt die Merkdatei. Schreibt `writeMarker`. Ruft `writeMarker`.
> - **HostFirstSetup.parseCount**: Die [[Glossar#Ersteinrichtung|Ersteinrichtung]] liest hier einen Schritt. Eine Ebene tiefer steht er genauer. Wertet aus `parseCount`.
> - **return Z.166 return List.copyOf(removed);**: Zeile 166: Rückgabe `return List.copyOf(removed);`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `HostFirstSetup.completeRestart(Path,Path,Path,Set,List)`.
