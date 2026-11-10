[[00 Start]] › [[Plugin-Kern]] › [[Lebenszyklus]] › [[FabricLauncherPlugin.onEnable]] › [[FabricLauncherPlugin.onEnable.Teil1.Z98.Z99.Z100]]

# FabricLauncherPlugin.onEnable.Teil1.Z98.Z99.Z100

```mermaid
flowchart TD
  n1["if Z.100 ('restart-required'.equals(HostFirstSetup.readSta…"]
  n2["HostFirstSetup.readState"]:::internal-link
  n3["FabricLauncherPlugin.hostFirstSetupMarker"]:::internal-link
  n4["HostFirstSetup.completeRestart(Path,Path,Path,Set,List)"]:::internal-link
  n5["FabricLauncherPlugin.getWorldRoot"]:::internal-link
  n6["FabricLauncherPlugin.hostFirstSetupMarker"]:::internal-link
  n7["FabricLauncherPlugin.configuredPath"]:::internal-link
  n8["FabricLauncherPlugin.hostProtectedPaths"]:::internal-link
  n1 -->|"Z.100"| n2
  n2 -->|"Z.100"| n3
  n4 -->|"Z.103"| n5
  n5 -->|"Z.103"| n6
  n6 -->|"Z.104"| n7
  n7 -->|"Z.105"| n8
  n3 -->|"ja"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.100 ('restart-required'.equals(HostFirstSetup.readSta…
  Zeile 100: prüft `('restart-required'.equals(HostFirstSetup.readSta…`.
HostFirstSetup.readState
  Liest `readState`. Ruft `readState`.
FabricLauncherPlugin.hostFirstSetupMarker
  Betrifft den Host `hostFirstSetupMarker`.
HostFirstSetup.completeRestart(Path,Path,Path,Set,List)
  Schließt ab `completeRestart`. Ruft `readState`, `requireRoot`, `lobbyNameSafe`.
FabricLauncherPlugin.getWorldRoot
  Liefert `getWorldRoot`.
FabricLauncherPlugin.configuredPath
  Liest den konfigurierten Wert `configuredPath`. Ruft `getWorldRoot`.
FabricLauncherPlugin.hostProtectedPaths
  Betrifft den Host `hostProtectedPaths`. Ruft `getWorldRoot`, `directory`.
```

- Fortsetzung von `FabricLauncherPlugin.onEnable.Teil1.Z98.Z99`, Quellreihenfolge.
