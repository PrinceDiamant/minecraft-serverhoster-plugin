[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildProcessRecord]] › [[ChildProcessRecord.Teil1]]

# ChildProcessRecord.Teil1

```mermaid
flowchart TD
  n1["ChildProcessRecord.ChildProcessRecord"]:::internal-link
  n2["ChildProcessRecord.liveInspector"]:::internal-link
  n3["ChildProcessRecord.observe"]:::internal-link
  n4["ChildProcessRecord.ours"]:::internal-link
  n5["ChildProcessRecord.write"]:::internal-link
  n6["ChildProcessRecord.read"]:::internal-link
  n7["ChildProcessRecord.deleteIfMatch"]:::internal-link
  n8["ChildProcessRecord.reap"]:::internal-link
  n7 -->|"Z.145"| n6
  n8 -->|"Z.156"| n6
  n8 -->|"Z.168"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n2 fill:#f88,stroke:#900
  style n3 fill:#f88,stroke:#900
```

```knoten
ChildProcessRecord.ChildProcessRecord
  Dieser Teil kümmert sich um das laufende Programm den Merkzettel. Betrifft den Child `ChildProcessRecord`.
ChildProcessRecord.liveInspector
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `liveInspector` in `ChildProcessRecord.java`. Ruft `find`, `destroy`, `destroyForcibly`. [[Glossar#Befund|Befund]]: toter Code, wahrscheinlich. src/main/java/de/aichele/childlauncher/ChildProcessRecord.java:44–59 nur von Tests erreicht
ChildProcessRecord.observe
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Liest den lebenden [[Glossar#Prozess|Prozess]] `observe`. [[Glossar#Befund|Befund]]: toter Code, wahrscheinlich. src/main/java/de/aichele/childlauncher/ChildProcessRecord.java:61–74 nur von Tests erreicht
ChildProcessRecord.ours
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Prüft, ob es der eigene [[Glossar#Prozess|Prozess]] ist `ours`. Ruft `samePath`, `looksLikeJava`, `fileName`.
ChildProcessRecord.write
  Dieser Teil schreibt das. Schreibt `write`. Ruft `safe`.
ChildProcessRecord.read
  Dieser Teil liest das. Liest `read`. Ruft `required`.
ChildProcessRecord.deleteIfMatch
  Dieser Teil löscht hier einen Schritt. Eine Ebene tiefer steht er genauer. Löscht `deleteIfMatch`. Ruft `read`.
ChildProcessRecord.reap
  Dieser Teil räumt weg das. Räumt übrige [[Glossar#Prozess|Prozesse]] ab `reap`. Ruft `read`, `ours`, `waitUntilDead`.
```

> [!knoten]- Was die Blöcke tun
> - **ChildProcessRecord.ChildProcessRecord**: Dieser Teil kümmert sich um das laufende Programm den Merkzettel. Betrifft den Child `ChildProcessRecord`.
> - **ChildProcessRecord.liveInspector**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `liveInspector` in `ChildProcessRecord.java`. Ruft `find`, `destroy`, `destroyForcibly`. [[Glossar#Befund|Befund]]: toter Code, wahrscheinlich. src/main/java/de/aichele/childlauncher/ChildProcessRecord.java:44–59 nur von Tests erreicht
> - **ChildProcessRecord.observe**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Liest den lebenden [[Glossar#Prozess|Prozess]] `observe`. [[Glossar#Befund|Befund]]: toter Code, wahrscheinlich. src/main/java/de/aichele/childlauncher/ChildProcessRecord.java:61–74 nur von Tests erreicht
> - **ChildProcessRecord.ours**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Prüft, ob es der eigene [[Glossar#Prozess|Prozess]] ist `ours`. Ruft `samePath`, `looksLikeJava`, `fileName`.
> - **ChildProcessRecord.write**: Dieser Teil schreibt das. Schreibt `write`. Ruft `safe`.
> - **ChildProcessRecord.read**: Dieser Teil liest das. Liest `read`. Ruft `required`.
> - **ChildProcessRecord.deleteIfMatch**: Dieser Teil löscht hier einen Schritt. Eine Ebene tiefer steht er genauer. Löscht `deleteIfMatch`. Ruft `read`.
> - **ChildProcessRecord.reap**: Dieser Teil räumt weg das. Räumt übrige [[Glossar#Prozess|Prozesse]] ab `reap`. Ruft `read`, `ours`, `waitUntilDead`.

- Ein weiterer Abschnitt derselben Übersicht.
