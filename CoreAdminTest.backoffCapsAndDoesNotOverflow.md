[[00 Start]] › [[Tests]] › [[CoreAdminTest]] › [[CoreAdminTest.Teil1]] › [[CoreAdminTest.backoffCapsAndDoesNotOverflow]]

# CoreAdminTest.backoffCapsAndDoesNotOverflow

`CoreAdminTest.backoffCapsAndDoesNotOverflow()` [src/test/java/de/aichele/childlauncher/CoreAdminTest.java:114–120](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/test/java/de/aichele/childlauncher/CoreAdminTest.java#L114-L120)

```mermaid
flowchart TD
  n1["RestartBackoff.delaySeconds"]:::internal-link
  n2["RestartBackoff.delaySeconds"]:::internal-link
  n3["RestartBackoff.delaySeconds"]:::internal-link
  n4["RestartBackoff.delaySeconds"]:::internal-link
  n5["RestartBackoff.delaySeconds"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
RestartBackoff.delaySeconds
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Rechnet die Wartezeit `delaySeconds`.
```

> [!knoten]- Was die Blöcke tun
> - **RestartBackoff.delaySeconds**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Rechnet die Wartezeit `delaySeconds`.

- Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server.
- `backoffCapsAndDoesNotOverflow` in `src/test/java/de/aichele/childlauncher/CoreAdminTest.java`
- Das ist ein Probelauf, kein Teil des laufenden Servers.
