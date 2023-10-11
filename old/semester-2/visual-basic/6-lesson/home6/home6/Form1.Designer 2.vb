<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()>
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()>
    Private Sub InitializeComponent()
        Me.lblWholesale = New System.Windows.Forms.Label()
        Me.lblPercent = New System.Windows.Forms.Label()
        Me.lblRetail = New System.Windows.Forms.Label()
        Me.btnCalc = New System.Windows.Forms.Button()
        Me.btnClear = New System.Windows.Forms.Button()
        Me.btnExit = New System.Windows.Forms.Button()
        Me.wholeSaleBox = New System.Windows.Forms.TextBox()
        Me.markupBox = New System.Windows.Forms.TextBox()
        Me.retailBox = New System.Windows.Forms.TextBox()
        Me.SuspendLayout()
        '
        'lblWholesale
        '
        Me.lblWholesale.AutoSize = True
        Me.lblWholesale.Font = New System.Drawing.Font("Segoe UI", 13.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point)
        Me.lblWholesale.Location = New System.Drawing.Point(73, 55)
        Me.lblWholesale.Name = "lblWholesale"
        Me.lblWholesale.Size = New System.Drawing.Size(197, 25)
        Me.lblWholesale.TabIndex = 0
        Me.lblWholesale.Text = "Wholesale Cost of Item"
        '
        'lblPercent
        '
        Me.lblPercent.AutoSize = True
        Me.lblPercent.Font = New System.Drawing.Font("Segoe UI", 13.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point)
        Me.lblPercent.Location = New System.Drawing.Point(177, 116)
        Me.lblPercent.Name = "lblPercent"
        Me.lblPercent.Size = New System.Drawing.Size(93, 25)
        Me.lblPercent.TabIndex = 1
        Me.lblPercent.Text = "Markup %"
        '
        'lblRetail
        '
        Me.lblRetail.AutoSize = True
        Me.lblRetail.Font = New System.Drawing.Font("Segoe UI", 13.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point)
        Me.lblRetail.Location = New System.Drawing.Point(174, 182)
        Me.lblRetail.Name = "lblRetail"
        Me.lblRetail.Size = New System.Drawing.Size(96, 25)
        Me.lblRetail.TabIndex = 2
        Me.lblRetail.Text = "Retail Price"
        '
        'btnCalc
        '
        Me.btnCalc.Location = New System.Drawing.Point(41, 274)
        Me.btnCalc.Name = "btnCalc"
        Me.btnCalc.Size = New System.Drawing.Size(75, 23)
        Me.btnCalc.TabIndex = 3
        Me.btnCalc.Text = "Get Retail"
        Me.btnCalc.UseVisualStyleBackColor = True
        '
        'btnClear
        '
        Me.btnClear.Location = New System.Drawing.Point(222, 274)
        Me.btnClear.Name = "btnClear"
        Me.btnClear.Size = New System.Drawing.Size(75, 23)
        Me.btnClear.TabIndex = 4
        Me.btnClear.Text = "Clear"
        Me.btnClear.UseVisualStyleBackColor = True
        '
        'btnExit
        '
        Me.btnExit.Location = New System.Drawing.Point(408, 274)
        Me.btnExit.Name = "btnExit"
        Me.btnExit.Size = New System.Drawing.Size(75, 23)
        Me.btnExit.TabIndex = 5
        Me.btnExit.Text = "Exit"
        Me.btnExit.UseVisualStyleBackColor = True
        '
        'wholeSaleBox
        '
        Me.wholeSaleBox.AutoCompleteSource = System.Windows.Forms.AutoCompleteSource.FileSystem
        Me.wholeSaleBox.Location = New System.Drawing.Point(327, 57)
        Me.wholeSaleBox.Name = "wholeSaleBox"
        Me.wholeSaleBox.PlaceholderText = "100.00 "
        Me.wholeSaleBox.Size = New System.Drawing.Size(130, 23)
        Me.wholeSaleBox.TabIndex = 6
        '
        'markupBox
        '
        Me.markupBox.Location = New System.Drawing.Point(327, 119)
        Me.markupBox.Name = "markupBox"
        Me.markupBox.PlaceholderText = "50"
        Me.markupBox.Size = New System.Drawing.Size(130, 23)
        Me.markupBox.TabIndex = 7
        '
        'retailBox
        '
        Me.retailBox.Location = New System.Drawing.Point(327, 185)
        Me.retailBox.Name = "retailBox"
        Me.retailBox.PlaceholderText = "$150.00"
        Me.retailBox.Size = New System.Drawing.Size(130, 23)
        Me.retailBox.TabIndex = 8
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(7.0!, 15.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(516, 326)
        Me.Controls.Add(Me.retailBox)
        Me.Controls.Add(Me.markupBox)
        Me.Controls.Add(Me.wholeSaleBox)
        Me.Controls.Add(Me.btnExit)
        Me.Controls.Add(Me.btnClear)
        Me.Controls.Add(Me.btnCalc)
        Me.Controls.Add(Me.lblRetail)
        Me.Controls.Add(Me.lblPercent)
        Me.Controls.Add(Me.lblWholesale)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents lblWholesale As Label
    Friend WithEvents lblPercent As Label
    Friend WithEvents lblRetail As Label
    Friend WithEvents btnCalc As Button
    Friend WithEvents btnClear As Button
    Friend WithEvents btnExit As Button
    Friend WithEvents wholeSaleBox As TextBox
    Friend WithEvents markupBox As TextBox
    Friend WithEvents retailBox As TextBox
End Class
