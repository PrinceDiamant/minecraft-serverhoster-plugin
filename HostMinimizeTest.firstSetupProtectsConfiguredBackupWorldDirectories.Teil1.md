[[00 Start]] › [[Tests]] › [[HostMinimizeTest]] › [[HostMinimizeTest.Teil2]] › [[HostMinimizeTest.firstSetupProtectsConfiguredBackupWorldDirectories]] › [[HostMinimizeTest.firstSetupProtectsConfiguredBackupWorldDirectories.Teil1]]

# HostMinimizeTest.firstSetupProtectsConfiguredBackupWorldDirectories.Teil1

```mermaid
flowchart TD
  n1["Schritt Z.277 Files.createDirectories(data);"]
  n2["Schritt Z.278 Files.createDirectories(backup);"]
  n3["Schritt Z.279 Files.writeString(backup.resolve('level.dat'), 'b…"]
  n4["Schritt Z.280 Files.writeString(root.resolve('plugins/ServerHos…"]
  n5["Schritt Z.281 Files.writeString(root.resolve('server.properties…"]
  n6["HostFirstSetup.shouldRun"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n6 fill:#f88,stroke:#900
```

- Fortsetzung von `HostMinimizeTest.firstSetupProtectsConfiguredBackupWorldDirectories`, Quellreihenfolge.
