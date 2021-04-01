class Main {
  public static void main(String[] args) {
    System.out.println(f(6000,200));
  }
  public static int f(int k, int n){
    //GCF
    System.out.println("f(" + k + "," + n + ")");
    if (n == k){
      return k;
    }
    else{
      if (n > k){
        return f(k, n-k);
      }
      else{
        return f(k-n, n);
      }
    }
  }
}
