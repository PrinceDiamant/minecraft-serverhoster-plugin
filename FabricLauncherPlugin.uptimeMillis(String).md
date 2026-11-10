[[00 Start]] › [[Plugin-Kern]] › [[Slot-Status]] › [[FabricLauncherPlugin.uptimeMillis(String)]]

# FabricLauncherPlugin.uptimeMillis(String)

`FabricLauncherPlugin.uptimeMillis(String id)` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:309–309](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L309-L309)

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.slot"]:::internal-link
  n2["ChildSlot.uptimeMillis"]:::internal-link
  n3["return Z.309 return slot(id).uptimeMillis();"]
  n1 -->|"Z.309"| n2
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.slot
  Das [[Glossar#Plugin|Plugin]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `slot`.
ChildSlot.uptimeMillis
  Dieser Teil kümmert sich um die Zeit. Im [[Glossar#Quelltext|Quelltext]] heißt das `uptimeMillis`.
return Z.309 return slot(id).uptimeMillis();
  Hier endet die [[Glossar#Funktion|Funktion]] und liefert ein Ergebnis zurück. Das steht in [[Glossar#Zeile|Zeile]] 309.
```

> [!knoten]- Was die Blöcke tun
> - **FabricLauncherPlugin.slot**: Das [[Glossar#Plugin|Plugin]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `slot`.
> - **ChildSlot.uptimeMillis**: Dieser Teil kümmert sich um die Zeit. Im [[Glossar#Quelltext|Quelltext]] heißt das `uptimeMillis`.
> - **return Z.309 return slot(id).uptimeMillis();**: Hier endet die [[Glossar#Funktion|Funktion]] und liefert ein Ergebnis zurück. Das steht in [[Glossar#Zeile|Zeile]] 309.

- Sagt, wie lange der [[Glossar#Spielserver|Spielserver]] schon läuft.
- Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
