/* if (firstname == ""){
      System.out.println("Enter your first name: ");
      firstname = scan.nextLine();
    }
    */



import java.util.Scanner;
public class Student{
  public String firstname;
  public String lastname;
  private int intArray[] = new int[1000];
  private int average;
  private int total;
  
  
  public Student(Scanner scan){
    System.out.println("Enter your first name: ");
    firstname = scan.nextLine();
    System.out.println("Enter your last name: ");
    lastname = scan.nextLine();
    System.out.print("Enter the numbers of tests: ");
    numTests = scan.nextInt();
    System.out.println("Enter the individual scores of the test: ");
    for(int i = 0; i < numTests; i++){
      intArray[i] = scan.nextInt();
    }
    
     for(int i =0; i < intArray.length; i++){
      total = total + intArray[i];
    }
    
    average = total/numTests;
    //System.out.println(average);
  }
  public void printScores(){
    return;
    }
  public String toString(){
    return (firstname + " " + lastname  + " " + average + "%");
  }

  public String getName(){
    String fullName = firstname + " " + lastname;
    return fullName;
  }
  public int getAverage(){
    return average;
  }
}

public boolean equals(Student a){
  if (this.firstname.equalsIgnoreCase(a.firstname) && this.lastname.equalsIgnoreCase(a.lastname) && {
    return boolean;
}
}
