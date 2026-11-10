[[00 Start]] › [[Plugin-Kern]] › [[Properties]] › [[FabricLauncherPlugin.prepareFiles]] › [[FabricLauncherPlugin.prepareFiles.Z2531.Case2532.Z2534]]

# FabricLauncherPlugin.prepareFiles.Z2531.Case2532.Z2534

```mermaid
flowchart TD
  n1["if Z.2534 (!Files.exists(jar))"]
  n2["if Z.2537 ('latest'.equalsIgnoreCase(loader))"]
  n3["FabricLauncherPlugin.firstStable"]:::internal-link
  n4["Upstream.getJson"]:::internal-link
  n5["if Z.2538 ('latest'.equalsIgnoreCase(inst))"]
  n6["FabricLauncherPlugin.firstStable"]:::internal-link
  n7["Upstream.getJson"]:::internal-link
  n8["Upstream.download(String,Path)"]:::internal-link
  n3 -->|"Z.2537"| n4
  n2 -->|"ja"| n3
  n6 -->|"Z.2538"| n7
  n5 -->|"ja"| n6
  n4 --> n5
  n2 --> n5
  n7 --> n8
  n5 --> n8
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.2534 (!Files.exists(jar))
  Zeile 2534: prüft `(!Files.exists(jar))`.
if Z.2537 ('latest'.equalsIgnoreCase(loader))
  Zeile 2537: prüft `('latest'.equalsIgnoreCase(loader))`.
FabricLauncherPlugin.firstStable
  Sucht die neueste [[Glossar#Version|Version]], die als stabil gilt. `firstStable` in `FabricLauncherPlugin.java`.
Upstream.getJson
  Dieser Teil liefert die Antwort. Liefert `getJson`.
if Z.2538 ('latest'.equalsIgnoreCase(inst))
  Zeile 2538: prüft `('latest'.equalsIgnoreCase(inst))`.
Upstream.download(String,Path)
  Dieser Teil holt das. Liefert zum Herunterladen `download`. Ruft `download`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.2534 (!Files.exists(jar))**: Zeile 2534: prüft `(!Files.exists(jar))`.
> - **if Z.2537 ('latest'.equalsIgnoreCase(loader))**: Zeile 2537: prüft `('latest'.equalsIgnoreCase(loader))`.
> - **FabricLauncherPlugin.firstStable**: Sucht die neueste [[Glossar#Version|Version]], die als stabil gilt. `firstStable` in `FabricLauncherPlugin.java`.
> - **Upstream.getJson**: Dieser Teil liefert die Antwort. Liefert `getJson`.
> - **if Z.2538 ('latest'.equalsIgnoreCase(inst))**: Zeile 2538: prüft `('latest'.equalsIgnoreCase(inst))`.
> - **Upstream.download(String,Path)**: Dieser Teil holt das. Liefert zum Herunterladen `download`. Ruft `download`.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 2534 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `FabricLauncherPlugin.prepareFiles.Z2531.Case2532`.
