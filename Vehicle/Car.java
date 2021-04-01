public class Car {
  String model;
  int numWheels;
  int numPassengers;
  double topSpeed;

  public Car(String model, int numWheels, int numPassengers, double topSpeed) {
    this.model = model;
    this.numWheels = numWheels;
    this.numPassengers = numPassengers;
    this.topSpeed = topSpeed;
  }

  /**
   * Calculate the best case travel time. 
   * takes double distance assumes miles
   * returns travelTime in hours
   */
  public double travelTime(double distance) {
    return distance / this.topSpeed;
  }

  /**
   * 
   */
  public String toString() {
    // print model and passenger capacity
    return "The car model is " + this.model + " and the passenger capacity is " + this.numPassengers;

  }

  /**
   * Tells if it's possible for this Car to 
   * carry a given number of people.
   */
  public boolean canCarry(int passengers) {
    return passengers <= numPassengers;
  }

}