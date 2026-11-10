[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Catch103]]

# Dashboard.handle.Z103.Catch103

```mermaid
flowchart TD
  n1["catch Z.269 (SecurityException e)"]
  n2["Dashboard.json"]:::internal-link
  n3["catch Z.271 (IllegalStateException e)"]
  n4["Dashboard.json"]:::internal-link
  n5["catch Z.273 (IllegalArgumentException e)"]
  n6["Dashboard.json"]:::internal-link
  n7["catch Z.275 (Exception e)"]
  n8["try Z.277"]
  n9["Dashboard.json"]:::internal-link
  n10["catch Z.277 (Exception ignored)"]
  n1 --> n2
  n3 --> n4
  n5 --> n6
  n8 --> n9
  n8 -->|"Fehler"| n10
  n7 --> n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
catch Z.269 (SecurityException e)
  Zeile 269: fängt (SecurityException e).
Dashboard.json
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.
catch Z.271 (IllegalStateException e)
  Zeile 271: fängt (IllegalStateException e).
catch Z.273 (IllegalArgumentException e)
  Zeile 273: fängt (IllegalArgumentException e).
catch Z.275 (Exception e)
  Zeile 275: fängt (Exception e).
try Z.277
  Zeile 277: Versuch. Der Fehlerpfad geht in catch.
catch Z.277 (Exception ignored)
  Zeile 277: fängt (Exception ignored).
```

> [!knoten]- Was die Blöcke tun
> - **catch Z.269 (SecurityException e)**: Zeile 269: fängt (SecurityException e).
> - **Dashboard.json**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.
> - **catch Z.271 (IllegalStateException e)**: Zeile 271: fängt (IllegalStateException e).
> - **catch Z.273 (IllegalArgumentException e)**: Zeile 273: fängt (IllegalArgumentException e).
> - **catch Z.275 (Exception e)**: Zeile 275: fängt (Exception e).
> - **try Z.277**: Zeile 277: Versuch. Der Fehlerpfad geht in catch.
> - **catch Z.277 (Exception ignored)**: Zeile 277: fängt (Exception ignored).

- Was passiert, wenn der Schritt in [[Glossar#Zeile|Zeile]] 103 schiefgeht.
- Fortsetzung von `Dashboard.handle.Z103`.
