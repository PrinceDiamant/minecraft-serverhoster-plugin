[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildProcessRecord]] › [[ChildProcessRecord.Teil1]] › [[ChildProcessRecord.ours]] › [[ChildProcessRecord.ours.Teil2]]

# ChildProcessRecord.ours.Teil2

```mermaid
flowchart TD
  n1["ChildProcessRecord.samePath"]:::internal-link
  n2["ChildProcessRecord.looksLikeJava"]:::internal-link
  n3["ChildProcessRecord.fileName"]:::internal-link
  n4["ChildProcessRecord.fileName"]:::internal-link
  n5["return Z.84 return samePath(live.cwd(), recorded.wo…"]
  n1 -->|"Z.85"| n2
  n2 -->|"Z.87"| n3
  n3 -->|"Z.87"| n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
ChildProcessRecord.samePath
  Vergleicht `samePath`.
ChildProcessRecord.looksLikeJava
  `looksLikeJava` in `ChildProcessRecord.java`. Ruft `fileName`.
ChildProcessRecord.fileName
  Liefert die Datei `fileName`.
return Z.84 return samePath(live.cwd(), recorded.wo…
  Zeile 84: Rückgabe `return samePath(live.cwd(), recorded.wo…`.
```

- Fortsetzung von `ChildProcessRecord.ours`, Quellreihenfolge.
