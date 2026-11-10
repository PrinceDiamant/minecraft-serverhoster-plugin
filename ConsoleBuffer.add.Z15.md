[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ConsoleBuffer]] › [[ConsoleBuffer.add]] › [[ConsoleBuffer.add.Z15]]

# ConsoleBuffer.add.Z15

```mermaid
flowchart TD
  n1["sync Z.15"]
  n2["while Z.17 (lines.size() ) cap)"]
  n3["for Z.18 (Consumer(String) l : listeners)"]
  n4["try Z.18"]
  n5["catch Z.18 (Exception ignored)"]
  n4 -->|"Fehler"| n5
  n3 -->|"wiederholen"| n4
  n2 --> n3
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
sync Z.15
  Zeile 15: synchronisierter Block.
while Z.17 (lines.size() ) cap)
  Zeile 17: Schleife `(lines.size() ) cap)`.
for Z.18 (Consumer(String) l : listeners)
  Zeile 18: Schleife `(Consumer(String) l : listeners)`.
try Z.18
  Zeile 18: Versuch. Der Fehlerpfad geht in catch.
catch Z.18 (Exception ignored)
  Zeile 18: fängt (Exception ignored).
```

> [!knoten]- Was die Blöcke tun
> - **sync Z.15**: Zeile 15: synchronisierter Block.
> - **while Z.17 (lines.size() ) cap)**: Zeile 17: Schleife `(lines.size() ) cap)`.
> - **for Z.18 (Consumer(String) l : listeners)**: Zeile 18: Schleife `(Consumer(String) l : listeners)`.
> - **try Z.18**: Zeile 18: Versuch. Der Fehlerpfad geht in catch.
> - **catch Z.18 (Exception ignored)**: Zeile 18: fängt (Exception ignored).

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 15 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `ConsoleBuffer.add`.
