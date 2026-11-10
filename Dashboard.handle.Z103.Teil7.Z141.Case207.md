[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil7.Z141.Case207]]

# Dashboard.handle.Z103.Teil7.Z141.Case207

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.slot"]:::internal-link
  n2["if Z.209 (!slot.running())"]
  n3["ChildSlot.running"]:::internal-link
  n4["Dashboard.json"]:::internal-link
  n5["if Z.210 (!slot.serverReady // !pl.sendCommand(sid, 'list'…"]
  n6["FabricLauncherPlugin.sendCommand(String,String)"]:::internal-link
  n7["throw Z.211 throw new IllegalStateException('Die Spielerliste…"]
  n8["Dashboard.json"]:::internal-link
  n2 -->|"Z.209"| n3
  n3 -->|"ja"| n4
  n1 --> n2
  n5 -->|"Z.210"| n6
  n6 -->|"ja"| n7
  n4 --> n5
  n3 --> n5
  n7 --> n8
  n6 --> n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.slot
  Das [[Glossar#Plugin|Plugin]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `slot` in `FabricLauncherPlugin.java`. Ruft `profile`, `ChildSlot`.
if Z.209 (!slot.running())
  Zeile 209: prüft `(!slot.running())`.
ChildSlot.running
  Dieser Teil prüft, ob läuft, das. Sagt, ob der [[Glossar#Prozess|Prozess]] läuft `running`.
Dashboard.json
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.
if Z.210 (!slot.serverReady // !pl.sendCommand(sid, 'list'…
  Zeile 210: prüft `(!slot.serverReady // !pl.sendCommand(sid, 'list'…`.
FabricLauncherPlugin.sendCommand(String,String)
  Schickt einen [[Glossar#Befehl|Befehl]] in die [[Glossar#Konsole|Konsole]] des [[Glossar#Spielserver|Spielservers]]. Sendet `sendCommand`. Ruft `send`, `slot`.
throw Z.211 throw new IllegalStateException('Die Spielerliste…
  Zeile 211: Abbruch `throw new IllegalStateException('Die Spielerliste…`.
```

> [!knoten]- Was die Blöcke tun
> - **FabricLauncherPlugin.slot**: Das [[Glossar#Plugin|Plugin]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `slot` in `FabricLauncherPlugin.java`. Ruft `profile`, `ChildSlot`.
> - **if Z.209 (!slot.running())**: Zeile 209: prüft `(!slot.running())`.
> - **ChildSlot.running**: Dieser Teil prüft, ob läuft, das. Sagt, ob der [[Glossar#Prozess|Prozess]] läuft `running`.
> - **Dashboard.json**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.
> - **if Z.210 (!slot.serverReady // !pl.sendCommand(sid, 'list'…**: Zeile 210: prüft `(!slot.serverReady // !pl.sendCommand(sid, 'list'…`.
> - **FabricLauncherPlugin.sendCommand(String,String)**: Schickt einen [[Glossar#Befehl|Befehl]] in die [[Glossar#Konsole|Konsole]] des [[Glossar#Spielserver|Spielservers]]. Sendet `sendCommand`. Ruft `send`, `slot`.
> - **throw Z.211 throw new IllegalStateException('Die Spielerliste…**: Zeile 211: Abbruch `throw new IllegalStateException('Die Spielerliste…`.

- Das Innere eines Wegs, ab [[Glossar#Zeile|Zeile]] 207.
- Fortsetzung von `Dashboard.handle.Z103.Teil7.Z141`.
