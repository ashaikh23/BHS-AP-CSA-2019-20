import java.util.Scanner;
 class Main {
  public static void main(String[] args) {
    System.out.println("Please enter your name:");
    
    Scanner a = new Scanner(System.in);
   
    String m = a.nextLine();
    System.out.println("Hello" + m + "!");
  }
}
