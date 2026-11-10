[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Dialog]] › [[FabricLauncherPlugin.configureSetup]] › [[FabricLauncherPlugin.configureSetup.Teil4]]

# FabricLauncherPlugin.configureSetup.Teil4

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.configureSetup.Teil4.Z603"]:::internal-link
  n2["if Z.612 (pendingArchive != null)"]
  n3["try Z.613"]
  n4["Schritt Z.614 Files.move(pendingArchive, finalArchive);"]
  n5["catch Z.615 (IOException e)"]
  n6["return Z.621 return result;"]
  n3 --> n4
  n3 -->|"Fehler"| n5
  n2 -->|"ja"| n3
  n1 --> n2
  n4 --> n6
  n5 --> n6
  n2 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.configureSetup.Teil4.Z603
  Fortsetzung des Ablaufs ab Zeile 603.
if Z.612 (pendingArchive != null)
  Zeile 612: prüft `(pendingArchive != null)`.
try Z.613
  Zeile 613: Versuch. Der Fehlerpfad geht in catch.
Schritt Z.614 Files.move(pendingArchive, finalArchive);
  Zeile 614: Dateioperation. `Files.move(pendingArchive, finalArchive);`
catch Z.615 (IOException e)
  Zeile 615: fängt (IOException e).
return Z.621 return result;
  Zeile 621: Rückgabe `return result;`.
```

- Fortsetzung von `FabricLauncherPlugin.configureSetup`, Quellreihenfolge.
