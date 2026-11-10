[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildLaunchCleanup]]

# ChildLaunchCleanup

```mermaid
flowchart TD
  n1["ChildLaunchCleanup.ChildLaunchCleanup"]:::internal-link
  n2["ChildLaunchCleanup.abandon"]:::internal-link
  n1 -->|"Kapitel im Text"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
ChildLaunchCleanup.ChildLaunchCleanup
  Dieser Teil startet das Aufräumen. Im [[Glossar#Quelltext|Quelltext]] heißt das `ChildLaunchCleanup`.
ChildLaunchCleanup.abandon
  Dieser Teil bricht ab das. Im [[Glossar#Quelltext|Quelltext]] heißt das `abandon`.
```

> [!knoten]- Was die Blöcke tun
> - **ChildLaunchCleanup.ChildLaunchCleanup**: Dieser Teil startet das Aufräumen. Im [[Glossar#Quelltext|Quelltext]] heißt das `ChildLaunchCleanup`.
> - **ChildLaunchCleanup.abandon**: Dieser Teil bricht ab das. Im [[Glossar#Quelltext|Quelltext]] heißt das `abandon`.

- Räumt Dateien und übrig gebliebene Programme weg, wenn ein Start nicht geklappt hat.
