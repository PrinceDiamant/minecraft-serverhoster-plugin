[[00 Start]] › [[Server-Anlage]] › [[Startplan]] › [[LaunchPlan]] › [[LaunchPlan.argv(String,ServerProfile,Path)]] › [[LaunchPlan.argv(String,ServerProfile,Path).Teil1]]

# LaunchPlan.argv(String,ServerProfile,Path).Teil1

```mermaid
flowchart TD
  n1["if Z.40 (profile.jvmFlags != null)"]
  n2["for Z.41 (String fl : profile.jvmFlags)"]
  n3["if Z.42 (fl != null && !fl.contains('G1RSetUpdatingPauseI…"]
  n2 -->|"wiederholen"| n3
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.40 (profile.jvmFlags != null)
  Zeile 40: prüft `(profile.jvmFlags != null)`.
for Z.41 (String fl : profile.jvmFlags)
  Zeile 41: Schleife `(String fl : profile.jvmFlags)`.
if Z.42 (fl != null && !fl.contains('G1RSetUpdatingPauseI…
  Zeile 42: prüft `(fl != null && !fl.contains('G1RSetUpdatingPauseI…`.
```

- Fortsetzung von `LaunchPlan.argv(String,ServerProfile,Path)`, Quellreihenfolge.
