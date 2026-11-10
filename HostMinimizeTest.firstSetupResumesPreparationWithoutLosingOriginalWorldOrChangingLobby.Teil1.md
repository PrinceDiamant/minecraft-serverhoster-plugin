[[00 Start]] › [[Tests]] › [[HostMinimizeTest]] › [[HostMinimizeTest.Teil1]] › [[HostMinimizeTest.firstSetupResumesPreparationWithoutLosingOriginalWorldOrChangingLobby]] › [[HostMinimizeTest.firstSetupResumesPreparationWithoutLosingOriginalWorldOrChangingLobby.Teil1]]

# HostMinimizeTest.firstSetupResumesPreparationWithoutLosingOriginalWorldOrChangingLobby.Teil1

```mermaid
flowchart TD
  n1["Schritt Z.229 Files.createDirectories(data);"]
  n2["Schritt Z.230 Files.createDirectories(root.resolve('old-world_n…"]
  n3["Schritt Z.231 Files.writeString(root.resolve('plugins/ServerHos…"]
  n4["Schritt Z.232 Files.writeString(root.resolve('server.properties…"]
  n5["HostFirstSetup.shouldRun"]:::internal-link
  n6["HostFirstSetup.apply(Path,Path,Path,Path)"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n5 fill:#f88,stroke:#900
  style n6 fill:#f88,stroke:#900
```

- Fortsetzung von `HostMinimizeTest.firstSetupResumesPreparationWithoutLosingOriginalWorldOrChangingLobby`, Quellreihenfolge.
