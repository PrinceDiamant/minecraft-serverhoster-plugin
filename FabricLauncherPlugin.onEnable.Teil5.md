[[00 Start]] › [[Plugin-Kern]] › [[Lebenszyklus]] › [[FabricLauncherPlugin.onEnable]] › [[FabricLauncherPlugin.onEnable.Teil5]]

# FabricLauncherPlugin.onEnable.Teil5

```mermaid
flowchart TD
  n1["Schritt Z.154 memorySched.scheduleAtFixedRate(() -) ( try ( sam…"]
  n2["try Z.155"]
  n3["FabricLauncherPlugin.sampleHostMemory"]:::internal-link
  n4["catch Z.156 (Throwable t)"]
  n5["Schritt Z.158 healthSched.scheduleAtFixedRate(() -) ( try ( rec…"]
  n6["try Z.159"]
  n7["FabricLauncherPlugin.recoverChildSupervision"]:::internal-link
  n8["catch Z.160 (Throwable t)"]
  n9["FabricLauncherPlugin.onEnable.Teil5.Z162"]:::internal-link
  n2 --> n3
  n2 -->|"Fehler"| n4
  n1 --> n2
  n6 --> n7
  n6 -->|"Fehler"| n8
  n5 --> n6
  n3 --> n5
  n4 --> n5
  n7 --> n9
  n8 --> n9
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n3 fill:#f88,stroke:#900
```

```knoten
Schritt Z.154 memorySched.scheduleAtFixedRate(() -) ( try ( sam…
  Zeile 154: startet einen festen Timer. `memorySched.scheduleAtFixedRate(() -) ( try ( sam…`
try Z.155
  Zeile 155: Versuch. Der Fehlerpfad geht in catch.
FabricLauncherPlugin.sampleHostMemory
  Misst einmal den [[Glossar#Arbeitsspeicher|Arbeitsspeicher]] des [[Glossar#Host|Host]] und entscheidet, ob der [[Glossar#Spielserver|Spielserver]] wegen Mangels aus muss. Ein Sample auf `ServerhosterPlugin-Memory`. [[Glossar#Befund|Befund]]: [[Glossar#Altlast|Altlast]], sicher. Z.1030–1031 liest memoryProtection.autoShutdown als Fallback
catch Z.156 (Throwable t)
  Zeile 156: fängt (Throwable t).
Schritt Z.158 healthSched.scheduleAtFixedRate(() -) ( try ( rec…
  Zeile 158: startet einen festen Timer. `healthSched.scheduleAtFixedRate(() -) ( try ( rec…`
try Z.159
  Zeile 159: Versuch. Der Fehlerpfad geht in catch.
FabricLauncherPlugin.recoverChildSupervision
  Ein [[Glossar#Wecker|Wecker]] alle fünf Sekunden. Er hebt Zustände auf, die hängen geblieben sind, zum Beispiel „startet“, obwohl nichts mehr läuft. Hebt hängende Zustände auf `recoverChildSupervision`. Ruft `assess`, `armWatch`, `armPipe`.
catch Z.160 (Throwable t)
  Zeile 160: fängt (Throwable t).
FabricLauncherPlugin.onEnable.Teil5.Z162
  Der Ablauf geht in [[Glossar#Zeile|Zeile]] 162 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 162.
```

> [!knoten]- Was die Blöcke tun
> - **Schritt Z.154 memorySched.scheduleAtFixedRate(() -) ( try ( sam…**: Zeile 154: startet einen festen Timer. `memorySched.scheduleAtFixedRate(() -) ( try ( sam…`
> - **try Z.155**: Zeile 155: Versuch. Der Fehlerpfad geht in catch.
> - **FabricLauncherPlugin.sampleHostMemory**: Misst einmal den [[Glossar#Arbeitsspeicher|Arbeitsspeicher]] des [[Glossar#Host|Host]] und entscheidet, ob der [[Glossar#Spielserver|Spielserver]] wegen Mangels aus muss. Ein Sample auf `ServerhosterPlugin-Memory`. [[Glossar#Befund|Befund]]: [[Glossar#Altlast|Altlast]], sicher. Z.1030–1031 liest memoryProtection.autoShutdown als Fallback
> - **catch Z.156 (Throwable t)**: Zeile 156: fängt (Throwable t).
> - **Schritt Z.158 healthSched.scheduleAtFixedRate(() -) ( try ( rec…**: Zeile 158: startet einen festen Timer. `healthSched.scheduleAtFixedRate(() -) ( try ( rec…`
> - **try Z.159**: Zeile 159: Versuch. Der Fehlerpfad geht in catch.
> - **FabricLauncherPlugin.recoverChildSupervision**: Ein [[Glossar#Wecker|Wecker]] alle fünf Sekunden. Er hebt Zustände auf, die hängen geblieben sind, zum Beispiel „startet“, obwohl nichts mehr läuft. Hebt hängende Zustände auf `recoverChildSupervision`. Ruft `assess`, `armWatch`, `armPipe`.
> - **catch Z.160 (Throwable t)**: Zeile 160: fängt (Throwable t).
> - **FabricLauncherPlugin.onEnable.Teil5.Z162**: Der Ablauf geht in [[Glossar#Zeile|Zeile]] 162 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 162.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `FabricLauncherPlugin.onEnable`.
