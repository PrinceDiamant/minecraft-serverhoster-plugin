[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil5]] › [[HosterTest.tryCreateSymbolicLink]]

# HosterTest.tryCreateSymbolicLink

`HosterTest.tryCreateSymbolicLink(Path link, Path target)` [src/test/java/de/aichele/childlauncher/HosterTest.java:688–695](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/test/java/de/aichele/childlauncher/HosterTest.java#L688-L695)

```mermaid
flowchart TD
  n1["try Z.689"]
  n2["Schritt Z.690 Files.createSymbolicLink(link, target);"]
  n3["return Z.691 return true;"]
  n4["catch Z.692 (UnsupportedOperationExceptio…"]
  n5["return Z.693 return false;"]
  n2 --> n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `tryCreateSymbolicLink` in `src/test/java/de/aichele/childlauncher/HosterTest.java`
- Auslöser: Test
