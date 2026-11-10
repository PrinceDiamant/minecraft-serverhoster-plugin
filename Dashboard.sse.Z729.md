[[00 Start]] › [[Dashboard-HTTP]] › [[API-Status]] › [[Dashboard.sse]] › [[Dashboard.sse.Z729]]

# Dashboard.sse.Z729

```mermaid
flowchart TD
  n1["try Z.729"]
  n2["for Z.731 (String s : hist)"]
  n3["Dashboard.sse.Z729.Z733"]:::internal-link
  n4["catch Z.742 (IOException / InterruptedExc…"]
  n5["finally Z.729"]
  n6["FabricLauncherPlugin.console(String)"]:::internal-link
  n7["ConsoleBuffer.unsubscribe"]:::internal-link
  n2 --> n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  n3 --> n5
  n4 --> n5
  n6 -->|"Z.744"| n7
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.729
  Zeile 729: Versuch. Der Fehlerpfad geht in catch.
for Z.731 (String s : hist)
  Zeile 731: Schleife `(String s : hist)`.
Dashboard.sse.Z729.Z733
  Der Ablauf geht in [[Glossar#Zeile|Zeile]] 733 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 733.
catch Z.742 (IOException / InterruptedExc…
  Zeile 742: fängt (IOException / InterruptedExc….
finally Z.729
  Läuft danach immer, auch nach einem Fehler.
FabricLauncherPlugin.console(String)
  Liefert die letzten [[Glossar#Zeile|Zeilen]] der [[Glossar#Konsole|Konsole]]. Liefert die Konsole `console`. Ruft `slot`.
ConsoleBuffer.unsubscribe
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Hängt den Hörer ab `unsubscribe`.
```

> [!knoten]- Was die Blöcke tun
> - **try Z.729**: Zeile 729: Versuch. Der Fehlerpfad geht in catch.
> - **for Z.731 (String s : hist)**: Zeile 731: Schleife `(String s : hist)`.
> - **Dashboard.sse.Z729.Z733**: Der Ablauf geht in [[Glossar#Zeile|Zeile]] 733 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 733.
> - **catch Z.742 (IOException / InterruptedExc…**: Zeile 742: fängt (IOException / InterruptedExc….
> - **finally Z.729**: Läuft danach immer, auch nach einem Fehler.
> - **FabricLauncherPlugin.console(String)**: Liefert die letzten [[Glossar#Zeile|Zeilen]] der [[Glossar#Konsole|Konsole]]. Liefert die Konsole `console`. Ruft `slot`.
> - **ConsoleBuffer.unsubscribe**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Hängt den Hörer ab `unsubscribe`.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 729 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `Dashboard.sse`.
