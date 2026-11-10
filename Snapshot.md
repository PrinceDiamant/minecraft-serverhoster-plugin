[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Messung]] › [[HostMemoryProbe]] › [[Snapshot]]

# Snapshot

```mermaid
flowchart TD
  n1["HostMemoryProbe.Snapshot.view"]:::internal-link
  n2["HostMemoryProbe.Snapshot.cgroupUsePercent"]:::internal-link
  n1 -->|"Kapitel im Text"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
HostMemoryProbe.Snapshot.view
  Die Messung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Liefert die Sicht `view`.
HostMemoryProbe.Snapshot.cgroupUsePercent
  Die Messung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `cgroupUsePercent` in `HostMemoryProbe.java`.
```

> [!knoten]- Was die Blöcke tun
> - **HostMemoryProbe.Snapshot.view**: Die Messung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Liefert die Sicht `view`.
> - **HostMemoryProbe.Snapshot.cgroupUsePercent**: Die Messung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `cgroupUsePercent` in `HostMemoryProbe.java`.

- Eine einzelne Messung: freier Speicher und Wechselbereich in diesem Moment.
