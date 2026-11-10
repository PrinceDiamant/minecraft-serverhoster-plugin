[[00 Start]] › [[Plugin-Kern]] › [[Properties]]

# Properties

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.syncPropertiesEdit"]:::internal-link
  n2["FabricLauncherPlugin.configPrefix"]:::internal-link
  n3["FabricLauncherPlugin.prepareFiles"]:::internal-link
  n4["FabricLauncherPlugin.copyPlayerFiles"]:::internal-link
  n5["FabricLauncherPlugin.parseValue"]:::internal-link
  n6["FabricLauncherPlugin.setChildProperty(String,String)"]:::internal-link
  n7["FabricLauncherPlugin.setChildProperty(String,String,String)"]:::internal-link
  n8["FabricLauncherPlugin.updateProperties"]:::internal-link
  n9["FabricLauncherPlugin.writeProperties"]:::internal-link
  n10["FabricLauncherPlugin.forcedProperties"]:::internal-link
  n11["FabricLauncherPlugin.serverPropertiesPreview"]:::internal-link
  n1 -->|"Z.344"| n2
  n1 -->|"Z.349"| n5
  n6 -->|"Z.2612"| n7
  n7 -->|"Z.2617"| n8
  n7 -->|"Z.2620"| n1
  n9 -->|"Z.2631"| n10
  n9 -->|"Z.2638"| n8
  n11 -->|"Z.2659"| n10
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.syncPropertiesEdit
  Gleicht ab `syncPropertiesEdit`. Ruft `profile`, `configPrefix`, `parseValue`.
FabricLauncherPlugin.configPrefix
  `configPrefix` in `FabricLauncherPlugin.java`.
FabricLauncherPlugin.prepareFiles
  Bereitet vor `prepareFiles`. Ruft `firstStable`, `getJson`, `download`.
FabricLauncherPlugin.copyPlayerFiles
  Kopiert `copyPlayerFiles`.
FabricLauncherPlugin.parseValue
  Wertet aus `parseValue`.
FabricLauncherPlugin.setChildProperty(String,String)
  Setzt `setChildProperty`. Ruft `setChildProperty`.
FabricLauncherPlugin.setChildProperty(String,String,String)
  Setzt `setChildProperty`. Ruft `profile`, `directory`, `updateProperties`.
FabricLauncherPlugin.updateProperties
  Aktualisiert `updateProperties`. Ruft `update`.
FabricLauncherPlugin.writeProperties
  Schreibt `writeProperties`. Ruft `forcedProperties`, `hostBindAddress`, `updateProperties`.
FabricLauncherPlugin.forcedProperties
  Erzwingt `forcedProperties`. Ruft `effectiveBindAddress`.
FabricLauncherPlugin.serverPropertiesPreview
  `serverPropertiesPreview` in `FabricLauncherPlugin.java`. Ruft `profile`, `directory`, `open`.
```


