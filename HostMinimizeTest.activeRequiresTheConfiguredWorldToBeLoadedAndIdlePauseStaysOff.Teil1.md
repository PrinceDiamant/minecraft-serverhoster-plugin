[[00 Start]] › [[Tests]] › [[HostMinimizeTest]] › [[HostMinimizeTest.Teil1]] › [[HostMinimizeTest.activeRequiresTheConfiguredWorldToBeLoadedAndIdlePauseStaysOff]] › [[HostMinimizeTest.activeRequiresTheConfiguredWorldToBeLoadedAndIdlePauseStaysOff.Teil1]]

# HostMinimizeTest.activeRequiresTheConfiguredWorldToBeLoadedAndIdlePauseStaysOff.Teil1

```mermaid
flowchart TD
  n1["HostMinimize.phase"]:::internal-link
  n2["HostMinimize.phase"]:::internal-link
  n3["HostMinimize.phase"]:::internal-link
  n4["HostMinimize.playersBlocked"]:::internal-link
  n5["HostMinimize.playersBlocked"]:::internal-link
  n6["HostMinimize.playersBlocked"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n4 fill:#f88,stroke:#900
  style n5 fill:#f88,stroke:#900
  style n6 fill:#f88,stroke:#900
```

```knoten
HostMinimize.phase
  Das Verkleinern des [[Glossar#Host|Host]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Liefert die [[Glossar#Phase|Phase]] `phase`. Ruft `worldNameSafe`.
HostMinimize.playersBlocked
  Das Verkleinern des [[Glossar#Host|Host]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Liefert die [[Glossar#Spieler|Spieler]] `playersBlocked`. [[Glossar#Befund|Befund]]: toter Code, wahrscheinlich. src/main/java/de/aichele/childlauncher/HostMinimize.java:102–104 nur von Tests erreicht
```

> [!knoten]- Was die Blöcke tun
> - **HostMinimize.phase**: Das Verkleinern des [[Glossar#Host|Host]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Liefert die [[Glossar#Phase|Phase]] `phase`. Ruft `worldNameSafe`.
> - **HostMinimize.playersBlocked**: Das Verkleinern des [[Glossar#Host|Host]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Liefert die [[Glossar#Spieler|Spieler]] `playersBlocked`. [[Glossar#Befund|Befund]]: toter Code, wahrscheinlich. src/main/java/de/aichele/childlauncher/HostMinimize.java:102–104 nur von Tests erreicht

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `HostMinimizeTest.activeRequiresTheConfiguredWorldToBeLoadedAndIdlePauseStaysOff`.
