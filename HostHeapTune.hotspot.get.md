[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[HostHeapTune]] › [[HostHeapTune.hotspot]] › [[HostHeapTune.hotspot.get]]

# HostHeapTune.hotspot.get

`HostHeapTune.get(String name)` [src/main/java/de/aichele/childlauncher/HostHeapTune.java:69–76](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/HostHeapTune.java#L69-L76)

```mermaid
flowchart TD
  n1["try Z.70"]
  n2["return Z.72 return option == null ? '' : option.getValue();"]
  n3["catch Z.73 (RuntimeException e)"]
  n4["return Z.74 return '';"]
  n1 --> n2
  n1 -->|"Fehler"| n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.70
  Zeile 70: Versuch. Der Fehlerpfad geht in catch.
return Z.72 return option == null ? '' : option.getValue();
  Zeile 72: Rückgabe `return option == null ? '' : option.getValue();`.
catch Z.73 (RuntimeException e)
  Zeile 73: fängt (RuntimeException e).
return Z.74 return '';
  Zeile 74: Rückgabe `return '';`.
```

- `get` in `src/main/java/de/aichele/childlauncher/HostHeapTune.java`
