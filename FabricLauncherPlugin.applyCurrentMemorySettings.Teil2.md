[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Stopp]] › [[FabricLauncherPlugin.applyCurrentMemorySettings]] › [[FabricLauncherPlugin.applyCurrentMemorySettings.Teil2]]

# FabricLauncherPlugin.applyCurrentMemorySettings.Teil2

```mermaid
flowchart TD
  n1["Schritt Z.967 getConfig().set('memoryProtection.recoverySamples…"]
  n2["Schritt Z.968 getConfig().set('memoryProtection.recoveryCooldow…"]
  n3["Schritt Z.969 getConfig().set('memoryProtection.policyVersion',…"]
  n4["FabricLauncherPlugin.saveConfigWritable"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Schritt Z.967 getConfig().set('memoryProtection.recoverySamples…
  Zeile 967: liest die Config. `getConfig().set('memoryProtection.recoverySamples…`
Schritt Z.968 getConfig().set('memoryProtection.recoveryCooldow…
  Zeile 968: liest die Config. `getConfig().set('memoryProtection.recoveryCooldow…`
Schritt Z.969 getConfig().set('memoryProtection.policyVersion',…
  Zeile 969: liest die Config. `getConfig().set('memoryProtection.policyVersion',…`
FabricLauncherPlugin.saveConfigWritable
  Speichert die [[Glossar#Einstellungsdatei|Einstellungsdatei]] und setzt danach die [[Glossar#Dateirechte|Dateirechte]] so, dass sie beschreibbar bleibt. Speichert `saveConfigWritable`. Ruft `makeWritable`.
```

> [!knoten]- Was die Blöcke tun
> - **Schritt Z.967 getConfig().set('memoryProtection.recoverySamples…**: Zeile 967: liest die Config. `getConfig().set('memoryProtection.recoverySamples…`
> - **Schritt Z.968 getConfig().set('memoryProtection.recoveryCooldow…**: Zeile 968: liest die Config. `getConfig().set('memoryProtection.recoveryCooldow…`
> - **Schritt Z.969 getConfig().set('memoryProtection.policyVersion',…**: Zeile 969: liest die Config. `getConfig().set('memoryProtection.policyVersion',…`
> - **FabricLauncherPlugin.saveConfigWritable**: Speichert die [[Glossar#Einstellungsdatei|Einstellungsdatei]] und setzt danach die [[Glossar#Dateirechte|Dateirechte]] so, dass sie beschreibbar bleibt. Speichert `saveConfigWritable`. Ruft `makeWritable`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `FabricLauncherPlugin.applyCurrentMemorySettings`.
