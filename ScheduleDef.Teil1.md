[[00 Start]] › [[Zeitplaene]] › [[Plan-Klassen]] › [[ScheduleDef]] › [[ScheduleDef.Teil1]]

# ScheduleDef.Teil1

```mermaid
flowchart TD
  n1["ScheduleDef.ScheduleDef"]:::internal-link
  n2["ScheduleDef.cron"]:::internal-link
  n3["ScheduleDef.withEnabled"]:::internal-link
  n4["ScheduleDef.withLastRun"]:::internal-link
  n5["ScheduleDef.toConfig"]:::internal-link
  n6["ScheduleDef.toJson"]:::internal-link
  n7["ScheduleDef.load"]:::internal-link
  n8["ScheduleDef.validateInterval"]:::internal-link
  n1 -->|"Z.69"| n8
  n3 -->|"Z.86"| n1
  n4 -->|"Z.90"| n1
  n6 -->|"Z.108"| n5
  n6 -->|"Z.109"| n2
  n7 -->|"Z.130"| n1
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
ScheduleDef.ScheduleDef
  Plant `ScheduleDef`. Ruft `validateInterval`.
ScheduleDef.cron
  `cron` in `ScheduleDef.java`.
ScheduleDef.withEnabled
  Liefert eine Kopie mit `withEnabled`. Ruft `ScheduleDef`.
ScheduleDef.withLastRun
  Liefert eine Kopie mit `withLastRun`. Ruft `ScheduleDef`.
ScheduleDef.toConfig
  `toConfig` in `ScheduleDef.java`. Ruft `toConfig`.
ScheduleDef.toJson
  `toJson` in `ScheduleDef.java`. Ruft `toConfig`, `cron`.
ScheduleDef.load
  Lädt `load`. Ruft `asMap`, `Action`, `string`.
ScheduleDef.validateInterval
  Prüft `validateInterval`.
```


