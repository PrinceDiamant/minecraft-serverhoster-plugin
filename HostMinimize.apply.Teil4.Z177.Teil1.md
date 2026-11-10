[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[HostMinimize]] › [[HostMinimize.Teil2]] › [[HostMinimize.apply]] › [[HostMinimize.apply.Teil4.Z177.Teil1]]

# HostMinimize.apply.Teil4.Z177.Teil1

```mermaid
flowchart TD
  n1["PropertiesFile.update"]:::internal-link
  n2["HostMinimize.outerProperties"]:::internal-link
  n3["if Z.179 (files.stream().anyMatch(file -) file.getFileName…"]
  n4["HostMinimize.updateYaml"]:::internal-link
  n5["HostMinimize.bukkitChanges"]:::internal-link
  n6["if Z.181 (files.stream().anyMatch(file -) file.getFileName…"]
  n7["HostMinimize.updateYaml"]:::internal-link
  n8["HostMinimize.spigotChanges"]:::internal-link
  n1 -->|"Z.178"| n2
  n4 -->|"Z.180"| n5
  n3 -->|"ja"| n4
  n2 --> n3
  n7 -->|"Z.182"| n8
  n6 -->|"ja"| n7
  n5 --> n6
  n3 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
PropertiesFile.update
  Aktualisiert `update`.
HostMinimize.outerProperties
  `outerProperties` in `HostMinimize.java`.
if Z.179 (files.stream().anyMatch(file -) file.getFileName…
  Zeile 179: prüft `(files.stream().anyMatch(file -) file.getFileName…`.
HostMinimize.updateYaml
  Aktualisiert `updateYaml`. Ruft `assertNotSymlink`.
HostMinimize.bukkitChanges
  `bukkitChanges` in `HostMinimize.java`.
if Z.181 (files.stream().anyMatch(file -) file.getFileName…
  Zeile 181: prüft `(files.stream().anyMatch(file -) file.getFileName…`.
HostMinimize.spigotChanges
  `spigotChanges` in `HostMinimize.java`.
```

- Fortsetzung von `HostMinimize.apply.Teil4.Z177`, Quellreihenfolge.
