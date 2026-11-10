[[00 Start]] › [[Plugin-Kern]] › [[Befehle]] › [[FabricLauncherPlugin.onCommand]] › [[FabricLauncherPlugin.onCommand.Z2401.Case2433.Z2435.Case2441.Z2443]]

# FabricLauncherPlugin.onCommand.Z2401.Case2433.Z2435.Case2441.Z2443

```mermaid
flowchart TD
  n1["Schritt Z.2443 exec.submit(() -) ( try ( msg(s, String.valueOf(h…"]
  n2["try Z.2443"]
  n3["FabricLauncherPlugin.msg"]:::internal-link
  n4["FabricLauncherPlugin.hostMinimizeRollback"]:::internal-link
  n5["catch Z.2443 (Exception e)"]
  n6["FabricLauncherPlugin.msg"]:::internal-link
  n3 -->|"Z.2443"| n4
  n2 --> n3
  n2 -->|"Fehler"| n5
  n5 --> n6
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Schritt Z.2443 exec.submit(() -) ( try ( msg(s, String.valueOf(h…
  Zeile 2443: legt die Arbeit auf den Pool ServerhosterPlugin. `exec.submit(() -) ( try ( msg(s, String.valueOf(h…`
try Z.2443
  Zeile 2443: Versuch. Der Fehlerpfad geht in catch.
FabricLauncherPlugin.msg
  Sendet eine Chat-Zeile `msg`.
FabricLauncherPlugin.hostMinimizeRollback
  Betrifft den Host `hostMinimizeRollback`. Ruft `readHostMinimizeState`, `restore`, `getWorldRoot`.
catch Z.2443 (Exception e)
  Zeile 2443: fängt (Exception e).
```

- Fortsetzung von `FabricLauncherPlugin.onCommand.Z2401.Case2433.Z2435.Case2441`, Quellreihenfolge.
