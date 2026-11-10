[[00 Start]] › [[Tests]] › [[CoreAdminTest]] › [[CoreAdminTest.Teil1]] › [[CoreAdminTest.tracksMinecraftPlayerEventsAndListResponses]] › [[CoreAdminTest.tracksMinecraftPlayerEventsAndListResponses.Teil1]]

# CoreAdminTest.tracksMinecraftPlayerEventsAndListResponses.Teil1

```mermaid
flowchart TD
  n1["ChildSlot.ChildSlot"]:::internal-link
  n2["FabricLauncherPlugin.trackPlayers"]:::internal-link
  n3["FabricLauncherPlugin.trackPlayers"]:::internal-link
  n4["FabricLauncherPlugin.trackPlayers"]:::internal-link
  n5["FabricLauncherPlugin.trackPlayers"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
ChildSlot.ChildSlot
  Dieser Teil kümmert sich um den [[Glossar#Platz|Platz]]. Betrifft den Child `ChildSlot`. Ruft `ConsoleBuffer`.
FabricLauncherPlugin.trackPlayers
  Merkt sich, welche [[Glossar#Spieler|Spieler]] gerade auf dem [[Glossar#Spielserver|Spielserver]] sind. Führt mit `trackPlayers`.
```

> [!knoten]- Was die Blöcke tun
> - **ChildSlot.ChildSlot**: Dieser Teil kümmert sich um den [[Glossar#Platz|Platz]]. Betrifft den Child `ChildSlot`. Ruft `ConsoleBuffer`.
> - **FabricLauncherPlugin.trackPlayers**: Merkt sich, welche [[Glossar#Spieler|Spieler]] gerade auf dem [[Glossar#Spielserver|Spielserver]] sind. Führt mit `trackPlayers`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `CoreAdminTest.tracksMinecraftPlayerEventsAndListResponses`.
