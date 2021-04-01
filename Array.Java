class Main {
  public static void main(String[] args) {
    //arrys are a fixed length
    //initalize using array literal
    int[] a = {1,2,3,4};
    String[] b = {"Hello", "Ohhhh", "!"};
    String[] c = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    
    // initalize using new []
    String[] d = new String[5];
    d[3] = "Hello";
    //int[] d = new int[4];
    //length
    System.out.println("the length is " + a.length +".");
    System.out.println(b.length);
    //printing
    System.out.println(a);
    //print arrays just shows the memory address
    //use a loop to transversethe array and print
    for (int i = 0; i < 4; i++)
      System.out.println("a[" + i + "] =" + a[i]);
    //arrays are zero indexed
    for (int i = 0; i < 3; i++)
      System.out.println(b[i]);

    for (int i = 0; i < c.length; i++)
      System.out.println("c[" + i + "] = " + c[i]);
  }
}
