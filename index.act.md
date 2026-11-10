[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Status]] › [[index.act]]

# index.act

`index.act(a)` [src/main/resources/web/index.html:116–118](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/resources/web/index.html#L116-L118)

```mermaid
flowchart TD
  n1["if Z.116 actionPending"]
  n2["return Z.116 return;"]
  n3["for Z.116 ('child-start','child-restart','child-s…"]
  n4["index.$"]:::internal-link
  n5["index.$"]:::internal-link
  n6["index.act.Z117"]:::internal-link
  n1 -->|"ja"| n2
  n3 -->|"wiederholen"| n4
  n2 --> n3
  n1 --> n3
  n4 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.116 actionPending
  Zeile 116: prüft `actionPending`.
return Z.116 return;
  Zeile 116: Rückgabe `return;`.
for Z.116 ('child-start','child-restart','child-s…
  Zeile 116: Schleife `('child-start','child-restart','child-s…`.
index.$
  `$` in `index.html`.
index.act.Z117
  Fortsetzung des Ablaufs ab Zeile 117.
```

- `act` in `src/main/resources/web/index.html`
