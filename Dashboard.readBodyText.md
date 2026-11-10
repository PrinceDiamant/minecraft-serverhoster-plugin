[[00 Start]] › [[Dashboard-HTTP]] › [[API-Antworten]] › [[Dashboard.readBodyText]]

# Dashboard.readBodyText

`Dashboard.readBodyText(HttpExchange ex)` [src/main/java/de/aichele/childlauncher/Dashboard.java:974–980](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/Dashboard.java#L974-L980)

```mermaid
flowchart TD
  n1["try Z.975"]
  n2["if Z.977 (b.length ) MAX_TEXT)"]
  n3["throw Z.977 throw new IOException('Zu groß (max 2 MB)');"]
  n4["return Z.978 return new String(b, StandardCharsets.UTF_8);"]
  n2 -->|"ja"| n3
  n3 --> n4
  n2 --> n4
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.975
  Das Programm versucht diesen Schritt. Geht er schief, führt der andere Weg weiter. Das steht in [[Glossar#Zeile|Zeile]] 975.
if Z.977 (b.length ) MAX_TEXT)
  Hier fällt eine Entscheidung. Nur wenn sie zutrifft, geht es den Ja-Weg weiter. Das steht in [[Glossar#Zeile|Zeile]] 977.
throw Z.977 throw new IOException('Zu groß (max 2 MB)');
  Hier bricht die [[Glossar#Funktion|Funktion]] ab, weil etwas nicht geklappt hat. Das steht in [[Glossar#Zeile|Zeile]] 977.
return Z.978 return new String(b, StandardCharsets.UTF_8);
  Hier endet die [[Glossar#Funktion|Funktion]] und liefert ein Ergebnis zurück. Das steht in [[Glossar#Zeile|Zeile]] 978.
```

> [!knoten]- Was die Blöcke tun
> - **try Z.975**: Das Programm versucht diesen Schritt. Geht er schief, führt der andere Weg weiter. Das steht in [[Glossar#Zeile|Zeile]] 975.
> - **if Z.977 (b.length ) MAX_TEXT)**: Hier fällt eine Entscheidung. Nur wenn sie zutrifft, geht es den Ja-Weg weiter. Das steht in [[Glossar#Zeile|Zeile]] 977.
> - **throw Z.977 throw new IOException('Zu groß (max 2 MB)');**: Hier bricht die [[Glossar#Funktion|Funktion]] ab, weil etwas nicht geklappt hat. Das steht in [[Glossar#Zeile|Zeile]] 977.
> - **return Z.978 return new String(b, StandardCharsets.UTF_8);**: Hier endet die [[Glossar#Funktion|Funktion]] und liefert ein Ergebnis zurück. Das steht in [[Glossar#Zeile|Zeile]] 978.

- Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liest den Text den Text.
