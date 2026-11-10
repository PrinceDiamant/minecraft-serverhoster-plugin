[[00 Start]] › [[Plugin-Kern]] › [[Befehle]] › [[FabricLauncherPlugin.onCommand]] › [[FabricLauncherPlugin.onCommand.Z2401.Case2474]]

# FabricLauncherPlugin.onCommand.Z2401.Case2474

```mermaid
flowchart TD
  n1["if Z.2475 (a.length ( 4 // !a(1).equalsIgnoreCase('set'))"]
  n2["return Z.2475 return true;"]
  n3["FabricLauncherPlugin.parseValue"]:::internal-link
  n4["FabricLauncherPlugin.saveConfigWritable"]:::internal-link
  n5["Schritt Z.2479 s.sendMessage('config.yml: ' + a(2) + ' = ' + get…"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n3 --> n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.onCommand.Z2401`, Quellreihenfolge.
