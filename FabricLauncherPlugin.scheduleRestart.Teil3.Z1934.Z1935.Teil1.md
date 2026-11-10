[[00 Start]] › [[Child-Prozess]] › [[Neustart]] › [[FabricLauncherPlugin.scheduleRestart]] › [[FabricLauncherPlugin.scheduleRestart.Teil3.Z1934.Z1935.Teil1]]

# FabricLauncherPlugin.scheduleRestart.Teil3.Z1934.Z1935.Teil1

```mermaid
flowchart TD
  n1["try Z.1937"]
  n2["Schritt Z.1938 Thread.sleep(delay * 1000L);"]
  n3["catch Z.1939 (InterruptedException e)"]
  n4["if Z.1941 (slot.scheduleToken.get() == token)"]
  n5["return Z.1942 return;"]
  n6["if Z.1944 (slot.scheduleToken.get() != token // !slot.wantR…"]
  n7["ChildSlot.running"]:::internal-link
  n8["if Z.1945 (slot.scheduleToken.get() == token)"]
  n9["return Z.1946 return;"]
  n1 --> n2
  n1 -->|"Fehler"| n3
  n4 --> n5
  n4 --> n5
  n3 --> n4
  n6 -->|"Z.1944"| n7
  n8 --> n9
  n8 --> n9
  n7 -->|"ja"| n8
  n2 --> n6
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.scheduleRestart.Teil3.Z1934.Z1935`, Quellreihenfolge.
