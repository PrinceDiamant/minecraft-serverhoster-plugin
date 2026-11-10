[[00 Start]] › [[Tests]] › [[HostMinimizeTest]] › [[HostMinimizeTest.Teil1]] › [[HostMinimizeTest.firstSetupClearsOnlyOuterWorldsAndCreatesTheVoidLobby]] › [[HostMinimizeTest.firstSetupClearsOnlyOuterWorldsAndCreatesTheVoidLobby.Teil5]]

# HostMinimizeTest.firstSetupClearsOnlyOuterWorldsAndCreatesTheVoidLobby.Teil5

```mermaid
flowchart TD
  n1["Schritt Z.191 assertTrue(Files.exists(root.resolve('world/level…"]
  n2["HostFirstSetup.completeRestart(Path,Path,Path,Set)"]:::internal-link
  n3["Schritt Z.194 assertTrue(Files.exists(root.resolve('unused-worl…"]
  n4["HostFirstSetup.completeRestart(Path,Path,Path,Set)"]:::internal-link
  n5["Schritt Z.198 assertFalse(Files.exists(root.resolve('world')));"]
  n6["Schritt Z.199 assertFalse(Files.exists(root.resolve('world_neth…"]
  n7["Schritt Z.200 assertFalse(Files.exists(root.resolve('unused-wor…"]
  n8["Schritt Z.201 assertEquals('child-world', Files.readString(chil…"]
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  n6 --> n7
  n7 --> n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n2 fill:#f88,stroke:#900
  style n4 fill:#f88,stroke:#900
```

```knoten
Schritt Z.191 assertTrue(Files.exists(root.resolve('world/level…
  Zeile 191: Dateioperation. `assertTrue(Files.exists(root.resolve('world/level…`
HostFirstSetup.completeRestart(Path,Path,Path,Set)
  Die [[Glossar#Ersteinrichtung|Ersteinrichtung]] kümmert sich um den [[Glossar#Neustart|Neustart]]. Schließt ab `completeRestart`. Ruft `completeRestart`. [[Glossar#Befund|Befund]]: toter Code, wahrscheinlich. src/main/java/de/aichele/childlauncher/HostFirstSetup.java:116–118 nur von Tests erreicht
Schritt Z.194 assertTrue(Files.exists(root.resolve('unused-worl…
  Zeile 194: Dateioperation. `assertTrue(Files.exists(root.resolve('unused-worl…`
Schritt Z.198 assertFalse(Files.exists(root.resolve('world')));
  Zeile 198: Dateioperation. `assertFalse(Files.exists(root.resolve('world')));`
Schritt Z.199 assertFalse(Files.exists(root.resolve('world_neth…
  Zeile 199: Dateioperation. `assertFalse(Files.exists(root.resolve('world_neth…`
Schritt Z.200 assertFalse(Files.exists(root.resolve('unused-wor…
  Zeile 200: Dateioperation. `assertFalse(Files.exists(root.resolve('unused-wor…`
Schritt Z.201 assertEquals('child-world', Files.readString(chil…
  Zeile 201: liest Text aus einer Datei. `assertEquals('child-world', Files.readString(chil…`
```

> [!knoten]- Was die Blöcke tun
> - **Schritt Z.191 assertTrue(Files.exists(root.resolve('world/level…**: Zeile 191: Dateioperation. `assertTrue(Files.exists(root.resolve('world/level…`
> - **HostFirstSetup.completeRestart(Path,Path,Path,Set)**: Die [[Glossar#Ersteinrichtung|Ersteinrichtung]] kümmert sich um den [[Glossar#Neustart|Neustart]]. Schließt ab `completeRestart`. Ruft `completeRestart`. [[Glossar#Befund|Befund]]: toter Code, wahrscheinlich. src/main/java/de/aichele/childlauncher/HostFirstSetup.java:116–118 nur von Tests erreicht
> - **Schritt Z.194 assertTrue(Files.exists(root.resolve('unused-worl…**: Zeile 194: Dateioperation. `assertTrue(Files.exists(root.resolve('unused-worl…`
> - **Schritt Z.198 assertFalse(Files.exists(root.resolve('world')));**: Zeile 198: Dateioperation. `assertFalse(Files.exists(root.resolve('world')));`
> - **Schritt Z.199 assertFalse(Files.exists(root.resolve('world_neth…**: Zeile 199: Dateioperation. `assertFalse(Files.exists(root.resolve('world_neth…`
> - **Schritt Z.200 assertFalse(Files.exists(root.resolve('unused-wor…**: Zeile 200: Dateioperation. `assertFalse(Files.exists(root.resolve('unused-wor…`
> - **Schritt Z.201 assertEquals('child-world', Files.readString(chil…**: Zeile 201: liest Text aus einer Datei. `assertEquals('child-world', Files.readString(chil…`

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `HostMinimizeTest.firstSetupClearsOnlyOuterWorldsAndCreatesTheVoidLobby`.
