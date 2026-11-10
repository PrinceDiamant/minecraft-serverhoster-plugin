[[00 Start]] › [[Plugin-Kern]] › [[Befehle]] › [[FabricLauncherPlugin.onCommand]] › [[FabricLauncherPlugin.onCommand.Z2401.Case2403]]

# FabricLauncherPlugin.onCommand.Z2401.Case2403

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.focusSlot"]:::internal-link
  n2["FabricLauncherPlugin.focusSlot"]:::internal-link
  n3["Schritt Z.2403 exec.submit(() -) ( stopBlocking(cur); msg(s, 'Ch…"]
  n4["FabricLauncherPlugin.stopBlocking"]:::internal-link
  n5["FabricLauncherPlugin.msg"]:::internal-link
  n1 --> n2
  n4 --> n5
  n3 --> n4
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.focusSlot
  Liefert oder setzt den Fokus `focusSlot`. Ruft `slot`.
Schritt Z.2403 exec.submit(() -) ( stopBlocking(cur); msg(s, 'Ch…
  Zeile 2403: legt die Arbeit auf den Pool ServerhosterPlugin. `exec.submit(() -) ( stopBlocking(cur); msg(s, 'Ch…`
FabricLauncherPlugin.stopBlocking
  Stoppt `stopBlocking`. Ruft `invalidateRestarts`, `running`, `stopProcess`.
FabricLauncherPlugin.msg
  Sendet eine Chat-Zeile `msg`.
```

- Fortsetzung von `FabricLauncherPlugin.onCommand.Z2401`, Quellreihenfolge.
