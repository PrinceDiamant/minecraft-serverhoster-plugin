[[00 Start]] › [[Plugin-Kern]] › [[Benachrichtigung]] › [[NtfyNotifier]] › [[NtfyNotifier.send]] › [[NtfyNotifier.send.Teil2]]

# NtfyNotifier.send.Teil2

```mermaid
flowchart TD
  n1["try Z.33"]
  n2["if Z.35 (response.statusCode() ( 200 // response.statusCo…"]
  n3["throw Z.36 throw new IOException('ntfy returned HTTP ' + res…"]
  n4["catch Z.37 (InterruptedException e)"]
  n5["throw Z.39 throw new IOException('ntfy request interrupted',…"]
  n2 -->|"ja"| n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.33
  Zeile 33: Versuch. Der Fehlerpfad geht in catch.
if Z.35 (response.statusCode() ( 200 // response.statusCo…
  Zeile 35: prüft `(response.statusCode() ( 200 // response.statusCo…`.
throw Z.36 throw new IOException('ntfy returned HTTP ' + res…
  Zeile 36: Abbruch `throw new IOException('ntfy returned HTTP ' + res…`.
catch Z.37 (InterruptedException e)
  Zeile 37: fängt (InterruptedException e).
throw Z.39 throw new IOException('ntfy request interrupted',…
  Zeile 39: Abbruch `throw new IOException('ntfy request interrupted',…`.
```

> [!knoten]- Was die Blöcke tun
> - **try Z.33**: Zeile 33: Versuch. Der Fehlerpfad geht in catch.
> - **if Z.35 (response.statusCode() ( 200 // response.statusCo…**: Zeile 35: prüft `(response.statusCode() ( 200 // response.statusCo…`.
> - **throw Z.36 throw new IOException('ntfy returned HTTP ' + res…**: Zeile 36: Abbruch `throw new IOException('ntfy returned HTTP ' + res…`.
> - **catch Z.37 (InterruptedException e)**: Zeile 37: fängt (InterruptedException e).
> - **throw Z.39 throw new IOException('ntfy request interrupted',…**: Zeile 39: Abbruch `throw new IOException('ntfy request interrupted',…`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `NtfyNotifier.send`.
