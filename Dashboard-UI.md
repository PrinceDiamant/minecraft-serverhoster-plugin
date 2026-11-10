[[00 Start]] › [[Dashboard-UI]]

# Dashboard-UI

```mermaid
flowchart TD
  n1["UI-Start"]:::internal-link
  n2["UI-App"]:::internal-link
  n3["UI-Client"]:::internal-link
  n4["Legacy-Sitzung"]:::internal-link
  n5["Legacy-Status"]:::internal-link
  n6["Legacy-Konsole"]:::internal-link
  n7["Legacy-Altlast"]:::internal-link
  n8["Legacy-Dateien"]:::internal-link
  n9["Legacy-Logs"]:::internal-link
  n10["Legacy-Diag"]:::internal-link
  n11["UI-Workflows"]:::internal-link
  n1 -->|"Quelltext"| n2
  n2 -->|"Quelltext"| n3
  n3 -->|"Quelltext"| n4
  n4 -->|"Quelltext"| n5
  n5 -->|"Quelltext"| n6
  n6 -->|"Quelltext"| n7
  n7 -->|"Quelltext"| n8
  n8 -->|"Quelltext"| n9
  n9 -->|"Quelltext"| n10
  n10 -->|"Quelltext"| n11
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- React-Hülle um `src/main/resources/web/index.html`.
- Befund: doppelte Oberfläche.
- Befund: doppelte Implementierung (sicher)
