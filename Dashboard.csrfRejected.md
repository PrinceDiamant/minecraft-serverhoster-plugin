[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Auth]] › [[Dashboard.csrfRejected]]

# Dashboard.csrfRejected

`Dashboard.csrfRejected(String method, String header)` [src/main/java/de/aichele/childlauncher/Dashboard.java:562–564](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/Dashboard.java#L562-L564)

```mermaid
flowchart TD
  n1["return Z.563 return method != null && !Set.of('GET', 'HEAD', '…"]
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
return Z.563 return method != null && !Set.of('GET', 'HEAD', '…
  Hier endet die [[Glossar#Funktion|Funktion]] und liefert ein Ergebnis zurück. Das steht in [[Glossar#Zeile|Zeile]] 563.
```

> [!knoten]- Was die Blöcke tun
> - **return Z.563 return method != null && !Set.of('GET', 'HEAD', '…**: Hier endet die [[Glossar#Funktion|Funktion]] und liefert ein Ergebnis zurück. Das steht in [[Glossar#Zeile|Zeile]] 563.

- Lehnt eine Anfrage ab, die nicht von der eigenen [[Glossar#Bedienseite|Bedienseite]] kommt.
