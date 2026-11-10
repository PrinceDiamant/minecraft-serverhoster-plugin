[[00 Start]] › [[Child-Prozess]] › [[Pipe-Watch]]

# Pipe-Watch

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.pipe"]:::internal-link
  n2["FabricLauncherPlugin.startSampler"]:::internal-link
  n3["FabricLauncherPlugin.maybeQueryChildTick"]:::internal-link
  n4["FabricLauncherPlugin.parseTick"]:::internal-link
  n5["FabricLauncherPlugin.trackPlayers"]:::internal-link
  n6["FabricLauncherPlugin.watch"]:::internal-link
  n7["FabricLauncherPlugin.recoverChildSupervision"]:::internal-link
  n1 -->|"Z.1782"| n4
  n1 -->|"Z.1785"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n2 fill:#f88,stroke:#900
```

```knoten
FabricLauncherPlugin.pipe
  Liest eine Prozessausgabe `pipe`. Ruft `parseTick`, `add`, `trackPlayers`.
FabricLauncherPlugin.startSampler
  Server-Thread, `runTaskTimer` 1 Tick / 1 Tick. Befund: Kommentar widerspricht Code (sicher).
FabricLauncherPlugin.maybeQueryChildTick
  Führt nur aus, wenn die Sperrzeit um ist `maybeQueryChildTick`. Ruft `slot`, `running`, `send`.
FabricLauncherPlugin.parseTick
  Wertet aus `parseTick`. Ruft `consume`, `pushMspt`.
FabricLauncherPlugin.trackPlayers
  Führt mit `trackPlayers`.
FabricLauncherPlugin.watch
  Liest die Ausgabe bis zum Ende `watch`. Ruft `armWatch`, `add`, `deleteIfMatch`.
FabricLauncherPlugin.recoverChildSupervision
  Hebt hängende Zustände auf `recoverChildSupervision`. Ruft `assess`, `armWatch`, `armPipe`.
```

- stdout-Thread, Tick-Sampler auf dem Server-Thread, Supervisor alle 5 s.
