[[00 Start]] › [[Plugin-Kern]] › [[Befehle]] › [[FabricLauncherPlugin.onCommand]] › [[FabricLauncherPlugin.onCommand.Z2401.Case2433.Z2435.Case2436.Z2436]]

# FabricLauncherPlugin.onCommand.Z2401.Case2433.Z2435.Case2436.Z2436

```mermaid
flowchart TD
  n1["Schritt Z.2436 exec.submit(() -) ( try ( msg(s, hostMinimizeView…"]
  n2["try Z.2436"]
  n3["FabricLauncherPlugin.msg"]:::internal-link
  n4["FabricLauncherPlugin.hostMinimizeView"]:::internal-link
  n5["catch Z.2436 (Exception e)"]
  n6["FabricLauncherPlugin.msg"]:::internal-link
  n3 -->|"Z.2436"| n4
  n2 --> n3
  n2 -->|"Fehler"| n5
  n5 --> n6
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Schritt Z.2436 exec.submit(() -) ( try ( msg(s, hostMinimizeView…
  Zeile 2436: legt die Arbeit auf den Pool ServerhosterPlugin. `exec.submit(() -) ( try ( msg(s, hostMinimizeView…`
try Z.2436
  Zeile 2436: Versuch. Der Fehlerpfad geht in catch.
FabricLauncherPlugin.msg
  Schickt eine [[Glossar#Zeile|Zeile]] an den Menschen, der einen [[Glossar#Befehl|Befehl]] getippt hat. Sendet eine Chat-Zeile `msg`.
FabricLauncherPlugin.hostMinimizeView
  Das [[Glossar#Plugin|Plugin]] kümmert sich um das Verkleinern die Ansicht. Betrifft den [[Glossar#Host|Host]] `hostMinimizeView`. Ruft `readHostMinimizeState`, `configuredHostWorld`, `preview`.
catch Z.2436 (Exception e)
  Zeile 2436: fängt (Exception e).
```

> [!knoten]- Was die Blöcke tun
> - **Schritt Z.2436 exec.submit(() -) ( try ( msg(s, hostMinimizeView…**: Zeile 2436: legt die Arbeit auf den Pool ServerhosterPlugin. `exec.submit(() -) ( try ( msg(s, hostMinimizeView…`
> - **try Z.2436**: Zeile 2436: Versuch. Der Fehlerpfad geht in catch.
> - **FabricLauncherPlugin.msg**: Schickt eine [[Glossar#Zeile|Zeile]] an den Menschen, der einen [[Glossar#Befehl|Befehl]] getippt hat. Sendet eine Chat-Zeile `msg`.
> - **FabricLauncherPlugin.hostMinimizeView**: Das [[Glossar#Plugin|Plugin]] kümmert sich um das Verkleinern die Ansicht. Betrifft den [[Glossar#Host|Host]] `hostMinimizeView`. Ruft `readHostMinimizeState`, `configuredHostWorld`, `preview`.
> - **catch Z.2436 (Exception e)**: Zeile 2436: fängt (Exception e).

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 2436 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `FabricLauncherPlugin.onCommand.Z2401.Case2433.Z2435.Case2436`.
