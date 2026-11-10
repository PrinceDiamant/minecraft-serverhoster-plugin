[[00 Start]] › [[Zeitplaene]] › [[Tasks]] › [[FabricLauncherPlugin.tasks]] › [[FabricLauncherPlugin.tasks.Z1282]]

# FabricLauncherPlugin.tasks.Z1282

```mermaid
flowchart TD
  n1["for Z.1282 (Object o : raw)"]
  n2["if Z.1283 (o instanceof Map(?, ?) m)"]
  n3["if Z.1287 (o instanceof ConfigurationSection s)"]
  n2 -->|"nein"| n3
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
for Z.1282 (Object o : raw)
  Zeile 1282: Schleife `(Object o : raw)`.
if Z.1283 (o instanceof Map(?, ?) m)
  Zeile 1283: prüft `(o instanceof Map(?, ?) m)`.
if Z.1287 (o instanceof ConfigurationSection s)
  Zeile 1287: prüft `(o instanceof ConfigurationSection s)`.
```

> [!knoten]- Was die Blöcke tun
> - **for Z.1282 (Object o : raw)**: Zeile 1282: Schleife `(Object o : raw)`.
> - **if Z.1283 (o instanceof Map(?, ?) m)**: Zeile 1283: prüft `(o instanceof Map(?, ?) m)`.
> - **if Z.1287 (o instanceof ConfigurationSection s)**: Zeile 1287: prüft `(o instanceof ConfigurationSection s)`.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 1282 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `FabricLauncherPlugin.tasks`.
