[[00 Start]] › [[Tests]] › [[LifecycleRobustnessTest]] › [[LifecycleRobustnessTest.Teil1]] › [[LifecycleRobustnessTest.stopSendsStopWhenStartupNeverBecomesReadyAndThenKills]] › [[LifecycleRobustnessTest.stopSendsStopWhenStartupNeverBecomesReadyAndThenKills.Teil2]]

# LifecycleRobustnessTest.stopSendsStopWhenStartupNeverBecomesReadyAndThenKills.Teil2

```mermaid
flowchart TD
  n1["while Z.173 (process.isAlive() && System.nanoTime()…"]
  n2["Schritt Z.173 Thread.sleep(50);"]
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
while Z.173 (process.isAlive() && System.nanoTime()…
  Zeile 173: Schleife `(process.isAlive() && System.nanoTime()…`.
Schritt Z.173 Thread.sleep(50);
  Zeile 173: wartet. `Thread.sleep(50);`
```

- Fortsetzung von `LifecycleRobustnessTest.stopSendsStopWhenStartupNeverBecomesReadyAndThenKills`, Quellreihenfolge.
