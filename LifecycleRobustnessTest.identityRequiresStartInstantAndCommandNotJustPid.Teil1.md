[[00 Start]] › [[Tests]] › [[LifecycleRobustnessTest]] › [[LifecycleRobustnessTest.Teil1]] › [[LifecycleRobustnessTest.identityRequiresStartInstantAndCommandNotJustPid]] › [[LifecycleRobustnessTest.identityRequiresStartInstantAndCommandNotJustPid.Teil1]]

# LifecycleRobustnessTest.identityRequiresStartInstantAndCommandNotJustPid.Teil1

```mermaid
flowchart TD
  n1["LifecycleRobustnessTest.identity"]:::internal-link
  n2["ChildProcessRecord.ours"]:::internal-link
  n3["ChildProcessRecord.ours"]:::internal-link
  n1 --> n2
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
LifecycleRobustnessTest.identity
  `identity` in `LifecycleRobustnessTest.java`. Nur Test.
ChildProcessRecord.ours
  Prüft, ob es der eigene Prozess ist `ours`. Ruft `samePath`, `looksLikeJava`, `fileName`.
```

- Fortsetzung von `LifecycleRobustnessTest.identityRequiresStartInstantAndCommandNotJustPid`, Quellreihenfolge.
