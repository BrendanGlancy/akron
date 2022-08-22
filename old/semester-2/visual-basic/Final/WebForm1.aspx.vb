Public Class WebForm1
    Inherits System.Web.UI.Page

    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load

    End Sub

    Protected Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim boat_1(4) As Double
        Dim boat_2(4) As Double
        Dim boat_3(4) As Double
        Dim sum1 As Integer = 0
        Dim valid As Boolean = False

        Dim total1 As Integer
        Dim total2 As Integer
        Dim total3 As Integer
        Dim placing(3) As Integer


        Try
            boat_1 = {CInt(TextBox1.Text), CInt(TextBox2.Text), CInt(TextBox3.Text), CInt(TextBox4.Text)}
            boat_2 = {CInt(TextBox7.Text), CInt(TextBox8.Text), CInt(TextBox9.Text), CInt(TextBox10.Text)}
            boat_3 = {CInt(TextBox13.Text), CInt(TextBox14.Text), CInt(TextBox15.Text), CInt(TextBox16.Text)}
        Catch ex As Exception
            ClientScript.RegisterStartupScript(Page.GetType(), "myalert", "alert('Characters in the textbox must be valid to convert to integers');", True)
        End Try

        input_Valid(boat_1)
        input_Valid(boat_2)
        input_Valid(boat_3)

        ' Sum the arrays
        For i = 0 To 3
            sum1 = boat_1(i) + boat_2(i) + boat_3(i)
            If sum1 = 6 Then
                valid = True
            End If
        Next



        If Not valid Then
            ClientScript.RegisterStartupScript(Page.GetType(), "myalert", "alert('You entered in race results that are impossible');", True)
        Else
            total1 = boat_1(0) + boat_1(1) + boat_1(2) + boat_1(3)
            total2 = boat_2(0) + boat_2(1) + boat_2(2) + boat_2(3)
            total3 = boat_3(0) + boat_3(1) + boat_3(2) + boat_3(3)

            TextBox5.Text = total1
            TextBox11.Text = total2
            TextBox17.Text = total3

            If total1 < total2 And total2 < total3 Then
                TextBox6.Text = "1st"
                TextBox12.Text = "2nd"
                TextBox18.Text = "3rd"
            ElseIf total1 < total2 And total2 > total3 And total1 < total3 Then
                TextBox6.Text = "1st"
                TextBox12.Text = "3rd"
                TextBox8.Text = "2nd"
            ElseIf total1 > total2 And total2 < total3 And total1 < total3 Then
                TextBox6.Text = "2nd"
                TextBox12.Text = "1st"
                TextBox18.Text = "3rd"
            ElseIf total1 > total2 And total2 < total3 And total1 > total3 Then
                TextBox6.Text = "3rd"
                TextBox12.Text = "1st"
                TextBox18.Text = "2nd"
            ElseIf total1 > total2 And total2 > total3 And total1 > total3 Then
                TextBox6.Text = "3rd"
                TextBox12.Text = "2nd"
                TextBox18.Text = "1st"
            ElseIf total1 < total2 And total2 > total3 And total1 > total3 Then
                TextBox6.Text = "2nd"
                TextBox12.Text = "3rd"
                TextBox18.Text = "1st"
            ElseIf total1 = total2 And total2 = total3 Then
                TextBox6.Text = "TIED"
                TextBox12.Text = "TIED"
                TextBox18.Text = "TIED"
            ElseIf total1 = total2 And total2 > total3 Then
                TextBox6.Text = "TIED For 2nd"
                TextBox12.Text = "TIED For 2nd"
                TextBox18.Text = "1st"
            ElseIf total1 < total2 And total2 = total3 Then
                TextBox6.Text = "1st"
                TextBox12.Text = "TIED For 2nd"
                TextBox18.Text = "TIED For 2nd"
            ElseIf total1 > total2 And total2 = total3 Then
                TextBox6.Text = "3rd"
                TextBox12.Text = "TIED For 1st"
                TextBox18.Text = "TIED For 1st"
            ElseIf total1 < total2 And total2 = total3 Then
                TextBox6.Text = "1st"
                TextBox12.Text = "TIED For 3rd"
                TextBox18.Text = "TIED For 3rd"
            ElseIf total1 = total3 And total2 < total3 Then
                TextBox6.Text = "TIED For 2nd"
                TextBox12.Text = "1st"
                TextBox18.Text = "TIED For 2nd"
            End If
        End If
    End Sub

    ' Check to see if the input is valid
    Sub input_Valid(array As Array)
        For Each x As Integer In array
            If x < 0 Or x > 3 Then
                ClientScript.RegisterStartupScript(Page.GetType(), "myalert", "alert('Your numbers are not in the valid range (1-3)');", True)
            End If
        Next
    End Sub

    Protected Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        TextBox1.Text = ""
        TextBox2.Text = ""
        TextBox3.Text = ""
        TextBox4.Text = ""
        TextBox5.Text = ""
        TextBox6.Text = ""
        TextBox7.Text = ""
        TextBox8.Text = ""
        TextBox9.Text = ""
        TextBox10.Text = ""
        TextBox11.Text = ""
        TextBox12.Text = ""
        TextBox13.Text = ""
        TextBox14.Text = ""
        TextBox15.Text = ""
        TextBox16.Text = ""
        TextBox17.Text = ""
        TextBox18.Text = ""
    End Sub

    Protected Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click
        ClientScript.RegisterStartupScript(Page.GetType(), "myalert", "alert('In order to close a window with a button, the window in the web browser must of opened them. In short it is very difficult to do this as visual basic code alone cannot, and if javascirpt is used the tab must've been opened with the same script');", True)
    End Sub
End Class
