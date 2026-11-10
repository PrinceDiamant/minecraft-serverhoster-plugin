[[00 Start]] › [[Plugin-Kern]] › [[Properties]] › [[FabricLauncherPlugin.syncPropertiesEdit]] › [[FabricLauncherPlugin.syncPropertiesEdit.Teil1]]

# FabricLauncherPlugin.syncPropertiesEdit.Teil1

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.profile"]:::internal-link
  n2["FabricLauncherPlugin.configPrefix"]:::internal-link
  n3["for Z.346 (String k : p.stringPropertyNames())"]
  n4["if Z.348 (cur != null && !p.getProperty(k).equals(cur))"]
  n5["FabricLauncherPlugin.parseValue"]:::internal-link
  n1 --> n2
  n4 -->|"ja"| n5
  n3 -->|"wiederholen"| n4
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.profile
  Das [[Glossar#Plugin|Plugin]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `profile` in `FabricLauncherPlugin.java`.
FabricLauncherPlugin.configPrefix
  Der Anfang der Namen, unter denen die Werte eines Servers in den [[Glossar#Einstellungen|Einstellungen]] stehen. `configPrefix` in `FabricLauncherPlugin.java`.
for Z.346 (String k : p.stringPropertyNames())
  Zeile 346: Schleife `(String k : p.stringPropertyNames())`.
if Z.348 (cur != null && !p.getProperty(k).equals(cur))
  Zeile 348: prüft `(cur != null && !p.getProperty(k).equals(cur))`.
FabricLauncherPlugin.parseValue
  Das [[Glossar#Plugin|Plugin]] liest den Wert. Wertet aus `parseValue`.
```

> [!knoten]- Was die Blöcke tun
> - **FabricLauncherPlugin.profile**: Das [[Glossar#Plugin|Plugin]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `profile` in `FabricLauncherPlugin.java`.
> - **FabricLauncherPlugin.configPrefix**: Der Anfang der Namen, unter denen die Werte eines Servers in den [[Glossar#Einstellungen|Einstellungen]] stehen. `configPrefix` in `FabricLauncherPlugin.java`.
> - **for Z.346 (String k : p.stringPropertyNames())**: Zeile 346: Schleife `(String k : p.stringPropertyNames())`.
> - **if Z.348 (cur != null && !p.getProperty(k).equals(cur))**: Zeile 348: prüft `(cur != null && !p.getProperty(k).equals(cur))`.
> - **FabricLauncherPlugin.parseValue**: Das [[Glossar#Plugin|Plugin]] liest den Wert. Wertet aus `parseValue`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `FabricLauncherPlugin.syncPropertiesEdit`.
