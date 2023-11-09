<%@ Page Language="vb" AutoEventWireup="false" CodeBehind="WebForm1.aspx.vb" Inherits="Final.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Boat Race Results</title>
</head>
    <script type="text/javascript">
    </script>
<body>
    <form id="form1" runat="server">
        <div>
            <asp:Label ID="Label3" runat="server" Text="Race Results"></asp:Label>
        </div>
        <br />
        <div>
            <asp:Label ID="Label4" runat="server" Text="Race 1" style="margin-left:80px"></asp:Label>
            <asp:Label ID="Label5" runat="server" Text="Race 2" style="margin-left:33px"></asp:Label>
            <asp:Label ID="Label6" runat="server" Text="Race 3" style="margin-left:32px"></asp:Label>
            <asp:Label ID="Label7" runat="server" Text="Race 4" style="margin-left:30px"></asp:Label>
            <asp:Label ID="Label8" runat="server" Text="Total" style="margin-left:33px"></asp:Label>
            <asp:Label ID="Label9" runat="server" Text="Rank" style="margin-left:45px"></asp:Label>
        </div>
        <br />
        Boat #1:
            &nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="TextBox1" runat="server" Width="46px"></asp:TextBox>
            &nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="TextBox2" runat="server" Width="46px"></asp:TextBox>
            &nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="TextBox3" runat="server" Width="46px"></asp:TextBox>
            &nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="TextBox4" runat="server" Width="46px"></asp:TextBox>
            &nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="TextBox5" runat="server" Width="46px" BorderColor="Black" BorderStyle="Solid"></asp:TextBox>
            &nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="TextBox6" runat="server" Width="46px" BorderColor="Black"></asp:TextBox>
        <p>
            Boat #2:
            &nbsp;&nbsp;&nbsp;&nbsp; 
            <asp:TextBox ID="TextBox7" runat="server" Width="46px"></asp:TextBox>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <asp:TextBox ID="TextBox8" runat="server" Width="46px"></asp:TextBox>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <asp:TextBox ID="TextBox9" runat="server" Width="46px"></asp:TextBox>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <asp:TextBox ID="TextBox10" runat="server" Width="46px"></asp:TextBox>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <asp:TextBox ID="TextBox11" runat="server" Width="46px" BorderColor="Black" BorderStyle="Solid"></asp:TextBox>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <asp:TextBox ID="TextBox12" runat="server" Width="46px" BorderStyle="Solid" BorderColor="Black"></asp:TextBox>
        </p>
        Boat #3:
            &nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="TextBox13" runat="server" Width="46px" Height="16px"></asp:TextBox>
            &nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="TextBox14" runat="server" Width="46px" Height="16px"></asp:TextBox>
            &nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="TextBox15" runat="server" Width="46px" Height="16px"></asp:TextBox>
            &nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="TextBox16" runat="server" Width="46px" Height="16px"></asp:TextBox>
            &nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="TextBox17" runat="server" Width="46px" Height="16px" BorderColor="Black" BorderStyle="Solid"></asp:TextBox>
            &nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="TextBox18" runat="server" Width="46px" Height="16px" BorderStyle="Solid" BorderColor="Black"></asp:TextBox>
        <br />
        <br />
        <asp:Button ID="Button1" runat="server" Text="Submit" />
        <asp:Button ID="Button2" runat="server" Text="Clear" style="margin-left:150px" />
        <asp:Button ID="Button3" runat="server" Text="Close" style="margin-left:150px" />
    </form>
</body>
</html>
