[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Messung]] › [[ProcessProbe]] › [[ProcessProbe.jcmd(long,String,long)]] › [[ProcessProbe.jcmd(long,String,long).Teil1]]

# ProcessProbe.jcmd(long,String,long).Teil1

```mermaid
flowchart TD
  n1["if Z.75 (!JCMD.contains(command))"]
  n2["throw Z.75 throw new IllegalArgumentException('jcmd');"]
  n3["if Z.76 (pid (= 0)"]
  n4["throw Z.76 throw new IllegalStateException('Child läuft nich…"]
  n5["if Z.77 (timeoutSeconds (= 0)"]
  n6["throw Z.77 throw new IllegalArgumentException('timeoutSecond…"]
  n7["if Z.80 (!Files.isExecutable(bin))"]
  n8["throw Z.80 throw new IOException('jcmd fehlt: ' + bin);"]
  n9["Schritt Z.81 Process p = new ProcessBuilder(bin.toString(), Lo…"]
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n5 -->|"ja"| n6
  n4 --> n5
  n3 --> n5
  n7 -->|"ja"| n8
  n6 --> n7
  n5 --> n7
  n8 --> n9
  n7 --> n9
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `ProcessProbe.jcmd(long,String,long)`, Quellreihenfolge.
