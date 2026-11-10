[[00 Start]] › [[Child-Prozess]] › [[Stopp]]

# Stopp

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.stopBlocking"]:::internal-link
  n2["FabricLauncherPlugin.stopProcess"]:::internal-link
  n3["FabricLauncherPlugin.invalidateRestarts"]:::internal-link
  n1 -->|"Zeile 1981"| n3
  n1 -->|"Zeile 1987"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.stopBlocking
  Setzt den Zustand auf „stoppt“ und wartet, bis der [[Glossar#Spielserver|Spielserver]] wirklich aus ist.
FabricLauncherPlugin.stopProcess
  Fährt den [[Glossar#Spielserver|Spielserver]] herunter: erst die Bitte, dann Warten, dann ein hartes Beenden.
FabricLauncherPlugin.invalidateRestarts
  Vergisst geplante [[Glossar#Neustart|Neustarts]], damit ein absichtlicher [[Glossar#Stopp|Stopp]] nicht gleich wieder startet.
```

> [!knoten] Was die Blöcke tun
> - **FabricLauncherPlugin.stopBlocking**: Setzt den Zustand auf „stoppt“ und wartet, bis der [[Glossar#Spielserver|Spielserver]] wirklich aus ist.
> - **FabricLauncherPlugin.stopProcess**: Fährt den [[Glossar#Spielserver|Spielserver]] herunter: erst die Bitte, dann Warten, dann ein hartes Beenden.
> - **FabricLauncherPlugin.invalidateRestarts**: Vergisst geplante [[Glossar#Neustart|Neustarts]], damit ein absichtlicher [[Glossar#Stopp|Stopp]] nicht gleich wieder startet.

- Der [[Glossar#Spielserver|Spielserver]] wird heruntergefahren. Erst mit der Bitte aufzuhören, dann mit Warten, und nach einer Frist hart. Ein absichtlicher [[Glossar#Stopp|Stopp]] soll nicht gleich wieder starten.
