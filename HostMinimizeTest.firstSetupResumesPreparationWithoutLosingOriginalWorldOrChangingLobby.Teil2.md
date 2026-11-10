[[00 Start]] › [[Tests]] › [[HostMinimizeTest]] › [[HostMinimizeTest.Teil1]] › [[HostMinimizeTest.firstSetupResumesPreparationWithoutLosingOriginalWorldOrChangingLobby]] › [[HostMinimizeTest.firstSetupResumesPreparationWithoutLosingOriginalWorldOrChangingLobby.Teil2]]

# HostMinimizeTest.firstSetupResumesPreparationWithoutLosingOriginalWorldOrChangingLobby.Teil2

```mermaid
flowchart TD
  n1["Schritt Z.237 assertTrue(Files.exists(root.resolve('old-world_n…"]
  n2["Schritt Z.239 String staged = Files.readString(marker).replace(…"]
  n3["Schritt Z.240 Files.writeString(marker, staged);"]
  n4["HostFirstSetup.shouldRun"]:::internal-link
  n5["HostFirstSetup.apply(Path,Path,Path,Path)"]:::internal-link
  n6["Schritt Z.244 assertTrue(Files.exists(root.resolve('old-world_n…"]
  n7["HostFirstSetup.completeRestart(Path,Path,Path,Set)"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n4 fill:#f88,stroke:#900
  style n5 fill:#f88,stroke:#900
  style n7 fill:#f88,stroke:#900
```

- Fortsetzung von `HostMinimizeTest.firstSetupResumesPreparationWithoutLosingOriginalWorldOrChangingLobby`, Quellreihenfolge.
