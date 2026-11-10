[[00 Start]] › [[Dashboard-HTTP]] › [[API-Dateien]] › [[Dashboard.rel]]

# Dashboard.rel

`Dashboard.rel(String sid, Path p)` [src/main/java/de/aichele/childlauncher/Dashboard.java:816–816](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/Dashboard.java#L816-L816)

```mermaid
flowchart TD
  n1["Dashboard.guard"]:::internal-link
  n2["PathGuard.relativize"]:::internal-link
  n3["return Z.816 return guard(sid).relativize(p);"]
  n1 -->|"Z.816"| n2
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Dashboard.guard
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `guard`.
PathGuard.relativize
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `relativize`.
return Z.816 return guard(sid).relativize(p);
  Hier endet die [[Glossar#Funktion|Funktion]] und liefert ein Ergebnis zurück. Das steht in [[Glossar#Zeile|Zeile]] 816.
```

> [!knoten]- Was die Blöcke tun
> - **Dashboard.guard**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `guard`.
> - **PathGuard.relativize**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `relativize`.
> - **return Z.816 return guard(sid).relativize(p);**: Hier endet die [[Glossar#Funktion|Funktion]] und liefert ein Ergebnis zurück. Das steht in [[Glossar#Zeile|Zeile]] 816.

- Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer.
