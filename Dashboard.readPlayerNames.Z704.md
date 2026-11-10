[[00 Start]] › [[Dashboard-HTTP]] › [[API-Spieler]] › [[Dashboard.readPlayerNames]] › [[Dashboard.readPlayerNames.Z704]]

# Dashboard.readPlayerNames.Z704

```mermaid
flowchart TD
  n1["try Z.704"]
  n2["Schritt Z.705 JsonElement parsed = JsonParser.parseString(Files…"]
  n3["if Z.706 (!parsed.isJsonArray())"]
  n4["throw Z.706 throw new IllegalArgumentException('expected an a…"]
  n5["for Z.708 (JsonElement item : parsed.getAsJsonArr…"]
  n6["if Z.709 (!item.isJsonObject() // !item.getAsJsonObject().…"]
  n7["throw Z.712 throw new IllegalArgumentException('expected entr…"]
  n8["return Z.715 return names;"]
  n9["catch Z.716 (com.google.gson.JsonParseExc…"]
  n10["throw Z.717 throw new IOException('Spielerliste ' + file.getF…"]
  n3 -->|"ja"| n4
  n2 --> n3
  n6 -->|"ja"| n7
  n5 -->|"wiederholen"| n6
  n4 --> n5
  n3 --> n5
  n7 --> n8
  n6 --> n8
  n1 --> n2
  n1 -->|"Fehler"| n9
  n9 --> n10
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `Dashboard.readPlayerNames`, Quellreihenfolge.
