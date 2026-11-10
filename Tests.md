[[00 Start]] › [[Tests]]

# Tests

```mermaid
flowchart TD
  n1["RemoteBackupBridgeTest"]:::internal-link
  n2["LifecycleTestProcess"]:::internal-link
  n3["HostMinimizeTest"]:::internal-link
  n4["LifecycleRobustnessTest"]:::internal-link
  n5["CoreAdminTest"]:::internal-link
  n6["HosterTest"]:::internal-link
  n1 -->|"Quelltext"| n2
  n2 -->|"Quelltext"| n3
  n3 -->|"Quelltext"| n4
  n4 -->|"Quelltext"| n5
  n5 -->|"Quelltext"| n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
RemoteBackupBridgeTest
  Tests der FTP-Brücke.
LifecycleTestProcess
  Test-Helfer, der einen Child-Prozess spielt.
HostMinimizeTest
  Tests für Host-Minimize. Schreibt den Marker-Status pending.
LifecycleRobustnessTest
  Tests für Stopp, Neustart und abgebrochenen Start.
CoreAdminTest
  Tests der Admin-Befehle.
HosterTest
  Die große Plugin-Testklasse.
```

- JUnit unter `src/test`. Erreichbar, damit keine Testmethode als Lücke gilt.
