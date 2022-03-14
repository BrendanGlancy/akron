# Lesson 9 Arrays and More

**Class Objectives**

- Using Files
- The OpenFileDialog, SaveFileDialog, FontDialog, ColorDialog

```vb
Public Class Form1
   Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click

        ' Call ShowDialog.
        Dim result As DialogResult = OpenFileDialog1.ShowDialog()

        ' Test result.
        If result = Windows.Forms.DialogResult.OK Then
            ' Do something.
        End If

    End Sub

End Class
```

## StreamWriter

```vb
Dim file As System.IO.StreamWriter
file = My.Computer.FileSystem.OpenTextFileWriter("c:\test.txt", True)
file.WriteLine("Here is the first string.")
file.Close()
```

## Appending a file

```vb
Dim inputString As String = "This is a test string."
My.Computer.FileSystem.WriteAllText(
  "C://testfile.txt", inputString, True)
```

## Error handling existing file

```vb
Dim strFile As String = "yourfile.txt"
Dim fileExists As Boolean = File.Exists(strFile)
Using sw As New StreamWriter(File.Open(strFile, FileMode.OpenOrCreate))
    sw.WriteLine( _
        IIf(fileExists, _
            "Error Message in  Occured at-- " & DateTime.Now, _
            "Start Error Log for today"))
End Using
```

## Arrays

An array is a series of memory locations – or 'boxes' – each of which holds a single item of data, but with each box sharing the same name. All data in an array must be of the same data type

```vb
Module SimpleArray
   Public Sub Main()
      ' Declare an array with 7 elements.
      Dim students(6) As Integer

      ' Assign values to each element.
      students(0) = 23
      students(1) = 19
      students(2) = 21
      students(3) = 17
      students(4) = 19
      students(5) = 20
      students(6) = 22

      ' Display the value of each element.
      For ctr As Integer = 0 To 6
         Dim grade As String = If(ctr = 0, "kindergarten", $"grade {ctr}")
         Console.WriteLine($"Students in {grade}: {students(ctr)}")
      Next
   End Sub
End Module
' The example displays the following output:
'     Students in kindergarten: 23
'     Students in grade 1: 19
'     Students in grade 2: 21
'     Students in grade 3: 17
'     Students in grade 4: 19
'     Students in grade 5: 20
'     Students in grade 6: 22
```

## PrintDocument

```vb
file.Print()
```

## Linked List


```vb
Public Class Form1
    Dim aListData(9) As String
    Dim aNext(9) As Integer
    Dim iStart As Integer = 1
    Dim iNextFree As Integer = 1

    Private Sub btnMakeList_Click(sender As Object, e As EventArgs) Handles btnMakeList.Click
        'hard coded creation of a linked list for testing only

        aListData(1) = "chloe"
        aListData(2) = "francis"
        aListData(3) = "beatrix"
        aListData(4) = "david"
        aListData(5) = "edward"
        aListData(6) = "abigail"

        aNext(1) = 4
        aNext(2) = 0
        aNext(3) = 1
        aNext(4) = 5
        aNext(5) = 2
        aNext(6) = 3

        iStart = 6
        iNextFree = 7

    End Sub
End Class
```
