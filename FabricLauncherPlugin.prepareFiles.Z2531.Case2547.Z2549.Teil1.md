[[00 Start]] › [[Plugin-Kern]] › [[Properties]] › [[FabricLauncherPlugin.prepareFiles]] › [[FabricLauncherPlugin.prepareFiles.Z2531.Case2547.Z2549.Teil1]]

# FabricLauncherPlugin.prepareFiles.Z2531.Case2547.Z2549.Teil1

```mermaid
flowchart TD
  n1["Upstream.getJson"]:::internal-link
  n2["if Z.2551 (builds.isEmpty())"]
  n3["throw Z.2551 throw new IOException('No Paper builds for ' + mc…"]
  n4["for Z.2553 (JsonElement e : builds)"]
  n5["if Z.2553 ('STABLE'.equalsIgnoreCase(str(b, 'channel')))"]
  n6["FabricLauncherPlugin.str"]:::internal-link
  n2 -->|"ja"| n3
  n1 --> n2
  n5 -->|"Z.2553"| n6
  n4 -->|"wiederholen"| n5
  n3 --> n4
  n2 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Upstream.getJson
  Liefert `getJson`.
if Z.2551 (builds.isEmpty())
  Zeile 2551: prüft `(builds.isEmpty())`.
throw Z.2551 throw new IOException('No Paper builds for ' + mc…
  Zeile 2551: Abbruch `throw new IOException('No Paper builds for ' + mc…`.
for Z.2553 (JsonElement e : builds)
  Zeile 2553: Schleife `(JsonElement e : builds)`.
if Z.2553 ('STABLE'.equalsIgnoreCase(str(b, 'channel')))
  Zeile 2553: prüft `('STABLE'.equalsIgnoreCase(str(b, 'channel')))`.
FabricLauncherPlugin.str
  `str` in `FabricLauncherPlugin.java`.
```

- Fortsetzung von `FabricLauncherPlugin.prepareFiles.Z2531.Case2547.Z2549`, Quellreihenfolge.
