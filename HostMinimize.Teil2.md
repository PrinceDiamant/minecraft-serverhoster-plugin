[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[HostMinimize]] › [[HostMinimize.Teil2]]

# HostMinimize.Teil2

```mermaid
flowchart TD
  n1["HostMinimize.firstSetupWorld"]:::internal-link
  n2["HostMinimize.playersBlocked"]:::internal-link
  n3["HostMinimize.clearIdlePause"]:::internal-link
  n4["HostMinimize.preservedNotes"]:::internal-link
  n5["HostMinimize.preview"]:::internal-link
  n6["HostMinimize.apply"]:::internal-link
  n7["HostMinimize.restore"]:::internal-link
  n8["HostMinimize.writeEmptyWhitelist"]:::internal-link
  n5 -->|"Z.146"| n4
  n6 -->|"Z.183"| n8
  n6 -->|"Z.185"| n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n2 fill:#f88,stroke:#900
```

```knoten
HostMinimize.firstSetupWorld
  Das Verkleinern des [[Glossar#Host|Host]] kümmert sich um die [[Glossar#Einrichtung|Einrichtung]] die [[Glossar#Spielwelt|Spielwelt]]. `firstSetupWorld` in `HostMinimize.java`. Ruft `lobbyNameSafe`.
HostMinimize.playersBlocked
  Das Verkleinern des [[Glossar#Host|Host]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Liefert die [[Glossar#Spieler|Spieler]] `playersBlocked`. [[Glossar#Befund|Befund]]: toter Code, wahrscheinlich. src/main/java/de/aichele/childlauncher/HostMinimize.java:102–104 nur von Tests erreicht
HostMinimize.clearIdlePause
  Das Verkleinern des [[Glossar#Host|Host]] löscht den gemerkten Stand von hier einen Schritt. Eine Ebene tiefer steht er genauer. Leert `clearIdlePause`. Ruft `lobbyNameSafe`.
HostMinimize.preservedNotes
  Das Verkleinern des [[Glossar#Host|Host]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `preservedNotes` in `HostMinimize.java`.
HostMinimize.preview
  Das Verkleinern des [[Glossar#Host|Host]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Zeigt die Vorschau `preview`. Ruft `assertRoot`, `readProperties`, `outerProperties`.
HostMinimize.apply
  Das Verkleinern des [[Glossar#Host|Host]] wendet an das. Wendet an `apply`. Ruft `assertRoot`, `assertEditable`, `update`.
HostMinimize.restore
  Das Verkleinern des [[Glossar#Host|Host]] stellt wieder her das. Stellt wieder her `restore`. Ruft `assertEditable`.
HostMinimize.writeEmptyWhitelist
  Das Verkleinern des [[Glossar#Host|Host]] schreibt hier einen Schritt. Eine Ebene tiefer steht er genauer. Schreibt `writeEmptyWhitelist`. Ruft `assertEditable`.
```

> [!knoten]- Was die Blöcke tun
> - **HostMinimize.firstSetupWorld**: Das Verkleinern des [[Glossar#Host|Host]] kümmert sich um die [[Glossar#Einrichtung|Einrichtung]] die [[Glossar#Spielwelt|Spielwelt]]. `firstSetupWorld` in `HostMinimize.java`. Ruft `lobbyNameSafe`.
> - **HostMinimize.playersBlocked**: Das Verkleinern des [[Glossar#Host|Host]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Liefert die [[Glossar#Spieler|Spieler]] `playersBlocked`. [[Glossar#Befund|Befund]]: toter Code, wahrscheinlich. src/main/java/de/aichele/childlauncher/HostMinimize.java:102–104 nur von Tests erreicht
> - **HostMinimize.clearIdlePause**: Das Verkleinern des [[Glossar#Host|Host]] löscht den gemerkten Stand von hier einen Schritt. Eine Ebene tiefer steht er genauer. Leert `clearIdlePause`. Ruft `lobbyNameSafe`.
> - **HostMinimize.preservedNotes**: Das Verkleinern des [[Glossar#Host|Host]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `preservedNotes` in `HostMinimize.java`.
> - **HostMinimize.preview**: Das Verkleinern des [[Glossar#Host|Host]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Zeigt die Vorschau `preview`. Ruft `assertRoot`, `readProperties`, `outerProperties`.
> - **HostMinimize.apply**: Das Verkleinern des [[Glossar#Host|Host]] wendet an das. Wendet an `apply`. Ruft `assertRoot`, `assertEditable`, `update`.
> - **HostMinimize.restore**: Das Verkleinern des [[Glossar#Host|Host]] stellt wieder her das. Stellt wieder her `restore`. Ruft `assertEditable`.
> - **HostMinimize.writeEmptyWhitelist**: Das Verkleinern des [[Glossar#Host|Host]] schreibt hier einen Schritt. Eine Ebene tiefer steht er genauer. Schreibt `writeEmptyWhitelist`. Ruft `assertEditable`.

- Ein weiterer Abschnitt derselben Übersicht.
