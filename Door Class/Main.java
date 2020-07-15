/*
Create a Door class that includes attributes for style of door (swinging, sliding, garage, etc.) and the width of the door.

There should be two constructors.  
The default should by a swinging door with a width of 30"
The overloaded constructor should accept values for the style and width.

There should also be get and set methods for both attributes.  

This program should work with the driver class listed in main().  Do not change main() at all.
*/

class Main {
  public static void main(String[] args) {
    Door a = new Door();
    Door b = new Door("Sliding", 32);
    
    System.out.println("Door a is a " + a.getStyle() + " door that is " + a.getWidth() + " inches wide.");
    System.out.println("Door b is a " + b.getStyle() + " door that is " + b.getWidth() + " inches wide.");
    
    a.setStyle("Garage");
    b.setWidth(28);
    
    System.out.println("Door a has been updated to a " + a.getStyle() + " door that is " + a.getWidth() + " inches wide.");
    System.out.println("Door b has been updated to a " + b.getStyle() + " door that is " + b.getWidth() + " inches wide.");
    
  }
}
