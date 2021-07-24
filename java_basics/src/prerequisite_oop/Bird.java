package prerequisite_oop;

public class Bird extends Animal {
  
  public Bird(int age, int weightInLbs, String gender) {
    super(age, weightInLbs, gender);
  }

  public void move() {
    System.out.println("Flapping wings...");
  }
}
