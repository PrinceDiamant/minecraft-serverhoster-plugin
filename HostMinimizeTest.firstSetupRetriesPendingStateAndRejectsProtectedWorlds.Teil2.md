[[00 Start]] › [[Tests]] › [[HostMinimizeTest]] › [[HostMinimizeTest.Teil1]] › [[HostMinimizeTest.firstSetupRetriesPendingStateAndRejectsProtectedWorlds]] › [[HostMinimizeTest.firstSetupRetriesPendingStateAndRejectsProtectedWorlds.Teil2]]

# HostMinimizeTest.firstSetupRetriesPendingStateAndRejectsProtectedWorlds.Teil2

```mermaid
flowchart TD
  n1["HostFirstSetup.apply(Path,Path,Path,Path)"]:::internal-link
  n2["HostFirstSetup.readState"]:::internal-link
  n3["Schritt Z.221 assertEquals('level-name=child-server/nserver-por…"]
  n1 --> n2
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n1 fill:#f88,stroke:#900
```

```knoten
HostFirstSetup.apply(Path,Path,Path,Path)
  Die [[Glossar#Ersteinrichtung|Ersteinrichtung]] wendet an das. Wendet an `apply`. Ruft `apply`. [[Glossar#Befund|Befund]]: toter Code, wahrscheinlich. src/main/java/de/aichele/childlauncher/HostFirstSetup.java:58–60 nur von Tests erreicht
HostFirstSetup.readState
  Die [[Glossar#Ersteinrichtung|Ersteinrichtung]] liest den Zustand. Liest `readState`. Ruft `readState`.
Schritt Z.221 assertEquals('level-name=child-server/nserver-por…
  Zeile 221: `assertEquals('level-name=child-server/nserver-por…`
```

> [!knoten]- Was die Blöcke tun
> - **HostFirstSetup.apply(Path,Path,Path,Path)**: Die [[Glossar#Ersteinrichtung|Ersteinrichtung]] wendet an das. Wendet an `apply`. Ruft `apply`. [[Glossar#Befund|Befund]]: toter Code, wahrscheinlich. src/main/java/de/aichele/childlauncher/HostFirstSetup.java:58–60 nur von Tests erreicht
> - **HostFirstSetup.readState**: Die [[Glossar#Ersteinrichtung|Ersteinrichtung]] liest den Zustand. Liest `readState`. Ruft `readState`.
> - **Schritt Z.221 assertEquals('level-name=child-server/nserver-por…**: Zeile 221: `assertEquals('level-name=child-server/nserver-por…`

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `HostMinimizeTest.firstSetupRetriesPendingStateAndRejectsProtectedWorlds`.
