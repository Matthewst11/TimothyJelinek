<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="ControlsDemo.aspx.cs" Inherits="site.Demos.ControlsDemo" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            Your Name<asp:TextBox ID="YourName" runat="server"></asp:TextBox>
            <asp:Button ID="SubmitButton" runat="server" Text="Submit Information" OnClick="SubmitButton_Click" />
            <br />
            <asp:Label ID="Result" runat="server" Text="Label"></asp:Label>
        </div>
    </form>
</body>
</html>
