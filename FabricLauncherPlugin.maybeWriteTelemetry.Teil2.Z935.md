[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Probe]] › [[FabricLauncherPlugin.maybeWriteTelemetry]] › [[FabricLauncherPlugin.maybeWriteTelemetry.Teil2.Z935]]

# FabricLauncherPlugin.maybeWriteTelemetry.Teil2.Z935

```mermaid
flowchart TD
  n1["try Z.935"]
  n2["MemoryTelemetry.line"]:::internal-link
  n3["MemoryTelemetry.appendRotated"]:::internal-link
  n4["catch Z.939 (IOException e)"]
  n5["FabricLauncherPlugin.warnOnce"]:::internal-link
  n2 --> n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.935
  Zeile 935: Versuch. Der Fehlerpfad geht in catch.
MemoryTelemetry.line
  `line` in `MemoryTelemetry.java`. Ruft `usedMiB`, `committedMiB`, `maxMiB`.
MemoryTelemetry.appendRotated
  Hängt an `appendRotated`.
catch Z.939 (IOException e)
  Zeile 939: fängt (IOException e).
FabricLauncherPlugin.warnOnce
  Warnt `warnOnce`.
```

- Fortsetzung von `FabricLauncherPlugin.maybeWriteTelemetry.Teil2`, Quellreihenfolge.
