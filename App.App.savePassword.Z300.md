[[00 Start]] › [[Dashboard-UI]] › [[UI-App]] › [[App.App]] › [[App.App.savePassword]] › [[App.App.savePassword.Z300]]

# App.App.savePassword.Z300

```mermaid
flowchart TD
  n1["try Z.300"]
  n2["hostApi.dashboardRequest"]:::internal-link
  n3["hostApi.jsonBody"]:::internal-link
  n4["index.start"]:::internal-link
  n5["catch Z.310 cause"]
  n6["finally Z.300"]
  n2 -->|"Z.303"| n3
  n3 --> n4
  n1 --> n2
  n1 -->|"Fehler"| n5
  n4 --> n6
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n4 fill:#f88,stroke:#900
```

```knoten
try Z.300
  Zeile 300: Versuch. Der Fehlerpfad geht in catch.
hostApi.dashboardRequest
  Schickt von der [[Glossar#Bedienseite|Bedienseite]] eine Anfrage an das [[Glossar#Plugin|Plugin]]. `dashboardRequest` in `hostApi.ts`.
hostApi.jsonBody
  Baut den Text, den die [[Glossar#Bedienseite|Bedienseite]] als Auftrag mitschickt. Antwortet mit JSON `jsonBody`.
index.start
  Die ältere [[Glossar#Bedienseite|Bedienseite]] fragt ab jetzt alle drei Sekunden nach dem Zustand. Browser-Timer 3000 ms für `status`. [[Glossar#Befund|Befund]]: doppelte Implementierung, sicher. index.html:220 setInterval 3000 ms läuft in der React-Hülle weiter
catch Z.310 cause
  Zeile 310: fängt cause.
finally Z.300
  Läuft danach immer, auch nach einem Fehler.
```

> [!knoten]- Was die Blöcke tun
> - **try Z.300**: Zeile 300: Versuch. Der Fehlerpfad geht in catch.
> - **hostApi.dashboardRequest**: Schickt von der [[Glossar#Bedienseite|Bedienseite]] eine Anfrage an das [[Glossar#Plugin|Plugin]]. `dashboardRequest` in `hostApi.ts`.
> - **hostApi.jsonBody**: Baut den Text, den die [[Glossar#Bedienseite|Bedienseite]] als Auftrag mitschickt. Antwortet mit JSON `jsonBody`.
> - **index.start**: Die ältere [[Glossar#Bedienseite|Bedienseite]] fragt ab jetzt alle drei Sekunden nach dem Zustand. Browser-Timer 3000 ms für `status`. [[Glossar#Befund|Befund]]: doppelte Implementierung, sicher. index.html:220 setInterval 3000 ms läuft in der React-Hülle weiter
> - **catch Z.310 cause**: Zeile 310: fängt cause.
> - **finally Z.300**: Läuft danach immer, auch nach einem Fehler.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 300 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `App.App.savePassword`.
