[[00 Start]] › [[Plugin-Kern]] › [[Befehle]] › [[FabricLauncherPlugin.onCommand]] › [[FabricLauncherPlugin.onCommand.Z2401.Case2474]]

# FabricLauncherPlugin.onCommand.Z2401.Case2474

```mermaid
flowchart TD
  n1["if Z.2475 (a.length ( 4 // !a(1).equalsIgnoreCase('set'))"]
  n2["return Z.2475 return true;"]
  n3["FabricLauncherPlugin.parseValue"]:::internal-link
  n4["FabricLauncherPlugin.saveConfigWritable"]:::internal-link
  n5["Schritt Z.2479 s.sendMessage('config.yml: ' + a(2) + ' = ' + get…"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n3 --> n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.2475 (a.length ( 4 // !a(1).equalsIgnoreCase('set'))
  Zeile 2475: prüft `(a.length ( 4 // !a(1).equalsIgnoreCase('set'))`.
return Z.2475 return true;
  Zeile 2475: Rückgabe `return true;`.
FabricLauncherPlugin.parseValue
  Das [[Glossar#Plugin|Plugin]] liest den Wert. Wertet aus `parseValue`.
FabricLauncherPlugin.saveConfigWritable
  Speichert die [[Glossar#Einstellungsdatei|Einstellungsdatei]] und setzt danach die [[Glossar#Dateirechte|Dateirechte]] so, dass sie beschreibbar bleibt. Speichert `saveConfigWritable`. Ruft `makeWritable`.
Schritt Z.2479 s.sendMessage('config.yml: ' + a(2) + ' = ' + get…
  Zeile 2479: `s.sendMessage('config.yml: ' + a(2) + ' = ' + get…`
```

> [!knoten]- Was die Blöcke tun
> - **if Z.2475 (a.length ( 4 // !a(1).equalsIgnoreCase('set'))**: Zeile 2475: prüft `(a.length ( 4 // !a(1).equalsIgnoreCase('set'))`.
> - **return Z.2475 return true;**: Zeile 2475: Rückgabe `return true;`.
> - **FabricLauncherPlugin.parseValue**: Das [[Glossar#Plugin|Plugin]] liest den Wert. Wertet aus `parseValue`.
> - **FabricLauncherPlugin.saveConfigWritable**: Speichert die [[Glossar#Einstellungsdatei|Einstellungsdatei]] und setzt danach die [[Glossar#Dateirechte|Dateirechte]] so, dass sie beschreibbar bleibt. Speichert `saveConfigWritable`. Ruft `makeWritable`.
> - **Schritt Z.2479 s.sendMessage('config.yml: ' + a(2) + ' = ' + get…**: Zeile 2479: `s.sendMessage('config.yml: ' + a(2) + ' = ' + get…`

- Das Innere eines Wegs, ab [[Glossar#Zeile|Zeile]] 2474.
- Fortsetzung von `FabricLauncherPlugin.onCommand.Z2401`.
