[[00 Start]] › [[Server-Anlage]] › [[Versionen]] › [[Upstream]] › [[Upstream.download(String,Path,String,String)]]

# Upstream.download(String,Path,String,String)

`Upstream.download(String url, Path target, String algo, String expectedHex)` [src/main/java/de/aichele/childlauncher/Upstream.java:45–53](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/Upstream.java#L45-L53)

```mermaid
flowchart TD
  n1["if Z.49 (r.statusCode() / 100 != 2)"]
  n2["Schritt Z.49 Files.deleteIfExists(tmp);"]
  n3["throw Z.49 throw new IOException('HTTP ' + r.statusCode() + …"]
  n4["try Z.50"]
  n5["Upstream.checkHash"]:::internal-link
  n6["catch Z.51 (IOException e)"]
  n7["Schritt Z.51 Files.deleteIfExists(tmp);"]
  n8["throw Z.51 throw e;"]
  n9["Schritt Z.52 Files.move(tmp, target, StandardCopyOption.REPLAC…"]
  n2 --> n3
  n1 -->|"ja"| n2
  n4 --> n5
  n4 -->|"Fehler"| n6
  n7 --> n8
  n6 --> n7
  n3 --> n4
  n1 --> n4
  n5 --> n9
  n8 --> n9
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `download` in `src/main/java/de/aichele/childlauncher/Upstream.java`
