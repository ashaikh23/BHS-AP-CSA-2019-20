public class Door
{
  private String style;
  private int width;
  
  public Door()
  {
    style = "Swinging";
    width = 30;
  }
  
  public Door(String s, int w)
  {
    style = s;
    width = w;
  }
  
  public void setStyle(String s)
  {
    style = s;
  }
  public void setWidth(int w)
  {
    width = w;
  }
  
  public String getStyle()
  {
    return style;
  }
  public int getWidth()
  {
    return width;
  }
}
