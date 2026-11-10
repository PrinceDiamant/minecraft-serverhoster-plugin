[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]]

# Prozess-Bausteine

```mermaid
flowchart TD
  n1["RestartBackoff"]:::internal-link
  n2["StartFailureStatus"]:::internal-link
  n3["ChildProcessRecord"]:::internal-link
  n4["RestartPolicy"]:::internal-link
  n5["ChildStopSequence"]:::internal-link
  n6["ChildSlot"]:::internal-link
  n7["ConsoleBuffer"]:::internal-link
  n8["SupervisorHealth"]:::internal-link
  n9["ChildLaunchCleanup"]:::internal-link
  n10["TickQueryFilter"]:::internal-link
  n1 -->|"Kapitel im Text"| n2
  n2 -->|"Kapitel im Text"| n3
  n3 -->|"Kapitel im Text"| n4
  n4 -->|"Kapitel im Text"| n5
  n5 -->|"Kapitel im Text"| n6
  n6 -->|"Kapitel im Text"| n7
  n7 -->|"Kapitel im Text"| n8
  n8 -->|"Kapitel im Text"| n9
  n9 -->|"Kapitel im Text"| n10
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
RestartBackoff
  Rechnet die [[Glossar#Pause|Pause]] vor dem nächsten [[Glossar#Neustart|Neustart]] aus.
StartFailureStatus
  Merkt sich, woran ein Start gescheitert ist, damit man es in der [[Glossar#Bedienseite|Bedienseite]] sieht.
ChildProcessRecord
  Der Merkzettel zum laufenden Programm: Nummer, ob es noch lebt, und wie man es beendet.
RestartPolicy
  Die Regel, ob und wie oft der [[Glossar#Spielserver|Spielserver]] von allein neu starten darf.
ChildStopSequence
  Die Schritte des [[Glossar#Stopp|Stopps]]: nachfragen, die Bitte wiederholen, dann hart beenden.
ChildSlot
  Der [[Glossar#Platz|Platz]] des [[Glossar#Spielserver|Spielservers]]: Zustand, Programmnummer, [[Glossar#Konsole|Konsole]] und Messwerte.
ConsoleBuffer
  Ein kurzer Speicher für die letzten [[Glossar#Zeile|Zeilen]] der [[Glossar#Konsole|Konsole]], damit die [[Glossar#Bedienseite|Bedienseite]] sie zeigen kann.
SupervisorHealth
  Die vier Zustände aus, startet, läuft und stoppt, und die [[Glossar#Aufsicht|Aufsicht]] darüber.
ChildLaunchCleanup
  Räumt Dateien und übrig gebliebene Programme weg, wenn ein Start nicht geklappt hat.
TickQueryFilter
  Erkennt die Antwort auf die Frage nach dem letzten [[Glossar#Spielschritt|Spielschritt]] und lässt andere [[Glossar#Zeile|Zeilen]] links liegen.
```

> [!knoten] Was die Blöcke tun
> - **RestartBackoff**: Rechnet die [[Glossar#Pause|Pause]] vor dem nächsten [[Glossar#Neustart|Neustart]] aus.
> - **StartFailureStatus**: Merkt sich, woran ein Start gescheitert ist, damit man es in der [[Glossar#Bedienseite|Bedienseite]] sieht.
> - **ChildProcessRecord**: Der Merkzettel zum laufenden Programm: Nummer, ob es noch lebt, und wie man es beendet.
> - **RestartPolicy**: Die Regel, ob und wie oft der [[Glossar#Spielserver|Spielserver]] von allein neu starten darf.
> - **ChildStopSequence**: Die Schritte des [[Glossar#Stopp|Stopps]]: nachfragen, die Bitte wiederholen, dann hart beenden.
> - **ChildSlot**: Der [[Glossar#Platz|Platz]] des [[Glossar#Spielserver|Spielservers]]: Zustand, Programmnummer, [[Glossar#Konsole|Konsole]] und Messwerte.
> - **ConsoleBuffer**: Ein kurzer Speicher für die letzten [[Glossar#Zeile|Zeilen]] der [[Glossar#Konsole|Konsole]], damit die [[Glossar#Bedienseite|Bedienseite]] sie zeigen kann.
> - **SupervisorHealth**: Die vier Zustände aus, startet, läuft und stoppt, und die [[Glossar#Aufsicht|Aufsicht]] darüber.
> - **ChildLaunchCleanup**: Räumt Dateien und übrig gebliebene Programme weg, wenn ein Start nicht geklappt hat.
> - **TickQueryFilter**: Erkennt die Antwort auf die Frage nach dem letzten [[Glossar#Spielschritt|Spielschritt]] und lässt andere [[Glossar#Zeile|Zeilen]] links liegen.

- Die Zettel, auf denen Zustand, Programmnummer, [[Glossar#Konsole|Konsole]] und [[Glossar#Pause|Pausen]] stehen. Hier läuft nichts von selbst ab.
