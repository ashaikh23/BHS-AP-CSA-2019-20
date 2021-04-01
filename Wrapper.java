/* Wrapper classes exist for all primative data types
These provide

*/
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a number: ");
    String number = s.nextLine();
    Integer i = new Integer(number);
    System.out.print("number =  " + (i+ 2));
  }
}
