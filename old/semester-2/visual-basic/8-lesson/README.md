# Arrays and loops VBA

**For Each ...Next Statement**

```vb
For Each Element [ As datatype ] In group
  [ statements ]
  [ Continue For ]
  [ statements ]
  [ Exit For ]
  [ statements ]
Next [ element ]
```

<br>

| Term   | Definition  |
|--------------- | --------------- |
| element  | Required in the For Each statement. Optional in the Next statement. Variable. Used to iterate through the elements of the collection.   |
| datatype   |  Optional if Option Infer is on (the default) or element is already declared; required if Option Infer is off and element isn't already declared. The data type of element.  |
| group   | Required. A variable with a type that's a collection type or Object. Refers to the collection over which the statements are to be repeated.   |
| statements   |  	Optional. One or more statements between For Each and Next that run on each item in group.  |
| Continue For  | Optional. Transfers control to the start of the For Each loop.  |
| Exit For  | Optional. Transfers control out of the For Each loop.  |
| Next | Required. Terminates the definition of the For Each loop. |
