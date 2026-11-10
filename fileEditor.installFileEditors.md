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
  Der Ablauf geht in [[Glossar#Zeile|Zeile]] 22 weiter. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `Z22`.
return Z.39 return ( set(id: EditorId, value: string, path: s…
  Hier endet die [[Glossar#Funktion|Funktion]] und liefert ein Ergebnis zurück. Das steht in [[Glossar#Zeile|Zeile]] 39.
fileEditor.installFileEditors.editorFor
  Die [[Glossar#Bedienseite|Bedienseite]] kümmert sich um für. Im [[Glossar#Quelltext|Quelltext]] heißt das `editorFor`.
fileEditor.installFileEditors.set
  Die [[Glossar#Bedienseite|Bedienseite]] setzt das. Im [[Glossar#Quelltext|Quelltext]] heißt das `set`.
fileEditor.installFileEditors.get
  Die [[Glossar#Bedienseite|Bedienseite]] liefert das. Im [[Glossar#Quelltext|Quelltext]] heißt das `get`.
fileEditor.installFileEditors.refresh
  Die [[Glossar#Bedienseite|Bedienseite]] lädt neu das. Im [[Glossar#Quelltext|Quelltext]] heißt das `refresh`.
fileEditor.installFileEditors.setPath
  Die [[Glossar#Bedienseite|Bedienseite]] setzt den Pfad. Im [[Glossar#Quelltext|Quelltext]] heißt das `setPath`.
```

> [!knoten]- Was die Blöcke tun
> - **fileEditor.installFileEditors.Z22**: Der Ablauf geht in [[Glossar#Zeile|Zeile]] 22 weiter. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `Z22`.
> - **return Z.39 return ( set(id: EditorId, value: string, path: s…**: Hier endet die [[Glossar#Funktion|Funktion]] und liefert ein Ergebnis zurück. Das steht in [[Glossar#Zeile|Zeile]] 39.
> - **fileEditor.installFileEditors.editorFor**: Die [[Glossar#Bedienseite|Bedienseite]] kümmert sich um für. Im [[Glossar#Quelltext|Quelltext]] heißt das `editorFor`.
> - **fileEditor.installFileEditors.set**: Die [[Glossar#Bedienseite|Bedienseite]] setzt das. Im [[Glossar#Quelltext|Quelltext]] heißt das `set`.
> - **fileEditor.installFileEditors.get**: Die [[Glossar#Bedienseite|Bedienseite]] liefert das. Im [[Glossar#Quelltext|Quelltext]] heißt das `get`.
> - **fileEditor.installFileEditors.refresh**: Die [[Glossar#Bedienseite|Bedienseite]] lädt neu das. Im [[Glossar#Quelltext|Quelltext]] heißt das `refresh`.
> - **fileEditor.installFileEditors.setPath**: Die [[Glossar#Bedienseite|Bedienseite]] setzt den Pfad. Im [[Glossar#Quelltext|Quelltext]] heißt das `setPath`.

- Die [[Glossar#Bedienseite|Bedienseite]] richtet ein die Datei die Editoren.
