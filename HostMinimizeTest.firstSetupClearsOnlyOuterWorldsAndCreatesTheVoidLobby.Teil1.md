[[00 Start]] › [[Tests]] › [[HostMinimizeTest]] › [[HostMinimizeTest.Teil1]] › [[HostMinimizeTest.firstSetupClearsOnlyOuterWorldsAndCreatesTheVoidLobby]] › [[HostMinimizeTest.firstSetupClearsOnlyOuterWorldsAndCreatesTheVoidLobby.Teil1]]

# HostMinimizeTest.firstSetupClearsOnlyOuterWorldsAndCreatesTheVoidLobby.Teil1

```mermaid
flowchart TD
  n1["Schritt Z.143 Files.createDirectories(data.resolve('backups'));"]
  n2["Schritt Z.144 Files.writeString(root.resolve('plugins/ServerHos…"]
  n3["Schritt Z.145 Files.writeString(root.resolve('plugins/OtherPlug…"]
  n4["Schritt Z.146 Files.createDirectories(root.resolve('world/regio…"]
  n5["Schritt Z.147 Files.createDirectories(root.resolve('world_nethe…"]
  n6["Schritt Z.148 Files.createDirectories(root.resolve('unused-worl…"]
  n7["Schritt Z.149 Files.createDirectories(child.resolve('world'));"]
  n8["Schritt Z.150 Files.writeString(root.resolve('world/level.dat')…"]
  n9["Schritt Z.151 Files.writeString(root.resolve('world/region/r.0.…"]
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

- Fortsetzung von `HostMinimizeTest.firstSetupClearsOnlyOuterWorldsAndCreatesTheVoidLobby`, Quellreihenfolge.
