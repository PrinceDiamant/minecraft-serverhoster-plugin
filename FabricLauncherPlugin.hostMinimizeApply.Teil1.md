[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[Host-Minimieren.Teil1]] › [[FabricLauncherPlugin.hostMinimizeApply]] › [[FabricLauncherPlugin.hostMinimizeApply.Teil1]]

# FabricLauncherPlugin.hostMinimizeApply.Teil1

```mermaid
flowchart TD
  n1["if Z.2271 (!HostMinimize.CONFIRM.equals(confirm))"]
  n2["throw Z.2272 throw new IllegalArgumentException('Die Bestätigu…"]
  n3["FabricLauncherPlugin.focusSlot"]:::internal-link
  n4["FabricLauncherPlugin.hostMinimizeApply.Teil1.Z2274"]:::internal-link
  n5["FabricLauncherPlugin.hostProtectedPaths"]:::internal-link
  n6["FabricLauncherPlugin.configuredHostWorld"]:::internal-link
  n7["if Z.2287 (worldName.isBlank())"]
  n8["throw Z.2287 throw new IOException('The outer host world name …"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  n7 -->|"ja"| n8
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.2271 (!HostMinimize.CONFIRM.equals(confirm))
  Zeile 2271: prüft `(!HostMinimize.CONFIRM.equals(confirm))`.
throw Z.2272 throw new IllegalArgumentException('Die Bestätigu…
  Zeile 2272: Abbruch `throw new IllegalArgumentException('Die Bestätigu…`.
FabricLauncherPlugin.focusSlot
  Das [[Glossar#Plugin|Plugin]] liefert den [[Glossar#Platz|Platz]]. Liefert oder setzt den [[Glossar#Fokus|Fokus]] `focusSlot`. Ruft `slot`.
FabricLauncherPlugin.hostMinimizeApply.Teil1.Z2274
  Der Ablauf geht in [[Glossar#Zeile|Zeile]] 2274 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 2274.
FabricLauncherPlugin.hostProtectedPaths
  Die Ordner des [[Glossar#Host|Host]], die nicht gelöscht oder überschrieben werden dürfen. Betrifft den Host `hostProtectedPaths`. Ruft `getWorldRoot`, `directory`.
FabricLauncherPlugin.configuredHostWorld
  Liest, welche [[Glossar#Spielwelt|Spielwelt]] der [[Glossar#Host|Host]] benutzen soll. Liest den konfigurierten Wert `configuredHostWorld`. Ruft `getWorldRoot`, `worldNameSafe`.
if Z.2287 (worldName.isBlank())
  Zeile 2287: prüft `(worldName.isBlank())`.
throw Z.2287 throw new IOException('The outer host world name …
  Zeile 2287: Abbruch `throw new IOException('The outer host world name …`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.2271 (!HostMinimize.CONFIRM.equals(confirm))**: Zeile 2271: prüft `(!HostMinimize.CONFIRM.equals(confirm))`.
> - **throw Z.2272 throw new IllegalArgumentException('Die Bestätigu…**: Zeile 2272: Abbruch `throw new IllegalArgumentException('Die Bestätigu…`.
> - **FabricLauncherPlugin.focusSlot**: Das [[Glossar#Plugin|Plugin]] liefert den [[Glossar#Platz|Platz]]. Liefert oder setzt den [[Glossar#Fokus|Fokus]] `focusSlot`. Ruft `slot`.
> - **FabricLauncherPlugin.hostMinimizeApply.Teil1.Z2274**: Der Ablauf geht in [[Glossar#Zeile|Zeile]] 2274 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 2274.
> - **FabricLauncherPlugin.hostProtectedPaths**: Die Ordner des [[Glossar#Host|Host]], die nicht gelöscht oder überschrieben werden dürfen. Betrifft den Host `hostProtectedPaths`. Ruft `getWorldRoot`, `directory`.
> - **FabricLauncherPlugin.configuredHostWorld**: Liest, welche [[Glossar#Spielwelt|Spielwelt]] der [[Glossar#Host|Host]] benutzen soll. Liest den konfigurierten Wert `configuredHostWorld`. Ruft `getWorldRoot`, `worldNameSafe`.
> - **if Z.2287 (worldName.isBlank())**: Zeile 2287: prüft `(worldName.isBlank())`.
> - **throw Z.2287 throw new IOException('The outer host world name …**: Zeile 2287: Abbruch `throw new IOException('The outer host world name …`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `FabricLauncherPlugin.hostMinimizeApply`.
