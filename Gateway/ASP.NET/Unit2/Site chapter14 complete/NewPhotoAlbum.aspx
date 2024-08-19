<%@ Page Title="Create New Photo Album" Language="C#" MasterPageFile="~/MasterPages/Frontend.master" AutoEventWireup="true" CodeFile="NewPhotoAlbum.aspx.cs" Inherits="_NewPhotoAlbum" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="Server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="cpMainContent" runat="Server">
  <asp:DetailsView AutoGenerateRows="false" ID="DetailsView1" DefaultMode="Insert" runat="server" InsertMethod="DetailsView1_InsertItem">
    <Fields>
      <asp:BoundField DataField="Name" HeaderText="Name" />
      <asp:CommandField ShowInsertButton="True" ShowCancelButton="false" />
    </Fields>
  </asp:DetailsView>
</asp:Content>

