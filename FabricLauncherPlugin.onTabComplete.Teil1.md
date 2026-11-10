[[00 Start]] › [[Plugin-Kern]] › [[Befehle]] › [[FabricLauncherPlugin.onTabComplete]] › [[FabricLauncherPlugin.onTabComplete.Teil1]]

# FabricLauncherPlugin.onTabComplete.Teil1

```mermaid
flowchart TD
  n1["if Z.2511 (a.length == 2 && (a(0).equalsIgnoreCase('config'…"]
  n2["return Z.2511 return List.of('set');"]
  n3["if Z.2512 (a.length == 1)"]
  n4["return Z.2512 return List.of('start', 'stop', 'restart', 'statu…"]
  n5["if Z.2513 (a.length == 2 && a(0).equalsIgnoreCase('host'))"]
  n6["return Z.2513 return List.of('preview', 'apply', 'rollback').st…"]
  n7["if Z.2514 (a.length == 2 && a(0).equalsIgnoreCase('crashes'…"]
  n8["try Z.2515"]
  n9["FabricLauncherPlugin.crashFiles"]:::internal-link
  n10["return Z.2515 return crashFiles(focus).stream().filte…"]
  n11["catch Z.2516 (IOException e)"]
  n12["return Z.2516 return List.of();"]
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n5 -->|"ja"| n6
  n4 --> n5
  n3 --> n5
  n9 --> n10
  n8 --> n9
  n8 -->|"Fehler"| n11
  n11 --> n12
  n7 -->|"ja"| n8
  n6 --> n7
  n5 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.onTabComplete`, Quellreihenfolge.
