[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Messung]] › [[HostMemoryProbe]]

# HostMemoryProbe

```mermaid
flowchart TD
  n1["Snapshot"]:::internal-link
  n2["Cgroup"]:::internal-link
  n3["HostMemoryProbe.HostMemoryProbe"]:::internal-link
  n4["HostMemoryProbe.snapshot()"]:::internal-link
  n5["HostMemoryProbe.snapshot(Path,Path)"]:::internal-link
  n6["HostMemoryProbe.meminfo"]:::internal-link
  n7["HostMemoryProbe.cgroup"]:::internal-link
  n8["HostMemoryProbe.resolve"]:::internal-link
  n9["HostMemoryProbe.ancestors"]:::internal-link
  n10["HostMemoryProbe.number"]:::internal-link
  n11["HostMemoryProbe.keyValues"]:::internal-link
  n4 -->|"Z.37"| n5
  n5 -->|"Z.40"| n6
  n5 -->|"Z.41"| n7
  n7 -->|"Z.69"| n8
  n7 -->|"Z.70"| n9
  n7 -->|"Z.71"| n10
  n7 -->|"Z.74"| n11
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Snapshot
  Eine einzelne Messung: freier Speicher und Wechselbereich in diesem Moment.
Cgroup
  Eine Messung aus der Gruppenbegrenzung von Linux, falls der [[Glossar#Host|Host]] so begrenzt ist. Sie sagt, wie viel die Gruppe gerade verbraucht und wie viel sie darf.
HostMemoryProbe.HostMemoryProbe
  Die Messung kümmert sich um den [[Glossar#Arbeitsspeicher|Arbeitsspeicher]] die Messung. Im [[Glossar#Quelltext|Quelltext]] heißt das `HostMemoryProbe`.
HostMemoryProbe.snapshot()
  Die Messung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `snapshot()`.
HostMemoryProbe.snapshot(Path,Path)
  Die Messung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `snapshot(Path,Path)`.
HostMemoryProbe.meminfo
  Die Messung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `meminfo`.
HostMemoryProbe.cgroup
  Die Messung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `cgroup`.
HostMemoryProbe.resolve
  Die Messung bestimmt das. Im [[Glossar#Quelltext|Quelltext]] heißt das `resolve`.
HostMemoryProbe.ancestors
  Die Messung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `ancestors`.
HostMemoryProbe.number
  Die Messung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `number`.
HostMemoryProbe.keyValues
  Die Messung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `keyValues`.
```

> [!knoten]- Was die Blöcke tun
> - **Snapshot**: Eine einzelne Messung: freier Speicher und Wechselbereich in diesem Moment.
> - **Cgroup**: Eine Messung aus der Gruppenbegrenzung von Linux, falls der [[Glossar#Host|Host]] so begrenzt ist. Sie sagt, wie viel die Gruppe gerade verbraucht und wie viel sie darf.
> - **HostMemoryProbe.HostMemoryProbe**: Die Messung kümmert sich um den [[Glossar#Arbeitsspeicher|Arbeitsspeicher]] die Messung. Im [[Glossar#Quelltext|Quelltext]] heißt das `HostMemoryProbe`.
> - **HostMemoryProbe.snapshot()**: Die Messung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `snapshot()`.
> - **HostMemoryProbe.snapshot(Path,Path)**: Die Messung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `snapshot(Path,Path)`.
> - **HostMemoryProbe.meminfo**: Die Messung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `meminfo`.
> - **HostMemoryProbe.cgroup**: Die Messung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `cgroup`.
> - **HostMemoryProbe.resolve**: Die Messung bestimmt das. Im [[Glossar#Quelltext|Quelltext]] heißt das `resolve`.
> - **HostMemoryProbe.ancestors**: Die Messung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `ancestors`.
> - **HostMemoryProbe.number**: Die Messung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `number`.
> - **HostMemoryProbe.keyValues**: Die Messung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `keyValues`.

- Liest, wie viel [[Glossar#Arbeitsspeicher|Arbeitsspeicher]] auf dem [[Glossar#Host|Host]] noch frei ist, inklusive des Wechselbereichs.
