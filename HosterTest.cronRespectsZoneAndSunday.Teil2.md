[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil2]] › [[HosterTest.cronRespectsZoneAndSunday]] › [[HosterTest.cronRespectsZoneAndSunday.Teil2]]

# HosterTest.cronRespectsZoneAndSunday.Teil2

```mermaid
flowchart TD
  n1["CronExpr.matches"]:::internal-link
  n2["CronExpr.matches"]:::internal-link
  n3["CronExpr.matches"]:::internal-link
  n4["CronExpr.matches"]:::internal-link
  n5["CronExpr.next"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
CronExpr.matches
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `matches` in `CronExpr.java`. Ruft `field`, `dow`.
CronExpr.next
  Dieser Teil geht weiter bei das. Geht zum nächsten Schritt `next`. Ruft `matches`, `field`.
```

> [!knoten]- Was die Blöcke tun
> - **CronExpr.matches**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `matches` in `CronExpr.java`. Ruft `field`, `dow`.
> - **CronExpr.next**: Dieser Teil geht weiter bei das. Geht zum nächsten Schritt `next`. Ruft `matches`, `field`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `HosterTest.cronRespectsZoneAndSunday`.
