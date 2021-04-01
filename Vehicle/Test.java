import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CarTest() {
  Car c = new Car("Camry", 4, 5, 80);
  assertEquals(4, c.travelTime(320), 0.001);
}