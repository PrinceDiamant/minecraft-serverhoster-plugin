[[00 Start]] › [[Zeitplaene]] › [[Plan-Klassen]] › [[ScheduleDef]] › [[ScheduleDef.Teil1]] › [[ScheduleDef.ScheduleDef]] › [[ScheduleDef.ScheduleDef.Teil2]]

# ScheduleDef.ScheduleDef.Teil2

```mermaid
flowchart TD
  n1["try Z.64"]
  n2["catch Z.66 (DateTimeException e)"]
  n3["throw Z.67 throw new IllegalArgumentException('Ungültige Zei…"]
  n4["ScheduleDef.validateInterval"]:::internal-link
  n5["if Z.71 (actions.isEmpty() // actions.size() ) MAX_ACTION…"]
  n6["throw Z.72 throw new IllegalArgumentException('Ein Zeitplan …"]
  n7["if Z.73 (actions.stream().map(Action::id).distinct().coun…"]
  n8["throw Z.74 throw new IllegalArgumentException('Aktions-IDs m…"]
  n1 -->|"Fehler"| n2
  n2 --> n3
  n1 --> n4
  n3 --> n4
  n5 -->|"ja"| n6
  n4 --> n5
  n7 -->|"ja"| n8
  n6 --> n7
  n5 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.64
  Zeile 64: Versuch. Der Fehlerpfad geht in catch.
catch Z.66 (DateTimeException e)
  Zeile 66: fängt (DateTimeException e).
throw Z.67 throw new IllegalArgumentException('Ungültige Zei…
  Zeile 67: Abbruch `throw new IllegalArgumentException('Ungültige Zei…`.
ScheduleDef.validateInterval
  Der [[Glossar#Zeitplan|Zeitplan]] prüft hier einen Schritt. Eine Ebene tiefer steht er genauer. Prüft `validateInterval`.
if Z.71 (actions.isEmpty() // actions.size() ) MAX_ACTION…
  Zeile 71: prüft `(actions.isEmpty() // actions.size() ) MAX_ACTION…`.
throw Z.72 throw new IllegalArgumentException('Ein Zeitplan …
  Zeile 72: Abbruch `throw new IllegalArgumentException('Ein Zeitplan …`.
if Z.73 (actions.stream().map(Action::id).distinct().coun…
  Zeile 73: prüft `(actions.stream().map(Action::id).distinct().coun…`.
throw Z.74 throw new IllegalArgumentException('Aktions-IDs m…
  Zeile 74: Abbruch `throw new IllegalArgumentException('Aktions-IDs m…`.
```

> [!knoten]- Was die Blöcke tun
> - **try Z.64**: Zeile 64: Versuch. Der Fehlerpfad geht in catch.
> - **catch Z.66 (DateTimeException e)**: Zeile 66: fängt (DateTimeException e).
> - **throw Z.67 throw new IllegalArgumentException('Ungültige Zei…**: Zeile 67: Abbruch `throw new IllegalArgumentException('Ungültige Zei…`.
> - **ScheduleDef.validateInterval**: Der [[Glossar#Zeitplan|Zeitplan]] prüft hier einen Schritt. Eine Ebene tiefer steht er genauer. Prüft `validateInterval`.
> - **if Z.71 (actions.isEmpty() // actions.size() ) MAX_ACTION…**: Zeile 71: prüft `(actions.isEmpty() // actions.size() ) MAX_ACTION…`.
> - **throw Z.72 throw new IllegalArgumentException('Ein Zeitplan …**: Zeile 72: Abbruch `throw new IllegalArgumentException('Ein Zeitplan …`.
> - **if Z.73 (actions.stream().map(Action::id).distinct().coun…**: Zeile 73: prüft `(actions.stream().map(Action::id).distinct().coun…`.
> - **throw Z.74 throw new IllegalArgumentException('Aktions-IDs m…**: Zeile 74: Abbruch `throw new IllegalArgumentException('Aktions-IDs m…`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `ScheduleDef.ScheduleDef`.
