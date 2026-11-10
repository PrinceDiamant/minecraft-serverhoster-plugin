[[00 Start]] › [[Tests]] › [[HostMinimizeTest]] › [[HostMinimizeTest.Teil1]] › [[HostMinimizeTest.firstSetupClearsOnlyOuterWorldsAndCreatesTheVoidLobby]] › [[HostMinimizeTest.firstSetupClearsOnlyOuterWorldsAndCreatesTheVoidLobby.Teil3]]

# HostMinimizeTest.firstSetupClearsOnlyOuterWorldsAndCreatesTheVoidLobby.Teil3

```mermaid
flowchart TD
  n1["Schritt Z.172 assertTrue(Files.exists(root.resolve('world')));"]
  n2["Schritt Z.173 assertTrue(Files.exists(root.resolve('world_nethe…"]
  n3["Schritt Z.174 assertTrue(Files.exists(root.resolve('unused-worl…"]
  n4["Schritt Z.175 assertEquals('child-world', Files.readString(chil…"]
  n5["Schritt Z.176 assertEquals('keep config', Files.readString(data…"]
  n6["Schritt Z.177 assertEquals('keep password', Files.readString(da…"]
  n7["Schritt Z.178 assertEquals('keep backup', Files.readString(data…"]
  n8["Schritt Z.179 String properties = Files.readString(root.resolve…"]
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  n6 --> n7
  n7 --> n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HostMinimizeTest.firstSetupClearsOnlyOuterWorldsAndCreatesTheVoidLobby`, Quellreihenfolge.
