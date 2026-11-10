[[00 Start]] › [[Host-Betrieb]] › [[Host-Ersteinrichtung]] › [[HostFirstSetup]]

# HostFirstSetup

```mermaid
flowchart TD
  n1["HostFirstSetup.Teil1"]:::internal-link
  n2["HostFirstSetup.Teil2"]:::internal-link
  n3["HostFirstSetup.Teil3"]:::internal-link
  n1 -->|"Kapitel im Text"| n2
  n2 -->|"Kapitel im Text"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
HostFirstSetup.Teil1
  Ein weiterer Abschnitt derselben Übersicht. Im [[Glossar#Quelltext|Quelltext]] heißt das `Teil1`.
HostFirstSetup.Teil2
  Ein weiterer Abschnitt derselben Übersicht. Im [[Glossar#Quelltext|Quelltext]] heißt das `Teil2`.
HostFirstSetup.Teil3
  Ein weiterer Abschnitt derselben Übersicht. Im [[Glossar#Quelltext|Quelltext]] heißt das `Teil3`.
```

> [!knoten]- Was die Blöcke tun
> - **HostFirstSetup.Teil1**: Ein weiterer Abschnitt derselben Übersicht. Im [[Glossar#Quelltext|Quelltext]] heißt das `Teil1`.
> - **HostFirstSetup.Teil2**: Ein weiterer Abschnitt derselben Übersicht. Im [[Glossar#Quelltext|Quelltext]] heißt das `Teil2`.
> - **HostFirstSetup.Teil3**: Ein weiterer Abschnitt derselben Übersicht. Im [[Glossar#Quelltext|Quelltext]] heißt das `Teil3`.

```mermaid
stateDiagram-v2
  [*] --> auto_authorized: frisch, Z.42
  [*] --> manual_required: nicht frisch, Z.45
  manual_required --> requested: requestManual Z.55
  auto_authorized --> preparing: apply Z.103
  requested --> preparing: apply Z.103
  preparing --> restart_required: apply Z.112
  restart_required --> done: completeRestart Z.164
  note right of auto_authorized
    pending wird gelesen Z.35, produktiv nie geschrieben
  end note
```

- Der Stand dieser Merkdatei, von „noch nicht“ bis „fertig“. Manche Stände erlauben den Umbau, andere verlangen einen Menschen oder einen [[Glossar#Neustart|Neustart]].
