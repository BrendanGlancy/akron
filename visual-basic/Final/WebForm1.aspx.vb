Public Class WebForm1
    Inherits System.Web.UI.Page

    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load

    End Sub

    Protected Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim boat_1(4) As Double
        Dim boat_2(4) As Double
        Dim boat_3(4) As Double

        boat_1 = {CDbl(TextBox1.Text), CDbl(TextBox2.Text), CDbl(TextBox3.Text), CDbl(TextBox4.Text)}
        boat_2 = {CDbl(TextBox7.Text), CDbl(TextBox8.Text), CDbl(TextBox9.Text), CDbl(TextBox10.Text)}
        boat_3 = {CDbl(TextBox13.Text), CDbl(TextBox14.Text), CDbl(TextBox15.Text), CDbl(TextBox16.Text)}

        input_Valid(boat_1)
        input_Valid(boat_2)
        input_Valid(boat_3)
    End Sub

    ' Check to see if the input is valid
    Sub input_Valid(array As Array)
        For Each x As Double In array
            If x < 0 Or x > 3 Then
                ClientScript.RegisterStartupScript(Page.GetType(), "myalert", "alert('It bombed');", True)
            End If
        Next
    End Sub

    Protected Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click

    End Sub

    Protected Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click
    End Sub
End Class