# Release notes

## ServerHoster 2.0.6

- Finish an accepted clean setup when the outer process actually exits. Spigot
  calls plugin disable before the JVM exits and 2.0.5 removed the shutdown hook
  there, so the deletion never ran. A pending clean now keeps that hook. The
  next startup still does not delete if the marker is pending; it marks the
  attempt aborted and requires a new preview.
- After a successful deletion the next start writes the fresh lobby and
  requires setup again, so the old child does not autostart.

## ServerHoster 2.0.5

- Fix clean-setup apply rejecting an unchanged server. The ticket now stores
  the survivor list as well as the deletion list. Apply checks that stored
  list against a fresh scan. A log, crash report, or lock file may change
  without invalidating the ticket. Any other new or removed path still
  rejects the apply.
- The clean-setup ticket and its temporary file are control files. Writing
  them does not change the plan hash. A ticket that loses its survivor list
  is rejected as incomplete.
- A provider start script inside the server root, such as `.serverstart/run.sh`,
  is deleted with the other non-boot files. The panel rewrites it on the next
  start. The Spigot jar, this plugin jar, `eula.txt`, `bundler`, `libraries`,
  and `versions` stay.

## ServerHoster 2.0.4

- Use Minecraft 26.3's official void flat preset, including `structure_overrides`.
- Choose another lobby name when that folder already exists.
- If the child does not stop, leave its supervision running and do not edit host files.
- If the state file cannot be saved after editing, restore the backed-up host files.
- Remember manageable heap-option values and put them back on rollback. They still do not change `-Xmx` and are not kept after an outer JVM restart unless minimization stays active.
- Add a separate clean-setup action. It stays off, does not run on first install, and has no built-in undo or hidden copy. Preview lists every deletion and survivor. Apply needs `CLEAN <server-identity> <plan-hash>` from a ticket that expires after 10 minutes and is rejected if the tree changed.
- Clean-setup deletes only inside the outer server directory, only after the child has stopped, and only while the outer server is shutting down. A failed stop aborts with no deletions. The Spigot jar, this plugin jar, `eula.txt`, `bundler`, `libraries`, and `versions` stay. Fresh port-preserving config is written on the next start.

## ServerHoster 2.0.3

- Add an explicit outer-host minimization. It is off until an administrator
  confirms `HOST MINIMIEREN` in the setup screen or with `/child host apply`.
  Nothing runs on first start.
- The action backs up `server.properties`, `bukkit.yml`, and `spigot.yml` under
  `plugins/ServerhosterPlugin/host-minimize-backup/` and can restore them with
  `HOST ZURUECK`. It does not delete worlds, plugins, logs, backups, or the
  child directory. A new empty lobby name is used; existing world folders stay.
- Outer view and simulation distance become 2, Nether and End are disabled,
  and mob spawning is turned off for that lobby only. Port, online-mode, and an
  already disabled RCON stay unchanged. The child still forces
  `pause-when-empty-seconds=0`.
- Manageable outer JVM options may be set. They do not change `-Xmx` and do
  not call `System.gc`. Unsupported options are reported. The plugin does not
  restart the outer host; the panel restart remains manual. A running child is
  stopped gracefully before the files are written.

## ServerHoster 2.0.2

- Keep every 2.0.1 feature. Do not change configured `Xms`/`Xmx`, Lithium or
  other gameplay settings, view/simulation distance, worlds, or pause the child
  when it is empty.
- Record child PID, start instant, working directory and jar. A later start
  stops that process only when the live process still matches; a reused PID is
  left alone.
- Reattach a detached console pipe or exit watcher, and schedule the existing
  bounded restart if the watcher missed an exit. Drain and destroy a process
  whose start fails after `ProcessBuilder.start()`.
- Keep command and dashboard stop/restart off the Spigot main thread. Run
  memory sampling and its emergency child stop on a separate scheduler so
  `save-all` and schedules are not blocked by that work. `onDisable` still
  waits for the child stop before the JVM exits.
- Add read-only `memory-telemetry.log`. Heap, RSS, host meminfo, cgroup and
  GC counters are taken on the existing memory sample. Status polling does
  not read them again. Heap and GC counters are the outer Spigot JVM
  (`heapJvm=outer`, `gcJvm=outer`); child heap and child GC are not measured.
  On `/api/diag`, `rssMb` remains the child process RSS. A GC cycle duration
  is observed, not proof about a pause target. Host swap occupancy is not
  treated as a container OOM.
- Invalid memory thresholds disable automatic child stop without rewriting
  stored config. Negative wait values still mean 0 seconds. Waits above 7 days
  are capped only in memory.
- After automatic restarts are exhausted, the status keeps the start failure
  (`start failed: ... , gave up`) instead of replacing it with `preparing`.
- Existing `config.yml` remains valid. A missing `memoryTelemetry` block uses
  the documented defaults. Startup still updates only `metadata.pluginVersion`
  (and the legacy unlimited restart value, if present).

## ServerHoster 2.0.1

- Pause automatic child restarts after five consecutive retry attempts by
  default; configure the retry limit and backoff in Dashboard > Einstellungen.
- Migrate the legacy unlimited-retry value (`maxAttempts: 0`, used by 1.x and
  2.0.0 configs, including imported ones) to five attempts; invalid retry
  limits fail closed instead of creating an unbounded restart loop.
- Add a dedicated settings workflow for rarely changed restart and FTP/FTPS
  connection settings. Credentials remain in the local `secrets.yml`.
- Expand recovery, schedule execution, and memory-protection tests.

## ServerHoster 2.0.0

- Replace multi-profile operation with a strict single-child model.
- Add a first-run wizard that blocks automatic child start until setup is
  confirmed; support fresh setup, attaching an existing directory, and
  configuration import from ServerHoster 1.10.1+.
- Discover likely child directories when old plugin configuration is missing;
  show ambiguous matches for explicit administrator selection.
- Move the plugin data directory to `plugins/ServerhosterPlugin/`. Offer
  separately confirmed, optional cleanup of old plugin files while retaining
  local backups and memory incident reports.
- Remove mod/plugin catalogues, automatic mod installation, and mod toggles.
  New setup does not install mods or plugins.
- Add dashboard-managed hourly, daily, and weekly schedules with ordered
  console-command and backup actions. Schedules are persisted in YAML.
- Keep backups on-demand unless a schedule is configured; preserve optional
  local or FTP/FTPS storage, and optional external JDBC metadata.
- Keep ntfy notifications optional and configurable during setup.
- Change sustained critical-memory protection to warn and gracefully stop only
  the child server. The plugin never automatically stops the outer Spigot host.
- Retain raw `config.yml` and `server.properties` editors, read-only
  diagnostics, optional dashboard HTTPS, and the VoxelDash MIT notice.

### Inspiration and attribution

Operational workflows take inspiration from Pterodactyl Wings and Crafty
Controller. The MSPT display is inspired by spark and uses only vanilla `tick
query`; spark is not installed. Paper artifact handling draws on PaperMC Fill
v3. The `.jar.disabled` convention is associated with Prism/Modrinth. Spigot
builds use the official Spigot BuildTools. VoxelDash-derived dashboard elements
retain the required MIT license notice in the plugin JAR and dashboard.

## ServerHoster 1.10.1

- Add a read-only dashboard preview of `server.properties` changes enforced or
  added at the next child start.

## ServerHoster 1.10.0

- Restyle the dashboard with VoxelDash-inspired navigation and browser-session
  charts while retaining ServerHoster-backed data.
- Add remote FTP/FTPS backups, optional external JDBC metadata, and optional
  ntfy notifications.
- Keep backup storage local by default.
- Keep the VoxelDash MIT notice in the plugin JAR and dashboard.
