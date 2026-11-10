[[00 Start]] › [[Plugin-Kern]] › [[Diagnose]] › [[FabricLauncherPlugin.diagMap(String)]] › [[FabricLauncherPlugin.diagMap(String).Teil2]]

# FabricLauncherPlugin.diagMap(String).Teil2

```mermaid
flowchart TD
  n1["if Z.891 (pid ) 0)"]
  n2["ProcessProbe.snapshot"]:::internal-link
  n3["FabricLauncherPlugin.diagMap(String).Teil2.Z893"]:::internal-link
  n4["FabricLauncherPlugin.diskCached"]:::internal-link
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.891 (pid ) 0)
  Zeile 891: prüft `(pid ) 0)`.
ProcessProbe.snapshot
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `snapshot` in `ProcessProbe.java`. Ruft `kb`.
FabricLauncherPlugin.diagMap(String).Teil2.Z893
  Der Ablauf geht in [[Glossar#Zeile|Zeile]] 893 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 893.
FabricLauncherPlugin.diskCached
  Sagt, wie voll die Festplatte ist. Der Wert darf kurz zwischengespeichert sein. Liest die Platte `diskCached`. Ruft `disk`, `workDir`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.891 (pid ) 0)**: Zeile 891: prüft `(pid ) 0)`.
> - **ProcessProbe.snapshot**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `snapshot` in `ProcessProbe.java`. Ruft `kb`.
> - **FabricLauncherPlugin.diagMap(String).Teil2.Z893**: Der Ablauf geht in [[Glossar#Zeile|Zeile]] 893 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 893.
> - **FabricLauncherPlugin.diskCached**: Sagt, wie voll die Festplatte ist. Der Wert darf kurz zwischengespeichert sein. Liest die Platte `diskCached`. Ruft `disk`, `workDir`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `FabricLauncherPlugin.diagMap(String)`.
