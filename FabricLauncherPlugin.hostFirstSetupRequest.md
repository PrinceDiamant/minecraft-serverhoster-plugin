[[00 Start]] › [[Host-Betrieb]] › [[Host-Ersteinrichtung]] › [[FabricLauncherPlugin.hostFirstSetupRequest]]

# FabricLauncherPlugin.hostFirstSetupRequest

`FabricLauncherPlugin.hostFirstSetupRequest(String confirm)` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:2252–2257](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L2252-L2257)

```mermaid
flowchart TD
  n1["HostFirstSetup.requestManual"]:::internal-link
  n2["FabricLauncherPlugin.hostFirstSetupMarker"]:::internal-link
  n3["return Z.2256 return Map.of('firstSetupStatus', 'requested', 's…"]
  n1 -->|"Z.2253"| n2
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
HostFirstSetup.requestManual
  Fordert an `requestManual`. Ruft `readState`, `writeMarker`.
FabricLauncherPlugin.hostFirstSetupMarker
  Betrifft den Host `hostFirstSetupMarker`.
return Z.2256 return Map.of('firstSetupStatus', 'requested', 's…
  Zeile 2256: Rückgabe `return Map.of('firstSetupStatus', 'requested', 's…`.
```

- `hostFirstSetupRequest` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
