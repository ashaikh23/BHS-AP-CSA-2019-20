class Main {
  public static void main(String[] args) {
   int[] numArray = {1,2,3,4,5,6,7,8,9,11,22,33,44,55,66,77,88,99};
   System.out.println("printArray: ");
   printArray(numArray);
   //for-each loop
   //copies values from numArray to num
   //changes made to num don't affect numArray
   System.out.println("\nfor-each loop: ");
   for(int num : numArray){
     num++;
     System.out.println(num);
   }
   System.out.println("\nprintArray: ");
   printArray(numArray);
  }
  public static void printArray(int[] array) {
     for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
   }
   System.out.println();
  }
}
