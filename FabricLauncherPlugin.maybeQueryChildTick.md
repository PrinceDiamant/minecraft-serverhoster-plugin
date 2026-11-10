[[00 Start]] › [[Child-Prozess]] › [[Pipe-Watch]] › [[FabricLauncherPlugin.maybeQueryChildTick]]

# FabricLauncherPlugin.maybeQueryChildTick

`FabricLauncherPlugin.maybeQueryChildTick(String id)` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:1819–1825](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L1819-L1825)

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.slot"]:::internal-link
  n2["if Z.1822 (!slot.running() // now - slot.queryAt ( 10_000 /…"]
  n3["ChildSlot.running"]:::internal-link
  n4["return Z.1822 return;"]
  n5["FabricLauncherPlugin.send"]:::internal-link
  n2 -->|"Z.1822"| n3
  n3 -->|"ja"| n4
  n1 --> n2
  n4 --> n5
  n3 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.slot
  Das [[Glossar#Plugin|Plugin]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `slot`.
if Z.1822 (!slot.running() // now - slot.queryAt ( 10_000 /…
  Hier fällt eine Entscheidung. Nur wenn sie zutrifft, geht es den Ja-Weg weiter. Das steht in [[Glossar#Zeile|Zeile]] 1822.
ChildSlot.running
  Dieser Teil prüft, ob läuft, das. Im [[Glossar#Quelltext|Quelltext]] heißt das `running`.
return Z.1822 return;
  Hier endet die [[Glossar#Funktion|Funktion]] und liefert ein Ergebnis zurück. Das steht in [[Glossar#Zeile|Zeile]] 1822.
FabricLauncherPlugin.send
  Schickt Text an den laufenden [[Glossar#Spielserver|Spielserver]]. Im [[Glossar#Quelltext|Quelltext]] heißt das `send`.
```

> [!knoten]- Was die Blöcke tun
> - **FabricLauncherPlugin.slot**: Das [[Glossar#Plugin|Plugin]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `slot`.
> - **if Z.1822 (!slot.running() // now - slot.queryAt ( 10_000 /…**: Hier fällt eine Entscheidung. Nur wenn sie zutrifft, geht es den Ja-Weg weiter. Das steht in [[Glossar#Zeile|Zeile]] 1822.
> - **ChildSlot.running**: Dieser Teil prüft, ob läuft, das. Im [[Glossar#Quelltext|Quelltext]] heißt das `running`.
> - **return Z.1822 return;**: Hier endet die [[Glossar#Funktion|Funktion]] und liefert ein Ergebnis zurück. Das steht in [[Glossar#Zeile|Zeile]] 1822.
> - **FabricLauncherPlugin.send**: Schickt Text an den laufenden [[Glossar#Spielserver|Spielserver]]. Im [[Glossar#Quelltext|Quelltext]] heißt das `send`.

```mermaid
sequenceDiagram
  participant HTTP as Dashboard-Thread
  participant Child as Child-Konsole
  HTTP->>HTTP: skip unter 10000 ms seit Query oder 30000 ms seit Start, Z.1822
  HTTP->>Child: tick query
```

- Fragt nur ab und zu nach dem letzten [[Glossar#Spielschritt|Spielschritt]], frühestens eine halbe Minute nach dem Start und danach höchstens alle zehn Sekunden.
