[[00 Start]] › [[Plugin-Kern]] › [[Diagnose]] › [[FabricLauncherPlugin.jcmd(String,String)]]

# FabricLauncherPlugin.jcmd(String,String)

`FabricLauncherPlugin.jcmd(String id, String command)` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:1267–1267](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L1267-L1267)

```mermaid
flowchart TD
  n1["ProcessProbe.jcmd(long,String)"]:::internal-link
  n2["FabricLauncherPlugin.slot"]:::internal-link
  n3["ChildSlot.pid"]:::internal-link
  n4["return Z.1267 return ProcessProbe.jcmd(slot(id).pid()…"]
  n1 -->|"Z.1267"| n2
  n2 -->|"Z.1267"| n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
ProcessProbe.jcmd(long,String)
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `jcmd(long,String)`.
FabricLauncherPlugin.slot
  Das [[Glossar#Plugin|Plugin]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `slot`.
ChildSlot.pid
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `pid`.
return Z.1267 return ProcessProbe.jcmd(slot(id).pid()…
  Hier endet die [[Glossar#Funktion|Funktion]] und liefert ein Ergebnis zurück. Das steht in [[Glossar#Zeile|Zeile]] 1267.
```

> [!knoten]- Was die Blöcke tun
> - **ProcessProbe.jcmd(long,String)**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `jcmd(long,String)`.
> - **FabricLauncherPlugin.slot**: Das [[Glossar#Plugin|Plugin]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `slot`.
> - **ChildSlot.pid**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `pid`.
> - **return Z.1267 return ProcessProbe.jcmd(slot(id).pid()…**: Hier endet die [[Glossar#Funktion|Funktion]] und liefert ein Ergebnis zurück. Das steht in [[Glossar#Zeile|Zeile]] 1267.

- Fragt ein Hilfswerkzeug von Java, wie es dem laufenden Programm geht.
