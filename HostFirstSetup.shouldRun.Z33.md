[[00 Start]] › [[Host-Betrieb]] › [[Host-Ersteinrichtung]] › [[HostFirstSetup]] › [[HostFirstSetup.Teil1]] › [[HostFirstSetup.shouldRun]] › [[HostFirstSetup.shouldRun.Z33]]

# HostFirstSetup.shouldRun.Z33

```mermaid
flowchart TD
  n1["if Z.33 (Files.isRegularFile(marker, LinkOption.NOFOLLOW_…"]
  n2["HostMinimize.readState"]:::internal-link
  n3["if Z.35 ('pending'.equals(status) // 'preparing'.equals(s…"]
  n4["return Z.35 return true;"]
  n5["if Z.36 ('done'.equals(status) // 'restart-required'.equa…"]
  n6["return Z.36 return false;"]
  n7["throw Z.37 throw new IOException('host setup marker has an u…"]
  n3 -->|"ja"| n4
  n2 --> n3
  n5 -->|"ja"| n6
  n4 --> n5
  n3 --> n5
  n6 --> n7
  n5 --> n7
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.33 (Files.isRegularFile(marker, LinkOption.NOFOLLOW_…
  Zeile 33: prüft `(Files.isRegularFile(marker, LinkOption.NOFOLLOW_…`.
HostMinimize.readState
  Liest `readState`.
if Z.35 ('pending'.equals(status) // 'preparing'.equals(s…
  Zeile 35: prüft `('pending'.equals(status) // 'preparing'.equals(s…`.
return Z.35 return true;
  Zeile 35: Rückgabe `return true;`.
if Z.36 ('done'.equals(status) // 'restart-required'.equa…
  Zeile 36: prüft `('done'.equals(status) // 'restart-required'.equa…`.
return Z.36 return false;
  Zeile 36: Rückgabe `return false;`.
throw Z.37 throw new IOException('host setup marker has an u…
  Zeile 37: Abbruch `throw new IOException('host setup marker has an u…`.
```

- Fortsetzung von `HostFirstSetup.shouldRun`, Quellreihenfolge.
