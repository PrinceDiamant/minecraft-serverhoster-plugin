[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Klassen]] › [[DashboardPassword]] › [[DashboardPassword.read]]

# DashboardPassword.read

`DashboardPassword.read(Path file, boolean setupRequired)` [src/main/java/de/aichele/childlauncher/DashboardPassword.java:14–24](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/DashboardPassword.java#L14-L24)

```mermaid
flowchart TD
  n1["if Z.15 (Files.isSymbolicLink(file))"]
  n2["throw Z.15 throw new IOException('Dashboard password file mu…"]
  n3["if Z.16 (!Files.exists(file, LinkOption.NOFOLLOW_LINKS))"]
  n4["if Z.17 (!setupRequired)"]
  n5["throw Z.17 throw new IOException('Dashboard password is miss…"]
  n6["return Z.18 return null;"]
  n7["if Z.20 (!Files.isRegularFile(file, LinkOption.NOFOLLOW_L…"]
  n8["throw Z.20 throw new IOException('Dashboard password must be…"]
  n9["Schritt Z.21 String password = Files.readString(file, Standard…"]
  n10["if Z.22 (password.isEmpty())"]
  n11["throw Z.22 throw new IOException('Dashboard password file is…"]
  n12["return Z.23 return password;"]
  n1 -->|"ja"| n2
  n4 -->|"ja"| n5
  n5 --> n6
  n4 --> n6
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n7 -->|"ja"| n8
  n6 --> n7
  n3 --> n7
  n8 --> n9
  n7 --> n9
  n10 -->|"ja"| n11
  n9 --> n10
  n11 --> n12
  n10 --> n12
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `read` in `src/main/java/de/aichele/childlauncher/DashboardPassword.java`
