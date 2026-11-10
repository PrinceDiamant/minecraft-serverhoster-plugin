[[00 Start]] › [[Server-Anlage]] › [[Setup-Suche]] › [[SetupDiscovery]] › [[SetupDiscovery.hasServerFiles]]

# SetupDiscovery.hasServerFiles

`SetupDiscovery.hasServerFiles(Path path)` [src/main/java/de/aichele/childlauncher/SetupDiscovery.java:180–189](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/SetupDiscovery.java#L180-L189)

```mermaid
flowchart TD
  n1["for Z.181 (String marker : List.of('server.proper…"]
  n2["if Z.182 (Files.isRegularFile(path.resolve(marker), LinkOp…"]
  n3["return Z.182 return true;"]
  n4["try Z.184"]
  n5["for Z.185 (Path entry : entries)"]
  n6["if Z.186 (!Files.isSymbolicLink(entry) && Files.isRegularF…"]
  n7["return Z.186 return true;"]
  n8["return Z.187 return false;"]
  n2 -->|"ja"| n3
  n1 -->|"wiederholen"| n2
  n6 -->|"ja"| n7
  n5 -->|"wiederholen"| n6
  n7 --> n8
  n6 --> n8
  n4 --> n5
  n3 --> n4
  n2 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
for Z.181 (String marker : List.of('server.proper…
  Zeile 181: Schleife `(String marker : List.of('server.proper…`.
if Z.182 (Files.isRegularFile(path.resolve(marker), LinkOp…
  Zeile 182: prüft `(Files.isRegularFile(path.resolve(marker), LinkOp…`.
return Z.182 return true;
  Zeile 182: Rückgabe `return true;`.
try Z.184
  Zeile 184: Versuch. Der Fehlerpfad geht in catch.
for Z.185 (Path entry : entries)
  Zeile 185: Schleife `(Path entry : entries)`.
if Z.186 (!Files.isSymbolicLink(entry) && Files.isRegularF…
  Zeile 186: prüft `(!Files.isSymbolicLink(entry) && Files.isRegularF…`.
return Z.186 return true;
  Zeile 186: Rückgabe `return true;`.
return Z.187 return false;
  Zeile 187: Rückgabe `return false;`.
```

> [!knoten]- Was die Blöcke tun
> - **for Z.181 (String marker : List.of('server.proper…**: Zeile 181: Schleife `(String marker : List.of('server.proper…`.
> - **if Z.182 (Files.isRegularFile(path.resolve(marker), LinkOp…**: Zeile 182: prüft `(Files.isRegularFile(path.resolve(marker), LinkOp…`.
> - **return Z.182 return true;**: Zeile 182: Rückgabe `return true;`.
> - **try Z.184**: Zeile 184: Versuch. Der Fehlerpfad geht in catch.
> - **for Z.185 (Path entry : entries)**: Zeile 185: Schleife `(Path entry : entries)`.
> - **if Z.186 (!Files.isSymbolicLink(entry) && Files.isRegularF…**: Zeile 186: prüft `(!Files.isSymbolicLink(entry) && Files.isRegularF…`.
> - **return Z.186 return true;**: Zeile 186: Rückgabe `return true;`.
> - **return Z.187 return false;**: Zeile 187: Rückgabe `return false;`.

- Dieser Teil prüft den Server die Dateien.
- `hasServerFiles` in `src/main/java/de/aichele/childlauncher/SetupDiscovery.java`
