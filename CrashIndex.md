[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Klassen]] › [[CrashIndex]]

# CrashIndex

```mermaid
flowchart TD
  n1["CrashIndex.CrashIndex"]:::internal-link
  n2["CrashIndex.list"]:::internal-link
  n3["CrashIndex.read"]:::internal-link
  n1 -->|"Kapitel im Text"| n2
  n2 -->|"Kapitel im Text"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
CrashIndex.CrashIndex
  Dieser Teil kümmert sich um die Position. Im [[Glossar#Quelltext|Quelltext]] heißt das `CrashIndex`.
CrashIndex.list
  Dieser Teil zeigt das. Im [[Glossar#Quelltext|Quelltext]] heißt das `list`.
CrashIndex.read
  Dieser Teil liest das. Im [[Glossar#Quelltext|Quelltext]] heißt das `read`.
```

> [!knoten]- Was die Blöcke tun
> - **CrashIndex.CrashIndex**: Dieser Teil kümmert sich um die Position. Im [[Glossar#Quelltext|Quelltext]] heißt das `CrashIndex`.
> - **CrashIndex.list**: Dieser Teil zeigt das. Im [[Glossar#Quelltext|Quelltext]] heißt das `list`.
> - **CrashIndex.read**: Dieser Teil liest das. Im [[Glossar#Quelltext|Quelltext]] heißt das `read`.

- Sucht [[Glossar#Absturzbericht|Absturzberichte]] und liefert ihren Text.
