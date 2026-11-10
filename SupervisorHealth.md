[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[SupervisorHealth]]

# SupervisorHealth

```mermaid
flowchart TD
  n1["SupervisorHealth.SupervisorHealth"]:::internal-link
  n2["SupervisorHealth.dashboardState"]:::internal-link
  n3["SupervisorHealth.assess"]:::internal-link
  n1 -->|"Kapitel im Text"| n2
  n2 -->|"Kapitel im Text"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
SupervisorHealth.SupervisorHealth
  Dieser Teil kümmert sich um den Zustand. Im [[Glossar#Quelltext|Quelltext]] heißt das `SupervisorHealth`.
SupervisorHealth.dashboardState
  Dieser Teil kümmert sich um den Zustand. Im [[Glossar#Quelltext|Quelltext]] heißt das `dashboardState`.
SupervisorHealth.assess
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `assess`.
```

> [!knoten]- Was die Blöcke tun
> - **SupervisorHealth.SupervisorHealth**: Dieser Teil kümmert sich um den Zustand. Im [[Glossar#Quelltext|Quelltext]] heißt das `SupervisorHealth`.
> - **SupervisorHealth.dashboardState**: Dieser Teil kümmert sich um den Zustand. Im [[Glossar#Quelltext|Quelltext]] heißt das `dashboardState`.
> - **SupervisorHealth.assess**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `assess`.

- Die vier Zustände aus, startet, läuft und stoppt, und die [[Glossar#Aufsicht|Aufsicht]] darüber.
