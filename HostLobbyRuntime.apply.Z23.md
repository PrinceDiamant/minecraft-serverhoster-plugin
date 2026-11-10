[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[HostLobbyRuntime]] › [[HostLobbyRuntime.apply]] › [[HostLobbyRuntime.apply.Z23]]

# HostLobbyRuntime.apply.Z23

```mermaid
flowchart TD
  n1["for Z.23 (World world : worlds)"]
  n2["if Z.24 (world == null // !lobbyName.equals(world.name()))"]
  n3["for Z.27 (String rule : RULES_OFF)"]
  n2 --> n3
  n2 --> n3
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HostLobbyRuntime.apply`, Quellreihenfolge.
