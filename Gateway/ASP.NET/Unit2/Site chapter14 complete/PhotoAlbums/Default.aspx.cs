using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class PhotoAlbums_Default : BasePage
{
  PlanetWroxEntities entities = new PlanetWroxEntities();

  protected void Page_Load(object sender, EventArgs e)
  {

  }

  public IEnumerable<PhotoAlbum> PhotoAlbumList_GetData()
  {
    return from p in entities.PhotoAlbums
           orderby p.Id
           select p;
  }

  public IQueryable<Picture> ListView1_GetData()
  {
    int photoAlbumId = Convert.ToInt32(PhotoAlbumList.SelectedValue);
    return from p in entities.Pictures
           where p.PhotoAlbumId == photoAlbumId
           orderby p.Id
           select p;
  }
  
  protected void PhotoAlbumList_SelectedIndexChanged(object sender, EventArgs e)
  {
    ListView1.DataBind();
  }
}