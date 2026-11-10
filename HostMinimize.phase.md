[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[HostMinimize]] › [[HostMinimize.Teil1]] › [[HostMinimize.phase]]

# HostMinimize.phase

`HostMinimize.phase(String worldName, String levelName, boolean worldLoaded)` [src/main/java/de/aichele/childlauncher/HostMinimize.java:91–94](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/HostMinimize.java#L91-L94)

```mermaid
flowchart TD
  n1["if Z.92 (worldNameSafe(worldName) && worldName.equals(lev…"]
  n2["HostMinimize.worldNameSafe"]:::internal-link
  n3["return Z.92 return 'active';"]
  n4["return Z.93 return 'staged';"]
  n1 -->|"Z.92"| n2
  n2 -->|"ja"| n3
  n3 --> n4
  n2 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.92 (worldNameSafe(worldName) && worldName.equals(lev…
  Zeile 92: prüft `(worldNameSafe(worldName) && worldName.equals(lev…`.
HostMinimize.worldNameSafe
  Betrifft die Welt `worldNameSafe`.
return Z.92 return 'active';
  Zeile 92: Rückgabe `return 'active';`.
return Z.93 return 'staged';
  Zeile 93: Rückgabe `return 'staged';`.
```

- `phase` in `src/main/java/de/aichele/childlauncher/HostMinimize.java`
