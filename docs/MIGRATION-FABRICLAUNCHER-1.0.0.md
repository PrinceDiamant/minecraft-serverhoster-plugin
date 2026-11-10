# Upgrade von ServerHoster 2.4.2 auf 2.4.3

Das Plugin-Jar ersetzen; Konfiguration und Child-Ordner bleiben erhalten.
`/api/setup` liefert `required` und `completed` aus demselben Snapshot.

## Vorheriges Upgrade: 2.4.1 auf 2.4.2

Das Plugin-Jar ersetzen; Konfiguration und Child-Ordner bleiben erhalten.

## Vorheriges Upgrade: 2.4.0 auf 2.4.1

Das Plugin-Jar ersetzen; Konfiguration und Child-Ordner bleiben erhalten.
Bei `type: custom` werden relative `customJar`-Pfade jetzt wie dokumentiert
vom Child-Ordner aus aufgelöst. Wurde bisher ein relativer Pfad absichtlich
vom Host-Ordner aus angegeben, muss er entsprechend angepasst werden.

## Vorheriges Upgrade: 2.3.2 auf 2.4.0

Das Plugin lädt weiter aus `plugins/ServerhosterPlugin/`. Ein Upgrade von
2.3.2 ist der Austausch des Jars. `config.yml`, Dashboard-Passwort, Secrets
und der Child-Ordner bleiben liegen. Der Start schreibt
`metadata.pluginVersion` fort. `autoRestart.maxAttempts: 0` wird weiterhin
auf 5 gesetzt. Einträge unter `servers:`, `focusServer` und `tasks` werden
entfernt und nicht mehr gelesen. Zeitpläne unter `schedules` bleiben. Es gibt
genau einen Child.

Ältere Datenordner unter `plugins/FabricLauncher/` und Jars mit dem Namen
`FabricLauncher` werden nicht mehr importiert oder aufgeräumt. Wer von so
einer Installation kommt, richtet den Child im Dashboard neu ein oder
übernimmt die Werte von Hand in `plugins/ServerhosterPlugin/config.yml`.

Der Child-Ordner selbst wird beim Upgrade nicht verändert.
