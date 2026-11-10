[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil3]] › [[HosterTest.launchPlanDropsDeadFlagAndNamesJars]] › [[HosterTest.launchPlanDropsDeadFlagAndNamesJars.Teil2]]

# HosterTest.launchPlanDropsDeadFlagAndNamesJars.Teil2

```mermaid
flowchart TD
  n1["LaunchPlan.jarName"]:::internal-link
  n2["LaunchPlan.jarName"]:::internal-link
  n3["LaunchPlan.jarName"]:::internal-link
  n4["LaunchPlan.jarName"]:::internal-link
  n5["LaunchPlan.jarPath"]:::internal-link
  n6["HosterTest.profile"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n5 -->|"Z.453"| n6
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
LaunchPlan.jarName
  Betrifft das Jar `jarName`. Ruft `fileName`.
LaunchPlan.jarPath
  Betrifft das Jar `jarPath`. Ruft `directory`, `jarName`.
HosterTest.profile
  `profile` in `HosterTest.java`. Ruft `ServerProfile`. Nur Test.
```

- Fortsetzung von `HosterTest.launchPlanDropsDeadFlagAndNamesJars`, Quellreihenfolge.
