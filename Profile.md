[[00 Start]] › [[Server-Anlage]] › [[Profile]]

# Profile

```mermaid
flowchart TD
  n1["ServerProfile"]:::internal-link
  n2["Profiles"]:::internal-link
  n3["ProfileMerge"]:::internal-link
  n1 -->|"Quelltext"| n2
  n2 -->|"Quelltext"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
ServerProfile
  Baut ein Profil. type fällt im Code auf fabric zurück, config.yml liefert vanilla.
Profiles
  Lädt servers.*, Fokus und Port-Kollision. Der Kern benutzt davon den ersten Eintrag.
ProfileMerge
  Mischt Properties aus Config und Datei.
```


