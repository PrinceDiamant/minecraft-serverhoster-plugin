[[00 Start]] › [[Host-Betrieb]] › [[Host-Ersteinrichtung]] › [[HostFirstSetup]] › [[HostFirstSetup.Teil1]] › [[HostFirstSetup.completeRestart(Path,Path,Path,Set,List)]] › [[HostFirstSetup.completeRestart(Path,Path,Path,Set,List).Teil1]]

# HostFirstSetup.completeRestart(Path,Path,Path,Set,List).Teil1

```mermaid
flowchart TD
  n1["HostFirstSetup.readState"]:::internal-link
  n2["if Z.123 (!'restart-required'.equals(state.get('status')))"]
  n3["return Z.123 return List.of();"]
  n4["HostFirstSetup.requireRoot"]:::internal-link
  n2 -->|"ja"| n3
  n1 --> n2
  n3 --> n4
  n2 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
HostFirstSetup.readState
  Die [[Glossar#Ersteinrichtung|Ersteinrichtung]] liest den Zustand. Liest `readState`. Ruft `readState`.
if Z.123 (!'restart-required'.equals(state.get('status')))
  Zeile 123: prüft `(!'restart-required'.equals(state.get('status')))`.
return Z.123 return List.of();
  Zeile 123: Rückgabe `return List.of();`.
HostFirstSetup.requireRoot
  Die [[Glossar#Ersteinrichtung|Ersteinrichtung]] kümmert sich um den Anfang. Verlangt `requireRoot`.
```

> [!knoten]- Was die Blöcke tun
> - **HostFirstSetup.readState**: Die [[Glossar#Ersteinrichtung|Ersteinrichtung]] liest den Zustand. Liest `readState`. Ruft `readState`.
> - **if Z.123 (!'restart-required'.equals(state.get('status')))**: Zeile 123: prüft `(!'restart-required'.equals(state.get('status')))`.
> - **return Z.123 return List.of();**: Zeile 123: Rückgabe `return List.of();`.
> - **HostFirstSetup.requireRoot**: Die [[Glossar#Ersteinrichtung|Ersteinrichtung]] kümmert sich um den Anfang. Verlangt `requireRoot`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `HostFirstSetup.completeRestart(Path,Path,Path,Set,List)`.
