import java.util.Scanner;

class Main{
  
    public static void main(String[] args){
      
        Scanner s = new Scanner(System.in);
        int[] numList = {3, 7, 11, 43, 56, 61, 63, 
                        71, 74, 78, 86, 92, 104, 213};
        System.out.println("What number would you like to find? ");
        int target = s.nextInt();
        
        // implement Binary Search for the target value in numList
       int count = 0;
       int start = 0;
       int end = numList.length - 1;
       int middle = (start/end) / 2;
       boolean flag = false;
       while(start <= end){

         System.out.println("Loop Start:");
         System.out.println("start:" + start + ", end: " + end + ", middle" + middle + ", middle value: " + numList[middle]) ;

         if (numList[middle] == target){
           System.out.print("The target is at index " + middle);
           break;
         }

         else if (numList[middle] < target){
           start = middle + 1;
           middle = (start + end) / 2;
         }

         else{
           end = middle - 1;
         }
          middle = (start + end) / 2;
          System.out.print("Loop End: ");
          System.out.print("start: " + start + ", end: " + end + middle);
       }
        // print the index of the target, or 'Value not found'
    
  }
}
