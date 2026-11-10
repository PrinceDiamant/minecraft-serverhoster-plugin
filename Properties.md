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
  n1 -->|"Zeile 344"| n2
  n1 -->|"Zeile 349"| n5
  n6 -->|"Zeile 2612"| n7
  n7 -->|"Zeile 2617"| n8
  n7 -->|"Zeile 2620"| n1
  n9 -->|"Zeile 2631"| n10
  n9 -->|"Zeile 2638"| n8
  n11 -->|"Zeile 2659"| n10
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.syncPropertiesEdit
  Das [[Glossar#Plugin|Plugin]] gleicht ab die Eigenschaften die Bearbeitung.
FabricLauncherPlugin.configPrefix
  Der Anfang der Namen, unter denen die Werte eines Servers in den [[Glossar#Einstellungen|Einstellungen]] stehen.
FabricLauncherPlugin.prepareFiles
  Das [[Glossar#Plugin|Plugin]] bereitet vor die Dateien.
FabricLauncherPlugin.copyPlayerFiles
  Das [[Glossar#Plugin|Plugin]] kopiert den [[Glossar#Spieler|Spieler]] die Dateien.
FabricLauncherPlugin.parseValue
  Das [[Glossar#Plugin|Plugin]] liest den Wert.
FabricLauncherPlugin.setChildProperty(String,String)
  Das [[Glossar#Plugin|Plugin]] setzt den [[Glossar#Spielserver|Spielserver]] eine Eigenschaft.
FabricLauncherPlugin.setChildProperty(String,String,String)
  Das [[Glossar#Plugin|Plugin]] setzt den [[Glossar#Spielserver|Spielserver]] eine Eigenschaft.
FabricLauncherPlugin.updateProperties
  Das [[Glossar#Plugin|Plugin]] ändert die Eigenschaften.
FabricLauncherPlugin.writeProperties
  Das [[Glossar#Plugin|Plugin]] schreibt die Eigenschaften.
FabricLauncherPlugin.forcedProperties
  Werte, die das [[Glossar#Plugin|Plugin]] in der Eigenschaftsdatei fest setzt, auch wenn dort etwas anderes steht.
FabricLauncherPlugin.serverPropertiesPreview
  Zeigt, wie die Eigenschaftsdatei aussehen wird, bevor sie geschrieben wird.
```

> [!knoten] Was die Blöcke tun
> - **FabricLauncherPlugin.syncPropertiesEdit**: Das [[Glossar#Plugin|Plugin]] gleicht ab die Eigenschaften die Bearbeitung.
> - **FabricLauncherPlugin.configPrefix**: Der Anfang der Namen, unter denen die Werte eines Servers in den [[Glossar#Einstellungen|Einstellungen]] stehen.
> - **FabricLauncherPlugin.prepareFiles**: Das [[Glossar#Plugin|Plugin]] bereitet vor die Dateien.
> - **FabricLauncherPlugin.copyPlayerFiles**: Das [[Glossar#Plugin|Plugin]] kopiert den [[Glossar#Spieler|Spieler]] die Dateien.
> - **FabricLauncherPlugin.parseValue**: Das [[Glossar#Plugin|Plugin]] liest den Wert.
> - **FabricLauncherPlugin.setChildProperty(String,String)**: Das [[Glossar#Plugin|Plugin]] setzt den [[Glossar#Spielserver|Spielserver]] eine Eigenschaft.
> - **FabricLauncherPlugin.setChildProperty(String,String,String)**: Das [[Glossar#Plugin|Plugin]] setzt den [[Glossar#Spielserver|Spielserver]] eine Eigenschaft.
> - **FabricLauncherPlugin.updateProperties**: Das [[Glossar#Plugin|Plugin]] ändert die Eigenschaften.
> - **FabricLauncherPlugin.writeProperties**: Das [[Glossar#Plugin|Plugin]] schreibt die Eigenschaften.
> - **FabricLauncherPlugin.forcedProperties**: Werte, die das [[Glossar#Plugin|Plugin]] in der Eigenschaftsdatei fest setzt, auch wenn dort etwas anderes steht.
> - **FabricLauncherPlugin.serverPropertiesPreview**: Zeigt, wie die Eigenschaftsdatei aussehen wird, bevor sie geschrieben wird.

- Die Eigenschaftsdatei des [[Glossar#Spielserver|Spielservers]], zum Beispiel [[Glossar#Port|Port]] und Schwierigkeit, und die Dateien der [[Glossar#Spieler|Spieler]].
