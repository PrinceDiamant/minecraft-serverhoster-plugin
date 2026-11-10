[[00 Start]] › [[Zeitplaene]] › [[Plan-Klassen]] › [[ScheduleDef]] › [[ScheduleDef.Teil1]] › [[ScheduleDef.withEnabled]]

# ScheduleDef.withEnabled

`ScheduleDef.withEnabled(boolean value)` [src/main/java/de/aichele/childlauncher/ScheduleDef.java:85–87](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/ScheduleDef.java#L85-L87)

```mermaid
flowchart TD
  n1["ScheduleDef.ScheduleDef"]:::internal-link
  n2["return Z.86 return new ScheduleDef(id, name, value,…"]
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
ScheduleDef.ScheduleDef
  Der [[Glossar#Zeitplan|Zeitplan]] plant hier einen Schritt. Eine Ebene tiefer steht er genauer. Plant `ScheduleDef`. Ruft `validateInterval`.
return Z.86 return new ScheduleDef(id, name, value,…
  Zeile 86: Rückgabe `return new ScheduleDef(id, name, value,…`.
```

> [!knoten]- Was die Blöcke tun
> - **ScheduleDef.ScheduleDef**: Der [[Glossar#Zeitplan|Zeitplan]] plant hier einen Schritt. Eine Ebene tiefer steht er genauer. Plant `ScheduleDef`. Ruft `validateInterval`.
> - **return Z.86 return new ScheduleDef(id, name, value,…**: Zeile 86: Rückgabe `return new ScheduleDef(id, name, value,…`.

- Der [[Glossar#Zeitplan|Zeitplan]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer.
- `withEnabled` in `src/main/java/de/aichele/childlauncher/ScheduleDef.java`
