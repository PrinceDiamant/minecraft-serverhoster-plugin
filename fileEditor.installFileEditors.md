[[00 Start]] › [[Dashboard-UI]] › [[UI-Client]] › [[fileEditor.installFileEditors]]

# fileEditor.installFileEditors

`fileEditor.installFileEditors()` [ui/src/lib/fileEditor.ts:20–51](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/ui/src/lib/fileEditor.ts#L20-L51)

```mermaid
flowchart TD
  n1["fileEditor.installFileEditors.Z22"]:::internal-link
  n2["return Z.39 return ( set(id: EditorId, value: string, path: s…"]
  n3["fileEditor.installFileEditors.editorFor"]:::internal-link
  n4["fileEditor.installFileEditors.set"]:::internal-link
  n5["fileEditor.installFileEditors.get"]:::internal-link
  n6["fileEditor.installFileEditors.refresh"]:::internal-link
  n7["fileEditor.installFileEditors.setPath"]:::internal-link
  n1 --> n2
  n2 -->|"innere Methode"| n3
  n3 -->|"innere Methode"| n4
  n4 -->|"innere Methode"| n5
  n5 -->|"innere Methode"| n6
  n6 -->|"innere Methode"| n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
fileEditor.installFileEditors.Z22
  Fortsetzung des Ablaufs ab Zeile 22.
return Z.39 return ( set(id: EditorId, value: string, path: s…
  Zeile 39: Rückgabe `return ( set(id: EditorId, value: string, path: s…`.
fileEditor.installFileEditors.editorFor
  Liefert den Editor `editorFor`. Ruft `get`.
fileEditor.installFileEditors.set
  Setzt `set`. Ruft `editorFor`, `modeForPath`, `refresh`.
fileEditor.installFileEditors.get
  Liefert `get`. Ruft `editorFor`.
fileEditor.installFileEditors.refresh
  Lädt neu `refresh`. Ruft `editorFor`.
fileEditor.installFileEditors.setPath
  Setzt `setPath`. Ruft `editorFor`, `modeForPath`.
```

- `installFileEditors` in `ui/src/lib/fileEditor.ts`
