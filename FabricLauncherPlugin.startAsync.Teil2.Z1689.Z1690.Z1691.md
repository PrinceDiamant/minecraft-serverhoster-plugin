[[00 Start]] › [[Child-Prozess]] › [[Startablauf]] › [[FabricLauncherPlugin.startAsync]] › [[FabricLauncherPlugin.startAsync.Teil2.Z1689.Z1690.Z1691]]

# FabricLauncherPlugin.startAsync.Teil2.Z1689.Z1690.Z1691

```mermaid
flowchart TD
  n1["try Z.1691"]
  n2["FabricLauncherPlugin.openChild"]:::internal-link
  n3["catch Z.1693 (Exception e)"]
  n4["FabricLauncherPlugin.slot"]:::internal-link
  n5["StartFailureStatus.text"]:::internal-link
  n6["if Z.1696 (failedSlot.phase == SupervisorHealth.Phase.PREPA…"]
  n7["FabricLauncherPlugin.msg"]:::internal-link
  n8["FabricLauncherPlugin.scheduleRestart"]:::internal-link
  n9["finally Z.1691"]
  n1 --> n2
  n1 -->|"Fehler"| n3
  n4 --> n5
  n5 --> n6
  n6 --> n7
  n6 --> n7
  n7 --> n8
  n3 --> n4
  n2 --> n9
  n8 --> n9
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.1691
  Zeile 1691: Versuch. Der Fehlerpfad geht in catch.
FabricLauncherPlugin.openChild
  Öffnet `openChild`. Ruft `slot`, `running`, `msg`.
catch Z.1693 (Exception e)
  Zeile 1693: fängt (Exception e).
FabricLauncherPlugin.slot
  `slot` in `FabricLauncherPlugin.java`. Ruft `profile`, `ChildSlot`.
StartFailureStatus.text
  Antwortet mit Text `text`.
if Z.1696 (failedSlot.phase == SupervisorHealth.Phase.PREPA…
  Zeile 1696: prüft `(failedSlot.phase == SupervisorHealth.Phase.PREPA…`.
FabricLauncherPlugin.msg
  Sendet eine Chat-Zeile `msg`.
FabricLauncherPlugin.scheduleRestart
  Plant `scheduleRestart`. Ruft `maxAttempts`, `mayRetry`, `notifyNtfy`.
finally Z.1691
  Läuft danach immer, auch nach einem Fehler.
```

- Fortsetzung von `FabricLauncherPlugin.startAsync.Teil2.Z1689.Z1690`, Quellreihenfolge.
