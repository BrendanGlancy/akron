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
        Me.number1 = New System.Windows.Forms.Label()
        Me.number2 = New System.Windows.Forms.Label()
        Me.plusSign = New System.Windows.Forms.Label()
        Me.answerBox = New System.Windows.Forms.TextBox()
        Me.equalSign = New System.Windows.Forms.Label()
        Me.Button1 = New System.Windows.Forms.Button()
        Me.Button2 = New System.Windows.Forms.Button()
        Me.Button3 = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'number1
        '
        Me.number1.AutoSize = True
        Me.number1.Font = New System.Drawing.Font("Segoe UI", 15.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point)
        Me.number1.Location = New System.Drawing.Point(66, 86)
        Me.number1.Name = "number1"
        Me.number1.Size = New System.Drawing.Size(24, 30)
        Me.number1.TabIndex = 0
        Me.number1.Text = "1"
        '
        'number2
        '
        Me.number2.AutoSize = True
        Me.number2.Font = New System.Drawing.Font("Segoe UI", 15.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point)
        Me.number2.Location = New System.Drawing.Point(365, 86)
        Me.number2.Name = "number2"
        Me.number2.Size = New System.Drawing.Size(24, 30)
        Me.number2.TabIndex = 1
        Me.number2.Text = "1"
        '
        'plusSign
        '
        Me.plusSign.AutoSize = True
        Me.plusSign.Font = New System.Drawing.Font("Segoe UI", 15.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point)
        Me.plusSign.Location = New System.Drawing.Point(218, 86)
        Me.plusSign.Name = "plusSign"
        Me.plusSign.Size = New System.Drawing.Size(27, 30)
        Me.plusSign.TabIndex = 2
        Me.plusSign.Text = "+"
        '
        'answerBox
        '
        Me.answerBox.Location = New System.Drawing.Point(624, 91)
        Me.answerBox.Name = "answerBox"
        Me.answerBox.Size = New System.Drawing.Size(137, 23)
        Me.answerBox.TabIndex = 3
        '
        'equalSign
        '
        Me.equalSign.AutoSize = True
        Me.equalSign.Font = New System.Drawing.Font("Segoe UI", 15.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point)
        Me.equalSign.Location = New System.Drawing.Point(498, 86)
        Me.equalSign.Name = "equalSign"
        Me.equalSign.Size = New System.Drawing.Size(27, 30)
        Me.equalSign.TabIndex = 4
        Me.equalSign.Text = "="
        '
        'Button1
        '
        Me.Button1.Location = New System.Drawing.Point(66, 370)
        Me.Button1.Name = "Button1"
        Me.Button1.Size = New System.Drawing.Size(108, 33)
        Me.Button1.TabIndex = 5
        Me.Button1.Text = "Show Answer"
        Me.Button1.UseVisualStyleBackColor = True
        '
        'Button2
        '
        Me.Button2.Location = New System.Drawing.Point(343, 370)
        Me.Button2.Name = "Button2"
        Me.Button2.Size = New System.Drawing.Size(112, 33)
        Me.Button2.TabIndex = 6
        Me.Button2.Text = "Random"
        Me.Button2.UseVisualStyleBackColor = True
        '
        'Button3
        '
        Me.Button3.Location = New System.Drawing.Point(654, 370)
        Me.Button3.Name = "Button3"
        Me.Button3.Size = New System.Drawing.Size(107, 33)
        Me.Button3.TabIndex = 7
        Me.Button3.Text = "Exit"
        Me.Button3.UseVisualStyleBackColor = True
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(7.0!, 15.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(800, 450)
        Me.Controls.Add(Me.Button3)
        Me.Controls.Add(Me.Button2)
        Me.Controls.Add(Me.Button1)
        Me.Controls.Add(Me.equalSign)
        Me.Controls.Add(Me.answerBox)
        Me.Controls.Add(Me.plusSign)
        Me.Controls.Add(Me.number2)
        Me.Controls.Add(Me.number1)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents number1 As Label
    Friend WithEvents number2 As Label
    Friend WithEvents plusSign As Label
    Friend WithEvents answerBox As TextBox
    Friend WithEvents equalSign As Label
    Friend WithEvents Button1 As Button
    Friend WithEvents Button2 As Button
    Friend WithEvents Button3 As Button
End Class
