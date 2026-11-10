[[00 Start]] › [[Server-Anlage]] › [[Startplan]]

# Startplan

```mermaid
flowchart TD
  n1["SpigotBuilder"]:::internal-link
  n2["PathGuard"]:::internal-link
  n3["PropertiesFile"]:::internal-link
  n4["JarProbe"]:::internal-link
  n5["LaunchPlan"]:::internal-link
  n1 -->|"Quelltext"| n2
  n2 -->|"Quelltext"| n3
  n3 -->|"Quelltext"| n4
  n4 -->|"Quelltext"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
SpigotBuilder
  Lädt oder baut das Spigot-Jar.
PathGuard
  Prüft, dass ein Pfad unter der erlaubten Wurzel bleibt.
PropertiesFile
  Liest und schreibt eine Properties-Datei.
JarProbe
  Liest Metadaten aus dem Server-Jar.
LaunchPlan
  Baut Argumente und Dateien für den Prozessstart.
```


