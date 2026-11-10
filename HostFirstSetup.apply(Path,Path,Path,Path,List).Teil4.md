[[00 Start]] › [[Host-Betrieb]] › [[Host-Ersteinrichtung]] › [[HostFirstSetup]] › [[HostFirstSetup.Teil1]] › [[HostFirstSetup.apply(Path,Path,Path,Path,List)]] › [[HostFirstSetup.apply(Path,Path,Path,Path,List).Teil4]]

# HostFirstSetup.apply(Path,Path,Path,Path,List).Teil4

```mermaid
flowchart TD
  n1["HostFirstSetup.apply(Path,Path,Path,Path,List).Teil4.Z94"]:::internal-link
  n2["HostFirstSetup.encodeWorldNames"]:::internal-link
  n3["HostFirstSetup.writeMarker(Path,String,String,int,String)"]:::internal-link
  n4["for Z.104 (PluginJar pluginJar : pluginJars)"]
  n5["HostFirstSetup.movePluginJar"]:::internal-link
  n6["HostFirstSetup.writeMarker(Path,String,String,int,String)"]:::internal-link
  n1 --> n2
  n2 --> n3
  n5 --> n6
  n4 -->|"wiederholen"| n5
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
HostFirstSetup.apply(Path,Path,Path,Path,List).Teil4.Z94
  Fortsetzung des Ablaufs ab Zeile 94.
HostFirstSetup.encodeWorldNames
  Kodiert `encodeWorldNames`.
HostFirstSetup.writeMarker(Path,String,String,int,String)
  Schreibt `writeMarker`.
for Z.104 (PluginJar pluginJar : pluginJars)
  Zeile 104: Schleife `(PluginJar pluginJar : pluginJars)`.
HostFirstSetup.movePluginJar
  Verschiebt `movePluginJar`.
```

- Fortsetzung von `HostFirstSetup.apply(Path,Path,Path,Path,List)`, Quellreihenfolge.
