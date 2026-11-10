[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.serveWebAsset]]

# Dashboard.serveWebAsset

`Dashboard.serveWebAsset(HttpExchange ex, String path)` [src/main/java/de/aichele/childlauncher/Dashboard.java:942–963](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/Dashboard.java#L942-L963)

```mermaid
flowchart TD
  n1["if Z.943 (path.contains('//') // Arrays.asList(path.split(…"]
  n2["Dashboard.send"]:::internal-link
  n3["return Z.945 return;"]
  n4["Dashboard.serveWebAsset.Z947"]:::internal-link
  n5["Dashboard.serveWebAsset.Z955"]:::internal-link
  n2 --> n3
  n1 -->|"ja"| n2
  n3 --> n4
  n1 --> n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.943 (path.contains('//') // Arrays.asList(path.split(…
  Hier fällt eine Entscheidung. Nur wenn sie zutrifft, geht es den Ja-Weg weiter. Das steht in [[Glossar#Zeile|Zeile]] 943.
Dashboard.send
  Schickt die Antwort an den Browser. Im [[Glossar#Quelltext|Quelltext]] heißt das `send`.
return Z.945 return;
  Hier endet die [[Glossar#Funktion|Funktion]] und liefert ein Ergebnis zurück. Das steht in [[Glossar#Zeile|Zeile]] 945.
Dashboard.serveWebAsset.Z947
  Der Ablauf geht in [[Glossar#Zeile|Zeile]] 947 weiter. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `Z947`.
Dashboard.serveWebAsset.Z955
  Der Ablauf geht in [[Glossar#Zeile|Zeile]] 955 weiter. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `Z955`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.943 (path.contains('//') // Arrays.asList(path.split(…**: Hier fällt eine Entscheidung. Nur wenn sie zutrifft, geht es den Ja-Weg weiter. Das steht in [[Glossar#Zeile|Zeile]] 943.
> - **Dashboard.send**: Schickt die Antwort an den Browser. Im [[Glossar#Quelltext|Quelltext]] heißt das `send`.
> - **return Z.945 return;**: Hier endet die [[Glossar#Funktion|Funktion]] und liefert ein Ergebnis zurück. Das steht in [[Glossar#Zeile|Zeile]] 945.
> - **Dashboard.serveWebAsset.Z947**: Der Ablauf geht in [[Glossar#Zeile|Zeile]] 947 weiter. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `Z947`.
> - **Dashboard.serveWebAsset.Z955**: Der Ablauf geht in [[Glossar#Zeile|Zeile]] 955 weiter. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `Z955`.

- Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liefert die Seite eine Datei der Seite.
