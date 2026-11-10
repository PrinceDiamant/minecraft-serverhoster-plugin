[[00 Start]] › [[Dashboard-UI]] › [[UI-Client]] › [[fileEditor.installFileEditors]] › [[fileEditor.installFileEditors.set]]

# fileEditor.installFileEditors.set

`fileEditor.set(id: EditorId, value: string, path: string)` [ui/src/lib/fileEditor.ts:40–46](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/ui/src/lib/fileEditor.ts#L40-L46)

```mermaid
flowchart TD
  n1["fileEditor.installFileEditors.editorFor"]:::internal-link
  n2["fileEditor.modeForPath"]:::internal-link
  n3["fileEditor.installFileEditors.refresh"]:::internal-link
  n1 --> n2
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
fileEditor.installFileEditors.editorFor
  Liefert den Editor `editorFor`. Ruft `get`.
fileEditor.modeForPath
  `modeForPath` in `fileEditor.ts`.
fileEditor.installFileEditors.refresh
  Lädt neu `refresh`. Ruft `editorFor`.
```

- `set` in `ui/src/lib/fileEditor.ts`
