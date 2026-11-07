# Vergleich und Änderungsnotiz, 7. November 2026

Dieses Dokument trennt den Repository-Stand vor dieser Änderung von dem, was
der Pull Request ergänzt. Es beschreibt keine laufende Installation: ob ein
bestimmter Hoster welches Jar ausführt, ist aus diesem Repository nicht
ablesbar.

## Baseline des Ziel-Repositories

| | |
|---|---|
| Repository | `https://github.com/Sciddie/minecraft-serverhoster-plugin` |
| Default-Branch | `main` |
| Commit | `388f633991843fb3ddbab26c159eb121ff1ff767` |
| Datum | 15. Oktober 2026, 14:01:40 +0200 |
| Version | ServerHoster 2.0.1, Maven-Artefakt `FabricLauncher` 2.0.1, Jar `ServerHoster-2.0.1.jar` |
| Weitere Branches | `cursor/serverhoster-e08b` ist der gemergte Pull Request #1 und enthält keine Commits, die `main` nicht hat |
| Offene Pull Requests | keine |

Build der Baseline: JDK 25, Maven, Spigot-API 26.3 provided, Node 22 nur für das
Dashboard im Maven-Lauf. H2 nur in Tests. Kein mitgeliefertes Server-Jar.

Module und Hauptklassen der Baseline:

- Root-Plugin `src/main/java/de/aichele/childlauncher/`. Einstieg
  `FabricLauncherPlugin` (`plugin.yml`: Name `ServerhosterPlugin`, Befehl
  `/child`, Recht `serverhoster.admin`).
- Prozess und Diagnose: `ChildSlot`, `LaunchPlan`, `ProcessProbe`,
  `HostMemoryProbe`, `MemoryProtectionPolicy`, `MemoryIncidentReport`,
  `RestartPolicy`, `RestartBackoff`.
- Betrieb: `Dashboard`, `ServerHosterSettings`, `ScheduleDef`,
  `ScheduleExecution`, `TaskDef`, `BackupBridge`, `RemoteBackupBridge`,
  `NtfyNotifier`, `HttpsSupport`, `SetupDiscovery`, `SetupRecovery`,
  `PropertiesFile`, `PathGuard`, `CrashIndex`, `JarProbe`, `SpigotBuilder`.
- `worldporter/` ist ein separates, optionales Maven-Projekt und nicht Teil
  des Root-Builds. `spigot-minimal-config/` ist Beispielmaterial, kein
  automatisches Trimming.

Vorhandene Oberflächen der Baseline:

- `/child`: `start`, `stop`, `restart`, `status`, `cmd`, `config`, `prop`,
  `diag`, `threaddump`, `heap`, `flags`, `tasks`, `task`, `backup`,
  `versions`, `plan`, `crashes`, `jar`.
- Dashboard-HTTP: Login, Status, Konsole inklusive SSE, Spieler, Dateien,
  Logs, `server.properties` und Vorschau, rohe `config.yml`, Einstellungen,
  Diagnose mit `Thread.print`, `GC.heap_info` und `VM.flags`, Aufgaben,
  Zeitpläne, Backup lokal oder FTP/FTPS, Setup und optionales HTTPS.
- Genau ein Child: Vanilla, Fabric, Paper, Spigot oder Custom. Artefakte erst
  beim ausdrücklichen Start. `pause-when-empty-seconds` wird auf `0` erzwungen.
  Keine Mod-Installation.

Ressourcen- und Prozessverhalten der Baseline:

- Start, Stopp und Neustart aus Befehl und Dashboard laufen auf einem
  Daemon-Pool, nicht auf dem Spigot-Thread. `onDisable` stoppt den Child
  blockierend. Ein Shutdown-Hook mit `shutdownHookTimeoutSeconds` (Standard 25)
  deckt SIGTERM ab und wird im normalen `onDisable` entfernt.
- Stopp während des Starts wartet auf die Zeile `Done (` bis
  `startupStopTimeoutSeconds`, sendet danach wiederholt `stop` und beendet den
  Prozess erst nach `stopTimeoutSeconds`.
- Automatischer Neustart ist begrenzt (Standard 5). `maxAttempts: 0` aus älteren
  Konfigurationen wird auf 5 migriert.
- cgroup v1/v2, Host-Swap und Prozess-RSS werden gelesen. Kritischer Druck kann
  nur den Child stoppen. Heap-Obergrenzen über dem cgroup-Limit erzeugen eine
  Warnung und werden nicht verkleinert. Die Status-API nennt für Spigot bereits
  Heap belegt, committed und maximal; die Übersicht zeigte bisher belegt/max.
- Es gibt keine PID-Datei. Nach einem harten Host-Abbruch kann ein Child-Prozess
  Port und Welt-Lock behalten. Ein unterbrochener Exit-Watcher plant keinen
  Neustart. Die Konsolen-Pipe schluckt Lesefehler. Schlägt das Einreihen von
  Pipe oder Watcher nach `start()` fehl, bleibt der Prozess liegen. Die
  Speichermessung inklusive Notstopp läuft auf demselben Scheduler wie
  `save-all` und Zeitpläne.

## Referenz Minimal-Variante

| | |
|---|---|
| Repository | `https://github.com/Sciddie/minimal-serverhoster-mc` |
| Default-Branch | `main`, einziger Branch, keine Pull Requests |
| Commit | `a7a11b26e20a5a40c7e49231908f34954d67ca97` |
| Datum | 18. Oktober 2026, 02:50:57 +0200 |
| Version | Parent `server-hoster-parent` `1.0.0-SNAPSHOT`; Module `ServerHoster` und `HostTrimmer` |

Übernommen als Idee, aber neu geprüft und enger gebaut:

- Prozessdatensatz vor dem nächsten Start, statt einen PID nur deshalb zu
  beenden, weil die Kommandozeile `java` enthält.
- Ein eigener Überwachungsfaden ist kein Ersatz für den vorhandenen Pool. Ein
  Health-Check hängt Pipe oder Watcher neu an und plant den bestehenden
  begrenzten Neustart, wenn der Watcher das Ende verpasst hat.
- Ausgabe nach einem fehlgeschlagenen Start ableiten und den Prozess beenden.
- Speichermessung mit getrennten Spalten für Heap, RSS, Host und cgroup, plus
  GC-Zähler und Dauer des letzten gemeldeten Zyklus. Kein `System.gc()`.

Nicht übernommen:

- `synchronized` auf dem gesamten Start/Stopp. Stopp bleibt gegenseitig
  ausgeschlossen, blockiert aber nicht den Spigot-Thread, wenn er vom Befehl
  oder Dashboard kommt.
- Sofortiges `destroyForcibly` und stille `catch`-Blöcke beim PID-Rest.
- Destruktives Host-Trimming, Löschen von Welten oder Plugins, Umschreiben von
  Sichtweite, Spawn und `pause-when-empty-seconds`.
- `HeapTuner` (`MinHeapFreeRatio`, `G1PeriodicGCInterval`) und `WorldTweaks`.
  Das würde den laufenden Host verändern.
- Unbegrenzte Neustarts, festes Xmx 9G und die vielen G1-Flags der Minimal-Config.
- Die Annahme, voller Swap sei ein Container-OOM oder ein 200-ms-GC-Ziel schließe
  lange Pausen aus. Beides ist nicht belegt.

## Historische Linie FabricLauncher 1.0.0

Im Ziel-Repository gibt es keinen Commit mit Version 1.0.0. Der erste importierte
Stand hier ist ServerHoster 1.2.0. Die Version 1.0.0 liegt im Schwester-Repository
`https://github.com/Sciddie/minecraft-fabric-launcher`, Import-Commit
`bb554cfcce8f13cf022a8a73cdd115363ddf0552` vom 12. Oktober 2026, 23:19:15 UTC.
Eine Git-Marke `v1.0.0` existiert dort nicht. Spätere Marken dieser Linie reichen
bis `v1.4.0` und sind nicht der Stand des Ziel-Repositories.

Aus dem Quelltext und `docs/Dokumentation.md` dieses Commits, nicht aus einem
lebenden Server:

- Spigot-Plugin mit Dashboard, das einen Child-Prozess startet. Standardtyp
  Fabric, `Xms`/`Xmx` 8G, Modrinth-Mods Lithium und Ferrite Core, Paper, Vanilla
  und Custom sind ebenfalls im Code.
- `OuterTuner` schreibt Sichtweite, Spawns und verwandte Werte des äußeren
  Spigot und ändert zur Laufzeit die geladenen Host-Welten. `neuterOuter`
  steht standardmäßig auf `true`.
- Dashboard ohne die späteren Flächen für Backup, Zeitpläne, Setup-Assistent,
  HTTPS, jcmd und cgroup-Schutz. Befehlsumfang im Wesentlichen Start, Stopp,
  Neustart, Status, Konsole, Config und Properties.
- `autoRestart.maxAttempts` standardmäßig 0, im Code als unbegrenzt behandelt.
- `server.properties` des Child erzwingt unter anderem Sichtweite 12,
  Simulationsdistanz 4 und `pause-when-empty-seconds: 0`.
- Die Betriebsdoku nennt ein konkretes Panel-Layout. Das ist die Beschreibung
  jener Fassung, kein Beleg für den heutigen Betrieb.

Die aktuelle Baseline 2.0.1 hat daraus ein einzelnes Child ohne Mod-Katalog,
mit Setup, Backup, Zeitplänen, HTTPS, begrenztem Neustart, cgroup-Schutz und
ohne `OuterTuner` gemacht. Gameplay-Defaults des Child bleiben Minecraft-Defaults;
erzwungen werden Port, Bind-Adresse und `pause-when-empty-seconds: 0`.

## Was dieser Pull Request ändert

Version 2.0.2 auf Basis von `388f633`. Kein Merge, kein Deploy, kein Neustart
eines laufenden Servers.

- Neue Klassen: `ChildProcessRecord`, `ChildLaunchCleanup`, `ChildStopSequence`,
  `SupervisorHealth`, `RuntimeLimits`, `GcDiagnostics`, `MemoryTelemetry`.
- `child-process.record` im Plugin-Datenordner. Fehlende Startzeit oder
  fehlende Jar-/Verzeichnis-Übereinstimmung verhindert das Beenden.
- Health-Check alle 5 Sekunden und ein eigener Memory-Scheduler.
- `memory-telemetry.log` aus der bestehenden cgroup-Probe. Heap und GC-Zähler
  sind die äußere Spigot-JVM (`heapJvm=outer`, `gcJvm=outer`) und werden in
  demselben Takt einmal gelesen. Child-Heap und Child-GC werden nicht gemessen.
  Die Diagnose zeigt diese letzte Probe; `rssMb` bleibt der Child-Prozess.
  Die Statusseite liest sie nicht erneut. Die Übersicht zeigt den
  Spigot-Heap aus den bestehenden Zählern und für den Child nur die
  konfigurierte Xmx-Decke.
- Der Memory-Scheduler bleibt vom `save-all`-Scheduler getrennt, weil der
  Notstopp sonst Speichern und Zeitpläne blockiert. Der Health-Check bleibt
  ein eigener Takt, damit dieselbe Blockade nicht die Prozessaufsicht trifft.
- Ungültige Speicherschwellen schalten nur den automatischen Stopp für diese
  Läufe ab. Wartezeiten über 7 Tage werden nur im Speicher gekappt.

## Migration und Grenzen

Bestehende `config.yml` bleibt gültig. `memory.xms` und `memory.xmx` werden
nicht angefasst. Fehlt `memoryTelemetry`, gilt Intervall 60 Sekunden, 5 MB und
eingeschaltet. Abschalten ist `memoryTelemetry.enabled: false`. Der bisherige
Versionslauf schreibt `metadata.pluginVersion` auf die laufende Plugin-Version
und migriert weiterhin nur das alte unbegrenzte `maxAttempts: 0`.

Nicht geprüft: ein laufender Spigot- oder Fabric-Prozess, ein echtes
cgroup-Limit eines Hosters, und der Dashboard-Browser gegen einen Server.
Die Tests starten lokale `sleep`- und `bash`-Prozesse und lesen die JVM-GC-Beans.
Ein Symlink als Prozessdatensatz oder Telemetrie-Log wird abgelehnt. Nach drei
fehlgeschlagenen Leseversuchen der Konsole wird die Pipe nicht weiter neu
gehängt; das wird geloggt.
