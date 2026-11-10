[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Dialog]] › [[FabricLauncherPlugin.configureSetup]] › [[FabricLauncherPlugin.configureSetup.Teil2.Z519.Z530.Z535.Z538.Teil1]]

# FabricLauncherPlugin.configureSetup.Teil2.Z519.Z530.Z535.Z538.Teil1

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.findSetupCandidate"]:::internal-link
  n2["if Z.541 (!expected.equals(confirm))"]
  n3["throw Z.541 throw new IllegalArgumentException('Die Archivier…"]
  n4["if Z.542 (!SetupDiscovery.isSafeArchiveTarget(root, candid…"]
  n5["SetupDiscovery.isSafeArchiveTarget"]:::internal-link
  n6["throw Z.543 throw new IllegalArgumentException('Dieser Ordner…"]
  n7["Schritt Z.549 Files.move(candidate.path(), pendingArchive);"]
  n2 -->|"ja"| n3
  n1 --> n2
  n4 -->|"Z.542"| n5
  n5 -->|"ja"| n6
  n3 --> n4
  n2 --> n4
  n6 --> n7
  n5 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.findSetupCandidate
  Sucht `findSetupCandidate`. Ruft `scan`.
if Z.541 (!expected.equals(confirm))
  Zeile 541: prüft `(!expected.equals(confirm))`.
throw Z.541 throw new IllegalArgumentException('Die Archivier…
  Zeile 541: Abbruch `throw new IllegalArgumentException('Die Archivier…`.
if Z.542 (!SetupDiscovery.isSafeArchiveTarget(root, candid…
  Zeile 542: prüft `(!SetupDiscovery.isSafeArchiveTarget(root, candid…`.
SetupDiscovery.isSafeArchiveTarget
  Prüft `isSafeArchiveTarget`.
throw Z.543 throw new IllegalArgumentException('Dieser Ordner…
  Zeile 543: Abbruch `throw new IllegalArgumentException('Dieser Ordner…`.
Schritt Z.549 Files.move(candidate.path(), pendingArchive);
  Zeile 549: Dateioperation. `Files.move(candidate.path(), pendingArchive);`
```

- Fortsetzung von `FabricLauncherPlugin.configureSetup.Teil2.Z519.Z530.Z535.Z538`, Quellreihenfolge.
