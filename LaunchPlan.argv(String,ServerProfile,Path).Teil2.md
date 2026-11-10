[[00 Start]] › [[Server-Anlage]] › [[Startplan]] › [[LaunchPlan]] › [[LaunchPlan.argv(String,ServerProfile,Path)]] › [[LaunchPlan.argv(String,ServerProfile,Path).Teil2]]

# LaunchPlan.argv(String,ServerProfile,Path).Teil2

```mermaid
flowchart TD
  n1["if Z.48 (profile.serverArgs != null)"]
  n2["return Z.49 return List.copyOf(cmd);"]
  n1 --> n2
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.48 (profile.serverArgs != null)
  Zeile 48: prüft `(profile.serverArgs != null)`.
return Z.49 return List.copyOf(cmd);
  Zeile 49: Rückgabe `return List.copyOf(cmd);`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.48 (profile.serverArgs != null)**: Zeile 48: prüft `(profile.serverArgs != null)`.
> - **return Z.49 return List.copyOf(cmd);**: Zeile 49: Rückgabe `return List.copyOf(cmd);`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `LaunchPlan.argv(String,ServerProfile,Path)`.
