[[00 Start]] › [[Tests]] › [[HostMinimizeTest]] › [[HostMinimizeTest.Teil1]] › [[HostMinimizeTest.firstSetupRefusesCleanupWhenPreparedWorldSelectionWasChanged]] › [[HostMinimizeTest.firstSetupRefusesCleanupWhenPreparedWorldSelectionWasChanged.Teil2]]

# HostMinimizeTest.firstSetupRefusesCleanupWhenPreparedWorldSelectionWasChanged.Teil2

```mermaid
flowchart TD
  n1["Schritt Z.262 Files.writeString(root.resolve('server.properties…"]
  n2["HostFirstSetup.completeRestart(Path,Path,Path,Set)"]:::internal-link
  n3["Schritt Z.265 assertTrue(Files.exists(root.resolve('world/level…"]
  n4["HostFirstSetup.readState"]:::internal-link
  n5["Schritt Z.267 Files.writeString(root.resolve('server.properties…"]
  n6["HostFirstSetup.completeRestart(Path,Path,Path,Set)"]:::internal-link
  n7["Schritt Z.270 assertTrue(Files.exists(root.resolve('world/level…"]
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n2 fill:#f88,stroke:#900
  style n6 fill:#f88,stroke:#900
```

```knoten
Schritt Z.262 Files.writeString(root.resolve('server.properties…
  Zeile 262: schreibt Text in eine Datei. `Files.writeString(root.resolve('server.properties…`
HostFirstSetup.completeRestart(Path,Path,Path,Set)
  Schließt ab `completeRestart`. Ruft `completeRestart`. Befund: toter Code (wahrscheinlich).
Schritt Z.265 assertTrue(Files.exists(root.resolve('world/level…
  Zeile 265: Dateioperation. `assertTrue(Files.exists(root.resolve('world/level…`
HostFirstSetup.readState
  Liest `readState`. Ruft `readState`.
Schritt Z.267 Files.writeString(root.resolve('server.properties…
  Zeile 267: schreibt Text in eine Datei. `Files.writeString(root.resolve('server.properties…`
Schritt Z.270 assertTrue(Files.exists(root.resolve('world/level…
  Zeile 270: Dateioperation. `assertTrue(Files.exists(root.resolve('world/level…`
```

- Fortsetzung von `HostMinimizeTest.firstSetupRefusesCleanupWhenPreparedWorldSelectionWasChanged`, Quellreihenfolge.
