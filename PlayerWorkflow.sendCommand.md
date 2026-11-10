[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[PlayerWorkflow]] › [[PlayerWorkflow.sendCommand]]

# PlayerWorkflow.sendCommand

`PlayerWorkflow.sendCommand(command: string)` [ui/src/components/PlayerWorkflow.tsx:12–18](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/ui/src/components/PlayerWorkflow.tsx#L12-L18)

```mermaid
flowchart TD
  n1["hostApi.dashboardRequest"]:::internal-link
  n2["hostApi.jsonBody"]:::internal-link
  n3["if Z.17 !result.ok"]
  n4["throw Z.17 throw new Error('Der Child-Server läuft nicht ode…"]
  n1 -->|"Z.15"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
hostApi.dashboardRequest
  `dashboardRequest` in `hostApi.ts`.
hostApi.jsonBody
  Antwortet mit JSON `jsonBody`.
if Z.17 !result.ok
  Zeile 17: prüft `!result.ok`.
throw Z.17 throw new Error('Der Child-Server läuft nicht ode…
  Zeile 17: Abbruch `throw new Error('Der Child-Server läuft nicht ode…`.
```

- `sendCommand` in `ui/src/components/PlayerWorkflow.tsx`
