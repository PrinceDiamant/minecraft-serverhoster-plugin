[[00 Start]] › [[Tests]] › [[LifecycleRobustnessTest]] › [[LifecycleRobustnessTest.Teil2]] › [[LifecycleRobustnessTest.supervisorDoesNotRestartDuringLaunchStopOrQueuedRestart]] › [[LifecycleRobustnessTest.supervisorDoesNotRestartDuringLaunchStopOrQueuedRestart.Teil2]]

# LifecycleRobustnessTest.supervisorDoesNotRestartDuringLaunchStopOrQueuedRestart.Teil2

```mermaid
flowchart TD
  n1["SupervisorHealth.assess"]:::internal-link
  n2["LifecycleRobustnessTest.state"]:::internal-link
  n3["SupervisorHealth.assess"]:::internal-link
  n4["LifecycleRobustnessTest.state"]:::internal-link
  n1 -->|"Z.186"| n2
  n3 -->|"Z.188"| n4
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
SupervisorHealth.assess
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Bewertet `assess`.
LifecycleRobustnessTest.state
  Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server. Liefert den Zustand `state`. Nur Test.
```

> [!knoten]- Was die Blöcke tun
> - **SupervisorHealth.assess**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Bewertet `assess`.
> - **LifecycleRobustnessTest.state**: Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server. Liefert den Zustand `state`. Nur Test.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `LifecycleRobustnessTest.supervisorDoesNotRestartDuringLaunchStopOrQueuedRestart`.
