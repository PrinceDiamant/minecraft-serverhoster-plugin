[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Probe]] › [[FabricLauncherPlugin.maybeWriteTelemetry]] › [[FabricLauncherPlugin.maybeWriteTelemetry.Teil1]]

# FabricLauncherPlugin.maybeWriteTelemetry.Teil1

```mermaid
flowchart TD
  n1["if Z.921 (!getConfig().getBoolean('memoryTelemetry.enabled…"]
  n2["return Z.921 return;"]
  n3["Schritt Z.922 long configuredInterval = getConfig().getLong('me…"]
  n4["RuntimeLimits.boundedSeconds"]:::internal-link
  n5["if Z.924 (configuredInterval ) 0 && configuredInterval ( 1…"]
  n6["FabricLauncherPlugin.warnOnce"]:::internal-link
  n7["RuntimeLimits.boundedSeconds"]:::internal-link
  n8["FabricLauncherPlugin.warnOnce"]:::internal-link
  n9["Schritt Z.927 long maxBytes = getConfig().getLong('memoryTeleme…"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n3 --> n4
  n5 -->|"ja"| n6
  n4 --> n5
  n7 -->|"Z.926"| n8
  n6 --> n7
  n5 --> n7
  n8 --> n9
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.921 (!getConfig().getBoolean('memoryTelemetry.enabled…
  Zeile 921: prüft `(!getConfig().getBoolean('memoryTelemetry.enabled…`.
return Z.921 return;
  Zeile 921: Rückgabe `return;`.
Schritt Z.922 long configuredInterval = getConfig().getLong('me…
  Zeile 922: liest die Config. `long configuredInterval = getConfig().getLong('me…`
RuntimeLimits.boundedSeconds
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Begrenzt `boundedSeconds`.
if Z.924 (configuredInterval ) 0 && configuredInterval ( 1…
  Zeile 924: prüft `(configuredInterval ) 0 && configuredInterval ( 1…`.
FabricLauncherPlugin.warnOnce
  Schreibt eine Warnung nur ein einziges Mal, damit das Protokoll nicht vollläuft. Warnt `warnOnce`.
Schritt Z.927 long maxBytes = getConfig().getLong('memoryTeleme…
  Zeile 927: liest die Config. `long maxBytes = getConfig().getLong('memoryTeleme…`
```

> [!knoten]- Was die Blöcke tun
> - **if Z.921 (!getConfig().getBoolean('memoryTelemetry.enabled…**: Zeile 921: prüft `(!getConfig().getBoolean('memoryTelemetry.enabled…`.
> - **return Z.921 return;**: Zeile 921: Rückgabe `return;`.
> - **Schritt Z.922 long configuredInterval = getConfig().getLong('me…**: Zeile 922: liest die Config. `long configuredInterval = getConfig().getLong('me…`
> - **RuntimeLimits.boundedSeconds**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Begrenzt `boundedSeconds`.
> - **if Z.924 (configuredInterval ) 0 && configuredInterval ( 1…**: Zeile 924: prüft `(configuredInterval ) 0 && configuredInterval ( 1…`.
> - **FabricLauncherPlugin.warnOnce**: Schreibt eine Warnung nur ein einziges Mal, damit das Protokoll nicht vollläuft. Warnt `warnOnce`.
> - **Schritt Z.927 long maxBytes = getConfig().getLong('memoryTeleme…**: Zeile 927: liest die Config. `long maxBytes = getConfig().getLong('memoryTeleme…`

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `FabricLauncherPlugin.maybeWriteTelemetry`.
