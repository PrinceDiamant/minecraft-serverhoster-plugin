[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[Host-Minimieren.Teil2]] › [[FabricLauncherPlugin.refreshHostMinimize]] › [[FabricLauncherPlugin.refreshHostMinimize.Z2337.Teil2]]

# FabricLauncherPlugin.refreshHostMinimize.Z2337.Teil2

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.getWorldRoot"]:::internal-link
  n2["if Z.2346 (Files.isRegularFile(properties, LinkOption.NOFOL…"]
  n3["for Z.2347 (String line : Files.readAllLines(prope…"]
  n4["if Z.2348 (line.startsWith('level-name='))"]
  n5["HostFirstSetup.readState"]:::internal-link
  n6["FabricLauncherPlugin.hostFirstSetupMarker"]:::internal-link
  n3 -->|"wiederholen"| n4
  n2 -->|"ja"| n3
  n1 --> n2
  n5 -->|"Z.2351"| n6
  n4 --> n5
  n4 --> n5
  n2 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.getWorldRoot
  Das [[Glossar#Plugin|Plugin]] liefert die [[Glossar#Spielwelt|Spielwelt]] den Anfang. Liefert `getWorldRoot`.
if Z.2346 (Files.isRegularFile(properties, LinkOption.NOFOL…
  Zeile 2346: prüft `(Files.isRegularFile(properties, LinkOption.NOFOL…`.
for Z.2347 (String line : Files.readAllLines(prope…
  Zeile 2347: Schleife `(String line : Files.readAllLines(prope…`.
if Z.2348 (line.startsWith('level-name='))
  Zeile 2348: prüft `(line.startsWith('level-name='))`.
HostFirstSetup.readState
  Die [[Glossar#Ersteinrichtung|Ersteinrichtung]] liest den Zustand. Liest `readState`. Ruft `readState`.
FabricLauncherPlugin.hostFirstSetupMarker
  Liest oder schreibt die Merkdatei der [[Glossar#Ersteinrichtung|Ersteinrichtung]]. Betrifft den [[Glossar#Host|Host]] `hostFirstSetupMarker`.
```

> [!knoten]- Was die Blöcke tun
> - **FabricLauncherPlugin.getWorldRoot**: Das [[Glossar#Plugin|Plugin]] liefert die [[Glossar#Spielwelt|Spielwelt]] den Anfang. Liefert `getWorldRoot`.
> - **if Z.2346 (Files.isRegularFile(properties, LinkOption.NOFOL…**: Zeile 2346: prüft `(Files.isRegularFile(properties, LinkOption.NOFOL…`.
> - **for Z.2347 (String line : Files.readAllLines(prope…**: Zeile 2347: Schleife `(String line : Files.readAllLines(prope…`.
> - **if Z.2348 (line.startsWith('level-name='))**: Zeile 2348: prüft `(line.startsWith('level-name='))`.
> - **HostFirstSetup.readState**: Die [[Glossar#Ersteinrichtung|Ersteinrichtung]] liest den Zustand. Liest `readState`. Ruft `readState`.
> - **FabricLauncherPlugin.hostFirstSetupMarker**: Liest oder schreibt die Merkdatei der [[Glossar#Ersteinrichtung|Ersteinrichtung]]. Betrifft den [[Glossar#Host|Host]] `hostFirstSetupMarker`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `FabricLauncherPlugin.refreshHostMinimize.Z2337`.
