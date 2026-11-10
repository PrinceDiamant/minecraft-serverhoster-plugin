[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Probe]] › [[FabricLauncherPlugin.addProcessDiagnostics]] › [[FabricLauncherPlugin.addProcessDiagnostics.Teil1]]

# FabricLauncherPlugin.addProcessDiagnostics.Teil1

```mermaid
flowchart TD
  n1["if Z.1245 (pid (= 0)"]
  n2["return Z.1247 return;"]
  n3["ProcessProbe.snapshot"]:::internal-link
  n4["for Z.1251 (String key : List.of('rssMb', 'hwmMb',…"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.1245 (pid (= 0)
  Zeile 1245: prüft `(pid (= 0)`.
return Z.1247 return;
  Zeile 1247: Rückgabe `return;`.
ProcessProbe.snapshot
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `snapshot` in `ProcessProbe.java`. Ruft `kb`.
for Z.1251 (String key : List.of('rssMb', 'hwmMb',…
  Zeile 1251: Schleife `(String key : List.of('rssMb', 'hwmMb',…`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.1245 (pid (= 0)**: Zeile 1245: prüft `(pid (= 0)`.
> - **return Z.1247 return;**: Zeile 1247: Rückgabe `return;`.
> - **ProcessProbe.snapshot**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `snapshot` in `ProcessProbe.java`. Ruft `kb`.
> - **for Z.1251 (String key : List.of('rssMb', 'hwmMb',…**: Zeile 1251: Schleife `(String key : List.of('rssMb', 'hwmMb',…`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `FabricLauncherPlugin.addProcessDiagnostics`.
