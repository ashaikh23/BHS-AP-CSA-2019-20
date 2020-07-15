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
