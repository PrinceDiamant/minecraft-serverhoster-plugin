[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Diag]]

# Legacy-Diag

```mermaid
flowchart TD
  n1["index.loadDiag"]:::internal-link
  n2["index.jcmd"]:::internal-link
  n3["index.loadPlan"]:::internal-link
  n4["index.loadJar"]:::internal-link
  n5["index.loadCrashes"]:::internal-link
  n6["index.readCrash"]:::internal-link
  n1 -->|"Quelltext"| n2
  n2 -->|"Quelltext"| n3
  n3 -->|"Quelltext"| n4
  n4 -->|"Quelltext"| n5
  n5 -->|"Quelltext"| n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
index.loadDiag
  Lädt `loadDiag`. Ruft `api`, `$`, `row`.
index.jcmd
  `jcmd` in `index.html`. Ruft `post`, `$`.
index.loadPlan
  Lädt `loadPlan`. Ruft `$`, `api`.
index.loadJar
  Lädt `loadJar`. Ruft `api`, `$`.
index.loadCrashes
  Lädt `loadCrashes`. Ruft `api`, `$`, `esc`.
index.readCrash
  Liest `readCrash`. Ruft `$`, `toast`, `api`.
```


