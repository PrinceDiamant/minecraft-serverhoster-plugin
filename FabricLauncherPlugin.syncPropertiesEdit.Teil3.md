[[00 Start]] › [[Plugin-Kern]] › [[Properties]] › [[FabricLauncherPlugin.syncPropertiesEdit]] › [[FabricLauncherPlugin.syncPropertiesEdit.Teil3]]

# FabricLauncherPlugin.syncPropertiesEdit.Teil3

```mermaid
flowchart TD
  n1["if Z.362 (changed)"]
  n2["FabricLauncherPlugin.saveConfigWritable"]:::internal-link
  n3["FabricLauncherPlugin.reloadProfiles"]:::internal-link
  n4["return Z.363 return changed;"]
  n2 --> n3
  n1 -->|"ja"| n2
  n3 --> n4
  n1 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n3 fill:#f88,stroke:#900
```

```knoten
if Z.362 (changed)
  Zeile 362: prüft `(changed)`.
FabricLauncherPlugin.saveConfigWritable
  Speichert `saveConfigWritable`. Ruft `makeWritable`.
FabricLauncherPlugin.reloadProfiles
  `Profiles.load`, danach nur `getFirst()`. Befund: angemeldet aber nicht umgesetzt (sicher).
return Z.363 return changed;
  Zeile 363: Rückgabe `return changed;`.
```

- Fortsetzung von `FabricLauncherPlugin.syncPropertiesEdit`, Quellreihenfolge.
