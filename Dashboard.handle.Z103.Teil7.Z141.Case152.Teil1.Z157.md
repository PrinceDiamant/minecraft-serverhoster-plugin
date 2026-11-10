[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil7.Z141.Case152.Teil1.Z157]]

# Dashboard.handle.Z103.Teil7.Z141.Case152.Teil1.Z157

```mermaid
flowchart TD
  n1["switch Z.157 (a)"]
  n2["case Z.158 'start'"]
  n3["FabricLauncherPlugin.requestStart(String)"]:::internal-link
  n4["case Z.159 'stop'"]
  n5["FabricLauncherPlugin.requestStop(String)"]:::internal-link
  n6["case Z.160 'restart'"]
  n7["FabricLauncherPlugin.requestRestart(String)"]:::internal-link
  n8["case Z.161 default"]
  n9["Dashboard.handle.Z103.Teil7.Z141.Case152.Teil1.Z157.Case161"]:::internal-link
  n1 --> n2
  n2 --> n3
  n1 --> n4
  n4 --> n5
  n1 --> n6
  n6 --> n7
  n1 --> n8
  n8 --> n9
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
switch Z.157 (a)
  Zeile 157: Verzweigung nach `(a)`.
case Z.158 'start'
  Zeile 158: Zweig `'start'`.
FabricLauncherPlugin.requestStart(String)
  Bittet darum, den [[Glossar#Spielserver|Spielserver]] zu starten. Fordert an `requestStart`. Ruft `startAsync`.
case Z.159 'stop'
  Zeile 159: Zweig `'stop'`.
FabricLauncherPlugin.requestStop(String)
  Bittet darum, den [[Glossar#Spielserver|Spielserver]] zu stoppen. Fordert an `requestStop`. Ruft `slot`, `stopBlocking`.
case Z.160 'restart'
  Zeile 160: Zweig `'restart'`.
FabricLauncherPlugin.requestRestart(String)
  Bittet darum, den [[Glossar#Spielserver|Spielserver]] neu zu starten. Fordert an `requestRestart`. Ruft `slot`, `stopBlocking`, `reloadProfiles`.
case Z.161 default
  Zeile 161: Zweig `default`.
Dashboard.handle.Z103.Teil7.Z141.Case152.Teil1.Z157.Case161
  Das Innere eines Wegs, ab [[Glossar#Zeile|Zeile]] 161. Rumpf dieses switch-Zweigs ab Zeile 161.
```

> [!knoten]- Was die Blöcke tun
> - **switch Z.157 (a)**: Zeile 157: Verzweigung nach `(a)`.
> - **case Z.158 'start'**: Zeile 158: Zweig `'start'`.
> - **FabricLauncherPlugin.requestStart(String)**: Bittet darum, den [[Glossar#Spielserver|Spielserver]] zu starten. Fordert an `requestStart`. Ruft `startAsync`.
> - **case Z.159 'stop'**: Zeile 159: Zweig `'stop'`.
> - **FabricLauncherPlugin.requestStop(String)**: Bittet darum, den [[Glossar#Spielserver|Spielserver]] zu stoppen. Fordert an `requestStop`. Ruft `slot`, `stopBlocking`.
> - **case Z.160 'restart'**: Zeile 160: Zweig `'restart'`.
> - **FabricLauncherPlugin.requestRestart(String)**: Bittet darum, den [[Glossar#Spielserver|Spielserver]] neu zu starten. Fordert an `requestRestart`. Ruft `slot`, `stopBlocking`, `reloadProfiles`.
> - **case Z.161 default**: Zeile 161: Zweig `default`.
> - **Dashboard.handle.Z103.Teil7.Z141.Case152.Teil1.Z157.Case161**: Das Innere eines Wegs, ab [[Glossar#Zeile|Zeile]] 161. Rumpf dieses switch-Zweigs ab Zeile 161.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 157 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `Dashboard.handle.Z103.Teil7.Z141.Case152.Teil1`.
