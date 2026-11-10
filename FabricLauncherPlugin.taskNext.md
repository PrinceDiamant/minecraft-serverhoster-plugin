[[00 Start]] › [[Zeitplaene]] › [[Tasks]] › [[FabricLauncherPlugin.taskNext]]

# FabricLauncherPlugin.taskNext

`FabricLauncherPlugin.taskNext(TaskDef task)` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:1347–1353](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L1347-L1353)

```mermaid
flowchart TD
  n1["if Z.1348 (task.cron == null // task.cron.isBlank())"]
  n2["return Z.1348 return '';"]
  n3["try Z.1349"]
  n4["CronExpr.next"]:::internal-link
  n5["return Z.1351 return z == null ? '' : z.toString();"]
  n6["catch Z.1352 (RuntimeException e)"]
  n7["return Z.1352 return '';"]
  n1 -->|"ja"| n2
  n4 --> n5
  n3 --> n4
  n3 -->|"Fehler"| n6
  n6 --> n7
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.1348 (task.cron == null // task.cron.isBlank())
  Zeile 1348: prüft `(task.cron == null // task.cron.isBlank())`.
return Z.1348 return '';
  Zeile 1348: Rückgabe `return '';`.
try Z.1349
  Zeile 1349: Versuch. Der Fehlerpfad geht in catch.
CronExpr.next
  Geht zum nächsten Schritt `next`. Ruft `matches`, `field`.
return Z.1351 return z == null ? '' : z.toString();
  Zeile 1351: Rückgabe `return z == null ? '' : z.toString();`.
catch Z.1352 (RuntimeException e)
  Zeile 1352: fängt (RuntimeException e).
return Z.1352 return '';
  Zeile 1352: Rückgabe `return '';`.
```

- `taskNext` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
