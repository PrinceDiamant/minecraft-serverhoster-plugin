[[00 Start]] › [[Plugin-Kern]] › [[Bind-Adresse]]

# Bind-Adresse

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.hostBindAddress"]:::internal-link
  n2["FabricLauncherPlugin.effectiveBindAddress"]:::internal-link
  n3["FabricLauncherPlugin.childBindAddress"]:::internal-link
  n3 -->|"Zeile 286"| n2
  n3 -->|"Zeile 286"| n1
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.hostBindAddress
  Die Adresse, unter der der [[Glossar#Host|Host]] selbst erreichbar sein soll.
FabricLauncherPlugin.effectiveBindAddress
  Die Adresse, die nach allen Ersatzregeln wirklich gilt.
FabricLauncherPlugin.childBindAddress
  Die Adresse, unter der der [[Glossar#Spielserver|Spielserver]] erreichbar sein soll.
```

> [!knoten] Was die Blöcke tun
> - **FabricLauncherPlugin.hostBindAddress**: Die Adresse, unter der der [[Glossar#Host|Host]] selbst erreichbar sein soll.
> - **FabricLauncherPlugin.effectiveBindAddress**: Die Adresse, die nach allen Ersatzregeln wirklich gilt.
> - **FabricLauncherPlugin.childBindAddress**: Die Adresse, unter der der [[Glossar#Spielserver|Spielserver]] erreichbar sein soll.

- Unter welcher Adresse und Türnummer der [[Glossar#Host|Host]], die [[Glossar#Bedienseite|Bedienseite]] und der [[Glossar#Spielserver|Spielserver]] erreichbar sind.
