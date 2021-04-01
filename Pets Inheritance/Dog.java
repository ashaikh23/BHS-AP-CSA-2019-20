public class Dog extends Petypes{

  public Dog(String name, int lifeSpan, String breed){
    super(name, lifeSpan);
    this.breed = breed;
  }

  public String getbreed()
  {
    return breed;
  }

  public String getName()
  {
    return name;
  }

  public String toString()
  {
    return getName() + "will live about " + getlifeSpan() + " years. \n" + getName() + " is a " + getbreed(); 
  }
  
}
