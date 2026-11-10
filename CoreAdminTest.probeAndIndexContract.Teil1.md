[[00 Start]] › [[Tests]] › [[CoreAdminTest]] › [[CoreAdminTest.Teil3]] › [[CoreAdminTest.probeAndIndexContract]] › [[CoreAdminTest.probeAndIndexContract.Teil1]]

# CoreAdminTest.probeAndIndexContract.Teil1

```mermaid
flowchart TD
  n1["Schritt Z.354 long pid = ProcessHandle.current().pid();"]
  n2["ProcessProbe.snapshot"]:::internal-link
  n3["if Z.356 (System.getProperty('os.name', '').toLowerCase().…"]
  n4["ProcessProbe.jcmd(long,String)"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `CoreAdminTest.probeAndIndexContract`, Quellreihenfolge.
