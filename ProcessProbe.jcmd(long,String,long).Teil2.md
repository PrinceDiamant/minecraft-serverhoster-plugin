[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Messung]] › [[ProcessProbe]] › [[ProcessProbe.jcmd(long,String,long)]] › [[ProcessProbe.jcmd(long,String,long).Teil2]]

# ProcessProbe.jcmd(long,String,long).Teil2

```mermaid
flowchart TD
  n1["try Z.84"]
  n2["catch Z.84 (IOException ignored)"]
  n3["ProcessProbe.jcmd(long,String,long).Teil2.Z88"]:::internal-link
  n4["if Z.97 (text.length() ) 1_500_000)"]
  n5["if Z.98 (p.exitValue() != 0)"]
  n6["ProcessProbe.abbreviate"]:::internal-link
  n7["throw Z.98 throw new IOException('jcmd exit ' + p.…"]
  n1 -->|"Fehler"| n2
  n1 --> n3
  n2 --> n3
  n3 --> n4
  n6 --> n7
  n5 -->|"ja"| n6
  n4 --> n5
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `ProcessProbe.jcmd(long,String,long)`, Quellreihenfolge.
