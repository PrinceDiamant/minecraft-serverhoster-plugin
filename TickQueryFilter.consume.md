[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[TickQueryFilter]] › [[TickQueryFilter.consume]]

# TickQueryFilter.consume

`TickQueryFilter.consume(String line, long queryAt, long now)` [src/main/java/de/aichele/childlauncher/TickQueryFilter.java:18–42](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/TickQueryFilter.java#L18-L42)

```mermaid
flowchart TD
  n1["if Z.19 (now - queryAt ) 3000)"]
  n2["return Z.19 return false;"]
  n3["if Z.21 (rate.find())"]
  n4["try Z.22"]
  n5["catch Z.22 (NumberFormatException ignore…"]
  n6["return Z.23 return true;"]
  n7["TickQueryFilter.consume.Z26"]:::internal-link
  n8["return Z.35 return line.contains('The game is running normall…"]
  n1 -->|"ja"| n2
  n4 -->|"Fehler"| n5
  n4 --> n6
  n5 --> n6
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n6 --> n7
  n3 --> n7
  n7 --> n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.19 (now - queryAt ) 3000)
  Zeile 19: prüft `(now - queryAt ) 3000)`.
return Z.19 return false;
  Zeile 19: Rückgabe `return false;`.
if Z.21 (rate.find())
  Zeile 21: prüft `(rate.find())`.
try Z.22
  Zeile 22: Versuch. Der Fehlerpfad geht in catch.
catch Z.22 (NumberFormatException ignore…
  Zeile 22: fängt (NumberFormatException ignore….
return Z.23 return true;
  Zeile 23: Rückgabe `return true;`.
TickQueryFilter.consume.Z26
  Der Ablauf geht in [[Glossar#Zeile|Zeile]] 26 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 26.
return Z.35 return line.contains('The game is running normall…
  Zeile 35: Rückgabe `return line.contains('The game is running normall…`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.19 (now - queryAt ) 3000)**: Zeile 19: prüft `(now - queryAt ) 3000)`.
> - **return Z.19 return false;**: Zeile 19: Rückgabe `return false;`.
> - **if Z.21 (rate.find())**: Zeile 21: prüft `(rate.find())`.
> - **try Z.22**: Zeile 22: Versuch. Der Fehlerpfad geht in catch.
> - **catch Z.22 (NumberFormatException ignore…**: Zeile 22: fängt (NumberFormatException ignore….
> - **return Z.23 return true;**: Zeile 23: Rückgabe `return true;`.
> - **TickQueryFilter.consume.Z26**: Der Ablauf geht in [[Glossar#Zeile|Zeile]] 26 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 26.
> - **return Z.35 return line.contains('The game is running normall…**: Zeile 35: Rückgabe `return line.contains('The game is running normall…`.

- Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer.
- `consume` in `src/main/java/de/aichele/childlauncher/TickQueryFilter.java`
