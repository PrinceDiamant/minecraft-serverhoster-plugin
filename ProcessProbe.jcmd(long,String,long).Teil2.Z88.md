[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Messung]] › [[ProcessProbe]] › [[ProcessProbe.jcmd(long,String,long)]] › [[ProcessProbe.jcmd(long,String,long).Teil2.Z88]]

# ProcessProbe.jcmd(long,String,long).Teil2.Z88

```mermaid
flowchart TD
  n1["try Z.88"]
  n2["if Z.89 (!p.waitFor(timeoutSeconds, TimeUnit.SECONDS))"]
  n3["throw Z.89 throw new IOException('jcmd timeout after ' + tim…"]
  n4["catch Z.91 (InterruptedException e)"]
  n5["throw Z.94 throw new IOException('jcmd interrupted');"]
  n2 -->|"ja"| n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `ProcessProbe.jcmd(long,String,long).Teil2`, Quellreihenfolge.
