[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[Host-Minimieren.Teil1]] › [[FabricLauncherPlugin.heapPrevious]]

# FabricLauncherPlugin.heapPrevious

`FabricLauncherPlugin.heapPrevious(List<HostHeapTune.Result> results)` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:2196–2204](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L2196-L2204)

```mermaid
flowchart TD
  n1["for Z.2198 (HostHeapTune.Result result : results)"]
  n2["if Z.2199 (!result.applied() // result.previous().isBlank()…"]
  n3["if Z.2200 (!encoded.isEmpty())"]
  n4["return Z.2203 return encoded.toString();"]
  n2 --> n3
  n2 --> n3
  n1 -->|"wiederholen"| n2
  n3 --> n4
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
for Z.2198 (HostHeapTune.Result result : results)
  Zeile 2198: Schleife `(HostHeapTune.Result result : results)`.
if Z.2199 (!result.applied() // result.previous().isBlank()…
  Zeile 2199: prüft `(!result.applied() // result.previous().isBlank()…`.
if Z.2200 (!encoded.isEmpty())
  Zeile 2200: prüft `(!encoded.isEmpty())`.
return Z.2203 return encoded.toString();
  Zeile 2203: Rückgabe `return encoded.toString();`.
```

> [!knoten]- Was die Blöcke tun
> - **for Z.2198 (HostHeapTune.Result result : results)**: Zeile 2198: Schleife `(HostHeapTune.Result result : results)`.
> - **if Z.2199 (!result.applied() // result.previous().isBlank()…**: Zeile 2199: prüft `(!result.applied() // result.previous().isBlank()…`.
> - **if Z.2200 (!encoded.isEmpty())**: Zeile 2200: prüft `(!encoded.isEmpty())`.
> - **return Z.2203 return encoded.toString();**: Zeile 2203: Rückgabe `return encoded.toString();`.

- Das [[Glossar#Plugin|Plugin]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer.
- `heapPrevious` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
