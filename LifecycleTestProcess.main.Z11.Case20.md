[[00 Start]] › [[Tests]] › [[LifecycleTestProcess]] › [[LifecycleTestProcess.main]] › [[LifecycleTestProcess.main.Z11.Case20]]

# LifecycleTestProcess.main.Z11.Case20

```mermaid
flowchart TD
  n1["Schritt Z.21 Runtime.getRuntime().addShutdownHook(new Thread((…"]
  n2["try Z.22"]
  n3["Schritt Z.23 Thread.sleep(60_000);"]
  n4["catch Z.24 (InterruptedException e)"]
  n5["while Z.28 (true)"]
  n2 --> n3
  n2 -->|"Fehler"| n4
  n1 --> n2
  n3 --> n5
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `LifecycleTestProcess.main.Z11`, Quellreihenfolge.
