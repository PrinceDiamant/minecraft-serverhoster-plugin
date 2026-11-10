[[00 Start]] › [[Server-Anlage]] › [[Setup-Suche]] › [[SetupDiscovery]] › [[SetupDiscovery.scan]] › [[SetupDiscovery.scan.Teil2.Z54.Z55]]

# SetupDiscovery.scan.Teil2.Z54.Z55

```mermaid
flowchart TD
  n1["for Z.55 (ServerProfile profile : Profiles.load(…"]
  n2["Profiles.load"]:::internal-link
  n3["ServerProfile.directory"]:::internal-link
  n4["if Z.57 (isAllowedConfiguredDirectory(root, path) && isSe…"]
  n5["SetupDiscovery.isAllowedConfiguredDirectory"]:::internal-link
  n6["SetupDiscovery.isServerDirectory"]:::internal-link
  n1 -->|"Z.55"| n2
  n4 -->|"Z.57"| n5
  n5 -->|"Z.57"| n6
  n3 --> n4
  n2 -->|"wiederholen"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n2 fill:#f88,stroke:#900
```

```knoten
for Z.55 (ServerProfile profile : Profiles.load(…
  Zeile 55: Schleife `(ServerProfile profile : Profiles.load(…`.
Profiles.load
  Lädt `load`. Ruft `one`, `str`, `copyId`. Befund: angemeldet aber nicht umgesetzt (sicher).
ServerProfile.directory
  `directory` in `ServerProfile.java`.
if Z.57 (isAllowedConfiguredDirectory(root, path) && isSe…
  Zeile 57: prüft `(isAllowedConfiguredDirectory(root, path) && isSe…`.
SetupDiscovery.isAllowedConfiguredDirectory
  Prüft `isAllowedConfiguredDirectory`.
SetupDiscovery.isServerDirectory
  Prüft `isServerDirectory`. Ruft `hasServerFiles`.
```

- Fortsetzung von `SetupDiscovery.scan.Teil2.Z54`, Quellreihenfolge.
