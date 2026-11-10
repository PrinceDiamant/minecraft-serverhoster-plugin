[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[HostHeapTune]]

# HostHeapTune

```mermaid
flowchart TD
  n1["HostHeapTune.HostHeapTune"]:::internal-link
  n2["HostHeapTune.apply"]:::internal-link
  n3["HostHeapTune.hotspot"]:::internal-link
  n1 -->|"Kapitel im Text"| n2
  n2 -->|"Kapitel im Text"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
HostHeapTune.HostHeapTune
  Dieser Teil kümmert sich um den Programmspeicher die Anpassung. Im [[Glossar#Quelltext|Quelltext]] heißt das `HostHeapTune`.
HostHeapTune.apply
  Dieser Teil wendet an das. Im [[Glossar#Quelltext|Quelltext]] heißt das `apply`.
HostHeapTune.hotspot
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `hotspot`.
```

> [!knoten]- Was die Blöcke tun
> - **HostHeapTune.HostHeapTune**: Dieser Teil kümmert sich um den Programmspeicher die Anpassung. Im [[Glossar#Quelltext|Quelltext]] heißt das `HostHeapTune`.
> - **HostHeapTune.apply**: Dieser Teil wendet an das. Im [[Glossar#Quelltext|Quelltext]] heißt das `apply`.
> - **HostHeapTune.hotspot**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `hotspot`.

- Setzt die Speicherwerte, mit denen der verkleinerte [[Glossar#Host|Host]] starten soll.
