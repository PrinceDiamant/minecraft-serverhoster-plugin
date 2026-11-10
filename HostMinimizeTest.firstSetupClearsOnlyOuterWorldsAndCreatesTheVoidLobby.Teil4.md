[[00 Start]] › [[Tests]] › [[HostMinimizeTest]] › [[HostMinimizeTest.Teil1]] › [[HostMinimizeTest.firstSetupClearsOnlyOuterWorldsAndCreatesTheVoidLobby]] › [[HostMinimizeTest.firstSetupClearsOnlyOuterWorldsAndCreatesTheVoidLobby.Teil4]]

# HostMinimizeTest.firstSetupClearsOnlyOuterWorldsAndCreatesTheVoidLobby.Teil4

```mermaid
flowchart TD
  n1["Schritt Z.187 assertTrue(Files.exists(root.resolve('plugins/Oth…"]
  n2["HostFirstSetup.readState"]:::internal-link
  n3["HostFirstSetup.shouldRun"]:::internal-link
  n4["HostFirstSetup.completeRestart(Path,Path,Path,Set)"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n3 fill:#f88,stroke:#900
  style n4 fill:#f88,stroke:#900
```

```knoten
Schritt Z.187 assertTrue(Files.exists(root.resolve('plugins/Oth…
  Zeile 187: Dateioperation. `assertTrue(Files.exists(root.resolve('plugins/Oth…`
HostFirstSetup.readState
  Liest `readState`. Ruft `readState`.
HostFirstSetup.shouldRun
  Entscheidet, ob `shouldRun`. Ruft `readState`, `writeMarker`. Befund: Altlast (wahrscheinlich).
HostFirstSetup.completeRestart(Path,Path,Path,Set)
  Schließt ab `completeRestart`. Ruft `completeRestart`. Befund: toter Code (wahrscheinlich).
```

- Fortsetzung von `HostMinimizeTest.firstSetupClearsOnlyOuterWorldsAndCreatesTheVoidLobby`, Quellreihenfolge.
