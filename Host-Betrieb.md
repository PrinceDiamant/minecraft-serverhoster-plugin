[[00 Start]] › [[Host-Betrieb]]

# Host-Betrieb

```mermaid
flowchart TD
  n1["Speicher-Probe"]:::internal-link
  n2["Speicher-Stopp"]:::internal-link
  n3["Host-Minimieren"]:::internal-link
  n4["Host-Ersteinrichtung"]:::internal-link
  n5["Speicher-Messung"]:::internal-link
  n1 -->|"Quelltext"| n2
  n2 -->|"Quelltext"| n3
  n3 -->|"Quelltext"| n4
  n4 -->|"Quelltext"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Speicher-Probe
  Periodische Messung auf dem Thread ServerhosterPlugin-Memory.
Speicher-Stopp
  Bei Druck wantRunning aus und stopBlocking. Der Logtext sagt Emergency restart, neu gestartet wird nicht.
Host-Minimieren
  HostMinimize, Heap-Flags und die Lobby-Welt, solange der Child läuft.
Host-Ersteinrichtung
  Marker-Datei steuert, ob der Host beim Start Welten umbaut.
Speicher-Messung
  HostMemoryProbe, MemoryTelemetry, MemoryProtectionPolicy, RuntimeLimits, GcDiagnostics, Bericht und ProcessProbe.
```

- cgroup-Speicher, Notstopp nur des Child, Host-Minimize, Ersteinrichtung.
