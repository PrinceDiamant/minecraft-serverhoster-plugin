[[00 Start]] › [[Server-Anlage]] › [[Versionen]] › [[Upstream]]

# Upstream

```mermaid
flowchart TD
  n1["Upstream.Upstream"]:::internal-link
  n2["Upstream.getText"]:::internal-link
  n3["Upstream.getJson"]:::internal-link
  n4["Upstream.download(String,Path)"]:::internal-link
  n5["Upstream.download(String,Path,String,String)"]:::internal-link
  n6["Upstream.checkHash"]:::internal-link
  n7["Upstream.digest"]:::internal-link
  n4 -->|"Z.43"| n5
  n5 -->|"Z.50"| n6
  n6 -->|"Z.57"| n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Upstream.Upstream
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `Upstream`.
Upstream.getText
  Dieser Teil liefert den Text. Im [[Glossar#Quelltext|Quelltext]] heißt das `getText`.
Upstream.getJson
  Dieser Teil liefert die Antwort. Im [[Glossar#Quelltext|Quelltext]] heißt das `getJson`.
Upstream.download(String,Path)
  Dieser Teil holt das. Im [[Glossar#Quelltext|Quelltext]] heißt das `download(String,Path)`.
Upstream.download(String,Path,String,String)
  Dieser Teil holt das. Im [[Glossar#Quelltext|Quelltext]] heißt das `download(String,Path,String,String)`.
Upstream.checkHash
  Dieser Teil prüft hier einen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `checkHash`.
Upstream.digest
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `digest`.
```

> [!knoten]- Was die Blöcke tun
> - **Upstream.Upstream**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `Upstream`.
> - **Upstream.getText**: Dieser Teil liefert den Text. Im [[Glossar#Quelltext|Quelltext]] heißt das `getText`.
> - **Upstream.getJson**: Dieser Teil liefert die Antwort. Im [[Glossar#Quelltext|Quelltext]] heißt das `getJson`.
> - **Upstream.download(String,Path)**: Dieser Teil holt das. Im [[Glossar#Quelltext|Quelltext]] heißt das `download(String,Path)`.
> - **Upstream.download(String,Path,String,String)**: Dieser Teil holt das. Im [[Glossar#Quelltext|Quelltext]] heißt das `download(String,Path,String,String)`.
> - **Upstream.checkHash**: Dieser Teil prüft hier einen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `checkHash`.
> - **Upstream.digest**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `digest`.

- Die Quelle im Netz, von der die Versionslisten kommen.
