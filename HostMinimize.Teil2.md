[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[HostMinimize]] › [[HostMinimize.Teil2]]

# HostMinimize.Teil2

```mermaid
flowchart TD
  n1["HostMinimize.firstSetupWorld"]:::internal-link
  n2["HostMinimize.playersBlocked"]:::internal-link
  n3["HostMinimize.clearIdlePause"]:::internal-link
  n4["HostMinimize.preservedNotes"]:::internal-link
  n5["HostMinimize.preview"]:::internal-link
  n6["HostMinimize.apply"]:::internal-link
  n7["HostMinimize.restore"]:::internal-link
  n8["HostMinimize.writeEmptyWhitelist"]:::internal-link
  n5 -->|"Z.146"| n4
  n6 -->|"Z.183"| n8
  n6 -->|"Z.185"| n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n2 fill:#f88,stroke:#900
```

```knoten
HostMinimize.firstSetupWorld
  `firstSetupWorld` in `HostMinimize.java`. Ruft `lobbyNameSafe`.
HostMinimize.playersBlocked
  Liefert die Spieler `playersBlocked`. Befund: toter Code (wahrscheinlich).
HostMinimize.clearIdlePause
  Leert `clearIdlePause`. Ruft `lobbyNameSafe`.
HostMinimize.preservedNotes
  `preservedNotes` in `HostMinimize.java`.
HostMinimize.preview
  Zeigt die Vorschau `preview`. Ruft `assertRoot`, `readProperties`, `outerProperties`.
HostMinimize.apply
  Wendet an `apply`. Ruft `assertRoot`, `assertEditable`, `update`.
HostMinimize.restore
  Stellt wieder her `restore`. Ruft `assertEditable`.
HostMinimize.writeEmptyWhitelist
  Schreibt `writeEmptyWhitelist`. Ruft `assertEditable`.
```


