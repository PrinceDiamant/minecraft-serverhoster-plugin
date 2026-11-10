[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Auth]]

# HTTP-Auth

```mermaid
flowchart TD
  n1["Dashboard.ip"]:::internal-link
  n2["Dashboard.createSession"]:::internal-link
  n3["Dashboard.setupPassword"]:::internal-link
  n4["Dashboard.login"]:::internal-link
  n5["Dashboard.token"]:::internal-link
  n6["Dashboard.authed"]:::internal-link
  n7["Dashboard.csrfRejected"]:::internal-link
  n3 -->|"Zeile 295"| n7
  n3 -->|"Zeile 298"| n1
  n3 -->|"Zeile 318"| n2
  n4 -->|"Zeile 325"| n1
  n4 -->|"Zeile 333"| n2
  n6 -->|"Zeile 487"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Dashboard.ip
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer.
Dashboard.createSession
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] legt an die [[Glossar#Anmeldung|Anmeldung]].
Dashboard.setupPassword
  Legt das Passwort der [[Glossar#Bedienseite|Bedienseite]] fest, wenn noch keines da ist.
Dashboard.login
  Prüft das Passwort und merkt die [[Glossar#Anmeldung|Anmeldung]].
Dashboard.token
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer.
Dashboard.authed
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer.
Dashboard.csrfRejected
  Lehnt eine Anfrage ab, die nicht von der eigenen [[Glossar#Bedienseite|Bedienseite]] kommt.
```

> [!knoten] Was die Blöcke tun
> - **Dashboard.ip**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer.
> - **Dashboard.createSession**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] legt an die [[Glossar#Anmeldung|Anmeldung]].
> - **Dashboard.setupPassword**: Legt das Passwort der [[Glossar#Bedienseite|Bedienseite]] fest, wenn noch keines da ist.
> - **Dashboard.login**: Prüft das Passwort und merkt die [[Glossar#Anmeldung|Anmeldung]].
> - **Dashboard.token**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer.
> - **Dashboard.authed**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer.
> - **Dashboard.csrfRejected**: Lehnt eine Anfrage ab, die nicht von der eigenen [[Glossar#Bedienseite|Bedienseite]] kommt.

- [[Glossar#Anmeldung|Anmeldung]] an der [[Glossar#Bedienseite|Bedienseite]]. Das Passwort wird geprüft, danach gilt die Anmeldung zwölf Stunden.
