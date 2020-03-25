class Main {
  public static void main(String[] args) {
    Kelvin k = new Kelvin(500);
    Fahrenheit f = new Fahrenheit(50.6);
		Celsius c = new Celsius(50.2);

    System.out.println(k.toString());
    System.out.println(f.toString());
		System.out.println(c.toString());
  }
}
