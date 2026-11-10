[[00 Start]] › [[Zeitplaene]] › [[Plan-Klassen]] › [[LegacyTaskMigration]] › [[LegacyTaskMigration.convert]] › [[LegacyTaskMigration.convert.Teil2]]

# LegacyTaskMigration.convert.Teil2

```mermaid
flowchart TD
  n1["LegacyTaskMigration.convert.Teil2.Z48"]:::internal-link
  n2["if Z.70 (id.isBlank() // !Character.isLetterOrDigit(id.ch…"]
  n3["for Z.73 (int suffix = 2; ids.contains(id); suff…"]
  n1 --> n2
  n2 --> n3
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
LegacyTaskMigration.convert.Teil2.Z48
  Der Ablauf geht in [[Glossar#Zeile|Zeile]] 48 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 48.
if Z.70 (id.isBlank() // !Character.isLetterOrDigit(id.ch…
  Zeile 70: prüft `(id.isBlank() // !Character.isLetterOrDigit(id.ch…`.
for Z.73 (int suffix = 2; ids.contains(id); suff…
  Zeile 73: Schleife `(int suffix = 2; ids.contains(id); suff…`.
```

> [!knoten]- Was die Blöcke tun
> - **LegacyTaskMigration.convert.Teil2.Z48**: Der Ablauf geht in [[Glossar#Zeile|Zeile]] 48 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 48.
> - **if Z.70 (id.isBlank() // !Character.isLetterOrDigit(id.ch…**: Zeile 70: prüft `(id.isBlank() // !Character.isLetterOrDigit(id.ch…`.
> - **for Z.73 (int suffix = 2; ids.contains(id); suff…**: Zeile 73: Schleife `(int suffix = 2; ids.contains(id); suff…`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `LegacyTaskMigration.convert`.
