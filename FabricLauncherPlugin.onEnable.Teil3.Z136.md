[[00 Start]] › [[Plugin-Kern]] › [[Lebenszyklus]] › [[FabricLauncherPlugin.onEnable]] › [[FabricLauncherPlugin.onEnable.Teil3.Z136]]

# FabricLauncherPlugin.onEnable.Teil3.Z136

```mermaid
flowchart TD
  n1["Schritt Z.136 shutdownHook = new Thread(() -) ( shuttingDown = …"]
  n2["for Z.138 (ChildSlot s : slots.values())"]
  n3["FabricLauncherPlugin.invalidateRestarts"]:::internal-link
  n4["for Z.143 (ChildSlot s : List.copyOf(slots.values…"]
  n5["if Z.143 (s.running() // s.phase == SupervisorHealth.Phase…"]
  n6["ChildSlot.running"]:::internal-link
  n7["FabricLauncherPlugin.stopProcess"]:::internal-link
  n2 -->|"wiederholen"| n3
  n5 -->|"Z.143"| n6
  n6 -->|"ja"| n7
  n4 -->|"wiederholen"| n5
  n3 --> n4
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Schritt Z.136 shutdownHook = new Thread(() -) ( shuttingDown = …
  Zeile 136: `shutdownHook = new Thread(() -) ( shuttingDown = …`
for Z.138 (ChildSlot s : slots.values())
  Zeile 138: Schleife `(ChildSlot s : slots.values())`.
FabricLauncherPlugin.invalidateRestarts
  Verwirft `invalidateRestarts`.
for Z.143 (ChildSlot s : List.copyOf(slots.values…
  Zeile 143: Schleife `(ChildSlot s : List.copyOf(slots.values…`.
if Z.143 (s.running() // s.phase == SupervisorHealth.Phase…
  Zeile 143: prüft `(s.running() // s.phase == SupervisorHealth.Phase…`.
ChildSlot.running
  Sagt, ob der Prozess läuft `running`.
FabricLauncherPlugin.stopProcess
  Stoppt `stopProcess`. Ruft `add`, `boundedSeconds`, `warnOnce`.
```

- Fortsetzung von `FabricLauncherPlugin.onEnable.Teil3`, Quellreihenfolge.
