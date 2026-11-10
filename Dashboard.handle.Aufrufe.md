[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Aufrufe]]

# Dashboard.handle.Aufrufe

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.configMutationLock"]:::internal-link
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.configMutationLock
  Sorgt dafür, dass nicht zwei Änderungen der [[Glossar#Einstellungen|Einstellungen]] gleichzeitig schreiben. `configMutationLock` in `FabricLauncherPlugin.java`.
```

> [!knoten]- Was die Blöcke tun
> - **FabricLauncherPlugin.configMutationLock**: Sorgt dafür, dass nicht zwei Änderungen der [[Glossar#Einstellungen|Einstellungen]] gleichzeitig schreiben. `configMutationLock` in `FabricLauncherPlugin.java`.

- Aufrufe, die das Diagramm nicht in den gezeichneten Ablauf gesetzt hat.
- Fortsetzung von `Dashboard.handle`.
- ungeprüft: Ablaufparser oder nachgetragene Aufrufe, siehe [[bericht]].
