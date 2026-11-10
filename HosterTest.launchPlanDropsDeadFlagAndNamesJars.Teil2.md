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
  Dieser Teil kümmert sich um den Namen. Betrifft das Jar `jarName`. Ruft `fileName`.
LaunchPlan.jarPath
  Dieser Teil kümmert sich um den Pfad. Betrifft das Jar `jarPath`. Ruft `directory`, `jarName`.
HosterTest.profile
  Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server. `profile` in `HosterTest.java`. Ruft `ServerProfile`. Nur Test.
```

> [!knoten]- Was die Blöcke tun
> - **LaunchPlan.jarName**: Dieser Teil kümmert sich um den Namen. Betrifft das Jar `jarName`. Ruft `fileName`.
> - **LaunchPlan.jarPath**: Dieser Teil kümmert sich um den Pfad. Betrifft das Jar `jarPath`. Ruft `directory`, `jarName`.
> - **HosterTest.profile**: Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server. `profile` in `HosterTest.java`. Ruft `ServerProfile`. Nur Test.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `HosterTest.launchPlanDropsDeadFlagAndNamesJars`.
