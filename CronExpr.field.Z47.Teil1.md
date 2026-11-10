[[00 Start]] › [[Zeitplaene]] › [[Plan-Klassen]] › [[CronExpr]] › [[CronExpr.field]] › [[CronExpr.field.Z47.Teil1]]

# CronExpr.field.Z47.Teil1

```mermaid
flowchart TD
  n1["if Z.49 (p.isEmpty())"]
  n2["if Z.53 (slash )= 0)"]
  n3["if Z.54 (step (= 0)"]
  n4["throw Z.54 throw new IllegalArgumentException('cron step');"]
  n1 --> n2
  n1 --> n2
  n3 -->|"ja"| n4
  n2 --> n3
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.49 (p.isEmpty())
  Zeile 49: prüft `(p.isEmpty())`.
if Z.53 (slash )= 0)
  Zeile 53: prüft `(slash )= 0)`.
if Z.54 (step (= 0)
  Zeile 54: prüft `(step (= 0)`.
throw Z.54 throw new IllegalArgumentException('cron step');
  Zeile 54: Abbruch `throw new IllegalArgumentException('cron step');`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.49 (p.isEmpty())**: Zeile 49: prüft `(p.isEmpty())`.
> - **if Z.53 (slash )= 0)**: Zeile 53: prüft `(slash )= 0)`.
> - **if Z.54 (step (= 0)**: Zeile 54: prüft `(step (= 0)`.
> - **throw Z.54 throw new IllegalArgumentException('cron step');**: Zeile 54: Abbruch `throw new IllegalArgumentException('cron step');`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `CronExpr.field.Z47`.
