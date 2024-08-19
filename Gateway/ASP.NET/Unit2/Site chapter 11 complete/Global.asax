<%@ Application Language="C#" %>

<script RunAt="server">

  void Application_Start(object sender, EventArgs e)
  {
    
    RouteConfig.RegisterRoutes(System.Web.Routing.RouteTable.Routes);
    ScriptManager.ScriptResourceMapping.AddDefinition("jquery",
      new ScriptResourceDefinition
      {
        Path = "~/Scripts/jquery-2.0.3.min.js"
      }
    );
  }

  void Application_End(object sender, EventArgs e)
  {
    
  }

  void Application_Error(object sender, EventArgs e)
  {
    
  }

  void Session_Start(object sender, EventArgs e)
  {
    
  }

  void Session_End(object sender, EventArgs e)
  {
    
  }
</script>
