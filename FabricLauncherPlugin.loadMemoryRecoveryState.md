[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Stopp]] › [[FabricLauncherPlugin.loadMemoryRecoveryState]]

# FabricLauncherPlugin.loadMemoryRecoveryState

`FabricLauncherPlugin.loadMemoryRecoveryState()` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:974–984](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L974-L984)

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.memoryRecoveryFile"]:::internal-link
  n2["if Z.976 (!Files.exists(state))"]
  n3["return Z.976 return;"]
  n4["try Z.977"]
  n5["Schritt Z.978 recoveryBlockedSince = Long.parseLong(Files.readS…"]
  n6["if Z.979 (recoveryBlockedSince (= 0)"]
  n7["throw Z.979 throw new NumberFormatException('timestamp must b…"]
  n8["catch Z.980 (IOException / NumberFormatEx…"]
  n2 -->|"ja"| n3
  n1 --> n2
  n6 -->|"ja"| n7
  n5 --> n6
  n4 --> n5
  n4 -->|"Fehler"| n8
  n3 --> n4
  n2 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.memoryRecoveryFile
  Betrifft den Speicher `memoryRecoveryFile`.
if Z.976 (!Files.exists(state))
  Zeile 976: prüft `(!Files.exists(state))`.
return Z.976 return;
  Zeile 976: Rückgabe `return;`.
try Z.977
  Zeile 977: Versuch. Der Fehlerpfad geht in catch.
Schritt Z.978 recoveryBlockedSince = Long.parseLong(Files.readS…
  Zeile 978: Dateioperation. `recoveryBlockedSince = Long.parseLong(Files.readS…`
if Z.979 (recoveryBlockedSince (= 0)
  Zeile 979: prüft `(recoveryBlockedSince (= 0)`.
throw Z.979 throw new NumberFormatException('timestamp must b…
  Zeile 979: Abbruch `throw new NumberFormatException('timestamp must b…`.
catch Z.980 (IOException / NumberFormatEx…
  Zeile 980: fängt (IOException / NumberFormatEx….
```

- `loadMemoryRecoveryState` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
