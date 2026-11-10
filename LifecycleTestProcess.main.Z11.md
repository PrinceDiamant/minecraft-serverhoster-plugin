[[00 Start]] › [[Tests]] › [[LifecycleTestProcess]] › [[LifecycleTestProcess.main]] › [[LifecycleTestProcess.main.Z11]]

# LifecycleTestProcess.main.Z11

```mermaid
flowchart TD
  n1["switch Z.11 (args(0))"]
  n2["case Z.12 'sleep'"]
  n3["Schritt Z.12 Thread.sleep(Long.parseLong(args(1)));"]
  n4["case Z.13 'ready-stop'"]
  n5["LifecycleTestProcess.main.Z11.Case13"]:::internal-link
  n6["case Z.19 'never-ready'"]
  n7["Schritt Z.19 Thread.sleep(60_000);"]
  n8["case Z.20 'ignore-stop'"]
  n9["LifecycleTestProcess.main.Z11.Case20"]:::internal-link
  n10["case Z.33 default"]
  n11["throw Z.33 throw new IllegalArgumentException('Unknown test …"]
  n1 --> n2
  n2 --> n3
  n1 --> n4
  n4 --> n5
  n1 --> n6
  n6 --> n7
  n1 --> n8
  n8 --> n9
  n1 --> n10
  n10 --> n11
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `LifecycleTestProcess.main`, Quellreihenfolge.
