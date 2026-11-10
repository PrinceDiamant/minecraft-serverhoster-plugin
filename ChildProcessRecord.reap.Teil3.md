[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildProcessRecord]] › [[ChildProcessRecord.Teil1]] › [[ChildProcessRecord.reap]] › [[ChildProcessRecord.reap.Teil3]]

# ChildProcessRecord.reap.Teil3

```mermaid
flowchart TD
  n1["if Z.171 (!waitUntilDead(inspector, identity.pid(), gracef…"]
  n2["ChildProcessRecord.waitUntilDead"]:::internal-link
  n3["if Z.173 (!waitUntilDead(inspector, identity.pid(), forced…"]
  n4["ChildProcessRecord.waitUntilDead"]:::internal-link
  n5["return Z.174 return new ReapResult(Kind.STILL_ALIVE, 'pid ' + …"]
  n6["try Z.176"]
  n7["Schritt Z.177 Files.deleteIfExists(file);"]
  n8["catch Z.178 (IOException e)"]
  n9["return Z.179 return new ReapResult(Kind.REAPED, 'pid ' + ident…"]
  n10["return Z.181 return new ReapResult(Kind.REAPED, 'pid ' + ident…"]
  n1 -->|"Z.171"| n2
  n3 -->|"Z.173"| n4
  n4 -->|"ja"| n5
  n2 -->|"ja"| n3
  n6 --> n7
  n6 -->|"Fehler"| n8
  n8 --> n9
  n5 --> n6
  n4 --> n6
  n2 --> n6
  n7 --> n10
  n9 --> n10
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `ChildProcessRecord.reap`, Quellreihenfolge.
