class Main {
  public static void main(String[] args) {
   System.out.println(mystery(4,3));
  }
  public static int mystery(int i, int j){
   System.out.println("m(" + i + "," + j + ")");
   if (j < 1){
     System.out.println("Return 1");
     return 1;
   }
   else{
     System.out.print(" m(" + i + "," + j + ") = ");
     int r = i * mystery(j, i-1);
     System.out.println("Return " + r);
     return r;
   }
  }
}
