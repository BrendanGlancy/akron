Public Class Form1
    ' global init
    Dim random1 = Int((100 - 1) * Rnd() + 1)
    Dim random2 = Int((100 - 1) * Rnd() + 1)

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        ' onClick random number
        random1 = Int((100 - 1) * Rnd() + 1)
        random2 = Int((100 - 1) * Rnd() + 1)
        number1.Text = random1
        number2.Text = random2
    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        ' add the answer
        answerBox.Text = random1 + random2
    End Sub

    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click
        Me.Close()
    End Sub
End Class
