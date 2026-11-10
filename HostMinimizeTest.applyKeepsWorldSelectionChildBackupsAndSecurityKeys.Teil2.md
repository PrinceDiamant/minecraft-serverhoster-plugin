[[00 Start]] › [[Tests]] › [[HostMinimizeTest]] › [[HostMinimizeTest.Teil1]] › [[HostMinimizeTest.applyKeepsWorldSelectionChildBackupsAndSecurityKeys]] › [[HostMinimizeTest.applyKeepsWorldSelectionChildBackupsAndSecurityKeys.Teil2]]

# HostMinimizeTest.applyKeepsWorldSelectionChildBackupsAndSecurityKeys.Teil2

```mermaid
flowchart TD
  n1["Schritt Z.44 Files.writeString(root.resolve('bukkit.yml'), 'se…"]
  n2["Schritt Z.45 Files.writeString(root.resolve('eula.txt'), 'eula…"]
  n3["Schritt Z.46 Files.createDirectories(root.resolve('libraries')…"]
  n4["Schritt Z.47 Files.writeString(root.resolve('libraries/keep.ja…"]
  n5["Schritt Z.49 Files.createDirectories(root.resolve('serverhoste…"]
  n6["HostMinimize.apply"]:::internal-link
  n7["Schritt Z.54 String properties = Files.readString(root.resolve…"]
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HostMinimizeTest.applyKeepsWorldSelectionChildBackupsAndSecurityKeys`, Quellreihenfolge.
