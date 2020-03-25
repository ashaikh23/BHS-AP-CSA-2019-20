/*Create a program that asks the user for a name and then says hello to that person.  

Sample Output:
Please enter your name:
Pat McGee
Hello Pat McGee!
*/

import java.util.Scanner;
 class Main {
  public static void main(String[] args) {
    System.out.println("Please enter your name:");
    
    Scanner a = new Scanner(System.in);
   
    String m = a.nextLine();
    System.out.println("Hello" + m + "!");
  }
}
