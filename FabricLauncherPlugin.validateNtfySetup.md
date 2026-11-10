[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Dialog]] › [[FabricLauncherPlugin.validateNtfySetup]]

# FabricLauncherPlugin.validateNtfySetup

`FabricLauncherPlugin.validateNtfySetup(boolean enabled, String server, String topic)` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:643–660](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L643-L660)

```mermaid
flowchart TD
  n1["try Z.645"]
  n2["catch Z.647 (IllegalArgumentException e)"]
  n3["throw Z.648 throw new IllegalArgumentException('Ungültige ntf…"]
  n4["if Z.650 (!('https'.equalsIgnoreCase(uri.getScheme()) // '…"]
  n5["throw Z.652 throw new IllegalArgumentException('ntfy-Server m…"]
  n6["if Z.654 (normalizedTopic.length() ) 128 // (!normalizedTo…"]
  n7["throw Z.656 throw new IllegalArgumentException('ntfy-Thema da…"]
  n8["if Z.657 (enabled && normalizedTopic.isEmpty())"]
  n9["throw Z.658 throw new IllegalArgumentException('Für ntfy muss…"]
  n10["return Z.659 return new NtfySetup(enabled, uri.toString().repl…"]
  n1 -->|"Fehler"| n2
  n2 --> n3
  n4 -->|"ja"| n5
  n1 --> n4
  n3 --> n4
  n6 -->|"ja"| n7
  n5 --> n6
  n4 --> n6
  n8 -->|"ja"| n9
  n7 --> n8
  n6 --> n8
  n9 --> n10
  n8 --> n10
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.645
  Zeile 645: Versuch. Der Fehlerpfad geht in catch.
catch Z.647 (IllegalArgumentException e)
  Zeile 647: fängt (IllegalArgumentException e).
throw Z.648 throw new IllegalArgumentException('Ungültige ntf…
  Zeile 648: Abbruch `throw new IllegalArgumentException('Ungültige ntf…`.
if Z.650 (!('https'.equalsIgnoreCase(uri.getScheme()) // '…
  Zeile 650: prüft `(!('https'.equalsIgnoreCase(uri.getScheme()) // '…`.
throw Z.652 throw new IllegalArgumentException('ntfy-Server m…
  Zeile 652: Abbruch `throw new IllegalArgumentException('ntfy-Server m…`.
if Z.654 (normalizedTopic.length() ) 128 // (!normalizedTo…
  Zeile 654: prüft `(normalizedTopic.length() ) 128 // (!normalizedTo…`.
throw Z.656 throw new IllegalArgumentException('ntfy-Thema da…
  Zeile 656: Abbruch `throw new IllegalArgumentException('ntfy-Thema da…`.
if Z.657 (enabled && normalizedTopic.isEmpty())
  Zeile 657: prüft `(enabled && normalizedTopic.isEmpty())`.
throw Z.658 throw new IllegalArgumentException('Für ntfy muss…
  Zeile 658: Abbruch `throw new IllegalArgumentException('Für ntfy muss…`.
return Z.659 return new NtfySetup(enabled, uri.toString().repl…
  Zeile 659: Rückgabe `return new NtfySetup(enabled, uri.toString().repl…`.
```

> [!knoten]- Was die Blöcke tun
> - **try Z.645**: Zeile 645: Versuch. Der Fehlerpfad geht in catch.
> - **catch Z.647 (IllegalArgumentException e)**: Zeile 647: fängt (IllegalArgumentException e).
> - **throw Z.648 throw new IllegalArgumentException('Ungültige ntf…**: Zeile 648: Abbruch `throw new IllegalArgumentException('Ungültige ntf…`.
> - **if Z.650 (!('https'.equalsIgnoreCase(uri.getScheme()) // '…**: Zeile 650: prüft `(!('https'.equalsIgnoreCase(uri.getScheme()) // '…`.
> - **throw Z.652 throw new IllegalArgumentException('ntfy-Server m…**: Zeile 652: Abbruch `throw new IllegalArgumentException('ntfy-Server m…`.
> - **if Z.654 (normalizedTopic.length() ) 128 // (!normalizedTo…**: Zeile 654: prüft `(normalizedTopic.length() ) 128 // (!normalizedTo…`.
> - **throw Z.656 throw new IllegalArgumentException('ntfy-Thema da…**: Zeile 656: Abbruch `throw new IllegalArgumentException('ntfy-Thema da…`.
> - **if Z.657 (enabled && normalizedTopic.isEmpty())**: Zeile 657: prüft `(enabled && normalizedTopic.isEmpty())`.
> - **throw Z.658 throw new IllegalArgumentException('Für ntfy muss…**: Zeile 658: Abbruch `throw new IllegalArgumentException('Für ntfy muss…`.
> - **return Z.659 return new NtfySetup(enabled, uri.toString().repl…**: Zeile 659: Rückgabe `return new NtfySetup(enabled, uri.toString().repl…`.

- Das [[Glossar#Plugin|Plugin]] prüft den Mitteilungsdienst die [[Glossar#Einrichtung|Einrichtung]].
- `validateNtfySetup` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
