[[00 Start]] › [[Tests]] › [[HostMinimizeTest]] › [[HostMinimizeTest.Teil1]]

# HostMinimizeTest.Teil1

```mermaid
flowchart TD
  n1["HostMinimizeTest.applyKeepsWorldSelectionChildBackupsAndSecurityKeys"]:::internal-link
  n2["HostMinimizeTest.missingWhitelistIsRemovedAgainOnRollback"]:::internal-link
  n3["HostMinimizeTest.activeRequiresTheConfiguredWorldToBeLoadedAndIdlePauseStaysOff"]:::internal-link
  n4["HostMinimizeTest.symlinkAndChildRootAreRefused"]:::internal-link
  n5["HostMinimizeTest.firstSetupClearsOnlyOuterWorldsAndCreatesTheVoidLobby"]:::internal-link
  n6["HostMinimizeTest.firstSetupRetriesPendingStateAndRejectsProtectedWorlds"]:::internal-link
  n7["HostMinimizeTest.firstSetupResumesPreparationWithoutLosingOriginalWorldOrChangingLobby"]:::internal-link
  n8["HostMinimizeTest.firstSetupRefusesCleanupWhenPreparedWorldSelectionWasChanged"]:::internal-link
  n1 -->|"Quelltext"| n2
  n2 -->|"Quelltext"| n3
  n3 -->|"Quelltext"| n4
  n4 -->|"Quelltext"| n5
  n5 -->|"Quelltext"| n6
  n6 -->|"Quelltext"| n7
  n7 -->|"Quelltext"| n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
HostMinimizeTest.applyKeepsWorldSelectionChildBackupsAndSecurityKeys
  Wendet an `applyKeepsWorldSelectionChildBackupsAndSecurityKeys`. Ruft `apply`, `restore`. Nur Test.
HostMinimizeTest.missingWhitelistIsRemovedAgainOnRollback
  `missingWhitelistIsRemovedAgainOnRollback` in `HostMinimizeTest.java`. Ruft `apply`, `restore`. Nur Test.
HostMinimizeTest.activeRequiresTheConfiguredWorldToBeLoadedAndIdlePauseStaysOff
  `activeRequiresTheConfiguredWorldToBeLoadedAndIdlePauseStaysOff` in `HostMinimizeTest.java`. Ruft `phase`, `playersBlocked`, `clearIdlePause`. Nur Test.
HostMinimizeTest.symlinkAndChildRootAreRefused
  `symlinkAndChildRootAreRefused` in `HostMinimizeTest.java`. Ruft `apply`. Nur Test.
HostMinimizeTest.firstSetupClearsOnlyOuterWorldsAndCreatesTheVoidLobby
  `firstSetupClearsOnlyOuterWorldsAndCreatesTheVoidLobby` in `HostMinimizeTest.java`. Ruft `shouldRun`, `apply`, `readState`. Nur Test.
HostMinimizeTest.firstSetupRetriesPendingStateAndRejectsProtectedWorlds
  `firstSetupRetriesPendingStateAndRejectsProtectedWorlds` in `HostMinimizeTest.java`. Ruft `shouldRun`, `apply`, `readState`. Nur Test.
HostMinimizeTest.firstSetupResumesPreparationWithoutLosingOriginalWorldOrChangingLobby
  `firstSetupResumesPreparationWithoutLosingOriginalWorldOrChangingLobby` in `HostMinimizeTest.java`. Ruft `shouldRun`, `apply`, `completeRestart`. Nur Test.
HostMinimizeTest.firstSetupRefusesCleanupWhenPreparedWorldSelectionWasChanged
  `firstSetupRefusesCleanupWhenPreparedWorldSelectionWasChanged` in `HostMinimizeTest.java`. Ruft `shouldRun`, `apply`, `completeRestart`. Nur Test.
```


