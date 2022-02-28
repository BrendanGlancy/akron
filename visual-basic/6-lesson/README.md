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

Write an application that accepts from the user the wholesale cost of an item and its
markup percentage. (For example, if an item’s wholesale cost is $5 and its retail
price is $10, then the markup is 100%.)
The program should contain a function named CalculateRetail that receives the
wholesale cost and markup percentage as arguments, and returns the retail price
of the item. The application’s form should look something like the one shown in
Figure 6-22.

![6-22](https://user-images.githubusercontent.com/61941978/155856678-9fdf06a2-9518-4a97-9310-4395a2010010.png)



