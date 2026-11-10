[[00 Start]] › [[Plugin-Kern]] › [[Konfiguration]] › [[ServerHosterSettings]] › [[ServerHosterSettings.ServerHosterSettings]] › [[ServerHosterSettings.ServerHosterSettings.Teil1]]

# ServerHosterSettings.ServerHosterSettings.Teil1

```mermaid
flowchart TD
  n1["RestartPolicy.maxAttempts"]:::internal-link
  n2["if Z.22 (initialRestartDelaySeconds ( 1 // initialRestart…"]
  n3["throw Z.23 throw new IllegalArgumentException('Initial resta…"]
  n4["if Z.24 (maximumRestartDelaySeconds ( initialRestartDelay…"]
  n5["throw Z.25 throw new IllegalArgumentException('Maximum resta…"]
  n6["if Z.26 (restartResetAfterSeconds ( 60 // restartResetAft…"]
  n7["throw Z.27 throw new IllegalArgumentException('Restart count…"]
  n8["ServerHosterSettings.enumValue"]:::internal-link
  n9["ServerHosterSettings.enumValue"]:::internal-link
  n2 -->|"ja"| n3
  n1 --> n2
  n4 -->|"ja"| n5
  n3 --> n4
  n2 --> n4
  n6 -->|"ja"| n7
  n5 --> n6
  n4 --> n6
  n7 --> n8
  n6 --> n8
  n8 --> n9
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
RestartPolicy.maxAttempts
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Begrenzt nach oben `maxAttempts`.
if Z.22 (initialRestartDelaySeconds ( 1 // initialRestart…
  Zeile 22: prüft `(initialRestartDelaySeconds ( 1 // initialRestart…`.
throw Z.23 throw new IllegalArgumentException('Initial resta…
  Zeile 23: Abbruch `throw new IllegalArgumentException('Initial resta…`.
if Z.24 (maximumRestartDelaySeconds ( initialRestartDelay…
  Zeile 24: prüft `(maximumRestartDelaySeconds ( initialRestartDelay…`.
throw Z.25 throw new IllegalArgumentException('Maximum resta…
  Zeile 25: Abbruch `throw new IllegalArgumentException('Maximum resta…`.
if Z.26 (restartResetAfterSeconds ( 60 // restartResetAft…
  Zeile 26: prüft `(restartResetAfterSeconds ( 60 // restartResetAft…`.
throw Z.27 throw new IllegalArgumentException('Restart count…
  Zeile 27: Abbruch `throw new IllegalArgumentException('Restart count…`.
ServerHosterSettings.enumValue
  Dieser Teil kümmert sich um den Wert. `enumValue` in `ServerHosterSettings.java`.
```

> [!knoten]- Was die Blöcke tun
> - **RestartPolicy.maxAttempts**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Begrenzt nach oben `maxAttempts`.
> - **if Z.22 (initialRestartDelaySeconds ( 1 // initialRestart…**: Zeile 22: prüft `(initialRestartDelaySeconds ( 1 // initialRestart…`.
> - **throw Z.23 throw new IllegalArgumentException('Initial resta…**: Zeile 23: Abbruch `throw new IllegalArgumentException('Initial resta…`.
> - **if Z.24 (maximumRestartDelaySeconds ( initialRestartDelay…**: Zeile 24: prüft `(maximumRestartDelaySeconds ( initialRestartDelay…`.
> - **throw Z.25 throw new IllegalArgumentException('Maximum resta…**: Zeile 25: Abbruch `throw new IllegalArgumentException('Maximum resta…`.
> - **if Z.26 (restartResetAfterSeconds ( 60 // restartResetAft…**: Zeile 26: prüft `(restartResetAfterSeconds ( 60 // restartResetAft…`.
> - **throw Z.27 throw new IllegalArgumentException('Restart count…**: Zeile 27: Abbruch `throw new IllegalArgumentException('Restart count…`.
> - **ServerHosterSettings.enumValue**: Dieser Teil kümmert sich um den Wert. `enumValue` in `ServerHosterSettings.java`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `ServerHosterSettings.ServerHosterSettings`.
