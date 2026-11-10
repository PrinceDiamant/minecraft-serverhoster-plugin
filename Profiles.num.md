[[00 Start]] › [[Server-Anlage]] › [[Profile]] › [[Profiles]] › [[Profiles.num]]

# Profiles.num

`Profiles.num(Map<String, Object> flat, String key, int fallback)` [src/main/java/de/aichele/childlauncher/ServerProfile.java:141–146](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/ServerProfile.java#L141-L146)

```mermaid
flowchart TD
  n1["if Z.143 (v instanceof Number n)"]
  n2["return Z.143 return n.intValue();"]
  n3["if Z.144 (v == null)"]
  n4["return Z.144 return fallback;"]
  n5["try Z.145"]
  n6["return Z.145 return Integer.parseInt(String.valueOf(v).trim());"]
  n7["catch Z.145 (NumberFormatException e)"]
  n8["return Z.145 return fallback;"]
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n5 --> n6
  n5 -->|"Fehler"| n7
  n7 --> n8
  n4 --> n5
  n3 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `num` in `src/main/java/de/aichele/childlauncher/ServerProfile.java`
