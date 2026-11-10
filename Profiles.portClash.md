[[00 Start]] › [[Server-Anlage]] › [[Profile]] › [[Profiles]] › [[Profiles.portClash]]

# Profiles.portClash

`Profiles.portClash(List<ServerProfile> profiles, int port)` [src/main/java/de/aichele/childlauncher/ServerProfile.java:79–83](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/ServerProfile.java#L79-L83)

```mermaid
flowchart TD
  n1["for Z.81 (ServerProfile p : profiles)"]
  n2["if Z.81 (p.port == port)"]
  n3["return Z.82 return n ) 1;"]
  n1 -->|"wiederholen"| n2
  n2 --> n3
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Wird vom Plugin-Kern nicht ausgewertet.
- Befund: angemeldet aber nicht umgesetzt, wahrscheinlich. ServerProfile.java:79, nur Tests rufen Profiles.portClash
