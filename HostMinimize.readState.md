[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[HostMinimize]] › [[HostMinimize.Teil3]] › [[HostMinimize.readState]]

# HostMinimize.readState

`HostMinimize.readState(String text)` [src/main/java/de/aichele/childlauncher/HostMinimize.java:299–307](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/HostMinimize.java#L299-L307)

```mermaid
flowchart TD
  n1["if Z.301 (text == null)"]
  n2["return Z.301 return values;"]
  n3["for Z.302 (String line : text.split('/n'))"]
  n4["if Z.304 (eq ) 0)"]
  n5["return Z.306 return values;"]
  n1 -->|"ja"| n2
  n3 -->|"wiederholen"| n4
  n2 --> n3
  n1 --> n3
  n4 --> n5
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.301 (text == null)
  Zeile 301: prüft `(text == null)`.
return Z.301 return values;
  Zeile 301: Rückgabe `return values;`.
for Z.302 (String line : text.split('/n'))
  Zeile 302: Schleife `(String line : text.split('/n'))`.
if Z.304 (eq ) 0)
  Zeile 304: prüft `(eq ) 0)`.
return Z.306 return values;
  Zeile 306: Rückgabe `return values;`.
```

- `readState` in `src/main/java/de/aichele/childlauncher/HostMinimize.java`
