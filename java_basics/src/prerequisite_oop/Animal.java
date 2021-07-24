package prerequisite_oop;

public class Animal {
  int age;
  int weightInLbs;
  String gender;

  public Animal(int age, int weightInLbs, String gender) {
    this.age = age;
    this.weightInLbs = weightInLbs;
    this.gender = gender;
  }

  public void eat() {
    System.out.println("Eating...");
  }

  public void sleep() {
    System.out.println("Walking...");
  }
}
