[[00 Start]] › [[Dashboard-HTTP]] › [[API-Status]] › [[Dashboard.rssMb]]

# Dashboard.rssMb

`Dashboard.rssMb(long pid)` [src/main/java/de/aichele/childlauncher/Dashboard.java:684–690](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/Dashboard.java#L684-L690)

```mermaid
flowchart TD
  n1["try Z.685"]
  n2["for Z.686 (String l : Files.readAllLines(Paths.ge…"]
  n3["if Z.687 (l.startsWith('VmRSS:'))"]
  n4["return Z.687 return Long.parseLong(l.replaceAll('//D', '')) / …"]
  n5["catch Z.688 (Exception ignored)"]
  n6["return Z.689 return -1;"]
  n3 -->|"ja"| n4
  n2 -->|"wiederholen"| n3
  n1 --> n2
  n1 -->|"Fehler"| n5
  n4 --> n6
  n3 --> n6
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.685
  Zeile 685: Versuch. Der Fehlerpfad geht in catch.
for Z.686 (String l : Files.readAllLines(Paths.ge…
  Zeile 686: Schleife `(String l : Files.readAllLines(Paths.ge…`.
if Z.687 (l.startsWith('VmRSS:'))
  Zeile 687: prüft `(l.startsWith('VmRSS:'))`.
return Z.687 return Long.parseLong(l.replaceAll('//D', '')) / …
  Zeile 687: Rückgabe `return Long.parseLong(l.replaceAll('//D', '')) / …`.
catch Z.688 (Exception ignored)
  Zeile 688: fängt (Exception ignored).
return Z.689 return -1;
  Zeile 689: Rückgabe `return -1;`.
```

- `rssMb` in `src/main/java/de/aichele/childlauncher/Dashboard.java`
