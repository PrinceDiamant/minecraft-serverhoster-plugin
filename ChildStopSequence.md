[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildStopSequence]]

# ChildStopSequence

```mermaid
flowchart TD
  n1["ChildStopSequence.ChildStopSequence"]:::internal-link
  n2["ChildStopSequence.stop"]:::internal-link
  n3["ChildStopSequence.signal"]:::internal-link
  n2 -->|"Z.58"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
ChildStopSequence.ChildStopSequence
  Betrifft den Child `ChildStopSequence`.
ChildStopSequence.stop
  Stoppt `stop`. Ruft `signal`.
ChildStopSequence.signal
  `signal` in `ChildStopSequence.java`.
```

```mermaid
stateDiagram-v2
  [*] --> CLEAN: sauber Z.51
  [*] --> UNCLEAN: Z.54
  [*] --> KILLED: Z.66
  [*] --> INTERRUPTED: Z.71
```


