Public Class Form1
    Private Sub btnCalc_Click(sender As Object, e As EventArgs) Handles btnCalc.Click
        Dim wholeSale As Double
        Dim markup As Double
        Dim retailPrice As Double

        Try
            wholeSale = CDbl(wholeSaleBox.Text)
            markup = CDbl(markupBox.Text)
            retailPrice = CalculateRetail(retailPrice, markup, wholeSale)
        Catch
            MessageBox.Show("Must enter valued Integers")
        End Try

        retailBox.Text = retailPrice.ToString("c")
    End Sub

    Function CalculateRetail(retailPrice, markup, wholeSale) As Double
        ' to calc
        retailPrice = ((markup / 100) * wholeSale) + wholeSale
        Return retailPrice
    End Function

    Private Sub btnClear_Click(sender As Object, e As EventArgs) Handles btnClear.Click
        retailBox.Text = ""
        markupBox.Text = ""
        wholeSaleBox.Text = ""
    End Sub

    Private Sub btnExit_Click(sender As Object, e As EventArgs) Handles btnExit.Click
        Me.Close()
    End Sub
End Class
