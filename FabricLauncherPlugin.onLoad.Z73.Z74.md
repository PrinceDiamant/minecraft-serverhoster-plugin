[[00 Start]] › [[Plugin-Kern]] › [[Lebenszyklus]] › [[FabricLauncherPlugin.onLoad]] › [[FabricLauncherPlugin.onLoad.Z73.Z74]]

# FabricLauncherPlugin.onLoad.Z73.Z74

```mermaid
flowchart TD
  n1["if Z.74 (HostFirstSetup.shouldRun(marker, freshInstall))"]
  n2["HostFirstSetup.shouldRun"]:::internal-link
  n3["FabricLauncherPlugin.configuredPath"]:::internal-link
  n4["HostFirstSetup.apply(Path,Path,Path,Path,List)"]:::internal-link
  n5["FabricLauncherPlugin.getWorldRoot"]:::internal-link
  n6["FabricLauncherPlugin.runningPluginJar"]:::internal-link
  n7["FabricLauncherPlugin.hostProtectedPaths"]:::internal-link
  n8["if Z.79 (result.applied())"]
  n9["if Z.82 (!result.disabledPluginJars().isEmpty())"]
  n10["if Z.87 ('manual-required'.equals(HostFirstSetup.readStat…"]
  n11["HostFirstSetup.readState"]:::internal-link
  n1 -->|"Z.74"| n2
  n4 -->|"Z.76"| n5
  n5 -->|"Z.76"| n6
  n6 -->|"Z.77"| n7
  n3 --> n4
  n8 -->|"ja"| n9
  n7 --> n8
  n10 -->|"Z.87"| n11
  n2 -->|"ja"| n3
  n2 -->|"nein"| n10
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n2 fill:#f88,stroke:#900
```

```knoten
if Z.74 (HostFirstSetup.shouldRun(marker, freshInstall))
  Zeile 74: prüft `(HostFirstSetup.shouldRun(marker, freshInstall))`.
HostFirstSetup.shouldRun
  Die [[Glossar#Ersteinrichtung|Ersteinrichtung]] führt aus das. Entscheidet, ob `shouldRun`. Ruft `readState`, `writeMarker`. [[Glossar#Befund|Befund]]: [[Glossar#Altlast|Altlast]], wahrscheinlich. HostFirstSetup.java:35 akzeptiert pending; Schreibstelle nur HostMinimizeTest.java:216
FabricLauncherPlugin.configuredPath
  Liest einen Ordner so, wie er in den [[Glossar#Einstellungen|Einstellungen]] steht. Liest den konfigurierten Wert `configuredPath`. Ruft `getWorldRoot`.
HostFirstSetup.apply(Path,Path,Path,Path,List)
  Die [[Glossar#Ersteinrichtung|Ersteinrichtung]] wendet an das. Wendet an `apply`. Ruft `readState`, `requireRoot`, `otherPluginJars`.
FabricLauncherPlugin.getWorldRoot
  Das [[Glossar#Plugin|Plugin]] liefert die [[Glossar#Spielwelt|Spielwelt]] den Anfang. Liefert `getWorldRoot`.
FabricLauncherPlugin.runningPluginJar
  Das [[Glossar#Plugin|Plugin]] prüft, ob läuft, das Plugin die [[Glossar#Programmdatei|Programmdatei]]. Sagt, ob der [[Glossar#Prozess|Prozess]] läuft `runningPluginJar`.
FabricLauncherPlugin.hostProtectedPaths
  Die Ordner des [[Glossar#Host|Host]], die nicht gelöscht oder überschrieben werden dürfen. Betrifft den Host `hostProtectedPaths`. Ruft `getWorldRoot`, `directory`.
if Z.79 (result.applied())
  Zeile 79: prüft `(result.applied())`.
if Z.82 (!result.disabledPluginJars().isEmpty())
  Zeile 82: prüft `(!result.disabledPluginJars().isEmpty())`.
if Z.87 ('manual-required'.equals(HostFirstSetup.readStat…
  Zeile 87: prüft `('manual-required'.equals(HostFirstSetup.readStat…`.
HostFirstSetup.readState
  Die [[Glossar#Ersteinrichtung|Ersteinrichtung]] liest den Zustand. Liest `readState`. Ruft `readState`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.74 (HostFirstSetup.shouldRun(marker, freshInstall))**: Zeile 74: prüft `(HostFirstSetup.shouldRun(marker, freshInstall))`.
> - **HostFirstSetup.shouldRun**: Die [[Glossar#Ersteinrichtung|Ersteinrichtung]] führt aus das. Entscheidet, ob `shouldRun`. Ruft `readState`, `writeMarker`. [[Glossar#Befund|Befund]]: [[Glossar#Altlast|Altlast]], wahrscheinlich. HostFirstSetup.java:35 akzeptiert pending; Schreibstelle nur HostMinimizeTest.java:216
> - **FabricLauncherPlugin.configuredPath**: Liest einen Ordner so, wie er in den [[Glossar#Einstellungen|Einstellungen]] steht. Liest den konfigurierten Wert `configuredPath`. Ruft `getWorldRoot`.
> - **HostFirstSetup.apply(Path,Path,Path,Path,List)**: Die [[Glossar#Ersteinrichtung|Ersteinrichtung]] wendet an das. Wendet an `apply`. Ruft `readState`, `requireRoot`, `otherPluginJars`.
> - **FabricLauncherPlugin.getWorldRoot**: Das [[Glossar#Plugin|Plugin]] liefert die [[Glossar#Spielwelt|Spielwelt]] den Anfang. Liefert `getWorldRoot`.
> - **FabricLauncherPlugin.runningPluginJar**: Das [[Glossar#Plugin|Plugin]] prüft, ob läuft, das Plugin die [[Glossar#Programmdatei|Programmdatei]]. Sagt, ob der [[Glossar#Prozess|Prozess]] läuft `runningPluginJar`.
> - **FabricLauncherPlugin.hostProtectedPaths**: Die Ordner des [[Glossar#Host|Host]], die nicht gelöscht oder überschrieben werden dürfen. Betrifft den Host `hostProtectedPaths`. Ruft `getWorldRoot`, `directory`.
> - **if Z.79 (result.applied())**: Zeile 79: prüft `(result.applied())`.
> - **if Z.82 (!result.disabledPluginJars().isEmpty())**: Zeile 82: prüft `(!result.disabledPluginJars().isEmpty())`.
> - **if Z.87 ('manual-required'.equals(HostFirstSetup.readStat…**: Zeile 87: prüft `('manual-required'.equals(HostFirstSetup.readStat…`.
> - **HostFirstSetup.readState**: Die [[Glossar#Ersteinrichtung|Ersteinrichtung]] liest den Zustand. Liest `readState`. Ruft `readState`.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 74 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `FabricLauncherPlugin.onLoad.Z73`.
