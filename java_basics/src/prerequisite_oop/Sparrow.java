package prerequisite_oop;

public class Sparrow extends Bird implements Flyable {
  
  public Sparrow(int age, int weightInLbs, String gender) {
    super(age, weightInLbs, gender);
  }

  public void fly() {
    System.out.println("Sparrow flying high...");
  }
}
