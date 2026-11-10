[[00 Start]] › [[Dashboard-HTTP]] › [[API-Zeit]] › [[Dashboard.schedulesApi]] › [[Dashboard.schedulesApi.Aufrufe]]

# Dashboard.schedulesApi.Aufrufe

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.configMutationLock"]:::internal-link
  n2["FabricLauncherPlugin.configMutationLock"]:::internal-link
  n3["FabricLauncherPlugin.configMutationLock"]:::internal-link
  n4["FabricLauncherPlugin.configMutationLock"]:::internal-link
  n1 -->|"Z.391"| n2
  n2 -->|"Z.409"| n3
  n3 -->|"Z.420"| n4
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
- Fortsetzung von `Dashboard.schedulesApi`.
- ungeprüft: Ablaufparser oder nachgetragene Aufrufe, siehe [[bericht]].
