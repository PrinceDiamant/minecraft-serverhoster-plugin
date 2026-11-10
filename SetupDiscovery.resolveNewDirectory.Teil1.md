[[00 Start]] › [[Server-Anlage]] › [[Setup-Suche]] › [[SetupDiscovery]] › [[SetupDiscovery.resolveNewDirectory]] › [[SetupDiscovery.resolveNewDirectory.Teil1]]

# SetupDiscovery.resolveNewDirectory.Teil1

```mermaid
flowchart TD
  n1["if Z.102 (value == null // value.isBlank())"]
  n2["throw Z.102 throw new IllegalArgumentException('Serverordner …"]
  n3["if Z.105 (requested.isAbsolute())"]
  n4["throw Z.105 throw new IllegalArgumentException('Neue Serveror…"]
  n5["if Z.107 (!resolved.startsWith(root) // resolved.equals(ro…"]
  n6["throw Z.108 throw new IllegalArgumentException('Serverordner …"]
  n7["if Z.110 (SKIP.contains(relative.getName(0).toString().toL…"]
  n8["throw Z.111 throw new IllegalArgumentException('Serverordner …"]
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n5 -->|"ja"| n6
  n4 --> n5
  n3 --> n5
  n7 -->|"ja"| n8
  n6 --> n7
  n5 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.102 (value == null // value.isBlank())
  Zeile 102: prüft `(value == null // value.isBlank())`.
throw Z.102 throw new IllegalArgumentException('Serverordner …
  Zeile 102: Abbruch `throw new IllegalArgumentException('Serverordner …`.
if Z.105 (requested.isAbsolute())
  Zeile 105: prüft `(requested.isAbsolute())`.
throw Z.105 throw new IllegalArgumentException('Neue Serveror…
  Zeile 105: Abbruch `throw new IllegalArgumentException('Neue Serveror…`.
if Z.107 (!resolved.startsWith(root) // resolved.equals(ro…
  Zeile 107: prüft `(!resolved.startsWith(root) // resolved.equals(ro…`.
throw Z.108 throw new IllegalArgumentException('Serverordner …
  Zeile 108: Abbruch `throw new IllegalArgumentException('Serverordner …`.
if Z.110 (SKIP.contains(relative.getName(0).toString().toL…
  Zeile 110: prüft `(SKIP.contains(relative.getName(0).toString().toL…`.
throw Z.111 throw new IllegalArgumentException('Serverordner …
  Zeile 111: Abbruch `throw new IllegalArgumentException('Serverordner …`.
```

- Fortsetzung von `SetupDiscovery.resolveNewDirectory`, Quellreihenfolge.
