[[00 Start]] › [[Backup]] › [[Backup-Lauf]] › [[FabricLauncherPlugin.backupSpec]]

# FabricLauncherPlugin.backupSpec

`FabricLauncherPlugin.backupSpec()` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:1485–1495](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L1485-L1495)

```mermaid
flowchart TD
  n1["Schritt Z.1486 FileConfiguration c = getConfig();"]
  n2["if Z.1489 (!path.isAbsolute())"]
  n3["return Z.1490 return new BackupBridge.Spec(path.toString(), c.g…"]
  n1 --> n2
  n2 --> n3
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Schritt Z.1486 FileConfiguration c = getConfig();
  Ein einzelner Arbeitsschritt, ohne eine weitere eigene [[Glossar#Funktion|Funktion]] aufzurufen. Das steht in [[Glossar#Zeile|Zeile]] 1486.
if Z.1489 (!path.isAbsolute())
  Hier fällt eine Entscheidung. Nur wenn sie zutrifft, geht es den Ja-Weg weiter. Das steht in [[Glossar#Zeile|Zeile]] 1489.
return Z.1490 return new BackupBridge.Spec(path.toString(), c.g…
  Hier endet die [[Glossar#Funktion|Funktion]] und liefert ein Ergebnis zurück. Das steht in [[Glossar#Zeile|Zeile]] 1490.
```

> [!knoten]- Was die Blöcke tun
> - **Schritt Z.1486 FileConfiguration c = getConfig();**: Ein einzelner Arbeitsschritt, ohne eine weitere eigene [[Glossar#Funktion|Funktion]] aufzurufen. Das steht in [[Glossar#Zeile|Zeile]] 1486.
> - **if Z.1489 (!path.isAbsolute())**: Hier fällt eine Entscheidung. Nur wenn sie zutrifft, geht es den Ja-Weg weiter. Das steht in [[Glossar#Zeile|Zeile]] 1489.
> - **return Z.1490 return new BackupBridge.Spec(path.toString(), c.g…**: Hier endet die [[Glossar#Funktion|Funktion]] und liefert ein Ergebnis zurück. Das steht in [[Glossar#Zeile|Zeile]] 1490.

- Das [[Glossar#Plugin|Plugin]] sichert die Vorgabe.
