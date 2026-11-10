[[00 Start]] › [[Tests]] › [[LifecycleRobustnessTest]] › [[LifecycleRobustnessTest.Teil1]] › [[LifecycleRobustnessTest.stopSendsStopWhenStartupNeverBecomesReadyAndThenKills]] › [[LifecycleRobustnessTest.stopSendsStopWhenStartupNeverBecomesReadyAndThenKills.Teil1]]

# LifecycleRobustnessTest.stopSendsStopWhenStartupNeverBecomesReadyAndThenKills.Teil1

```mermaid
flowchart TD
  n1["LifecycleRobustnessTest.testProcess"]:::internal-link
  n2["ChildStopSequence.stop"]:::internal-link
  n3["Schritt Z.172 long deadline = System.nanoTime() + java.util.con…"]
  n1 --> n2
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
LifecycleRobustnessTest.testProcess
  Prüft `testProcess`. Nur Test.
ChildStopSequence.stop
  Stoppt `stop`. Ruft `signal`.
Schritt Z.172 long deadline = System.nanoTime() + java.util.con…
  Zeile 172: `long deadline = System.nanoTime() + java.util.con…`
```

- Fortsetzung von `LifecycleRobustnessTest.stopSendsStopWhenStartupNeverBecomesReadyAndThenKills`, Quellreihenfolge.
