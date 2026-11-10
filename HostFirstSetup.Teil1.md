[[00 Start]] › [[Host-Betrieb]] › [[Host-Ersteinrichtung]] › [[HostFirstSetup]] › [[HostFirstSetup.Teil1]]

# HostFirstSetup.Teil1

```mermaid
flowchart TD
  n1["HostFirstSetup.HostFirstSetup"]:::internal-link
  n2["HostFirstSetup.shouldRun"]:::internal-link
  n3["HostFirstSetup.requestManual"]:::internal-link
  n4["HostFirstSetup.apply(Path,Path,Path,Path)"]:::internal-link
  n5["HostFirstSetup.apply(Path,Path,Path,Path,List)"]:::internal-link
  n6["HostFirstSetup.completeRestart(Path,Path,Path,Set)"]:::internal-link
  n7["HostFirstSetup.completeRestart(Path,Path,Path,Set,List)"]:::internal-link
  n8["HostFirstSetup.encodeWorldNames"]:::internal-link
  n4 -->|"Z.59"| n5
  n5 -->|"Z.102"| n8
  n6 -->|"Z.117"| n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n2 fill:#f88,stroke:#900
  style n4 fill:#f88,stroke:#900
  style n6 fill:#f88,stroke:#900
```

```knoten
HostFirstSetup.HostFirstSetup
  Betrifft den Host `HostFirstSetup`.
HostFirstSetup.shouldRun
  Entscheidet, ob `shouldRun`. Ruft `readState`, `writeMarker`. Befund: Altlast (wahrscheinlich).
HostFirstSetup.requestManual
  Fordert an `requestManual`. Ruft `readState`, `writeMarker`.
HostFirstSetup.apply(Path,Path,Path,Path)
  Wendet an `apply`. Ruft `apply`. Befund: toter Code (wahrscheinlich).
HostFirstSetup.apply(Path,Path,Path,Path,List)
  Wendet an `apply`. Ruft `readState`, `requireRoot`, `otherPluginJars`.
HostFirstSetup.completeRestart(Path,Path,Path,Set)
  Schließt ab `completeRestart`. Ruft `completeRestart`. Befund: toter Code (wahrscheinlich).
HostFirstSetup.completeRestart(Path,Path,Path,Set,List)
  Schließt ab `completeRestart`. Ruft `readState`, `requireRoot`, `lobbyNameSafe`.
HostFirstSetup.encodeWorldNames
  Kodiert `encodeWorldNames`.
```


