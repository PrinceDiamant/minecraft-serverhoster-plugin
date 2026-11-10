# Upgrade von ServerHoster 2.3.2

Das Plugin lädt weiter aus `plugins/ServerhosterPlugin/`. Ein Upgrade von
2.3.2 ist der Austausch des Jars. `config.yml`, Dashboard-Passwort, Secrets
und der Child-Ordner bleiben liegen. Der Start schreibt
`metadata.pluginVersion` fort. `autoRestart.maxAttempts: 0` wird weiterhin
auf 5 gesetzt. Einträge unter `servers:` und `focusServer` werden entfernt
und nicht mehr gelesen. Es gibt genau einen Child.

Ältere Datenordner unter `plugins/FabricLauncher/` und Jars mit dem Namen
`FabricLauncher` werden nicht mehr importiert oder aufgeräumt. Wer von so
einer Installation kommt, richtet den Child im Dashboard neu ein oder
übernimmt die Werte von Hand in `plugins/ServerhosterPlugin/config.yml`.

Der Child-Ordner selbst wird beim Upgrade nicht verändert.
