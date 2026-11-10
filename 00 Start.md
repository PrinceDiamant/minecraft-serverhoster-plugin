[[00 Start]]

# 00 Start

```mermaid
flowchart TD
  n1["Plugin-Kern"]:::internal-link
  n2["Child-Prozess"]:::internal-link
  n3["Dashboard-HTTP"]:::internal-link
  n4["Dashboard-UI"]:::internal-link
  n5["Backup"]:::internal-link
  n6["Zeitplaene"]:::internal-link
  n7["Host-Betrieb"]:::internal-link
  n8["Server-Anlage"]:::internal-link
  n9["Tests"]:::internal-link
  n1 -->|"startet"| n2
  n1 -->|"oeffnet"| n3
  n3 -->|"liefert, doppelt"| n4
  n1 -->|"sichert"| n5
  n1 -->|"plant, Altlast"| n6
  n1 -->|"misst"| n7
  n1 -->|"bereitet"| n8
  n1 -->|"prueft"| n9
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n4 fill:#f88,stroke:#900
  style n6 fill:#f88,stroke:#900
```

```knoten
Plugin-Kern
  FabricLauncherPlugin: Lebenszyklus, Befehl /child, Config und der eine Fokus-Slot.
Child-Prozess
  Der eine Child: starten, Ausgabe lesen, neu starten, stoppen. Die Kante Quelltext ist nur die Reihenfolge im Quelltext.
Dashboard-HTTP
  com.sun.net.httpserver, Kontext / zeigt auf Dashboard.handle.
Dashboard-UI
  React-Hülle um das gebündelte web/index.html. Dieselbe Oberfläche existiert zweimal. Befund: doppelte Implementierung (sicher).
Backup
  Lokales Zip über BackupBridge oder FTP/FTPS über RemoteBackupBridge.
Zeitplaene
  Zeitpläne und daneben weiter die alten Tasks, beide alle 20 s. Befund: Altlast (sicher).
Host-Betrieb
  Misst den Host-Speicher, stoppt bei Druck nur den Child, verkleinert den Host und richtet ihn einmal ein.
Server-Anlage
  Versionen, Profile und der Startplan. Profiles.load liest servers.*, der Kern behält einen Server.
Tests
  JUnit unter src/test. Die Methoden sind erreichbar, damit sie nicht als Lücke im Aufrufgraph gelten.
```

- Ein Child-Server, gesteuert vom Plugin `FabricLauncherPlugin` (`plugin.yml`: Befehl `/child`).
- Dashboard: `com.sun.net.httpserver` plus gebündeltes `web/index.html`, von React in `ui/` umgebaut.
- Hover über einen Block: Plugin `Mermaid Knoten Hover` im Vault. Eingeschränkten Modus aus, dann unter Community-Plugins einschalten.
- Commit `95b02b953b0b4c23673e900e021a7c3c844aa37d`.
- [[befunde]] · [[bericht]]
