public class Cat extends Petypes{
  
  public Cat (String name, int lifeSpan, String place)
  {
    super(name, lifeSpan);
    this.place = place;
  }
  
  public String getplace()
  {
    return place;
  }

  public String getname()
  {
    return name;
  }
  
  public String toString()
  {
    return getname() + "will live about " + getlifeSpan() + "./n" + getname() + "is a " + getplace() + "cat";
  }

}
