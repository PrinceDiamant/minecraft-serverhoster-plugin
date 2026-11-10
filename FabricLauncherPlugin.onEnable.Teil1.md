[[00 Start]] › [[Plugin-Kern]] › [[Lebenszyklus]] › [[FabricLauncherPlugin.onEnable]] › [[FabricLauncherPlugin.onEnable.Teil1]]

# FabricLauncherPlugin.onEnable.Teil1

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.onEnable.Teil1.Z98"]:::internal-link
  n2["try Z.113"]
  n3["HostMinimize.clearIdlePause"]:::internal-link
  n4["FabricLauncherPlugin.getWorldRoot"]:::internal-link
  n5["catch Z.114 (IOException e)"]
  n6["FabricLauncherPlugin.migrateRestartPolicy"]:::internal-link
  n7["Schritt Z.116 setupRequired = !getConfig().getBoolean('setup.co…"]
  n8["FabricLauncherPlugin.applyCurrentMemorySettings"]:::internal-link
  n3 -->|"Z.113"| n4
  n2 --> n3
  n2 -->|"Fehler"| n5
  n1 --> n2
  n4 --> n6
  n5 --> n6
  n6 --> n7
  n7 --> n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.onEnable.Teil1.Z98
  Der Ablauf geht in [[Glossar#Zeile|Zeile]] 98 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 98.
try Z.113
  Zeile 113: Versuch. Der Fehlerpfad geht in catch.
HostMinimize.clearIdlePause
  Das Verkleinern des [[Glossar#Host|Host]] löscht den gemerkten Stand von hier einen Schritt. Eine Ebene tiefer steht er genauer. Leert `clearIdlePause`. Ruft `lobbyNameSafe`.
FabricLauncherPlugin.getWorldRoot
  Das [[Glossar#Plugin|Plugin]] liefert die [[Glossar#Spielwelt|Spielwelt]] den Anfang. Liefert `getWorldRoot`.
catch Z.114 (IOException e)
  Zeile 114: fängt (IOException e).
FabricLauncherPlugin.migrateRestartPolicy
  Übernimmt eine ältere Schreibweise der [[Glossar#Neustart|Neustart]]-Regel in die heutige. Übernimmt den alten Wert von `migrateRestartPolicy`. Ruft `migrateLegacyUnlimited`, `migrateLegacyRestartPolicy`, `saveConfigWritable`.
Schritt Z.116 setupRequired = !getConfig().getBoolean('setup.co…
  Zeile 116: liest die Config. `setupRequired = !getConfig().getBoolean('setup.co…`
FabricLauncherPlugin.applyCurrentMemorySettings
  Das [[Glossar#Plugin|Plugin]] wendet an den aktuellen Stand den [[Glossar#Arbeitsspeicher|Arbeitsspeicher]] die [[Glossar#Einstellungen|Einstellungen]]. Wendet an `applyCurrentMemorySettings`. Ruft `saveConfigWritable`.
```

> [!knoten]- Was die Blöcke tun
> - **FabricLauncherPlugin.onEnable.Teil1.Z98**: Der Ablauf geht in [[Glossar#Zeile|Zeile]] 98 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 98.
> - **try Z.113**: Zeile 113: Versuch. Der Fehlerpfad geht in catch.
> - **HostMinimize.clearIdlePause**: Das Verkleinern des [[Glossar#Host|Host]] löscht den gemerkten Stand von hier einen Schritt. Eine Ebene tiefer steht er genauer. Leert `clearIdlePause`. Ruft `lobbyNameSafe`.
> - **FabricLauncherPlugin.getWorldRoot**: Das [[Glossar#Plugin|Plugin]] liefert die [[Glossar#Spielwelt|Spielwelt]] den Anfang. Liefert `getWorldRoot`.
> - **catch Z.114 (IOException e)**: Zeile 114: fängt (IOException e).
> - **FabricLauncherPlugin.migrateRestartPolicy**: Übernimmt eine ältere Schreibweise der [[Glossar#Neustart|Neustart]]-Regel in die heutige. Übernimmt den alten Wert von `migrateRestartPolicy`. Ruft `migrateLegacyUnlimited`, `migrateLegacyRestartPolicy`, `saveConfigWritable`.
> - **Schritt Z.116 setupRequired = !getConfig().getBoolean('setup.co…**: Zeile 116: liest die Config. `setupRequired = !getConfig().getBoolean('setup.co…`
> - **FabricLauncherPlugin.applyCurrentMemorySettings**: Das [[Glossar#Plugin|Plugin]] wendet an den aktuellen Stand den [[Glossar#Arbeitsspeicher|Arbeitsspeicher]] die [[Glossar#Einstellungen|Einstellungen]]. Wendet an `applyCurrentMemorySettings`. Ruft `saveConfigWritable`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `FabricLauncherPlugin.onEnable`.
