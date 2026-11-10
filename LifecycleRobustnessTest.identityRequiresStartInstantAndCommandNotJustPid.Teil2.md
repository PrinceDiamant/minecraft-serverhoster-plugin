[[00 Start]] › [[Tests]] › [[LifecycleRobustnessTest]] › [[LifecycleRobustnessTest.Teil1]] › [[LifecycleRobustnessTest.identityRequiresStartInstantAndCommandNotJustPid]] › [[LifecycleRobustnessTest.identityRequiresStartInstantAndCommandNotJustPid.Teil2]]

# LifecycleRobustnessTest.identityRequiresStartInstantAndCommandNotJustPid.Teil2

```mermaid
flowchart TD
  n1["ChildProcessRecord.ours"]:::internal-link
  n2["ChildProcessRecord.ours"]:::internal-link
  n3["ChildProcessRecord.ours"]:::internal-link
  n4["ChildProcessRecord.ours"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
ChildProcessRecord.ours
  Prüft, ob es der eigene Prozess ist `ours`. Ruft `samePath`, `looksLikeJava`, `fileName`.
```

- Fortsetzung von `LifecycleRobustnessTest.identityRequiresStartInstantAndCommandNotJustPid`, Quellreihenfolge.
