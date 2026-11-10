[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Probe]] › [[FabricLauncherPlugin.addProcessDiagnostics]] › [[FabricLauncherPlugin.addProcessDiagnostics.Teil2]]

# FabricLauncherPlugin.addProcessDiagnostics.Teil2

```mermaid
flowchart TD
  n1["for Z.1254 (String command : ProcessProbe.JCMD)"]
  n2["Schritt Z.1255 String key = name + ' jcmd ' + command;"]
  n3["try Z.1256"]
  n4["ProcessProbe.jcmd(long,String,long)"]:::internal-link
  n5["catch Z.1258 (IOException / IllegalArgumen…"]
  n6["if Z.1262 (profile != null && profile.jvmFlags != null && !…"]
  n3 --> n4
  n3 -->|"Fehler"| n5
  n2 --> n3
  n1 -->|"wiederholen"| n2
  n4 --> n6
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.addProcessDiagnostics`, Quellreihenfolge.
