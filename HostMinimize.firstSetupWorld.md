[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[HostMinimize]] › [[HostMinimize.Teil2]] › [[HostMinimize.firstSetupWorld]]

# HostMinimize.firstSetupWorld

`HostMinimize.firstSetupWorld(String existing, String level, String setupStatus, String setupWorld, boolean loaded)` [src/main/java/de/aichele/childlauncher/HostMinimize.java:96–100](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/HostMinimize.java#L96-L100)

```mermaid
flowchart TD
  n1["if Z.97 ('done'.equals(setupStatus) && lobbyNameSafe(setu…"]
  n2["HostMinimize.lobbyNameSafe"]:::internal-link
  n3["return Z.98 return setupWorld;"]
  n4["return Z.99 return existing;"]
  n1 -->|"Z.97"| n2
  n2 -->|"ja"| n3
  n3 --> n4
  n2 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.97 ('done'.equals(setupStatus) && lobbyNameSafe(setu…
  Zeile 97: prüft `('done'.equals(setupStatus) && lobbyNameSafe(setu…`.
HostMinimize.lobbyNameSafe
  Das Verkleinern des [[Glossar#Host|Host]] kümmert sich um den Namen die erlaubte Grenze. `lobbyNameSafe` in `HostMinimize.java`.
return Z.98 return setupWorld;
  Zeile 98: Rückgabe `return setupWorld;`.
return Z.99 return existing;
  Zeile 99: Rückgabe `return existing;`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.97 ('done'.equals(setupStatus) && lobbyNameSafe(setu…**: Zeile 97: prüft `('done'.equals(setupStatus) && lobbyNameSafe(setu…`.
> - **HostMinimize.lobbyNameSafe**: Das Verkleinern des [[Glossar#Host|Host]] kümmert sich um den Namen die erlaubte Grenze. `lobbyNameSafe` in `HostMinimize.java`.
> - **return Z.98 return setupWorld;**: Zeile 98: Rückgabe `return setupWorld;`.
> - **return Z.99 return existing;**: Zeile 99: Rückgabe `return existing;`.

- Das Verkleinern des [[Glossar#Host|Host]] kümmert sich um die [[Glossar#Einrichtung|Einrichtung]] die [[Glossar#Spielwelt|Spielwelt]].
- `firstSetupWorld` in `src/main/java/de/aichele/childlauncher/HostMinimize.java`
