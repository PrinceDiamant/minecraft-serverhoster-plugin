# ServerHoster 2.3.2 – Betrieb und Konfiguration

ServerHoster ist ein Spigot-26.3-Plugin für Java 25. Es verwaltet genau einen
separaten Child-Serverprozess und stellt ein Web-Dashboard bereit. Das Plugin
installiert keine Mods oder Plugins, enthält keine Server-Jars und besitzt
keine Ingame-GUI. Das Dashboard ist die administrative Oberfläche.

Für Installation und Upgrade siehe [SETUP.md](SETUP.md) und
[MIGRATION-FABRICLAUNCHER-1.0.0.md](MIGRATION-FABRICLAUNCHER-1.0.0.md).

## Lebenszyklus und Einrichtung

Beim ersten Start legt das Plugin `plugins/ServerhosterPlugin/` an und
verlangt eine Bestätigung im Einrichtungsassistenten, bevor ein Child
automatisch gestartet werden darf. Der Assistent kann einen neuen Server
konfigurieren oder einen vorhandenen Child-Ordner einbinden. Eine begrenzte,
lesende Erkennung durchsucht direkte Ordner unter dem Spigot-Root nach
üblichen Serverdateien. Mehrdeutige Treffer müssen explizit ausgewählt werden.

Neue Child-Installationen verwenden standardmäßig Vanilla. Unterstützt werden
Vanilla, Fabric, Paper, Spigot und ein eigenes Server-Jar. Typabhängige
Artefakte werden erst bei einem ausdrücklichen Child-Start geladen oder gebaut.
Ein eingebundener Child wird nicht automatisch verändert. Zeitpläne werden
ebenfalls im Dashboard verwaltet und in `config.yml` gespeichert.

## Konfiguration

Der rohe `config.yml`-Editor bleibt verfügbar. Änderungen an Zeitplänen aus
dem Dashboard verwenden denselben YAML-Konfigurationsstand. Die Datei vor
manuellen Änderungen sichern. Fehlerhaftes YAML oder ungültige Werte werden
gemeldet, nicht stillschweigend ersetzt.

| Schlüssel | Standard | Bedeutung |
|---|---|---|
| `setup.completed` | Vorlage: `false` | Assistent setzt diesen Wert nach bestätigter Einrichtung. |
| `type` | `vanilla` | `vanilla`, `fabric`, `paper`, `spigot` oder `custom`. |
| `mcVersion` | `26.3` | Minecraft-Version des Childs. |
| `workingDir` | `./child-server` | Child-Ordner, relativ zum Spigot-Arbeitsverzeichnis oder absolut. |
| `port` | `2063` | Spielport des Childs; muss vom Hoster freigegeben sein. |
| `serverIp` | `""` | Leer übernimmt die `server-ip` des Spigot-Hosts; ein nicht leerer Wert überschreibt sie. |
| `customJar` | `server.jar` | Jar-Pfad bei `type: custom`. |
| `memory.xms` / `memory.xmx` | `2G` / `5G` | Initialer und maximaler Child-Heap. Native Speicheranteile und der äußere Server brauchen zusätzliche Reserve. |
| `jvmFlags` | `-XX:+UseG1GC` | Zusätzliche JVM-Optionen. |
| `serverArgs` | `[]` | Zusätzliche Server-Argumente nach `nogui`. |
| `autoStart` | `true` | Child mit Spigot starten, sobald Einrichtung und Recovery-Schutz es erlauben. |
| `autoRestart.enabled` | `true` | Child nach unerwartetem Prozessende neu starten. |
| `autoRestart.maxAttempts` | `5` | Automatische Wiederholungen pro Fehlerfolge, danach Pause und Warnung. Im Dashboard unter Einstellungen änderbar. |
| `stopTimeoutSeconds` | `60` | Frist für den sauberen Child-Stopp, danach wird der Prozess notfalls beendet. Bei großen Welten oder vielen geladenen Chunks kann das Speichern länger dauern; dann die Frist erhöhen, sonst droht Datenverlust. Bei Host-Abschaltung kann zusätzlich die kürzere `shutdownHookTimeoutSeconds`-Frist bzw. das Provider-Limit gelten. |
| `startupStopTimeoutSeconds` | `180` | Beim Stop während des Starts auf die Vanilla-Bereitschaftsmeldung warten. |
| `memoryProtection.*` | siehe `config.yml` | Lesendes cgroup-Sampling und Schutz, der nur den Child stoppen kann. Ungültige Schwellen deaktivieren den automatischen Stopp, ohne die Datei umzuschreiben. |
| `memoryTelemetry.enabled` | `true`, auch wenn der Schlüssel fehlt | Schreibt `memory-telemetry.log` aus derselben cgroup-Messung. `heapJvm=outer` und `gcJvm=outer`: Heap und GC sind die äußere Spigot-JVM. Child-Heap und Child-GC werden nicht gemessen. `rssMb` in `/api/diag` ist der Child-Prozess. |
| `memoryTelemetry.intervalSeconds` | `60` | Mindestwert zur Laufzeit 15 Sekunden. Gespeicherte Werte unter 15 oder über 7 Tagen werden nicht in die Datei zurückgeschrieben. |
| `memoryTelemetry.maxBytes` | `5000000` | Danach wird die bisherige Datei zu `memory-telemetry.log.old`. |
| `serverProperties` | `{}` | Explizite Child-Overrides; alle übrigen Werte bleiben Minecraft-Defaults. |
| `schedules` | `[]` | Dashboard-Zeitpläne mit Stunde, Tag oder Woche und geordneten Aktionen. |
| `backup.storage` | `local` | Lokale ZIP-Dateien als Standard, FTP/FTPS optional. |
| `backup.paths` | `world` | Zu sichernde Pfade innerhalb des Child-Ordners. |
| `backup.database.enabled` | `false` | Optionale externe JDBC-Metadaten; keine lokale Datenbank. |
| `dashboard.enabled` | `true` | Dashboard aktivieren. |
| `dashboard.port` | `2064` | Dashboard-Port. |
| `dashboard.bind` | `""` | Leer verwendet die effektive Child-Bind-Adresse; bei Bedarf Interface explizit setzen. |
| `dashboard.https.enabled` | `false` | HTTPS optional; Modi: selbstsigniert, Keystore oder PEM. |
| `notifications.ntfy.enabled` | `false` | Optionale ntfy-Benachrichtigungen; Thema muss gesetzt sein. |

Der Datei-Editor sowie die Ansichten für `config.yml` und `server.properties`
bieten Syntaxhervorhebung für YAML, JSON, Properties, TOML und JavaScript;
andere Dateitypen werden als einfacher Text angezeigt. Die Hervorhebung
validiert oder verändert den Inhalt nicht.

Das Plugin
setzt Child-Port und Bind-Adresse und deaktiviert
`pause-when-empty-seconds`. Es nimmt keine Gameplay-Optimierungen am Child vor
und installiert keine Gameplay-Erweiterungen.

Die Host-Bind-Adresse wird beim Start von Spigot aus dessen `server.properties`
übernommen. Ist dort `server-ip` leer, bindet auch der Child standardmäßig an
alle Interfaces; das ist keine öffentlich erreichbare IP-Adresse. Die Anzeige im
Dashboard beschreibt die Bind-Adresse, nicht notwendigerweise eine öffentliche
Verbindungsadresse. Eine konkrete Adresse muss auf dem Host lokal verfügbar sein.
Bestehende nicht leere `serverIp`-Werte, auch `0.0.0.0`, bleiben beim Upgrade
unverändert und haben Vorrang. Um die Host-Adresse automatisch zu übernehmen,
`serverIp: ""` in der ServerHoster-Konfiguration setzen und den Host neu starten.
Die Standard-Bindung des Dashboards folgt ebenfalls dieser Adresse; ein
explizites `dashboard.bind` hat dort Vorrang.

Die Dashboard-Übersicht zeigt nur die zum Child-Zustand passenden Aktionen:
Ein gestoppter Child kann gestartet, ein laufender gestoppt oder neu gestartet
werden. Während des Starts kann der Start abgebrochen werden; ein ausstehender
automatischer Neustart lässt sich mit „Stoppen“ abbrechen. Beim Stoppen und bei
nicht verfügbarem Status werden widersprüchliche Aktionen gesperrt. Konsolenbefehle
sind verfügbar, sobald der Child seine Bereitschaft gemeldet hat.

Die Spielerverwaltung aktualisiert sichtbare Listen alle zehn Sekunden. Beim
Öffnen und über „Aktualisieren“ wird beim laufenden, bereiten Child zusätzlich
der `list`-Befehl angefordert; die Antwort erscheint gegebenenfalls beim
nächsten Aktualisierungsintervall. Fehler beim Lesen von Spielerlisten werden
angezeigt statt als leere Listen ausgegeben.

Dashboard-Seiten besitzen eigene Adressen wie `/dashboard`, `/players`,
`/files` und `/settings`. Ein Neuladen oder ein direkter Link öffnet dieselbe
Seite nach der Anmeldung. Solange die Ersteinrichtung erforderlich ist, führt
ein direkter Link stattdessen zur Einrichtung.

Die Verkleinerung des äußeren Spigots ist ab 2.0.3 eine eigene, ausgeschaltete
Aktion in der Einrichtung und über `/child host`. Sie sichert die drei
Host-Konfigurationsdateien, legt einen neuen leeren Weltnamen fest und ändert
Sichtweite, Nether, End und Spawn des äußeren Servers. Sie löscht keine Welten,
Plugins, Logs oder Backups und startet den Host nicht neu. `-Xmx` bleibt.

## Dashboard

Bei der Ersteinrichtung wird ein einmaliger Code im Host-Log ausgegeben. Mit
diesem Code wird im Dashboard ein Passwort gesetzt oder sicher erzeugt.
Der Code gilt nur bis zum nächsten Host-Neustart oder zur Passwortvergabe;
vorher sind Verwaltungsfunktionen gesperrt. Das Passwort liegt in
`plugins/ServerhosterPlugin/dashboard-password.txt`. Vorhandene Passwörter
bleiben beim Upgrade erhalten. Das Dashboard bietet
Child-Status, Start/Stop/Neustart, Konsole, Spielerverwaltung, Datei- und
Logzugriff, rohe Konfigurationseditoren, Diagnose, Backup-Verwaltung,
Zeitpläne, selten geänderte Einstellungen und Versionsinformationen. Der
Einstellungen-Tab bündelt Restart-Grenzen sowie Backupziel, -pfade,
Aufbewahrung und FTP/FTPS-Zugangsdaten. Das Passwort kann im Dashboard gesetzt
werden, wird anschließend nicht mehr angezeigt und liegt lokal in
`secrets.yml`. Eine leere Passworteingabe behält das bisherige Passwort.
Bei Dashboard-HTTP werden neue Zugangsdaten unverschlüsselt zum Dashboard
übertragen; AUTO kann auf unverschlüsseltes FTP zurückfallen.

In nicht vertrauenswürdigen Netzwerken HTTPS verwenden. Unterstützt werden
selbstsignierte Zertifikate, vorhandene PKCS12-/JKS-Keystores und PEM-Dateien.
Bei einem selbstsignierten Zertifikat muss das Zertifikat auf den Clients
vertrauenswürdig gemacht werden. HTTPS beschränkt nicht automatisch den
Dashboard-Zugriff. Das Dashboard ist geschützt zu betreiben, da es
Konsolenbefehle und Child-Dateiverwaltung ermöglicht.

`/child` ist der Befehlsstamm (Berechtigung `serverhoster.admin`, standardmäßig
OP). Verfügbar sind u.a. Start, Stop, Neustart, Status, Konsolenbefehle,
Konfigurations-/Property-Änderungen, Diagnose, Backup, Aufgabenliste und
manuelles Ausführen eines Tasks. Zeitpläne werden primär über das Dashboard
erstellt und bearbeitet.

## Zeitpläne und Backups

Das Dashboard kann Stunden-, Tages- und Wochenpläne erstellen, bearbeiten,
aktivieren/deaktivieren, löschen und manuell ausführen. Jeder Plan enthält
eine oder mehrere geordnete Aktionen: unterstützte Child-Konsolenbefehle und
Backup. Der Scheduler wertet die konfigurierte Zeitzone aus. Die Pläne liegen
in YAML und benötigen keinen Child-Neustart.

Ein geplanter Backup-Task wartet, solange Spieler online sind. Ist der Child
leer, wird er gespeichert und sauber gestoppt, die konfigurierten Pfade aus
`backup.paths` werden archiviert und ein zuvor laufender Child danach wieder
gestartet. Fehler erscheinen im Spigot-Log und zusätzlich über ntfy, wenn
konfiguriert.

Backups laufen nur auf Anforderung, solange kein Zeitplan angelegt wurde.
Lokale ZIP-Dateien sind Standard; FTP/FTPS ist optional. JDBC-Einstellungen
konfigurieren ein externes Metadatenziel. H2 ist nur für Tests vorgesehen und
nicht im Plugin-Jar enthalten.

## Prozesslebenszyklus ab 2.0.2

Vor einem Start liest das Plugin `plugins/ServerhosterPlugin/child-process.record`.
Ein dort genannter Prozess wird nur beendet, wenn PID, Startzeitpunkt und
Jar-Argument oder Arbeitsverzeichnis übereinstimmen. Ein wiederverwendeter PID
bleibt unangetastet. Schlägt der Start nach dem Erzeugen des Prozesses fehl,
werden Ausgabe abgeleitet und der Prozess beendet. Konsole und Exit-Watcher
werden neu verbunden, wenn sie ausfallen. Der automatische Neustart bleibt bei
höchstens fünf Versuchen, sofern die Konfiguration das nicht anders sagt.

Stopp und Neustart aus Befehl und Dashboard laufen nicht auf dem Spigot-Thread.
`onDisable` wartet weiterhin auf den Child-Stopp. Der Shutdown-Hook bleibt für
SIGTERM erhalten und wird nach einem normalen `onDisable` entfernt.
Speichermessung und ein eventueller Child-Notstopp blockieren nicht mehr den
Scheduler von `save-all` und Zeitplänen.

`pause-when-empty-seconds` bleibt am Child `0`. Die optionale Host-Minimierung
ändert nur den äußeren Spigot und pausiert auch dort nicht im Leerlauf.
Der Vergleich mit der Minimal-Variante und die Abgrenzung zur Baseline stehen
in [VERGLEICH-MINIMAL-2026-11.md](VERGLEICH-MINIMAL-2026-11.md).

## Diagnose und Speicherschutz

Diagnose ist lesend. JVM-Informationen werden mit `jcmd` über `Thread.print`,
`GC.heap_info` und `VM.flags` gesammelt. Minecraft-Tick-/MSPT-Daten kommen
vom Vanilla-Kommando `tick query`. Es wird kein Diagnose-Mod installiert.

Der Speicher-Monitor liest Host-/Container- und cgroup-Messwerte, ändert diese
aber nicht. Heap belegt, committed und maximal, Prozess-RSS, Host-`meminfo`
und cgroup-Zähler beschreiben verschiedene Ebenen. Ein voller Host-Swap belegt
keinen Container-OOM. Die Dauer des letzten GC-Zyklus belegt nicht, ob ein
Pause-Ziel eingehalten wurde. Ein automatischer Child-Notstopp setzt eine bekannte endliche
cgroup-Grenze und mehrere aufeinanderfolgende kritische Messungen voraus.
Fehlende oder unbekannte Grenzen lösen keinen automatischen Stopp aus. Das
Plugin kann warnen, Speichern anfordern, einen Incident-Bericht schreiben und
nur den Child sauber herunterfahren. Der äußere Spigot-Host wird niemals
automatisch beendet. Warnungen und Bericht prüfen; einen Host-Neustart bei
Bedarf im Hosting-Panel des Providers planen.

## Inspiration

Betriebsabläufe sind inspiriert von Pterodactyl Wings und Crafty Controller.
Die MSPT-Anzeige ist von spark inspiriert, nutzt jedoch nur Vanilla `tick
query`; spark wird nicht installiert. Die Paper-Artefaktbehandlung lehnt sich
an PaperMC Fill v3 an. Die `.jar.disabled`-Konvention ist von Prism/Modrinth
bekannt. Spigot-Builds verwenden die offiziellen Spigot BuildTools.
VoxelDash-inspirierte Dashboard-Elemente behalten den nötigen MIT-
Lizenzhinweis im Plugin-Jar und Dashboard.
