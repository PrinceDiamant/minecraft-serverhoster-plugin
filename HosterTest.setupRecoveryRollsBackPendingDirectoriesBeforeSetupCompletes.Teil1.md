[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil4]] › [[HosterTest.setupRecoveryRollsBackPendingDirectoriesBeforeSetupCompletes]] › [[HosterTest.setupRecoveryRollsBackPendingDirectoriesBeforeSetupCompletes.Teil1]]

# HosterTest.setupRecoveryRollsBackPendingDirectoriesBeforeSetupCompletes.Teil1

```mermaid
flowchart TD
  n1["Schritt Z.569 Path root = Files.createTempDirectory('serverhost…"]
  n2["Schritt Z.570 Path pendingDelete = Files.createDirectory(root.r…"]
  n3["Schritt Z.571 Files.writeString(pendingDelete.resolve('server.p…"]
  n4["Schritt Z.572 Path pendingReset = Files.createDirectory(root.re…"]
  n5["Schritt Z.573 Files.writeString(pendingReset.resolve('server.pr…"]
  n6["SetupRecovery.recover"]:::internal-link
  n7["Schritt Z.580 assertEquals('delete candidate', Files.readString…"]
  n8["Schritt Z.581 assertEquals('reset candidate', Files.readString(…"]
  n9["Schritt Z.582 assertFalse(Files.exists(pendingDelete));"]
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  n6 --> n7
  n7 --> n8
  n8 --> n9
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Schritt Z.569 Path root = Files.createTempDirectory('serverhost…
  Zeile 569: Dateioperation. `Path root = Files.createTempDirectory('serverhost…`
Schritt Z.570 Path pendingDelete = Files.createDirectory(root.r…
  Zeile 570: Dateioperation. `Path pendingDelete = Files.createDirectory(root.r…`
Schritt Z.571 Files.writeString(pendingDelete.resolve('server.p…
  Zeile 571: schreibt Text in eine Datei. `Files.writeString(pendingDelete.resolve('server.p…`
Schritt Z.572 Path pendingReset = Files.createDirectory(root.re…
  Zeile 572: Dateioperation. `Path pendingReset = Files.createDirectory(root.re…`
Schritt Z.573 Files.writeString(pendingReset.resolve('server.pr…
  Zeile 573: schreibt Text in eine Datei. `Files.writeString(pendingReset.resolve('server.pr…`
SetupRecovery.recover
  Hebt hängende Zustände auf `recover`.
Schritt Z.580 assertEquals('delete candidate', Files.readString…
  Zeile 580: liest Text aus einer Datei. `assertEquals('delete candidate', Files.readString…`
Schritt Z.581 assertEquals('reset candidate', Files.readString(…
  Zeile 581: liest Text aus einer Datei. `assertEquals('reset candidate', Files.readString(…`
Schritt Z.582 assertFalse(Files.exists(pendingDelete));
  Zeile 582: Dateioperation. `assertFalse(Files.exists(pendingDelete));`
```

- Fortsetzung von `HosterTest.setupRecoveryRollsBackPendingDirectoriesBeforeSetupCompletes`, Quellreihenfolge.
