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


