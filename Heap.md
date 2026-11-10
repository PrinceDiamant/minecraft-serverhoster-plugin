[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Messung]] › [[MemoryTelemetry]] › [[Heap]]

# Heap

```mermaid
flowchart TD
  n1["MemoryTelemetry.Heap.current"]:::internal-link
  n2["MemoryTelemetry.Heap.usedMiB"]:::internal-link
  n3["MemoryTelemetry.Heap.committedMiB"]:::internal-link
  n4["MemoryTelemetry.Heap.maxMiB"]:::internal-link
  n1 -->|"Kapitel im Text"| n2
  n2 -->|"Kapitel im Text"| n3
  n3 -->|"Kapitel im Text"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
MemoryTelemetry.Heap.current
  Die Messung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `current` in `MemoryTelemetry.java`.
MemoryTelemetry.Heap.usedMiB
  Die Messung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `usedMiB` in `MemoryTelemetry.java`. Ruft `mib`.
MemoryTelemetry.Heap.committedMiB
  Die Messung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `committedMiB` in `MemoryTelemetry.java`. Ruft `mib`.
MemoryTelemetry.Heap.maxMiB
  Die Messung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Begrenzt nach oben `maxMiB`. Ruft `mib`.
```

> [!knoten]- Was die Blöcke tun
> - **MemoryTelemetry.Heap.current**: Die Messung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `current` in `MemoryTelemetry.java`.
> - **MemoryTelemetry.Heap.usedMiB**: Die Messung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `usedMiB` in `MemoryTelemetry.java`. Ruft `mib`.
> - **MemoryTelemetry.Heap.committedMiB**: Die Messung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `committedMiB` in `MemoryTelemetry.java`. Ruft `mib`.
> - **MemoryTelemetry.Heap.maxMiB**: Die Messung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Begrenzt nach oben `maxMiB`. Ruft `mib`.

- Der Teil des [[Glossar#Arbeitsspeicher|Arbeitsspeichers]], den das Programm selbst für seine Daten benutzt.
