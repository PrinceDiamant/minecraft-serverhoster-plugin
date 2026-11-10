[[00 Start]] › [[Plugin-Kern]] › [[Benachrichtigung]] › [[NtfyNotifier]]

# NtfyNotifier

```mermaid
flowchart TD
  n1["NtfyNotifier.NtfyNotifier"]:::internal-link
  n2["NtfyNotifier.send"]:::internal-link
  n3["NtfyNotifier.target"]:::internal-link
  n4["NtfyNotifier.encodeHeader"]:::internal-link
  n5["NtfyNotifier.validPriority"]:::internal-link
  n2 -->|"Z.25"| n3
  n2 -->|"Z.28"| n4
  n2 -->|"Z.29"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
NtfyNotifier.NtfyNotifier
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `NtfyNotifier`.
NtfyNotifier.send
  Dieser Teil schickt das. Im [[Glossar#Quelltext|Quelltext]] heißt das `send`.
NtfyNotifier.target
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `target`.
NtfyNotifier.encodeHeader
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `encodeHeader`.
NtfyNotifier.validPriority
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `validPriority`.
```

> [!knoten]- Was die Blöcke tun
> - **NtfyNotifier.NtfyNotifier**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `NtfyNotifier`.
> - **NtfyNotifier.send**: Dieser Teil schickt das. Im [[Glossar#Quelltext|Quelltext]] heißt das `send`.
> - **NtfyNotifier.target**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `target`.
> - **NtfyNotifier.encodeHeader**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `encodeHeader`.
> - **NtfyNotifier.validPriority**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `validPriority`.

- Schickt die Nachricht an den Mitteilungsdienst.
