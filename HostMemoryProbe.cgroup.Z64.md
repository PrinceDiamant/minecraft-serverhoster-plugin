[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Messung]] › [[HostMemoryProbe]] › [[HostMemoryProbe.cgroup]] › [[HostMemoryProbe.cgroup.Z64]]

# HostMemoryProbe.cgroup.Z64

```mermaid
flowchart TD
  n1["try Z.64"]
  n2["HostMemoryProbe.cgroup.Z64.Z65"]:::internal-link
  n3["catch Z.97 (IOException ignored)"]
  n1 --> n2
  n1 -->|"Fehler"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.64
  Zeile 64: Versuch. Der Fehlerpfad geht in catch.
HostMemoryProbe.cgroup.Z64.Z65
  Der Ablauf geht in [[Glossar#Zeile|Zeile]] 65 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 65.
catch Z.97 (IOException ignored)
  Zeile 97: fängt (IOException ignored).
```

> [!knoten]- Was die Blöcke tun
> - **try Z.64**: Zeile 64: Versuch. Der Fehlerpfad geht in catch.
> - **HostMemoryProbe.cgroup.Z64.Z65**: Der Ablauf geht in [[Glossar#Zeile|Zeile]] 65 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 65.
> - **catch Z.97 (IOException ignored)**: Zeile 97: fängt (IOException ignored).

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 64 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `HostMemoryProbe.cgroup`.
