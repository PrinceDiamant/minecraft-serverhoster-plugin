[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Klassen]] › [[DashboardPassword]]

# DashboardPassword

```mermaid
flowchart TD
  n1["DashboardPassword.DashboardPassword"]:::internal-link
  n2["DashboardPassword.read"]:::internal-link
  n3["DashboardPassword.create"]:::internal-link
  n1 -->|"Kapitel im Text"| n2
  n2 -->|"Kapitel im Text"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
DashboardPassword.DashboardPassword
  Dieser Teil kümmert sich um das Passwort. Im [[Glossar#Quelltext|Quelltext]] heißt das `DashboardPassword`.
DashboardPassword.read
  Dieser Teil liest das. Im [[Glossar#Quelltext|Quelltext]] heißt das `read`.
DashboardPassword.create
  Dieser Teil legt an das. Im [[Glossar#Quelltext|Quelltext]] heißt das `create`.
```

> [!knoten]- Was die Blöcke tun
> - **DashboardPassword.DashboardPassword**: Dieser Teil kümmert sich um das Passwort. Im [[Glossar#Quelltext|Quelltext]] heißt das `DashboardPassword`.
> - **DashboardPassword.read**: Dieser Teil liest das. Im [[Glossar#Quelltext|Quelltext]] heißt das `read`.
> - **DashboardPassword.create**: Dieser Teil legt an das. Im [[Glossar#Quelltext|Quelltext]] heißt das `create`.

- Prüft das Passwort der [[Glossar#Bedienseite|Bedienseite]] und merkt sich die [[Glossar#Anmeldung|Anmeldung]].
