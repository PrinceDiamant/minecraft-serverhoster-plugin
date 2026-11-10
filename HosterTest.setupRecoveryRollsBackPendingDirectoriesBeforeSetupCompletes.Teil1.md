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

- Fortsetzung von `HosterTest.setupRecoveryRollsBackPendingDirectoriesBeforeSetupCompletes`, Quellreihenfolge.
