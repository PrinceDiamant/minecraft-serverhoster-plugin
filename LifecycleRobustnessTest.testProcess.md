[[00 Start]] › [[Tests]] › [[LifecycleRobustnessTest]] › [[LifecycleRobustnessTest.Teil2]] › [[LifecycleRobustnessTest.testProcess]]

# LifecycleRobustnessTest.testProcess

`LifecycleRobustnessTest.testProcess(String... args)` [src/test/java/de/aichele/childlauncher/LifecycleRobustnessTest.java:288–295](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/test/java/de/aichele/childlauncher/LifecycleRobustnessTest.java#L288-L295)

```mermaid
flowchart TD
  n1["return Z.294 return new ProcessBuilder(command).start();"]
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
return Z.294 return new ProcessBuilder(command).start();
  Zeile 294: Rückgabe `return new ProcessBuilder(command).start();`.
```

> [!knoten]- Was die Blöcke tun
> - **return Z.294 return new ProcessBuilder(command).start();**: Zeile 294: Rückgabe `return new ProcessBuilder(command).start();`.

- Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server.
- `testProcess` in `src/test/java/de/aichele/childlauncher/LifecycleRobustnessTest.java`
- Das ist ein Probelauf, kein Teil des laufenden Servers.
