[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Messung]] › [[HostMemoryProbe]] › [[Cgroup]]

# Cgroup

```mermaid
flowchart TD
  n1["HostMemoryProbe.Cgroup.unavailable"]:::internal-link
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
HostMemoryProbe.Cgroup.unavailable
  Die Messung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `unavailable` in `HostMemoryProbe.java`.
```

> [!knoten]- Was die Blöcke tun
> - **HostMemoryProbe.Cgroup.unavailable**: Die Messung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `unavailable` in `HostMemoryProbe.java`.

- Eine Messung aus der Gruppenbegrenzung von Linux, falls der [[Glossar#Host|Host]] so begrenzt ist. Sie sagt, wie viel die Gruppe gerade verbraucht und wie viel sie darf.
