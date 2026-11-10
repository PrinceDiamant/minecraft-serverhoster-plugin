[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[HostMinimize]] › [[HostMinimize.Teil3]] › [[HostMinimize.assertEditable]] › [[HostMinimize.assertEditable.Teil2]]

# HostMinimize.assertEditable.Teil2

```mermaid
flowchart TD
  n1["if Z.240 (!real.startsWith(realRoot))"]
  n2["throw Z.240 throw new SecurityException('path escapes the ser…"]
  n3["HostMinimize.assertEditable.Teil2.Z241"]:::internal-link
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.240 (!real.startsWith(realRoot))
  Zeile 240: prüft `(!real.startsWith(realRoot))`.
throw Z.240 throw new SecurityException('path escapes the ser…
  Zeile 240: Abbruch `throw new SecurityException('path escapes the ser…`.
HostMinimize.assertEditable.Teil2.Z241
  Fortsetzung des Ablaufs ab Zeile 241.
```

- Fortsetzung von `HostMinimize.assertEditable`, Quellreihenfolge.
