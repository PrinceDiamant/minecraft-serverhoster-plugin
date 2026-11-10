[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Stopp]] › [[FabricLauncherPlugin.requestChildEmergencyStop]] › [[FabricLauncherPlugin.requestChildEmergencyStop.Teil2.Z1171]]

# FabricLauncherPlugin.requestChildEmergencyStop.Teil2.Z1171

```mermaid
flowchart TD
  n1["for Z.1171 (ChildSlot slot : List.copyOf(slots.val…"]
  n2["if Z.1172 (!slot.running())"]
  n3["ChildSlot.running"]:::internal-link
  n4["FabricLauncherPlugin.send"]:::internal-link
  n5["FabricLauncherPlugin.send"]:::internal-link
  n6["if Z.1178 (!saved)"]
  n2 -->|"Z.1172"| n3
  n3 --> n4
  n3 --> n4
  n4 --> n5
  n5 --> n6
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.requestChildEmergencyStop.Teil2`, Quellreihenfolge.
