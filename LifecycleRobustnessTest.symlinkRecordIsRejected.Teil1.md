[[00 Start]] › [[Tests]] › [[LifecycleRobustnessTest]] › [[LifecycleRobustnessTest.Teil1]] › [[LifecycleRobustnessTest.symlinkRecordIsRejected]] › [[LifecycleRobustnessTest.symlinkRecordIsRejected.Teil1]]

# LifecycleRobustnessTest.symlinkRecordIsRejected.Teil1

```mermaid
flowchart TD
  n1["Schritt Z.106 Files.writeString(real, 'serverhoster-child-proce…"]
  n2["try Z.108"]
  n3["Schritt Z.109 Files.createSymbolicLink(link, real);"]
  n4["catch Z.110 (UnsupportedOperationExceptio…"]
  n5["ChildProcessRecord.read"]:::internal-link
  n2 --> n3
  n2 -->|"Fehler"| n4
  n1 --> n2
  n3 --> n5
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `LifecycleRobustnessTest.symlinkRecordIsRejected`, Quellreihenfolge.
