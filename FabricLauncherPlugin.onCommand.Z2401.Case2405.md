[[00 Start]] › [[Plugin-Kern]] › [[Befehle]] › [[FabricLauncherPlugin.onCommand]] › [[FabricLauncherPlugin.onCommand.Z2401.Case2405]]

# FabricLauncherPlugin.onCommand.Z2401.Case2405

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.focusSlot"]:::internal-link
  n2["FabricLauncherPlugin.profile"]:::internal-link
  n3["ChildSlot.running"]:::internal-link
  n4["ChildSlot.pid"]:::internal-link
  n5["ChildSlot.uptimeMillis"]:::internal-link
  n6["ServerProfile.directory"]:::internal-link
  n1 --> n2
  n3 -->|"Z.2408"| n4
  n4 -->|"Z.2408"| n5
  n2 --> n3
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.focusSlot
  Liefert oder setzt den Fokus `focusSlot`. Ruft `slot`.
FabricLauncherPlugin.profile
  `profile` in `FabricLauncherPlugin.java`.
ChildSlot.running
  Sagt, ob der Prozess läuft `running`.
ChildSlot.pid
  Liefert die Prozessnummer `pid`.
ChildSlot.uptimeMillis
  Liefert die Laufzeit `uptimeMillis`. Ruft `running`.
ServerProfile.directory
  `directory` in `ServerProfile.java`.
```

- Fortsetzung von `FabricLauncherPlugin.onCommand.Z2401`, Quellreihenfolge.
