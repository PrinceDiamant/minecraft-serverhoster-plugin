[[00 Start]] › [[Plugin-Kern]] › [[Properties]] › [[FabricLauncherPlugin.prepareFiles]] › [[FabricLauncherPlugin.prepareFiles.Z2531.Case2561.Z2563.Teil1]]

# FabricLauncherPlugin.prepareFiles.Z2531.Case2561.Z2563.Teil1

```mermaid
flowchart TD
  n1["Upstream.getJson"]:::internal-link
  n2["for Z.2566 (JsonElement e : man.getAsJsonArray('ve…"]
  n3["if Z.2566 (mc.equals(str(e.getAsJsonObject(), 'id')))"]
  n4["FabricLauncherPlugin.str"]:::internal-link
  n5["FabricLauncherPlugin.str"]:::internal-link
  n6["if Z.2567 (url == null)"]
  n7["throw Z.2567 throw new IOException('Version ' + mc + ' not in …"]
  n8["Upstream.getJson"]:::internal-link
  n3 -->|"Z.2566"| n4
  n4 -->|"ja"| n5
  n2 -->|"wiederholen"| n3
  n1 --> n2
  n6 -->|"ja"| n7
  n5 --> n6
  n4 --> n6
  n7 --> n8
  n6 --> n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.prepareFiles.Z2531.Case2561.Z2563`, Quellreihenfolge.
