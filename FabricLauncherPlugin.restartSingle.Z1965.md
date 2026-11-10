[[00 Start]] › [[Child-Prozess]] › [[Neustart]] › [[FabricLauncherPlugin.restartSingle]] › [[FabricLauncherPlugin.restartSingle.Z1965]]

# FabricLauncherPlugin.restartSingle.Z1965

```mermaid
flowchart TD
  n1["sync Z.1965"]
  n2["if Z.1967 (slot.scheduleToken.get() != token // !slot.wantR…"]
  n3["ChildSlot.running"]:::internal-link
  n4["return Z.1967 return;"]
  n5["FabricLauncherPlugin.launch"]:::internal-link
  n6["FabricLauncherPlugin.profile"]:::internal-link
  n2 -->|"Z.1967"| n3
  n3 -->|"ja"| n4
  n5 -->|"Z.1968"| n6
  n4 --> n5
  n3 --> n5
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
sync Z.1965
  Zeile 1965: synchronisierter Block.
if Z.1967 (slot.scheduleToken.get() != token // !slot.wantR…
  Zeile 1967: prüft `(slot.scheduleToken.get() != token // !slot.wantR…`.
ChildSlot.running
  Sagt, ob der Prozess läuft `running`.
return Z.1967 return;
  Zeile 1967: Rückgabe `return;`.
FabricLauncherPlugin.launch
  Startet den Prozess `launch`. Ruft `running`, `directory`, `copyPlayerFiles`.
FabricLauncherPlugin.profile
  `profile` in `FabricLauncherPlugin.java`.
```

- Fortsetzung von `FabricLauncherPlugin.restartSingle`, Quellreihenfolge.
