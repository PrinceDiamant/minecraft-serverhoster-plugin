[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Dialog]] › [[FabricLauncherPlugin.configureSetup]] › [[FabricLauncherPlugin.configureSetup.Teil3.Z580]]

# FabricLauncherPlugin.configureSetup.Teil3.Z580

```mermaid
flowchart TD
  n1["try Z.580"]
  n2["FabricLauncherPlugin.saveSetupConfigAtomically"]:::internal-link
  n3["catch Z.582 (IOException / RuntimeExcepti…"]
  n4["if Z.583 (rollbackSource != null && Files.exists(rollbackS…"]
  n5["try Z.585"]
  n6["Schritt Z.586 Files.move(rollbackSource, rollbackTarget);"]
  n7["catch Z.587 (IOException rollbackError)"]
  n8["FabricLauncherPlugin.reloadProfiles"]:::internal-link
  n9["throw Z.594 throw e;"]
  n1 --> n2
  n1 -->|"Fehler"| n3
  n5 --> n6
  n5 -->|"Fehler"| n7
  n4 -->|"ja"| n5
  n6 --> n8
  n7 --> n8
  n4 --> n8
  n8 --> n9
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n8 fill:#f88,stroke:#900
```

```knoten
try Z.580
  Zeile 580: Versuch. Der Fehlerpfad geht in catch.
FabricLauncherPlugin.saveSetupConfigAtomically
  Speichert `saveSetupConfigAtomically`. Ruft `makeWritable`.
catch Z.582 (IOException / RuntimeExcepti…
  Zeile 582: fängt (IOException / RuntimeExcepti….
if Z.583 (rollbackSource != null && Files.exists(rollbackS…
  Zeile 583: prüft `(rollbackSource != null && Files.exists(rollbackS…`.
try Z.585
  Zeile 585: Versuch. Der Fehlerpfad geht in catch.
Schritt Z.586 Files.move(rollbackSource, rollbackTarget);
  Zeile 586: Dateioperation. `Files.move(rollbackSource, rollbackTarget);`
catch Z.587 (IOException rollbackError)
  Zeile 587: fängt (IOException rollbackError).
FabricLauncherPlugin.reloadProfiles
  `Profiles.load`, danach nur `getFirst()`. Befund: angemeldet aber nicht umgesetzt (sicher).
throw Z.594 throw e;
  Zeile 594: Abbruch `throw e;`.
```

- Fortsetzung von `FabricLauncherPlugin.configureSetup.Teil3`, Quellreihenfolge.
