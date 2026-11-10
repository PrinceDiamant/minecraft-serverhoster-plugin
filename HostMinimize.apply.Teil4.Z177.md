[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[HostMinimize]] › [[HostMinimize.Teil2]] › [[HostMinimize.apply]] › [[HostMinimize.apply.Teil4.Z177]]

# HostMinimize.apply.Teil4.Z177

```mermaid
flowchart TD
  n1["try Z.177"]
  n2["HostMinimize.apply.Teil4.Z177.Teil1"]:::internal-link
  n3["HostMinimize.apply.Teil4.Z177.Teil2"]:::internal-link
  n4["catch Z.184 (IOException / RuntimeExcepti…"]
  n5["HostMinimize.restore"]:::internal-link
  n6["throw Z.186 throw e;"]
  n2 -->|"weiter"| n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  n5 --> n6
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.177
  Zeile 177: Versuch. Der Fehlerpfad geht in catch.
HostMinimize.apply.Teil4.Z177.Teil1
  Ein weiterer Abschnitt derselben Übersicht. Abschnitt 1 dieses Ablaufs, in Quellreihenfolge.
HostMinimize.apply.Teil4.Z177.Teil2
  Ein weiterer Abschnitt derselben Übersicht. Abschnitt 2 dieses Ablaufs, in Quellreihenfolge.
catch Z.184 (IOException / RuntimeExcepti…
  Zeile 184: fängt (IOException / RuntimeExcepti….
HostMinimize.restore
  Das Verkleinern des [[Glossar#Host|Host]] stellt wieder her das. Stellt wieder her `restore`. Ruft `assertEditable`.
throw Z.186 throw e;
  Zeile 186: Abbruch `throw e;`.
```

> [!knoten]- Was die Blöcke tun
> - **try Z.177**: Zeile 177: Versuch. Der Fehlerpfad geht in catch.
> - **HostMinimize.apply.Teil4.Z177.Teil1**: Ein weiterer Abschnitt derselben Übersicht. Abschnitt 1 dieses Ablaufs, in Quellreihenfolge.
> - **HostMinimize.apply.Teil4.Z177.Teil2**: Ein weiterer Abschnitt derselben Übersicht. Abschnitt 2 dieses Ablaufs, in Quellreihenfolge.
> - **catch Z.184 (IOException / RuntimeExcepti…**: Zeile 184: fängt (IOException / RuntimeExcepti….
> - **HostMinimize.restore**: Das Verkleinern des [[Glossar#Host|Host]] stellt wieder her das. Stellt wieder her `restore`. Ruft `assertEditable`.
> - **throw Z.186 throw e;**: Zeile 186: Abbruch `throw e;`.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 177 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `HostMinimize.apply.Teil4`.
