package prerequisite_oop;

public class Zoo {
  public static void main(String[] args) {
    Animal animal1 = new Animal(16, 9, "M");
    animal1.eat();

    Bird bird1 = new Bird(2, 1, "F");
    bird1.sleep();

    Fish fish1 = new Fish(1, 10, "M");
    fish1.swim();

    Chicken chicken1 = new Chicken(1, 8, "F");
    chicken1.eat();

    Sparrow sparrow1 = new Sparrow(1, 4, "M");
    sparrow1.fly();
  }
}
