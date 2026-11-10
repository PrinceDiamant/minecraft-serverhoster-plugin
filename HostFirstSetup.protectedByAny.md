[[00 Start]] › [[Host-Betrieb]] › [[Host-Ersteinrichtung]] › [[HostFirstSetup]] › [[HostFirstSetup.Teil2]] › [[HostFirstSetup.protectedByAny]]

# HostFirstSetup.protectedByAny

`HostFirstSetup.protectedByAny(Path path, List<Path> protectedPaths)` [src/main/java/de/aichele/childlauncher/HostFirstSetup.java:248–255](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/HostFirstSetup.java#L248-L255)

```mermaid
flowchart TD
  n1["for Z.249 (Path protectedPath : protectedPaths)"]
  n2["if Z.251 (protectedPath(path, absolute) // Files.exists(ab…"]
  n3["HostFirstSetup.protectedPath"]:::internal-link
  n4["HostFirstSetup.protectedPath"]:::internal-link
  n5["return Z.252 return true;"]
  n6["return Z.254 return false;"]
  n2 -->|"Z.251"| n3
  n3 -->|"Z.252"| n4
  n4 -->|"ja"| n5
  n1 -->|"wiederholen"| n2
  n5 --> n6
  n4 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
for Z.249 (Path protectedPath : protectedPaths)
  Zeile 249: Schleife `(Path protectedPath : protectedPaths)`.
if Z.251 (protectedPath(path, absolute) // Files.exists(ab…
  Zeile 251: prüft `(protectedPath(path, absolute) // Files.exists(ab…`.
HostFirstSetup.protectedPath
  `protectedPath` in `HostFirstSetup.java`.
return Z.252 return true;
  Zeile 252: Rückgabe `return true;`.
return Z.254 return false;
  Zeile 254: Rückgabe `return false;`.
```

- `protectedByAny` in `src/main/java/de/aichele/childlauncher/HostFirstSetup.java`
