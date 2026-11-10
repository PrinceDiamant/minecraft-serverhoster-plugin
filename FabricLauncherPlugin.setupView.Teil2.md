[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Dialog]] › [[FabricLauncherPlugin.setupView]] › [[FabricLauncherPlugin.setupView.Teil2]]

# FabricLauncherPlugin.setupView.Teil2

```mermaid
flowchart TD
  n1["SetupDiscovery.loadLegacyConfig"]:::internal-link
  n2["Schritt Z.398 result.put('legacyDataFound', Files.isRegularFile…"]
  n3["Schritt Z.400 result.put('cleanupAvailable', Files.isDirectory(…"]
  n4["return Z.403 return result;"]
  n1 --> n2
  n2 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
SetupDiscovery.loadLegacyConfig
  Dieser Teil lädt den alten Weg die [[Glossar#Einstellungen|Einstellungen]]. Lädt `loadLegacyConfig`.
Schritt Z.398 result.put('legacyDataFound', Files.isRegularFile…
  Zeile 398: Dateioperation. `result.put('legacyDataFound', Files.isRegularFile…`
Schritt Z.400 result.put('cleanupAvailable', Files.isDirectory(…
  Zeile 400: Dateioperation. `result.put('cleanupAvailable', Files.isDirectory(…`
return Z.403 return result;
  Zeile 403: Rückgabe `return result;`.
```

> [!knoten]- Was die Blöcke tun
> - **SetupDiscovery.loadLegacyConfig**: Dieser Teil lädt den alten Weg die [[Glossar#Einstellungen|Einstellungen]]. Lädt `loadLegacyConfig`.
> - **Schritt Z.398 result.put('legacyDataFound', Files.isRegularFile…**: Zeile 398: Dateioperation. `result.put('legacyDataFound', Files.isRegularFile…`
> - **Schritt Z.400 result.put('cleanupAvailable', Files.isDirectory(…**: Zeile 400: Dateioperation. `result.put('cleanupAvailable', Files.isDirectory(…`
> - **return Z.403 return result;**: Zeile 403: Rückgabe `return result;`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `FabricLauncherPlugin.setupView`.
