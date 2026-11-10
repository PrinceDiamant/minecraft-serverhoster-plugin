[[00 Start]]

# bericht

- Commit: `95b02b953b0b4c23673e900e021a7c3c844aa37d` (https://github.com/Sciddie/minecraft-serverhoster-plugin/commit/95b02b953b0b4c23673e900e021a7c3c844aa37d).
- Seiten: 2002 inklusive befunde und bericht.
- Diagramme: 2012.
- Seiten je Ebene:
  - Ebene 0: 1
  - Ebene 1: 11
  - Ebene 2: 60
  - Ebene 3: 370
  - Ebene 4: 845
  - Ebene 5: 558
  - Ebene 6: 157
- Ungeprüfte Aussagen:
  - Dashboard.handle: 1 eigene Aufrufe nur in Dashboard.handle.Aufrufe
  - Dashboard.schedulesApi: 4 eigene Aufrufe nur in Dashboard.schedulesApi.Aufrufe
  - Dashboard.saveConfig: 1 eigene Aufrufe nur in Dashboard.saveConfig.Aufrufe
  - FabricLauncherPlugin.runSchedule: 5 eigene Aufrufe nur in FabricLauncherPlugin.runSchedule.Aufrufe
- Zehn wichtigste Befunde:
  1. Doppelte Oberfläche: React in `ui/` baut `web/index.html` um (`App.readLegacyDashboard`). Sicher.
  2. Altlast `tasks`: `fireDueTasks` läuft weiter alle 20 s, `config.yml` nennt die Liste deprecated. Sicher.
  3. `Profiles.load` liest `servers.*`, `focus` und `portClash`; `reloadProfiles` behält nur `getFirst()`. Sicher.
  4. Sample-Intervall: Scheduler-Fallback 30 s (`FabricLauncherPlugin` Z.153), Bericht und `config.yml` 15 s. Sicher.
  5. `makeWritable` setzt 0777/0666 (`rwxrwxrwx` / `rw-rw-rw-`). Sicher.
  6. Logzeile Emergency restart, der Code stoppt den Child und startet ihn nicht neu (Z.1175 gegen Z.1197). Sicher.
  7. `Profiles.one` fällt auf `type=fabric` zurück, `config.yml` liefert `vanilla`. Sicher.
  8. `memoryProtection.autoShutdown` wird nach der Umbenennung weiter gelesen (Z.1031). Sicher.
  9. Backup-Download hängt `server=` an `#srv`; das Legacy-HTML hat kein Element `#srv`, `Dashboard` nimmt die Fokus-ID. Sicher.
  10. `Dashboard.cpu` rechnet mit CLK_TCK=100 (Z.676). Prüfen. Daneben: Feldkommentar once per second, Sampler läuft jeden Tick (Z.66 gegen Z.1815).

Bibliotheken, JDK, Spigot-API, React und Maven sind Blackboxen. Genannt ist nur, was der eigene Code damit tut.
