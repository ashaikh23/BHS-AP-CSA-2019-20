public class Door{
  private String Style;
  private int Width;
  public Door(){
    Style = "Swinging";
    Width = 30;
  }
  public Door(String s, int w){
    Style = s;
    Width = w;
  }
  public void setStyle(String s){
    Style = s;
  }
  public void setWidth(int w){
    Width = w;
  }
  public int getWidth(){
    return Width;
  }
  public String getStyle(){
    return Style;
  }
}
