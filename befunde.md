[[00 Start]]

# befunde

| Kategorie | Einschätzung | Fundstelle | Diagramm |
| --- | --- | --- | --- |
| doppelte Implementierung | sicher | ui/src/App.tsx:100–141 und src/main/resources/web/index.html | [[Dashboard-UI]] |
| doppelte Implementierung | sicher | App.tsx:100–141 entfernt loadPlayers/loadSetup/loadBackup/loadTasks | [[App.readLegacyDashboard]] |
| Altlast | sicher | FabricLauncherPlugin.java:151 und config.yml:93 Kommentar Deprecated | [[FabricLauncherPlugin.fireDueTasks]] |
| Altlast | sicher | config.yml:92–93 tasks neben schedules | [[Zeitplaene]] |
| angemeldet aber nicht umgesetzt | sicher | FabricLauncherPlugin.java:266–272 getFirst verwirft servers.* | [[FabricLauncherPlugin.reloadProfiles]] |
| angemeldet aber nicht umgesetzt | sicher | ServerProfile.java Profiles.load liest servers.*, reloadProfiles nutzt nur den ersten | [[Profiles.load]] |
| angemeldet aber nicht umgesetzt | wahrscheinlich | ServerProfile.java:85, nur Tests rufen Profiles.focus | [[Profiles.focus]] |
| angemeldet aber nicht umgesetzt | wahrscheinlich | ServerProfile.java:79, nur Tests rufen Profiles.portClash | [[Profiles.portClash]] |
| Logikrisiko | sicher | Z.153 Fallback 30 s, writeMemoryIncidentReport Z.1223 Fallback 15 s, config.yml:38 ist 15 | [[FabricLauncherPlugin.onEnable]] |
| Logikrisiko | sicher | FabricLauncherPlugin.java:241–242 rwxrwxrwx und rw-rw-rw-. Kommentar Z.240 sagt rw für group/other | [[FabricLauncherPlugin.makeWritable]] |
| Kommentar widerspricht Code | sicher | Z.1175 Emergency restart warning, Z.1197–1199 wantRunning=false und stopBlocking, kein Start | [[FabricLauncherPlugin.requestChildEmergencyStop]] |
| Logikrisiko | sicher | ServerProfile.java:103 Fallback fabric, config.yml:2 type vanilla | [[Profiles.one]] |
| Altlast | sicher | Z.1030–1031 liest memoryProtection.autoShutdown als Fallback | [[FabricLauncherPlugin.sampleHostMemory]] |
| Altlast | sicher | BackupWorkflow.tsx:214 server= aus #srv; index.html hat nur CSS #srv | [[BackupWorkflow.BackupWorkflow]] |
| Logikrisiko | sicher | Dashboard.java nimmt die Fokus-ID, Query server wird ignoriert | [[Dashboard.backupDownload]] |
| Logikrisiko | prüfen | Dashboard.java:676 Kommentar CLK_TCK=100, Division durch 100 | [[Dashboard.cpu]] |
| Kommentar widerspricht Code | sicher | Feldkommentar Z.66 once per second, runTaskTimer Z.1815 Periode 1 Tick, Schreiben alle 20 Ticks Z.1806 | [[FabricLauncherPlugin.startSampler]] |
| Altlast | wahrscheinlich | HostFirstSetup.java:35 akzeptiert pending; Schreibstelle nur HostMinimizeTest.java:216 | [[HostFirstSetup.shouldRun]] |
| Altlast | sicher | index.html:77 return path | [[index.scoped]] |
| doppelte Implementierung | sicher | index.html:220 setInterval 3000 ms läuft in der React-Hülle weiter | [[index.start]] |
| toter Code | wahrscheinlich | src/main/java/de/aichele/childlauncher/HostFirstSetup.java:58–60 nur von Tests erreicht | [[HostFirstSetup.apply(Path,Path,Path,Path)]] |
| toter Code | wahrscheinlich | src/main/java/de/aichele/childlauncher/HostFirstSetup.java:116–118 nur von Tests erreicht | [[HostFirstSetup.completeRestart(Path,Path,Path,Set)]] |
| toter Code | wahrscheinlich | src/main/java/de/aichele/childlauncher/ChildProcessRecord.java:44–59 nur von Tests erreicht | [[ChildProcessRecord.liveInspector]] |
| toter Code | wahrscheinlich | src/main/java/de/aichele/childlauncher/ChildProcessRecord.java:46–48 nur von Tests erreicht | [[ChildProcessRecord.liveInspector.find]] |
| toter Code | wahrscheinlich | src/main/java/de/aichele/childlauncher/ChildProcessRecord.java:49–51 nur von Tests erreicht | [[ChildProcessRecord.liveInspector.destroy]] |
| toter Code | wahrscheinlich | src/main/java/de/aichele/childlauncher/ChildProcessRecord.java:52–54 nur von Tests erreicht | [[ChildProcessRecord.liveInspector.destroyForcibly]] |
| toter Code | wahrscheinlich | src/main/java/de/aichele/childlauncher/ChildProcessRecord.java:55–57 nur von Tests erreicht | [[ChildProcessRecord.liveInspector.alive]] |
| toter Code | wahrscheinlich | src/main/java/de/aichele/childlauncher/ChildProcessRecord.java:61–74 nur von Tests erreicht | [[ChildProcessRecord.observe]] |
| toter Code | wahrscheinlich | src/main/java/de/aichele/childlauncher/ServerProfile.java:54–59 kein Produktionsaufruf im Aufrufgraph | [[ServerProfile.view]] |
| toter Code | wahrscheinlich | src/main/java/de/aichele/childlauncher/ServerProfile.java:79–83 nur von Tests erreicht | [[Profiles.portClash]] |
| toter Code | wahrscheinlich | src/main/java/de/aichele/childlauncher/ServerProfile.java:85–89 nur von Tests erreicht | [[Profiles.focus]] |
| toter Code | wahrscheinlich | src/main/java/de/aichele/childlauncher/HostMinimize.java:102–104 nur von Tests erreicht | [[HostMinimize.playersBlocked]] |
| toter Code | sicher | src/main/java/de/aichele/childlauncher/VersionCatalog.java:97–97 kein Aufruf, kein Treffer in plugin.yml/UI/Strings | [[VersionCatalog.newestFirst]] |
| toter Code | wahrscheinlich | src/main/java/de/aichele/childlauncher/BackupBridge.java:241–246 nur von Tests erreicht | [[BackupBridge.count]] |
| toter Code | wahrscheinlich | src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:290–290 kein Produktionsaufruf im Aufrufgraph | [[FabricLauncherPlugin.profiles]] |
| toter Code | prüfen | src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:304–304 kein Produktionsaufruf im Aufrufgraph; Name kommt in UI, Config oder anderem Text vor | [[FabricLauncherPlugin.running()]] |
| toter Code | prüfen | src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:305–305 kein Produktionsaufruf im Aufrufgraph; Name kommt in UI, Config oder anderem Text vor | [[FabricLauncherPlugin.running(String)]] |
| toter Code | prüfen | src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:306–306 kein Produktionsaufruf im Aufrufgraph; Name kommt in UI, Config oder anderem Text vor | [[FabricLauncherPlugin.pid()]] |
| toter Code | prüfen | src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:307–307 kein Produktionsaufruf im Aufrufgraph; Name kommt in UI, Config oder anderem Text vor | [[FabricLauncherPlugin.pid(String)]] |
| toter Code | sicher | src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:308–308 kein Aufruf, kein Treffer in plugin.yml/UI/Strings | [[FabricLauncherPlugin.uptimeMillis()]] |
| toter Code | sicher | src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:309–309 kein Aufruf, kein Treffer in plugin.yml/UI/Strings | [[FabricLauncherPlugin.uptimeMillis(String)]] |
| toter Code | sicher | src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:310–310 kein Aufruf, kein Treffer in plugin.yml/UI/Strings | [[FabricLauncherPlugin.lastStatus()]] |
| toter Code | sicher | src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:311–311 kein Aufruf, kein Treffer in plugin.yml/UI/Strings | [[FabricLauncherPlugin.lastStatus(String)]] |
| toter Code | prüfen | src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:312–312 kein Produktionsaufruf im Aufrufgraph; Name kommt in UI, Config oder anderem Text vor | [[FabricLauncherPlugin.console()]] |
| toter Code | prüfen | src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:314–314 kein Produktionsaufruf im Aufrufgraph; Name kommt in UI, Config oder anderem Text vor | [[FabricLauncherPlugin.players()]] |
| toter Code | sicher | src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:318–318 kein Aufruf, kein Treffer in plugin.yml/UI/Strings | [[FabricLauncherPlugin.requestStart()]] |
| toter Code | sicher | src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:319–319 kein Aufruf, kein Treffer in plugin.yml/UI/Strings | [[FabricLauncherPlugin.requestStop()]] |
| toter Code | sicher | src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:320–320 kein Aufruf, kein Treffer in plugin.yml/UI/Strings | [[FabricLauncherPlugin.requestRestart()]] |
| toter Code | prüfen | src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:335–337 kein Produktionsaufruf im Aufrufgraph; Name kommt in UI, Config oder anderem Text vor | [[FabricLauncherPlugin.focus]] |
| toter Code | wahrscheinlich | src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:859–859 kein Produktionsaufruf im Aufrufgraph | [[FabricLauncherPlugin.workDir()]] |
| toter Code | sicher | src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:861–861 kein Aufruf, kein Treffer in plugin.yml/UI/Strings | [[FabricLauncherPlugin.workDirs]] |
| toter Code | wahrscheinlich | src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:863–863 kein Produktionsaufruf im Aufrufgraph | [[FabricLauncherPlugin.upstream]] |
| toter Code | prüfen | src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:866–866 kein Produktionsaufruf im Aufrufgraph; Name kommt in UI, Config oder anderem Text vor | [[FabricLauncherPlugin.msptHistory()]] |
| toter Code | prüfen | src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:867–867 kein Produktionsaufruf im Aufrufgraph; Name kommt in UI, Config oder anderem Text vor | [[FabricLauncherPlugin.msptHistory(String)]] |
| toter Code | sicher | src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:1422–1425 kein Aufruf, kein Treffer in plugin.yml/UI/Strings | [[FabricLauncherPlugin.backupFile]] |
