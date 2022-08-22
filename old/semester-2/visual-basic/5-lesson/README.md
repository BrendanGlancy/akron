# Homework Review questions 1-17, Prgm Ex: #1
---

# List and Loops

Loops in VB

**While loops**
```vb
' In the following example, the statement in the loop continues to run until the index is greater than 10
Dim index As Integer = 0
While index <= 10
    Debug.Write(index.ToString & " ")
    index += 1
End While

Debug.WriteLine("")
' Output: 0 1 2 3 4 5 6 7 8 9 10
```

**Do loop**
```vb
' In the following example, the statement in the loop continues to run until the index variable is greater than 10.
' The Until clause is at the end of the loop
Dim index As Integer = 0
Do
    Debug.Write(index.ToString & " ")
    index += 1
Loop Until index > 10

Debug.WriteLine("")
' Output: 0 1 2 3 4 5 6 7 8 9 10
```

**For Next Statements**

```vb
' The following example removes all elements from a generic list. Instead of a For Each...Next Statement, the example shows a For...Next statement that iterates in descending order.
Dim lst As New List(Of Integer) From {10, 20, 30, 40}

For index As Integer = lst.Count - 1 To 0 Step -1
    lst.RemoveAt(index)
Next

Debug.WriteLine(lst.Count.ToString)
' Output: 0
```

**For Each**

```vb
'The following example lists all the folders in the C:\ directory by using the DirectoryInfo class.
Dim dInfo As New System.IO.DirectoryInfo("c:\")
For Each dir As System.IO.DirectoryInfo In dInfo.GetDirectories()
    Debug.WriteLine(dir.Name)
Next
```

## Sub Procedures

A Sub procedure is a series of Visual Basic statements enclosed by the Sub and End Sub statements. The Sub procedure performs a task and then returns control to the calling code, but it does not return a value to the calling code.

Each time the procedure is called, its statements are executed, starting with the first executable statement after the Sub statement and ending with the first End Sub, Exit Sub, or Return statement encountered.

## List box

**Events of the ListBox Control**

| Sr.No.   | Event & Description   |
|--------------- | --------------- |
| 1   | **Click** <br> Occurs when a list box is selected |
| 2   | **SelectedIndexChanged** <br> Occurs when the SelectIndex property of a list box is changed.   |

<br>

**Code for ListBox**

![vb net_listbox3](https://user-images.githubusercontent.com/61941978/153904165-e60af8a5-a424-4236-95a4-a283ff4a6227.jpg)

```vb
Public Class Form1
   Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
      ' Set the caption bar text of the form.
      Me.Text = "tutorialspont.com"
      ListBox1.Items.Add("Canada")
      ListBox1.Items.Add("USA")
      ListBox1.Items.Add("UK")
      ListBox1.Items.Add("Japan")
      ListBox1.Items.Add("Russia")
      ListBox1.Items.Add("China")
      ListBox1.Items.Add("India")
   End Sub

   Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
      MsgBox("You have selected " + ListBox1.SelectedItem.ToString())
   End Sub

   Private Sub ListBox1_SelectedIndexChanged(sender As Object, e As EventArgs)
      Handles ListBox1.SelectedIndexChanged
      Label2.Text = ListBox1.SelectedItem.ToString()
   End Sub
End Class
```

# Remark

Use the \<remarks> tag to add information about a type, supplementing the information specified with \<summary>.

This information appears in the Object Browser. For information about the Object Browser, see Viewing the Structure of Code.

Compile with -doc to process documentation comments to a file.

**Example**

```vb
''' <param name="id">The ID of the record to update.</param>
''' <remarks>Updates the record <paramref name="id"/>.
''' <para>Use <see cref="DoesRecordExist"/> to verify that
''' the record exists before calling this method.</para>
''' </remarks>
Public Sub UpdateRecord(ByVal id As Integer)
    ' Code goes here.
End Sub
''' <param name="id">The ID of the record to check.</param>
''' <returns><c>True</c> if <paramref name="id"/> exists,
''' <c>False</c> otherwise.</returns>
''' <remarks><seealso cref="UpdateRecord"/></remarks>
Public Function DoesRecordExist(ByVal id As Integer) As Boolean
    ' Code goes here.
End Function
```

The equivalent of this in java is using @ in one of your comments

**Example**

```java
/**
* Returns an Image object that can then be painted on the screen.
* The url argument must specify an absolute <a href="#{@link}">{@link URL}</a>. The name
* argument is a specifier that is relative to the url argument.
* <p>
* This method always returns immediately, whether or not the
* image exists. When this applet attempts to draw the image on
* the screen, the data will be loaded. The graphics primitives
* that draw the image will incrementally paint on the screen.
*
* @param  url  an absolute URL giving the base location of the image
* @param  name the location of the image, relative to the url argument
* @return      the image at the specified URL
* @see         Image
*/
public Image getImage(URL url, String name) {
    try {
        return getImage(new URL(url, name));
    } catch (MalformedURLException e) {
        return null;
    }
}
```
