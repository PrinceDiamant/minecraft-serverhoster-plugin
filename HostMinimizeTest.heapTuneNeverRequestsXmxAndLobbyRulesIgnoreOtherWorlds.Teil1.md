[[00 Start]] › [[Tests]] › [[HostMinimizeTest]] › [[HostMinimizeTest.Teil2]] › [[HostMinimizeTest.heapTuneNeverRequestsXmxAndLobbyRulesIgnoreOtherWorlds]] › [[HostMinimizeTest.heapTuneNeverRequestsXmxAndLobbyRulesIgnoreOtherWorlds.Teil1]]

# HostMinimizeTest.heapTuneNeverRequestsXmxAndLobbyRulesIgnoreOtherWorlds.Teil1

```mermaid
flowchart TD
  n1["HostMinimize.lobbyNameSafe"]:::internal-link
  n2["HostMinimize.lobbyNameSafe"]:::internal-link
  n3["HostLobbyRuntime.apply"]:::internal-link
  n4["HostLobbyRuntime.apply"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
HostMinimize.lobbyNameSafe
  Das Verkleinern des [[Glossar#Host|Host]] kümmert sich um den Namen die erlaubte Grenze. `lobbyNameSafe` in `HostMinimize.java`.
HostLobbyRuntime.apply
  Dieser Teil wendet an das. Wendet an `apply`. Ruft `worldNameSafe`.
```

> [!knoten]- Was die Blöcke tun
> - **HostMinimize.lobbyNameSafe**: Das Verkleinern des [[Glossar#Host|Host]] kümmert sich um den Namen die erlaubte Grenze. `lobbyNameSafe` in `HostMinimize.java`.
> - **HostLobbyRuntime.apply**: Dieser Teil wendet an das. Wendet an `apply`. Ruft `worldNameSafe`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `HostMinimizeTest.heapTuneNeverRequestsXmxAndLobbyRulesIgnoreOtherWorlds`.
