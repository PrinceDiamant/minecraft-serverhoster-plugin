[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[HostMinimize]] › [[HostMinimize.Teil2]] › [[HostMinimize.clearIdlePause]] › [[HostMinimize.clearIdlePause.Teil2]]

# HostMinimize.clearIdlePause.Teil2

```mermaid
flowchart TD
  n1["if Z.116 (updated.equals(text))"]
  n2["return Z.116 return false;"]
  n3["Schritt Z.117 Files.writeString(properties, updated);"]
  n4["return Z.118 return true;"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.116 (updated.equals(text))
  Zeile 116: prüft `(updated.equals(text))`.
return Z.116 return false;
  Zeile 116: Rückgabe `return false;`.
Schritt Z.117 Files.writeString(properties, updated);
  Zeile 117: schreibt Text in eine Datei. `Files.writeString(properties, updated);`
return Z.118 return true;
  Zeile 118: Rückgabe `return true;`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.116 (updated.equals(text))**: Zeile 116: prüft `(updated.equals(text))`.
> - **return Z.116 return false;**: Zeile 116: Rückgabe `return false;`.
> - **Schritt Z.117 Files.writeString(properties, updated);**: Zeile 117: schreibt Text in eine Datei. `Files.writeString(properties, updated);`
> - **return Z.118 return true;**: Zeile 118: Rückgabe `return true;`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `HostMinimize.clearIdlePause`.
