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

- Fortsetzung von `HostMinimizeTest.firstSetupClearsOnlyOuterWorldsAndCreatesTheVoidLobby`, Quellreihenfolge.
