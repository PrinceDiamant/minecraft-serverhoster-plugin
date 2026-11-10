[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildProcessRecord]] › [[ChildProcessRecord.Teil1]]

# ChildProcessRecord.Teil1

```mermaid
flowchart TD
  n1["ChildProcessRecord.ChildProcessRecord"]:::internal-link
  n2["ChildProcessRecord.liveInspector"]:::internal-link
  n3["ChildProcessRecord.observe"]:::internal-link
  n4["ChildProcessRecord.ours"]:::internal-link
  n5["ChildProcessRecord.write"]:::internal-link
  n6["ChildProcessRecord.read"]:::internal-link
  n7["ChildProcessRecord.deleteIfMatch"]:::internal-link
  n8["ChildProcessRecord.reap"]:::internal-link
  n7 -->|"Z.145"| n6
  n8 -->|"Z.156"| n6
  n8 -->|"Z.168"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n2 fill:#f88,stroke:#900
  style n3 fill:#f88,stroke:#900
```

```knoten
ChildProcessRecord.ChildProcessRecord
  Betrifft den Child `ChildProcessRecord`.
ChildProcessRecord.liveInspector
  `liveInspector` in `ChildProcessRecord.java`. Ruft `find`, `destroy`, `destroyForcibly`. Befund: toter Code (wahrscheinlich).
ChildProcessRecord.observe
  Liest den lebenden Prozess `observe`. Befund: toter Code (wahrscheinlich).
ChildProcessRecord.ours
  Prüft, ob es der eigene Prozess ist `ours`. Ruft `samePath`, `looksLikeJava`, `fileName`.
ChildProcessRecord.write
  Schreibt `write`. Ruft `safe`.
ChildProcessRecord.read
  Liest `read`. Ruft `required`.
ChildProcessRecord.deleteIfMatch
  Löscht `deleteIfMatch`. Ruft `read`.
ChildProcessRecord.reap
  Räumt übrige Prozesse ab `reap`. Ruft `read`, `ours`, `waitUntilDead`.
```


