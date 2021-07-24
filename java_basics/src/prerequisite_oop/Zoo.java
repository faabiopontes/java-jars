package prerequisite_oop;

public class Zoo {
  public static void main(String[] args) {
    Animal animal1 = new Animal(16, 9, "M");
    animal1.eat();

    Bird bird1 = new Bird(2, 1, "F");
    bird1.fly();

    Fish fish1 = new Fish(1, 10, "M");
    fish1.swim();
  }
}
