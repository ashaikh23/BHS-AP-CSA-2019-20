class Main {
  public static void main(String[] args) {
    Phone myNumber = new Phone();
    Phone otherNumber = new Phone("555","555","5555");
    //error
    System.out.println(myNumber == otherNumber);
    myNumber.printNumber();
    otherNumber.printNumber();
  }
}

