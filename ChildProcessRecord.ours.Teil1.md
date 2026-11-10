[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildProcessRecord]] › [[ChildProcessRecord.Teil1]] › [[ChildProcessRecord.ours]] › [[ChildProcessRecord.ours.Teil1]]

# ChildProcessRecord.ours.Teil1

```mermaid
flowchart TD
  n1["if Z.77 (recorded == null // live == null // !live.alive(…"]
  n2["return Z.77 return false;"]
  n3["if Z.78 (recorded.pid() (= 0 // recorded.pid() != live.pi…"]
  n4["return Z.78 return false;"]
  n5["if Z.79 (recorded.startedAt() == null // live.startedAt()…"]
  n6["return Z.80 return false;"]
  n7["if Z.82 (command.stream().anyMatch(token -) token.equals(…"]
  n8["return Z.83 return true;"]
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n5 -->|"ja"| n6
  n4 --> n5
  n3 --> n5
  n7 -->|"ja"| n8
  n6 --> n7
  n5 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.77 (recorded == null // live == null // !live.alive(…
  Zeile 77: prüft `(recorded == null // live == null // !live.alive(…`.
return Z.77 return false;
  Zeile 77: Rückgabe `return false;`.
if Z.78 (recorded.pid() (= 0 // recorded.pid() != live.pi…
  Zeile 78: prüft `(recorded.pid() (= 0 // recorded.pid() != live.pi…`.
return Z.78 return false;
  Zeile 78: Rückgabe `return false;`.
if Z.79 (recorded.startedAt() == null // live.startedAt()…
  Zeile 79: prüft `(recorded.startedAt() == null // live.startedAt()…`.
return Z.80 return false;
  Zeile 80: Rückgabe `return false;`.
if Z.82 (command.stream().anyMatch(token -) token.equals(…
  Zeile 82: prüft `(command.stream().anyMatch(token -) token.equals(…`.
return Z.83 return true;
  Zeile 83: Rückgabe `return true;`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.77 (recorded == null // live == null // !live.alive(…**: Zeile 77: prüft `(recorded == null // live == null // !live.alive(…`.
> - **return Z.77 return false;**: Zeile 77: Rückgabe `return false;`.
> - **if Z.78 (recorded.pid() (= 0 // recorded.pid() != live.pi…**: Zeile 78: prüft `(recorded.pid() (= 0 // recorded.pid() != live.pi…`.
> - **return Z.78 return false;**: Zeile 78: Rückgabe `return false;`.
> - **if Z.79 (recorded.startedAt() == null // live.startedAt()…**: Zeile 79: prüft `(recorded.startedAt() == null // live.startedAt()…`.
> - **return Z.80 return false;**: Zeile 80: Rückgabe `return false;`.
> - **if Z.82 (command.stream().anyMatch(token -) token.equals(…**: Zeile 82: prüft `(command.stream().anyMatch(token -) token.equals(…`.
> - **return Z.83 return true;**: Zeile 83: Rückgabe `return true;`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `ChildProcessRecord.ours`.
