[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.serveWebAsset]] › [[Dashboard.serveWebAsset.Z955]]

# Dashboard.serveWebAsset.Z955

```mermaid
flowchart TD
  n1["try Z.955"]
  n2["if Z.956 (in == null)"]
  n3["Dashboard.send"]:::internal-link
  n4["return Z.958 return;"]
  n5["Dashboard.sendBytes"]:::internal-link
  n3 --> n4
  n2 -->|"ja"| n3
  n4 --> n5
  n2 --> n5
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.955
  Zeile 955: Versuch. Der Fehlerpfad geht in catch.
if Z.956 (in == null)
  Zeile 956: prüft `(in == null)`.
Dashboard.send
  Schickt die Antwort an den Browser. Sendet `send`. Ruft `sendBytes`.
return Z.958 return;
  Zeile 958: Rückgabe `return;`.
Dashboard.sendBytes
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] schickt die Größe. Sendet `sendBytes`.
```

> [!knoten]- Was die Blöcke tun
> - **try Z.955**: Zeile 955: Versuch. Der Fehlerpfad geht in catch.
> - **if Z.956 (in == null)**: Zeile 956: prüft `(in == null)`.
> - **Dashboard.send**: Schickt die Antwort an den Browser. Sendet `send`. Ruft `sendBytes`.
> - **return Z.958 return;**: Zeile 958: Rückgabe `return;`.
> - **Dashboard.sendBytes**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] schickt die Größe. Sendet `sendBytes`.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 955 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `Dashboard.serveWebAsset`.
