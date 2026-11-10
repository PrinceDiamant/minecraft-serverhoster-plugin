[[00 Start]]

# Glossar

Wörter, die in den Diagrammen vorkommen, in Alltagssprache. Der Link unter einem Wort führt an die Stelle, an der es im Programm eine Rolle spielt.

## Plugin

Ein Zusatzprogramm für einen Minecraft-Server. Dieses Plugin heißt ServerHoster. Es startet einen weiteren Server und bedient ihn.

Im Diagramm: [[Plugin-Kern]].

## Host

Der Minecraft-Server, auf dem das [[Glossar#Plugin|Plugin]] installiert ist. Er bleibt der eigene Server. Den Server, den er zusätzlich startet, nennt das Glossar [[Glossar#Spielserver|Spielserver]].

Im Diagramm: [[Host-Betrieb]].

## Spielserver

Der Minecraft-Server, den das [[Glossar#Plugin|Plugin]] als eigenes Programm startet und steuert. Im [[Glossar#Quelltext|Quelltext]] heißt er Child. Es gibt praktisch nur einen.

Im Diagramm: [[Child-Prozess]].

## Bedienseite

Die Webseite im Browser, über die man den [[Glossar#Spielserver|Spielserver]] startet, stoppt, beobachtet und Dateien ansieht.

Im Diagramm: [[Dashboard-UI]].

## Web-Schnittstelle

Der Teil des [[Glossar#Plugin|Plugins]], der dem Browser antwortet. Die [[Glossar#Bedienseite|Bedienseite]] ist das, was man sieht. Die Schnittstelle ist die Tür dahinter.

Im Diagramm: [[Dashboard-HTTP]].

## Sicherungskopie

Eine gepackte Kopie der [[Glossar#Spielwelt|Spielwelt]]. Damit kann man einen älteren Stand zurückholen, wenn etwas schiefgeht.

Im Diagramm: [[Backup]].

## Spielwelt

Die gespeicherten Daten einer Welt: Gelände, Kisten, [[Glossar#Spieler|Spieler]]. Sie liegt in Ordnern auf der Festplatte.

Im Diagramm: [[Host-Pfade]].

## Zeitplan

Eine [[Glossar#Aufgabe|Aufgabe]], die zu einer festgelegten Uhrzeit von allein startet, zum Beispiel eine [[Glossar#Sicherungskopie|Sicherungskopie]].

Im Diagramm: [[Zeitplaene]].

## Aufgabe

Etwas, das das [[Glossar#Plugin|Plugin]] zu einem Zeitpunkt tun soll. Neben den Zeitplänen gibt es noch eine ältere Aufgabenliste, die mitläuft.

Im Diagramm: [[Tasks]].

## Arbeitsspeicher

Der Speicher, in dem ein laufendes Programm gerade arbeitet. Das ist nicht der freie [[Glossar#Platz|Platz]] auf der Festplatte.

Im Diagramm: [[Speicher-Messung]].

## Phase

Der Zustand des [[Glossar#Spielserver|Spielservers]]. Er ist aus, wird gerade gestartet, läuft, oder wird gestoppt.

Im Diagramm: [[Child-Prozess]].

## Fokus

Welcher Server gemeint ist, wenn mehrere in der [[Glossar#Einstellungsdatei|Einstellungsdatei]] stehen. Der laufende Weg benutzt praktisch nur den ersten.

Im Diagramm: [[Fokus]].

## Konsole

Das Textfenster des Servers. Dort erscheinen Meldungen, und man kann einen [[Glossar#Befehl|Befehl]] hineinschreiben.

Im Diagramm: [[Slot-Status]].

## Befehl

Eine Anweisung. Im Spiel ist das zum Beispiel /child start. In der [[Glossar#Konsole|Konsole]] ist es ein Text an den laufenden [[Glossar#Spielserver|Spielserver]], zum Beispiel stop.

Im Diagramm: [[Befehle]].

## Prozess

Ein Programm, das gerade läuft. Der [[Glossar#Spielserver|Spielserver]] ist ein eigener Prozess, neben dem [[Glossar#Host|Host]].

Im Diagramm: [[Child-Prozess]].

## Textleitung

Die Leitung, über die der [[Glossar#Spielserver|Spielserver]] seine Meldungen an das [[Glossar#Plugin|Plugin]] schickt. Im [[Glossar#Quelltext|Quelltext]] heißt sie Pipe. Darüber liest das Plugin die [[Glossar#Konsole|Konsole]] mit.

Im Diagramm: [[Pipe-Watch]].

## Funktion

Ein benanntes Stück des Programms, das eine [[Glossar#Aufgabe|Aufgabe]] erledigt. Ein Klick auf einen Block öffnet genau diese Funktion, eine Ebene tiefer.

## Klasse

Eine Schublade im [[Glossar#Quelltext|Quelltext]]. Darin liegen [[Glossar#Funktion|Funktionen]] und Daten, die zusammengehören, zum Beispiel alles über den Zustand des [[Glossar#Spielserver|Spielservers]].

Im Diagramm: [[Prozess-Bausteine]].

## Zeile

Eine nummerierte Zeile im [[Glossar#Quelltext|Quelltext]]. Steht an einem Block Z und eine Zahl, ist das diese Zeile. Der Link auf der Funktionsseite öffnet sie.

## Befund

Eine Stelle, die auffällt. Das kann ein alter Rest sein, ein doppelter Weg, ein [[Glossar#Widerspruch|Widerspruch]] oder ein Verhalten, das man so nicht erwartet.

Im Diagramm: [[befunde]].

## Altlast

Etwas Altes, das noch mitläuft, obwohl es schon einen neueren Weg gibt. Die alte Aufgabenliste ist so ein Fall.

Im Diagramm: [[Zeitplaene]].

## Ungenutzt

Programmtext, den im normalen Betrieb niemand aufruft. Er ist noch da, tut aber von selbst nichts.

Im Diagramm: [[befunde]].

## Doppelt gebaut

Dieselbe [[Glossar#Aufgabe|Aufgabe]] ist zweimal vorhanden. Die [[Glossar#Bedienseite|Bedienseite]] ist so ein Fall: eine ältere und eine neuere.

Im Diagramm: [[Dashboard-UI]].

## Unerwartetes Verhalten

Die Stelle kann sich anders verhalten, als der umgebende Text vermuten lässt. Zum Beispiel zwei verschiedene Wartezeiten für dieselbe Sache.

Im Diagramm: [[befunde]].

## Widerspruch

Ein Kommentar oder ein Meldungstext sagt etwas anderes, als der Ablauf wirklich tut.

Im Diagramm: [[befunde]].

## Nicht benutzt

Es ist vorgesehen und wird gelesen oder geprüft, aber der laufende Weg verwendet es nicht.

Im Diagramm: [[befunde]].

## Probelauf

Ein automatischer Test. Er prüft, ob ein Stück Programm das Erwartete tut. Er gehört nicht zum laufenden Server.

Im Diagramm: [[Tests]].

## Port

Die Türnummer, unter der ein Dienst im Netz erreichbar ist. Die [[Glossar#Bedienseite|Bedienseite]] hat so eine Nummer, der [[Glossar#Spielserver|Spielserver]] auch.

Im Diagramm: [[Bind-Adresse]].

## Programmdatei

Die Datei, in der ein Programm verpackt ist. Der [[Glossar#Spielserver|Spielserver]] und das [[Glossar#Plugin|Plugin]] liegen jeweils in so einer Datei. Oft endet sie auf .jar.

Im Diagramm: [[Startplan]].

## Thread

Ein eigener Arbeitsstrang im Programm. Mehrere können gleichzeitig laufen: einer liest die [[Glossar#Konsole|Konsole]] mit, ein [[Glossar#Wecker|Wecker]] misst den Speicher.

Im Diagramm: [[Lebenszyklus]].

## Anmeldung

Man bleibt an der [[Glossar#Bedienseite|Bedienseite]] angemeldet, ohne jedes Mal das Passwort zu tippen. Die Anmeldung gilt zwölf Stunden.

Im Diagramm: [[HTTP-Auth]].

## Dateirechte

Die Regeln, wer eine Datei lesen oder ändern darf. Das [[Glossar#Plugin|Plugin]] setzt sie beim Start sehr offen, für Ordner und Dateien.

Im Diagramm: [[FabricLauncherPlugin.makeWritable]].

## Spielschritt

Ein einzelner Rechenschritt des [[Glossar#Spielserver|Spielservers]]. Viele davon ergeben den Lauf der Spielzeit. Wie lang einer ist, legt der Spielserver fest, nicht dieses [[Glossar#Plugin|Plugin]].

Im Diagramm: [[Pipe-Watch]].

## Einrichtung

Der einmalige [[Glossar#Assistent|Assistent]], der den [[Glossar#Spielserver|Spielserver]] anlegt: [[Glossar#Version|Version]], Ordner, erste Dateien.

Im Diagramm: [[Setup]].

## Ersteinrichtung

Beim ersten Start kann der [[Glossar#Host|Host]] seine eigenen Welten umbauen, damit neben dem [[Glossar#Spielserver|Spielserver]] noch [[Glossar#Platz|Platz]] ist. Eine Merkdatei sagt, ob das schon geschehen ist.

Im Diagramm: [[Host-Ersteinrichtung]].

## Lizenz

Die Zustimmung, die ein Minecraft-Server vor dem Start verlangt. Das [[Glossar#Plugin|Plugin]] schreibt sie beim Start des [[Glossar#Spielserver|Spielservers]] selbst in die Datei eula.txt.

Im Diagramm: [[Startablauf]].

## Wecker

Ein Teil des [[Glossar#Plugin|Plugins]], der eine [[Glossar#Aufgabe|Aufgabe]] immer wieder anstößt. Manche alle fünf Sekunden, manche alle zwanzig Sekunden, die Speichermessung im Abstand aus den [[Glossar#Einstellungen|Einstellungen]].

Im Diagramm: [[Lebenszyklus]].

## Notstopp

Der [[Glossar#Spielserver|Spielserver]] wird ausgeschaltet, weil der [[Glossar#Arbeitsspeicher|Arbeitsspeicher]] knapp wird. Neu gestartet wird er dabei nicht, auch wenn eine Meldung das Wort [[Glossar#Neustart|Neustart]] benutzt.

Im Diagramm: [[Speicher-Stopp]].

## Absturzbericht

Eine Datei, die entsteht, wenn der [[Glossar#Spielserver|Spielserver]] unerwartet abbricht. Die [[Glossar#Diagnose|Diagnose]] kann sie anzeigen.

Im Diagramm: [[Diagnose]].

## Diagnose

Eine gesammelte Übersicht: läuft der Server, wie voll ist die Platte, wie langsam sind die [[Glossar#Spielschritt|Spielschritte]], was steht in einem [[Glossar#Absturzbericht|Absturzbericht]].

Im Diagramm: [[Diagnose]].

## Spieler

Personen, die gerade auf dem [[Glossar#Spielserver|Spielserver]] angemeldet sind.

Im Diagramm: [[API-Spieler]].

## Startplan

Die Angaben für den Start des [[Glossar#Spielserver|Spielservers]]: welche [[Glossar#Programmdatei|Programmdatei]], wie viel Speicher, welche Argumente.

Im Diagramm: [[Startplan]].

## Kapitel

Ein Block in einer Übersicht. Ein Pfeil mit der Aufschrift Kapitel im Text zeigt nur, wie die Kapitel im [[Glossar#Quelltext|Quelltext]] hintereinander stehen. Er ist kein zeitlicher Ablauf.

Im Diagramm: [[Child-Prozess]].

## Einstellungen

Die Werte, mit denen das [[Glossar#Plugin|Plugin]] arbeitet: [[Glossar#Pause|Pausen]], Schalter, Adressen. Sie stehen in der [[Glossar#Einstellungsdatei|Einstellungsdatei]].

Im Diagramm: [[Konfiguration]].

## Einstellungsdatei

Die Datei config.yml des [[Glossar#Plugin|Plugins]]. Beim Start liest das Plugin sie. Manche Werte haben im [[Glossar#Quelltext|Quelltext]] einen anderen Ersatzwert als in der ausgelieferten Datei.

Im Diagramm: [[Konfiguration]].

## Verschlüsselung

Die Verbindung zur [[Glossar#Bedienseite|Bedienseite]] kann so geschützt sein, dass niemand auf dem Weg mitliest. Im [[Glossar#Quelltext|Quelltext]] heißt das TLS.

Im Diagramm: [[HTTP-Start]].

## Neustart

Der [[Glossar#Spielserver|Spielserver]] geht aus und wieder an. Nach einem unerwarteten Ende wartet das [[Glossar#Plugin|Plugin]] eine [[Glossar#Pause|Pause]] und schaltet ihn wieder ein.

Im Diagramm: [[Neustart]].

## Stopp

Der [[Glossar#Spielserver|Spielserver]] wird heruntergefahren und bleibt aus. Ein absichtlicher Stopp soll nicht sofort wieder starten.

Im Diagramm: [[Stopp]].

## Platz

Der eine Ablageplatz, an dem der [[Glossar#Spielserver|Spielserver]] hängt: Zustand, Programmnummer, [[Glossar#Konsole|Konsole]], Messwerte. Es gibt praktisch nur einen.

Im Diagramm: [[Prozess-Bausteine]].

## Quelltext

Der Text, aus dem das Programm besteht. Auf einer Funktionsseite steht ein Link, der die zugehörigen [[Glossar#Zeile|Zeilen]] auf GitHub öffnet.

Im Diagramm: [[bericht]].

## Aufsicht

Der Teil, der merkt, wenn der [[Glossar#Spielserver|Spielserver]] aufgehört hat oder in einem Zustand hängen geblieben ist, zum Beispiel noch „startet“, obwohl nichts mehr läuft.

Im Diagramm: [[Pipe-Watch]].

## Pause

Die Wartezeit vor einem [[Glossar#Neustart|Neustart]]. Sie beginnt bei fünf Sekunden und wächst, wenn es kurz hintereinander oft passiert, höchstens auf fünf Minuten.

Im Diagramm: [[Neustart]].

## Version

Welche Ausgabe von Minecraft oder der Server-Software benutzt wird, zum Beispiel Vanilla, Fabric oder Paper.

Im Diagramm: [[Versionen]].

## Vorfall

Ein Ereignis, bei dem der [[Glossar#Arbeitsspeicher|Arbeitsspeicher]] knapp wurde. Das [[Glossar#Plugin|Plugin]] kann dazu einen Text aufschreiben.

Im Diagramm: [[Speicher-Stopp]].

## Assistent

Die geführten Schritte der [[Glossar#Einrichtung|Einrichtung]], in der [[Glossar#Bedienseite|Bedienseite]] oder im [[Glossar#Plugin|Plugin]].

Im Diagramm: [[Setup-Dialog]].
