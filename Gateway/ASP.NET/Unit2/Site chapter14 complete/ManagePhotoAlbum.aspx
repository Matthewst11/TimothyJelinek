<%@ Page Title="Manage Photo Album" Language="C#" MasterPageFile="~/MasterPages/Frontend.master" AutoEventWireup="true" CodeFile="ManagePhotoAlbum.aspx.cs" Inherits="_ManagePhotoAlbum" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="Server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="cpMainContent" runat="Server">
  <asp:ListView ID="ListView1" runat="server" DataKeyNames="Id" InsertItemPosition="LastItem" SelectMethod="ListView1_GetData" InsertMethod="ListView1_InsertItem" DeleteMethod="ListView1_DeleteItem" ItemType="Picture">
    <InsertItemTemplate>
      <li>Description:
        <asp:RequiredFieldValidator ID="reqDesc" ControlToValidate="Description" runat="server" ErrorMessage="Enter a description." />
        <asp:TextBox ID="Description" runat="server" TextMode="MultiLine" Text='<%# BindItem.Description %>' /><br />
        ToolTip:
        <asp:RequiredFieldValidator ID="reqToolTip" ControlToValidate="ToolTip" runat="server" ErrorMessage="Enter a tool tip." />
        <asp:TextBox ID="ToolTip" runat="server" Text='<%# BindItem.ToolTip %>' /><br />
        <asp:FileUpload ID="FileUpload1" runat="server" /><br />
        <asp:CustomValidator ID="cusValImage" runat="server" ErrorMessage="Select a valid .jpg file." />
        <asp:Button ID="InsertButton" runat="server" Text="Insert" CommandName="Insert" />
      </li>
    </InsertItemTemplate>
    <ItemTemplate>
      <li>Description:
        <asp:Label ID="Description" runat="server" Text='<%# Item.Description %>' /><br />
        ToolTip:
        <asp:Label ID="ToolTip" runat="server" Text='<%# Item.ToolTip %>' /><br />
        <asp:Image ID="ImageUrl" runat="server" ImageUrl='<%# Item.ImageUrl %>' /><br />
        <asp:Button ID="DeleteButton" runat="server" CommandName="Delete" Text="Delete" CausesValidation="False" />
      </li>
    </ItemTemplate>
    <LayoutTemplate>
      <ul class="ItemContainer">
        <li runat="server" id="itemPlaceholder" />
      </ul>
    </LayoutTemplate>
  </asp:ListView>
</asp:Content>
