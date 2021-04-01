import java.lang.Math;
// 0 <= Math.random() < 1 returns [0,1)
class Main {
  public static void main(String[] args) {
    for (int i = 0; i < 50; i++){
    double num = Math.random();
    System.out.print(num);
    num = (int)(num * 17) +67;
    System.out.print(", " + num);
    System.out.println(", " + (num-2));
    }
    //[0,1) multiply by range ----> [0, range)
    //cast as int
    //shift (add or subtract)
  }
}
