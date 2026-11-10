[[00 Start]] › [[Plugin-Kern]] › [[Befehle]] › [[FabricLauncherPlugin.onTabComplete]] › [[FabricLauncherPlugin.onTabComplete.Teil2]]

# FabricLauncherPlugin.onTabComplete.Teil2

```mermaid
flowchart TD
  n1["if Z.2518 (a.length == 2 && a(0).equalsIgnoreCase('versions…"]
  n2["return Z.2518 return List.of('fabric', 'paper', 'vanilla', 'spi…"]
  n3["return Z.2519 return List.of();"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.2518 (a.length == 2 && a(0).equalsIgnoreCase('versions…
  Zeile 2518: prüft `(a.length == 2 && a(0).equalsIgnoreCase('versions…`.
return Z.2518 return List.of('fabric', 'paper', 'vanilla', 'spi…
  Zeile 2518: Rückgabe `return List.of('fabric', 'paper', 'vanilla', 'spi…`.
return Z.2519 return List.of();
  Zeile 2519: Rückgabe `return List.of();`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.2518 (a.length == 2 && a(0).equalsIgnoreCase('versions…**: Zeile 2518: prüft `(a.length == 2 && a(0).equalsIgnoreCase('versions…`.
> - **return Z.2518 return List.of('fabric', 'paper', 'vanilla', 'spi…**: Zeile 2518: Rückgabe `return List.of('fabric', 'paper', 'vanilla', 'spi…`.
> - **return Z.2519 return List.of();**: Zeile 2519: Rückgabe `return List.of();`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `FabricLauncherPlugin.onTabComplete`.
