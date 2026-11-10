[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil3]] › [[HosterTest.launchPlanDropsDeadFlagAndNamesJars]] › [[HosterTest.launchPlanDropsDeadFlagAndNamesJars.Teil1]]

# HosterTest.launchPlanDropsDeadFlagAndNamesJars.Teil1

```mermaid
flowchart TD
  n1["HosterTest.profile"]:::internal-link
  n2["LaunchPlan.argv(String,ServerProfile)"]:::internal-link
  n3["Schritt Z.447 assertFalse(Files.exists(dir.resolve('fabric-serv…"]
  n4["LaunchPlan.jarName"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
HosterTest.profile
  `profile` in `HosterTest.java`. Ruft `ServerProfile`. Nur Test.
LaunchPlan.argv(String,ServerProfile)
  `argv` in `LaunchPlan.java`. Ruft `argv`, `jarPath`.
Schritt Z.447 assertFalse(Files.exists(dir.resolve('fabric-serv…
  Zeile 447: Dateioperation. `assertFalse(Files.exists(dir.resolve('fabric-serv…`
LaunchPlan.jarName
  Betrifft das Jar `jarName`. Ruft `fileName`.
```

- Fortsetzung von `HosterTest.launchPlanDropsDeadFlagAndNamesJars`, Quellreihenfolge.
