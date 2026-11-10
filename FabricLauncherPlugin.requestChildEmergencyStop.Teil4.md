[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Stopp]] › [[FabricLauncherPlugin.requestChildEmergencyStop]] › [[FabricLauncherPlugin.requestChildEmergencyStop.Teil4]]

# FabricLauncherPlugin.requestChildEmergencyStop.Teil4

```mermaid
flowchart TD
  n1["for Z.1196 (ChildSlot slot : List.copyOf(slots.val…"]
  n2["FabricLauncherPlugin.stopBlocking"]:::internal-link
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
for Z.1196 (ChildSlot slot : List.copyOf(slots.val…
  Zeile 1196: Schleife `(ChildSlot slot : List.copyOf(slots.val…`.
FabricLauncherPlugin.stopBlocking
  Setzt den Zustand auf „stoppt“ und wartet, bis der [[Glossar#Spielserver|Spielserver]] wirklich aus ist. Stoppt `stopBlocking`. Ruft `invalidateRestarts`, `running`, `stopProcess`.
```

> [!knoten]- Was die Blöcke tun
> - **for Z.1196 (ChildSlot slot : List.copyOf(slots.val…**: Zeile 1196: Schleife `(ChildSlot slot : List.copyOf(slots.val…`.
> - **FabricLauncherPlugin.stopBlocking**: Setzt den Zustand auf „stoppt“ und wartet, bis der [[Glossar#Spielserver|Spielserver]] wirklich aus ist. Stoppt `stopBlocking`. Ruft `invalidateRestarts`, `running`, `stopProcess`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `FabricLauncherPlugin.requestChildEmergencyStop`.
