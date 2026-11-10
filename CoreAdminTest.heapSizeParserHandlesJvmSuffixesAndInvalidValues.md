[[00 Start]] › [[Tests]] › [[CoreAdminTest]] › [[CoreAdminTest.Teil2]] › [[CoreAdminTest.heapSizeParserHandlesJvmSuffixesAndInvalidValues]]

# CoreAdminTest.heapSizeParserHandlesJvmSuffixesAndInvalidValues

`CoreAdminTest.heapSizeParserHandlesJvmSuffixesAndInvalidValues()` [src/test/java/de/aichele/childlauncher/CoreAdminTest.java:142–148](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/test/java/de/aichele/childlauncher/CoreAdminTest.java#L142-L148)

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.parseMemoryBytes"]:::internal-link
  n2["FabricLauncherPlugin.parseMemoryBytes"]:::internal-link
  n3["FabricLauncherPlugin.parseMemoryBytes"]:::internal-link
  n4["FabricLauncherPlugin.parseMemoryBytes"]:::internal-link
  n5["FabricLauncherPlugin.parseMemoryBytes"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.parseMemoryBytes
  Das [[Glossar#Plugin|Plugin]] liest den [[Glossar#Arbeitsspeicher|Arbeitsspeicher]] die Größe. Wertet aus `parseMemoryBytes`.
```

> [!knoten]- Was die Blöcke tun
> - **FabricLauncherPlugin.parseMemoryBytes**: Das [[Glossar#Plugin|Plugin]] liest den [[Glossar#Arbeitsspeicher|Arbeitsspeicher]] die Größe. Wertet aus `parseMemoryBytes`.

- Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server.
- `heapSizeParserHandlesJvmSuffixesAndInvalidValues` in `src/test/java/de/aichele/childlauncher/CoreAdminTest.java`
- Das ist ein Probelauf, kein Teil des laufenden Servers.
