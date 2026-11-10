[[00 Start]] › [[Host-Betrieb]] › [[Host-Ersteinrichtung]] › [[HostFirstSetup]] › [[HostFirstSetup.Teil3]] › [[HostFirstSetup.otherPluginJars]]

# HostFirstSetup.otherPluginJars

`HostFirstSetup.otherPluginJars(Path root, Path runningPluginJar)` [src/main/java/de/aichele/childlauncher/HostFirstSetup.java:269–297](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/HostFirstSetup.java#L269-L297)

```mermaid
flowchart TD
  n1["if Z.271 (Files.isSymbolicLink(plugins) // !Files.isDirect…"]
  n2["throw Z.272 throw new IOException('plugins must be a regular …"]
  n3["if Z.273 (runningPluginJar == null // Files.isSymbolicLink…"]
  n4["throw Z.275 throw new IOException('Could not identify the run…"]
  n5["if Z.279 (!running.getParent().equals(realPlugins))"]
  n6["throw Z.280 throw new SecurityException('the running ServerHo…"]
  n7["HostFirstSetup.otherPluginJars.Z282"]:::internal-link
  n8["return Z.296 return List.copyOf(result);"]
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n5 -->|"ja"| n6
  n4 --> n5
  n3 --> n5
  n6 --> n7
  n5 --> n7
  n7 --> n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.271 (Files.isSymbolicLink(plugins) // !Files.isDirect…
  Zeile 271: prüft `(Files.isSymbolicLink(plugins) // !Files.isDirect…`.
throw Z.272 throw new IOException('plugins must be a regular …
  Zeile 272: Abbruch `throw new IOException('plugins must be a regular …`.
if Z.273 (runningPluginJar == null // Files.isSymbolicLink…
  Zeile 273: prüft `(runningPluginJar == null // Files.isSymbolicLink…`.
throw Z.275 throw new IOException('Could not identify the run…
  Zeile 275: Abbruch `throw new IOException('Could not identify the run…`.
if Z.279 (!running.getParent().equals(realPlugins))
  Zeile 279: prüft `(!running.getParent().equals(realPlugins))`.
throw Z.280 throw new SecurityException('the running ServerHo…
  Zeile 280: Abbruch `throw new SecurityException('the running ServerHo…`.
HostFirstSetup.otherPluginJars.Z282
  Fortsetzung des Ablaufs ab Zeile 282.
return Z.296 return List.copyOf(result);
  Zeile 296: Rückgabe `return List.copyOf(result);`.
```

- `otherPluginJars` in `src/main/java/de/aichele/childlauncher/HostFirstSetup.java`
