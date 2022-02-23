# Lesson 6 | Procedures & Functions

Terms
- Procedure
    - A small section of a program that performs a specific task
- Argument
    - Independent items, or variables, that contain data or codes
- Function
    - Self contained modules of code that accomplish a specific task
- Debugging
    - The process of detecting and removing potential errors
- Method
    - A programming procedure that is defined as part of a class and included in any object of that class

**Generate a random True or False**

```vb
Dim rand as New Random

' Next() returns a non-negative random integer between 0 and 1
randomTrueorFalse = rand.Next(2)
```

## Calling functions within functions

```vb
Sub Main()
 ' Call the MultiBeep function and pass it 56
 MultiBeep 56
 Message
End Sub

Sub MultiBeep(numbeeps)
 For counter = 1 To numbeeps
 Beep
 Next counter
End Sub

Sub Message()
 MsgBox "Time to take a break!"
End Sub
```
**Shortcuts**

- F5 - runs the program
- F7 - shows the code

## Remove and replace characters VB

```vb
Imports System.Text.RegularExpressions

' Say result is input from a textbox
Dim input As String
Dim result As String
' Will remove all chars that aren't digits
result = Regex.Replace(input, "[^\d.]", "")
```

## Programming Challenge 1 Prompt

Create an application that calculates the registration fees for a conference. The gen-
eral conference registration fee is $895 per person. There is also an optional opening
night dinner with a keynote address for $30 per person. Additionally, the optional
preconference workshops listed in Table 7-3 are available.


