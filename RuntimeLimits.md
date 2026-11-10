[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Messung]] › [[RuntimeLimits]]

# RuntimeLimits

```mermaid
flowchart TD
  n1["RuntimeLimits.RuntimeLimits"]:::internal-link
  n2["RuntimeLimits.boundedSeconds"]:::internal-link
  n3["RuntimeLimits.memory"]:::internal-link
  n4["RuntimeLimits.percent"]:::internal-link
  n3 -->|"Z.32"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
RuntimeLimits.RuntimeLimits
  `RuntimeLimits` in `RuntimeLimits.java`.
RuntimeLimits.boundedSeconds
  Begrenzt `boundedSeconds`.
RuntimeLimits.memory
  Betrifft den Speicher `memory`. Ruft `percent`.
RuntimeLimits.percent
  `percent` in `RuntimeLimits.java`.
```


