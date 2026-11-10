[[00 Start]] › [[Server-Anlage]] › [[Setup-Suche]] › [[SetupDiscovery]] › [[SetupDiscovery.scan]] › [[SetupDiscovery.scan.Teil3]]

# SetupDiscovery.scan.Teil3

```mermaid
flowchart TD
  n1["for Z.82 (var entry : configured.entrySet())"]
  n2["SetupDiscovery.hasServerFiles"]:::internal-link
  n3["SetupDiscovery.topLevelEntries"]:::internal-link
  n4["return Z.88 return List.copyOf(result);"]
  n2 -->|"Z.86"| n3
  n1 -->|"wiederholen"| n2
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
for Z.82 (var entry : configured.entrySet())
  Zeile 82: Schleife `(var entry : configured.entrySet())`.
SetupDiscovery.hasServerFiles
  Prüft `hasServerFiles`.
SetupDiscovery.topLevelEntries
  `topLevelEntries` in `SetupDiscovery.java`.
return Z.88 return List.copyOf(result);
  Zeile 88: Rückgabe `return List.copyOf(result);`.
```

- Fortsetzung von `SetupDiscovery.scan`, Quellreihenfolge.
