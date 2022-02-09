# Lesson four

Review, see chapters 1-3

| Expression    | Not Expression    |
|---------------- | --------------- |
| Item1.1    | Item2.1    |
| Item1.2    | Item2.2    |


The And operator is best for checking if a values is inside a range of
numbers

## Order of operations

Logical operators have an order of precedence
- Not
- And
- or
- Xor

## Strings

Relational operators can be be used to compare strings and string literals

Characters are stored as numeric values
Visual basic uses Unicode

Characters of each string are compared one by one

**Trim**

- TrimStart() Trims the start
- TrimEnd() Trims the end
- Trim()

**IndexOf**

Positions are numbered starting at 0

## Case Statements

```vb
Select Case v
    Case 1
  		'code runs here if v = 1
    Case 2
        'code runs here if v = 2
    Case 3 To 5
        'code runs here if v = 3 or 4 or 5
    Case Is < 10
        'code runs here if v = 6 or 7 or 8 or 9
    Case 10, 15, 20
        'code runs here if v = 10 or 15 or 20
    Case #12/25/2020#
        'code runs here if v = #12/25/2020#
    Case "abc"
        'code runs here if v = "abc"
    Case Is <= "m"
        'code runs here if v <= "m"
    Case True
        'code runs here if v = True
    Case Else
  		'Code runs here if v did not match any of the above cases.
  		'In this example, since v = "z", the 'Case Else' would match
  		'and only the code here would execute.
End Select
```

## Validation Example

TryParse Definition

```vb
Public Shared Function TryParse (
      s As String,
      <OutAttribute> ByRef result As Integer
) As Boolean
```

TryParse use example:

```vb
Dim n As Integer
Do
    Console.Write("Enter the value of n: ")
    If Integer.TryParse(Console.ReadLine(), n) Then
        Exit Do
    End If
    Console.WriteLine("You should input an integer. Try again.")
Loop
```

## Radio Buttons

| Property   | Description    |
|--------------- | --------------- |
| AllowDrop   | Used to set or get a value representing whether the RadioButton allows the user to drag on the form  |
| Appearence   | Used to get or set a value that represents the appearence of the RadioButton |

