[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]]

# Host-Minimieren

```mermaid
flowchart TD
  n1["HostMinimize"]:::internal-link
  n2["HostHeapTune"]:::internal-link
  n3["HostLobbyRuntime"]:::internal-link
  n4["Host-Minimieren.Teil1"]:::internal-link
  n5["Host-Minimieren.Teil2"]:::internal-link
  n1 -->|"Kapitel im Text"| n2
  n2 -->|"Kapitel im Text"| n3
  n3 -->|"Kapitel im Text"| n4
  n4 -->|"Kapitel im Text"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
HostMinimize
  Wendet das Verkleinern an oder nimmt es zurück. [[Glossar#Spieler|Spieler]] können dabei auf dem [[Glossar#Host|Host]] blockiert sein.
HostHeapTune
  Setzt die Speicherwerte, mit denen der verkleinerte [[Glossar#Host|Host]] starten soll.
HostLobbyRuntime
  Hält auf dem [[Glossar#Host|Host]] eine kleine Wartewelt, während der [[Glossar#Spielserver|Spielserver]] läuft.
Host-Minimieren.Teil1
  Ein weiterer Abschnitt derselben Übersicht.
Host-Minimieren.Teil2
  Ein weiterer Abschnitt derselben Übersicht.
```

> [!knoten] Was die Blöcke tun
> - **HostMinimize**: Wendet das Verkleinern an oder nimmt es zurück. [[Glossar#Spieler|Spieler]] können dabei auf dem [[Glossar#Host|Host]] blockiert sein.
> - **HostHeapTune**: Setzt die Speicherwerte, mit denen der verkleinerte [[Glossar#Host|Host]] starten soll.
> - **HostLobbyRuntime**: Hält auf dem [[Glossar#Host|Host]] eine kleine Wartewelt, während der [[Glossar#Spielserver|Spielserver]] läuft.
> - **Host-Minimieren.Teil1**: Ein weiterer Abschnitt derselben Übersicht.
> - **Host-Minimieren.Teil2**: Ein weiterer Abschnitt derselben Übersicht.

- Macht den [[Glossar#Host|Host]] kleiner, solange der [[Glossar#Spielserver|Spielserver]] läuft, damit beide in den [[Glossar#Arbeitsspeicher|Arbeitsspeicher]] passen. Dazu eine Wartewelt und angepasste Startwerte.
