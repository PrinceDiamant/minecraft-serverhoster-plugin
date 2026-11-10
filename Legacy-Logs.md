[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Logs]]

# Legacy-Logs

```mermaid
flowchart TD
  n1["index.loadLogs"]:::internal-link
  n2["index.loadLog"]:::internal-link
  n3["index.renderLog"]:::internal-link
  n1 -->|"Zeile 151"| n2
  n2 -->|"Zeile 154"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
index.loadLogs
  Die ältere [[Glossar#Bedienseite|Bedienseite]] lädt die Protokolle.
index.loadLog
  Die ältere [[Glossar#Bedienseite|Bedienseite]] lädt das Protokoll.
index.renderLog
  Die ältere [[Glossar#Bedienseite|Bedienseite]] zeichnet das Protokoll.
```

> [!knoten] Was die Blöcke tun
> - **index.loadLogs**: Die ältere [[Glossar#Bedienseite|Bedienseite]] lädt die Protokolle.
> - **index.loadLog**: Die ältere [[Glossar#Bedienseite|Bedienseite]] lädt das Protokoll.
> - **index.renderLog**: Die ältere [[Glossar#Bedienseite|Bedienseite]] zeichnet das Protokoll.

- Die Protokollansicht in der älteren [[Glossar#Bedienseite|Bedienseite]].
