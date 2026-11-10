[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildLaunchCleanup]] › [[ChildLaunchCleanup.abandon]] › [[ChildLaunchCleanup.abandon.Teil2]]

# ChildLaunchCleanup.abandon.Teil2

```mermaid
flowchart TD
  n1["try Z.27"]
  n2["catch Z.29 (IOException e)"]
  n3["ChildLaunchCleanup.abandon.Teil2.Z34"]:::internal-link
  n1 -->|"Fehler"| n2
  n1 --> n3
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.27
  Zeile 27: Versuch. Der Fehlerpfad geht in catch.
catch Z.29 (IOException e)
  Zeile 29: fängt (IOException e).
ChildLaunchCleanup.abandon.Teil2.Z34
  Fortsetzung des Ablaufs ab Zeile 34.
```

- Fortsetzung von `ChildLaunchCleanup.abandon`, Quellreihenfolge.
