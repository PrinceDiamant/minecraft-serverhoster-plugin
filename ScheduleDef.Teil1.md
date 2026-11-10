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
  Der [[Glossar#Zeitplan|Zeitplan]] plant hier einen Schritt. Eine Ebene tiefer steht er genauer. Plant `ScheduleDef`. Ruft `validateInterval`.
ScheduleDef.cron
  Der [[Glossar#Zeitplan|Zeitplan]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `cron` in `ScheduleDef.java`.
ScheduleDef.withEnabled
  Der [[Glossar#Zeitplan|Zeitplan]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Liefert eine Kopie mit `withEnabled`. Ruft `ScheduleDef`.
ScheduleDef.withLastRun
  Der [[Glossar#Zeitplan|Zeitplan]] kümmert sich um den letzten Stand den Lauf. Liefert eine Kopie mit `withLastRun`. Ruft `ScheduleDef`.
ScheduleDef.toConfig
  Der [[Glossar#Zeitplan|Zeitplan]] kümmert sich um die [[Glossar#Einstellungen|Einstellungen]]. `toConfig` in `ScheduleDef.java`. Ruft `toConfig`.
ScheduleDef.toJson
  Der [[Glossar#Zeitplan|Zeitplan]] kümmert sich um die Antwort. `toJson` in `ScheduleDef.java`. Ruft `toConfig`, `cron`.
ScheduleDef.load
  Der [[Glossar#Zeitplan|Zeitplan]] lädt das. Lädt `load`. Ruft `asMap`, `Action`, `string`.
ScheduleDef.validateInterval
  Der [[Glossar#Zeitplan|Zeitplan]] prüft hier einen Schritt. Eine Ebene tiefer steht er genauer. Prüft `validateInterval`.
```

> [!knoten]- Was die Blöcke tun
> - **ScheduleDef.ScheduleDef**: Der [[Glossar#Zeitplan|Zeitplan]] plant hier einen Schritt. Eine Ebene tiefer steht er genauer. Plant `ScheduleDef`. Ruft `validateInterval`.
> - **ScheduleDef.cron**: Der [[Glossar#Zeitplan|Zeitplan]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `cron` in `ScheduleDef.java`.
> - **ScheduleDef.withEnabled**: Der [[Glossar#Zeitplan|Zeitplan]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Liefert eine Kopie mit `withEnabled`. Ruft `ScheduleDef`.
> - **ScheduleDef.withLastRun**: Der [[Glossar#Zeitplan|Zeitplan]] kümmert sich um den letzten Stand den Lauf. Liefert eine Kopie mit `withLastRun`. Ruft `ScheduleDef`.
> - **ScheduleDef.toConfig**: Der [[Glossar#Zeitplan|Zeitplan]] kümmert sich um die [[Glossar#Einstellungen|Einstellungen]]. `toConfig` in `ScheduleDef.java`. Ruft `toConfig`.
> - **ScheduleDef.toJson**: Der [[Glossar#Zeitplan|Zeitplan]] kümmert sich um die Antwort. `toJson` in `ScheduleDef.java`. Ruft `toConfig`, `cron`.
> - **ScheduleDef.load**: Der [[Glossar#Zeitplan|Zeitplan]] lädt das. Lädt `load`. Ruft `asMap`, `Action`, `string`.
> - **ScheduleDef.validateInterval**: Der [[Glossar#Zeitplan|Zeitplan]] prüft hier einen Schritt. Eine Ebene tiefer steht er genauer. Prüft `validateInterval`.

- Ein weiterer Abschnitt derselben Übersicht.
