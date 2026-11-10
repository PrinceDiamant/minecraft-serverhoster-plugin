[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Probe]] › [[FabricLauncherPlugin.maybeWriteTelemetry]] › [[FabricLauncherPlugin.maybeWriteTelemetry.Teil2]]

# FabricLauncherPlugin.maybeWriteTelemetry.Teil2

```mermaid
flowchart TD
  n1["if Z.928 (maxBytes ( 100_000)"]
  n2["FabricLauncherPlugin.warnOnce"]:::internal-link
  n3["if Z.933 (lastTelemetryWriteAt != 0 && now - lastTelemetry…"]
  n4["return Z.933 return;"]
  n5["FabricLauncherPlugin.maybeWriteTelemetry.Teil2.Z935"]:::internal-link
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n4 --> n5
  n3 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.928 (maxBytes ( 100_000)
  Zeile 928: prüft `(maxBytes ( 100_000)`.
FabricLauncherPlugin.warnOnce
  Schreibt eine Warnung nur ein einziges Mal, damit das Protokoll nicht vollläuft. Warnt `warnOnce`.
if Z.933 (lastTelemetryWriteAt != 0 && now - lastTelemetry…
  Zeile 933: prüft `(lastTelemetryWriteAt != 0 && now - lastTelemetry…`.
return Z.933 return;
  Zeile 933: Rückgabe `return;`.
FabricLauncherPlugin.maybeWriteTelemetry.Teil2.Z935
  Der Ablauf geht in [[Glossar#Zeile|Zeile]] 935 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 935.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.928 (maxBytes ( 100_000)**: Zeile 928: prüft `(maxBytes ( 100_000)`.
> - **FabricLauncherPlugin.warnOnce**: Schreibt eine Warnung nur ein einziges Mal, damit das Protokoll nicht vollläuft. Warnt `warnOnce`.
> - **if Z.933 (lastTelemetryWriteAt != 0 && now - lastTelemetry…**: Zeile 933: prüft `(lastTelemetryWriteAt != 0 && now - lastTelemetry…`.
> - **return Z.933 return;**: Zeile 933: Rückgabe `return;`.
> - **FabricLauncherPlugin.maybeWriteTelemetry.Teil2.Z935**: Der Ablauf geht in [[Glossar#Zeile|Zeile]] 935 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 935.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `FabricLauncherPlugin.maybeWriteTelemetry`.
