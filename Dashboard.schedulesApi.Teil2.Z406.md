[[00 Start]] › [[Dashboard-HTTP]] › [[API-Zeit]] › [[Dashboard.schedulesApi]] › [[Dashboard.schedulesApi.Teil2.Z406]]

# Dashboard.schedulesApi.Teil2.Z406

```mermaid
flowchart TD
  n1["if Z.406 (method.equals('PUT'))"]
  n2["Dashboard.parseSchedule"]:::internal-link
  n3["Dashboard.readBodyText"]:::internal-link
  n4["if Z.408 (!replacement.id().equals(id))"]
  n5["throw Z.408 throw new IllegalArgumentException('Schedule-ID s…"]
  n6["Dashboard.schedulesApi.Teil2.Z406.Z409"]:::internal-link
  n7["Dashboard.json"]:::internal-link
  n8["ScheduleDef.toJson"]:::internal-link
  n9["return Z.417 return;"]
  n2 -->|"Z.407"| n3
  n4 -->|"ja"| n5
  n3 --> n4
  n5 --> n6
  n4 --> n6
  n7 -->|"Z.416"| n8
  n6 --> n7
  n8 --> n9
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.406 (method.equals('PUT'))
  Zeile 406: prüft `(method.equals('PUT'))`.
Dashboard.parseSchedule
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liest den [[Glossar#Zeitplan|Zeitplan]]. Wertet aus `parseSchedule`. Ruft `load`.
Dashboard.readBodyText
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liest den Text den Text. Liest `readBodyText`.
if Z.408 (!replacement.id().equals(id))
  Zeile 408: prüft `(!replacement.id().equals(id))`.
throw Z.408 throw new IllegalArgumentException('Schedule-ID s…
  Zeile 408: Abbruch `throw new IllegalArgumentException('Schedule-ID s…`.
Dashboard.schedulesApi.Teil2.Z406.Z409
  Der Ablauf geht in [[Glossar#Zeile|Zeile]] 409 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 409.
Dashboard.json
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.
ScheduleDef.toJson
  Der [[Glossar#Zeitplan|Zeitplan]] kümmert sich um die Antwort. `toJson` in `ScheduleDef.java`. Ruft `toConfig`, `cron`.
return Z.417 return;
  Zeile 417: Rückgabe `return;`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.406 (method.equals('PUT'))**: Zeile 406: prüft `(method.equals('PUT'))`.
> - **Dashboard.parseSchedule**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liest den [[Glossar#Zeitplan|Zeitplan]]. Wertet aus `parseSchedule`. Ruft `load`.
> - **Dashboard.readBodyText**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liest den Text den Text. Liest `readBodyText`.
> - **if Z.408 (!replacement.id().equals(id))**: Zeile 408: prüft `(!replacement.id().equals(id))`.
> - **throw Z.408 throw new IllegalArgumentException('Schedule-ID s…**: Zeile 408: Abbruch `throw new IllegalArgumentException('Schedule-ID s…`.
> - **Dashboard.schedulesApi.Teil2.Z406.Z409**: Der Ablauf geht in [[Glossar#Zeile|Zeile]] 409 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 409.
> - **Dashboard.json**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.
> - **ScheduleDef.toJson**: Der [[Glossar#Zeitplan|Zeitplan]] kümmert sich um die Antwort. `toJson` in `ScheduleDef.java`. Ruft `toConfig`, `cron`.
> - **return Z.417 return;**: Zeile 417: Rückgabe `return;`.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 406 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `Dashboard.schedulesApi.Teil2`.
