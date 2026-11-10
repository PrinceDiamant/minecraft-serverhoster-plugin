[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Stopp]] › [[FabricLauncherPlugin.requestChildEmergencyStop]] › [[FabricLauncherPlugin.requestChildEmergencyStop.Teil2]]

# FabricLauncherPlugin.requestChildEmergencyStop.Teil2

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.notifyNtfy"]:::internal-link
  n2["HostMemoryProbe.Snapshot.cgroupUsePercent"]:::internal-link
  n3["Schritt Z.1166 int warningDelay = Math.max(5, getConfig().getInt…"]
  n4["FabricLauncherPlugin.requestChildEmergencyStop.Teil2.Z1171"]:::internal-link
  n1 -->|"Z.1165"| n2
  n2 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.notifyNtfy
  Meldet `notifyNtfy`. Ruft `ntfySettings`, `backupCredentials`, `send`.
HostMemoryProbe.Snapshot.cgroupUsePercent
  `cgroupUsePercent` in `HostMemoryProbe.java`.
Schritt Z.1166 int warningDelay = Math.max(5, getConfig().getInt…
  Zeile 1166: liest die Config. `int warningDelay = Math.max(5, getConfig().getInt…`
FabricLauncherPlugin.requestChildEmergencyStop.Teil2.Z1171
  Fortsetzung des Ablaufs ab Zeile 1171.
```

- Fortsetzung von `FabricLauncherPlugin.requestChildEmergencyStop`, Quellreihenfolge.
