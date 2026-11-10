[[00 Start]] › [[Server-Anlage]] › [[Profile]] › [[Profiles]] › [[Profiles.one]] › [[Profiles.one.Teil3]]

# Profiles.one.Teil3

```mermaid
flowchart TD
  n1["if Z.115 (rootDefaults)"]
  n2["if Z.116 (flags == null)"]
  n3["if Z.117 (args == null)"]
  n4["Profiles.bool"]:::internal-link
  n5["ServerProfile.ServerProfile"]:::internal-link
  n6["Profiles.props"]:::internal-link
  n7["return Z.120 return new ServerProfile(id, type, mc, …"]
  n2 --> n3
  n2 --> n3
  n1 -->|"ja"| n2
  n3 --> n4
  n3 --> n4
  n1 --> n4
  n5 -->|"Z.121"| n6
  n6 --> n7
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.115 (rootDefaults)
  Zeile 115: prüft `(rootDefaults)`.
if Z.116 (flags == null)
  Zeile 116: prüft `(flags == null)`.
if Z.117 (args == null)
  Zeile 117: prüft `(args == null)`.
Profiles.bool
  `bool` in `ServerProfile.java`.
ServerProfile.ServerProfile
  `ServerProfile` in `ServerProfile.java`.
Profiles.props
  `props` in `ServerProfile.java`.
return Z.120 return new ServerProfile(id, type, mc, …
  Zeile 120: Rückgabe `return new ServerProfile(id, type, mc, …`.
```

- Fortsetzung von `Profiles.one`, Quellreihenfolge.
