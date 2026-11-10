[[00 Start]] › [[Server-Anlage]] › [[Versionen]] › [[Upstream]] › [[Upstream.getText]]

# Upstream.getText

`Upstream.getText(String url)` [src/main/java/de/aichele/childlauncher/Upstream.java:31–35](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/Upstream.java#L31-L35)

```mermaid
flowchart TD
  n1["if Z.33 (r.statusCode() / 100 != 2)"]
  n2["throw Z.33 throw new IOException('HTTP ' + r.statusCode() + …"]
  n3["return Z.34 return r.body();"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `getText` in `src/main/java/de/aichele/childlauncher/Upstream.java`
