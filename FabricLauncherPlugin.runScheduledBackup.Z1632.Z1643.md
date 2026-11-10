[[00 Start]] › [[Backup]] › [[Backup-Lauf]] › [[FabricLauncherPlugin.runScheduledBackup]] › [[FabricLauncherPlugin.runScheduledBackup.Z1632.Z1643]]

# FabricLauncherPlugin.runScheduledBackup.Z1632.Z1643

```mermaid
flowchart TD
  n1["sync Z.1643"]
  n2["if Z.1646 (target.running() && !target.onlinePlayers.isEmpt…"]
  n3["ChildSlot.running"]:::internal-link
  n4["ChildSlot.running"]:::internal-link
  n5["FabricLauncherPlugin.runScheduledBackup.Z1632.Z1643.Z1649"]:::internal-link
  n2 -->|"Z.1646"| n3
  n3 --> n4
  n3 --> n4
  n4 --> n5
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
sync Z.1643
  Zeile 1643: synchronisierter Block.
if Z.1646 (target.running() && !target.onlinePlayers.isEmpt…
  Zeile 1646: prüft `(target.running() && !target.onlinePlayers.isEmpt…`.
ChildSlot.running
  Dieser Teil prüft, ob läuft, das. Sagt, ob der [[Glossar#Prozess|Prozess]] läuft `running`.
FabricLauncherPlugin.runScheduledBackup.Z1632.Z1643.Z1649
  Der Ablauf geht in [[Glossar#Zeile|Zeile]] 1649 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 1649.
```

> [!knoten]- Was die Blöcke tun
> - **sync Z.1643**: Zeile 1643: synchronisierter Block.
> - **if Z.1646 (target.running() && !target.onlinePlayers.isEmpt…**: Zeile 1646: prüft `(target.running() && !target.onlinePlayers.isEmpt…`.
> - **ChildSlot.running**: Dieser Teil prüft, ob läuft, das. Sagt, ob der [[Glossar#Prozess|Prozess]] läuft `running`.
> - **FabricLauncherPlugin.runScheduledBackup.Z1632.Z1643.Z1649**: Der Ablauf geht in [[Glossar#Zeile|Zeile]] 1649 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 1649.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 1643 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `FabricLauncherPlugin.runScheduledBackup.Z1632`.
