[[00 Start]] › [[Plugin-Kern]] › [[Befehle]] › [[FabricLauncherPlugin.onCommand]] › [[FabricLauncherPlugin.onCommand.Z2401.Case2417.Z2418.Z2421.Z2424.Z2427]]

# FabricLauncherPlugin.onCommand.Z2401.Case2417.Z2418.Z2421.Z2424.Z2427

```mermaid
flowchart TD
  n1["Schritt Z.2427 exec.submit(() -) ( try ( msg(s, runBackup(focus)…"]
  n2["try Z.2427"]
  n3["FabricLauncherPlugin.msg"]:::internal-link
  n4["FabricLauncherPlugin.runBackup"]:::internal-link
  n5["catch Z.2427 (Exception e)"]
  n6["FabricLauncherPlugin.msg"]:::internal-link
  n3 -->|"Z.2427"| n4
  n2 --> n3
  n2 -->|"Fehler"| n5
  n5 --> n6
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Schritt Z.2427 exec.submit(() -) ( try ( msg(s, runBackup(focus)…
  Zeile 2427: legt die Arbeit auf den Pool ServerhosterPlugin. `exec.submit(() -) ( try ( msg(s, runBackup(focus)…`
try Z.2427
  Zeile 2427: Versuch. Der Fehlerpfad geht in catch.
FabricLauncherPlugin.msg
  Schickt eine [[Glossar#Zeile|Zeile]] an den Menschen, der einen [[Glossar#Befehl|Befehl]] getippt hat. Sendet eine Chat-Zeile `msg`.
FabricLauncherPlugin.runBackup
  Das [[Glossar#Plugin|Plugin]] führt aus die [[Glossar#Sicherungskopie|Sicherungskopie]]. Führt aus `runBackup`. Ruft `slot`, `running`, `send`.
catch Z.2427 (Exception e)
  Zeile 2427: fängt (Exception e).
```

> [!knoten]- Was die Blöcke tun
> - **Schritt Z.2427 exec.submit(() -) ( try ( msg(s, runBackup(focus)…**: Zeile 2427: legt die Arbeit auf den Pool ServerhosterPlugin. `exec.submit(() -) ( try ( msg(s, runBackup(focus)…`
> - **try Z.2427**: Zeile 2427: Versuch. Der Fehlerpfad geht in catch.
> - **FabricLauncherPlugin.msg**: Schickt eine [[Glossar#Zeile|Zeile]] an den Menschen, der einen [[Glossar#Befehl|Befehl]] getippt hat. Sendet eine Chat-Zeile `msg`.
> - **FabricLauncherPlugin.runBackup**: Das [[Glossar#Plugin|Plugin]] führt aus die [[Glossar#Sicherungskopie|Sicherungskopie]]. Führt aus `runBackup`. Ruft `slot`, `running`, `send`.
> - **catch Z.2427 (Exception e)**: Zeile 2427: fängt (Exception e).

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 2427 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `FabricLauncherPlugin.onCommand.Z2401.Case2417.Z2418.Z2421.Z2424`.
