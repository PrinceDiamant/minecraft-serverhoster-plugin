[[00 Start]] › [[Zeitplaene]] › [[Schedules]] › [[FabricLauncherPlugin.fireDueSchedules]] › [[FabricLauncherPlugin.fireDueSchedules.Z1525.Z1528]]

# FabricLauncherPlugin.fireDueSchedules.Z1525.Z1528

```mermaid
flowchart TD
  n1["try Z.1528"]
  n2["if Z.1530 (!CronExpr.matches(schedule.cron(), now))"]
  n3["CronExpr.matches"]:::internal-link
  n4["ScheduleDef.cron"]:::internal-link
  n5["catch Z.1531 (RuntimeException e)"]
  n2 -->|"Z.1530"| n3
  n3 -->|"Z.1530"| n4
  n1 --> n2
  n1 -->|"Fehler"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.1528
  Zeile 1528: Versuch. Der Fehlerpfad geht in catch.
if Z.1530 (!CronExpr.matches(schedule.cron(), now))
  Zeile 1530: prüft `(!CronExpr.matches(schedule.cron(), now))`.
CronExpr.matches
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `matches` in `CronExpr.java`. Ruft `field`, `dow`.
ScheduleDef.cron
  Der [[Glossar#Zeitplan|Zeitplan]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `cron` in `ScheduleDef.java`.
catch Z.1531 (RuntimeException e)
  Zeile 1531: fängt (RuntimeException e).
```

> [!knoten]- Was die Blöcke tun
> - **try Z.1528**: Zeile 1528: Versuch. Der Fehlerpfad geht in catch.
> - **if Z.1530 (!CronExpr.matches(schedule.cron(), now))**: Zeile 1530: prüft `(!CronExpr.matches(schedule.cron(), now))`.
> - **CronExpr.matches**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `matches` in `CronExpr.java`. Ruft `field`, `dow`.
> - **ScheduleDef.cron**: Der [[Glossar#Zeitplan|Zeitplan]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `cron` in `ScheduleDef.java`.
> - **catch Z.1531 (RuntimeException e)**: Zeile 1531: fängt (RuntimeException e).

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 1528 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `FabricLauncherPlugin.fireDueSchedules.Z1525`.
