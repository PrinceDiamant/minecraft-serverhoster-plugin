[[00 Start]] › [[Dashboard-HTTP]] › [[API-Status]] › [[Dashboard.procField]]

# Dashboard.procField

`Dashboard.procField(long pid, String key)` [src/main/java/de/aichele/childlauncher/Dashboard.java:660–664](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/Dashboard.java#L660-L664)

```mermaid
flowchart TD
  n1["try Z.661"]
  n2["for Z.661 (String l : Files.readAllLines(Paths.ge…"]
  n3["if Z.661 (l.startsWith(key))"]
  n4["return Z.661 return Long.parseLong(l.replaceAll('//D', ''));"]
  n5["catch Z.662 (Exception ignored)"]
  n6["return Z.663 return -1;"]
  n3 -->|"ja"| n4
  n2 -->|"wiederholen"| n3
  n1 --> n2
  n1 -->|"Fehler"| n5
  n4 --> n6
  n3 --> n6
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.661
  Das Programm versucht diesen Schritt. Geht er schief, führt der andere Weg weiter. Das steht in [[Glossar#Zeile|Zeile]] 661.
for Z.661 (String l : Files.readAllLines(Paths.ge…
  Dasselbe wird für jeden Eintrag wiederholt. Das steht in [[Glossar#Zeile|Zeile]] 661.
if Z.661 (l.startsWith(key))
  Hier fällt eine Entscheidung. Nur wenn sie zutrifft, geht es den Ja-Weg weiter. Das steht in [[Glossar#Zeile|Zeile]] 661.
return Z.661 return Long.parseLong(l.replaceAll('//D', ''));
  Hier endet die [[Glossar#Funktion|Funktion]] und liefert ein Ergebnis zurück. Das steht in [[Glossar#Zeile|Zeile]] 661.
catch Z.662 (Exception ignored)
  Dieser Weg gilt, wenn der Schritt davor schiefgegangen ist. Das steht in [[Glossar#Zeile|Zeile]] 662.
return Z.663 return -1;
  Hier endet die [[Glossar#Funktion|Funktion]] und liefert ein Ergebnis zurück. Das steht in [[Glossar#Zeile|Zeile]] 663.
```

> [!knoten]- Was die Blöcke tun
> - **try Z.661**: Das Programm versucht diesen Schritt. Geht er schief, führt der andere Weg weiter. Das steht in [[Glossar#Zeile|Zeile]] 661.
> - **for Z.661 (String l : Files.readAllLines(Paths.ge…**: Dasselbe wird für jeden Eintrag wiederholt. Das steht in [[Glossar#Zeile|Zeile]] 661.
> - **if Z.661 (l.startsWith(key))**: Hier fällt eine Entscheidung. Nur wenn sie zutrifft, geht es den Ja-Weg weiter. Das steht in [[Glossar#Zeile|Zeile]] 661.
> - **return Z.661 return Long.parseLong(l.replaceAll('//D', ''));**: Hier endet die [[Glossar#Funktion|Funktion]] und liefert ein Ergebnis zurück. Das steht in [[Glossar#Zeile|Zeile]] 661.
> - **catch Z.662 (Exception ignored)**: Dieser Weg gilt, wenn der Schritt davor schiefgegangen ist. Das steht in [[Glossar#Zeile|Zeile]] 662.
> - **return Z.663 return -1;**: Hier endet die [[Glossar#Funktion|Funktion]] und liefert ein Ergebnis zurück. Das steht in [[Glossar#Zeile|Zeile]] 663.

- Liest ein einzelnes Feld aus den Prozessdaten des Betriebssystems.
