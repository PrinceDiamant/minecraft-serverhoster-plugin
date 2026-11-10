[[00 Start]] › [[Tests]] › [[HostMinimizeTest]] › [[HostMinimizeTest.Teil1]] › [[HostMinimizeTest.firstSetupRefusesCleanupWhenPreparedWorldSelectionWasChanged]] › [[HostMinimizeTest.firstSetupRefusesCleanupWhenPreparedWorldSelectionWasChanged.Teil1]]

# HostMinimizeTest.firstSetupRefusesCleanupWhenPreparedWorldSelectionWasChanged.Teil1

```mermaid
flowchart TD
  n1["Schritt Z.253 Files.createDirectories(data);"]
  n2["Schritt Z.254 Files.createDirectories(root.resolve('world'));"]
  n3["Schritt Z.255 Files.writeString(root.resolve('world/level.dat')…"]
  n4["Schritt Z.256 Files.writeString(root.resolve('plugins/ServerHos…"]
  n5["Schritt Z.257 Files.writeString(root.resolve('server.properties…"]
  n6["HostFirstSetup.shouldRun"]:::internal-link
  n7["HostFirstSetup.apply(Path,Path,Path,Path)"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n6 fill:#f88,stroke:#900
  style n7 fill:#f88,stroke:#900
```

- Fortsetzung von `HostMinimizeTest.firstSetupRefusesCleanupWhenPreparedWorldSelectionWasChanged`, Quellreihenfolge.
