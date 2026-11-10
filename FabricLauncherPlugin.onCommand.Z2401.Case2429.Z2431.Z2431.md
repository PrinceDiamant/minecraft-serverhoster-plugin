[[00 Start]] › [[Plugin-Kern]] › [[Befehle]] › [[FabricLauncherPlugin.onCommand]] › [[FabricLauncherPlugin.onCommand.Z2401.Case2429.Z2431.Z2431]]

# FabricLauncherPlugin.onCommand.Z2401.Case2429.Z2431.Z2431

```mermaid
flowchart TD
  n1["try Z.2431"]
  n2["for Z.2431 (String v : versions(a(1)).stream().lim…"]
  n3["FabricLauncherPlugin.versions"]:::internal-link
  n4["FabricLauncherPlugin.msg"]:::internal-link
  n5["catch Z.2431 (Exception e)"]
  n6["FabricLauncherPlugin.msg"]:::internal-link
  n2 -->|"Z.2431"| n3
  n3 -->|"wiederholen"| n4
  n1 --> n2
  n1 -->|"Fehler"| n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.onCommand.Z2401.Case2429.Z2431`, Quellreihenfolge.
