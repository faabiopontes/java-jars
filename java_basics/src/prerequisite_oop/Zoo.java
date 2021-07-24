package prerequisite_oop;

public class Zoo {
  public static void main(String[] args) {
    Bird bird1 = new Bird(2, 1, "F");
    bird1.sleep();

    Fish fish1 = new Fish(1, 10, "M");
    fish1.swim();

    Chicken chicken1 = new Chicken(1, 8, "F");
    chicken1.eat();

    Sparrow sparrow1 = new Sparrow(1, 4, "M");
    sparrow1.fly();

    moveAnimals(fish1);
    moveAnimals(sparrow1);

    Flyable flyingBird = new Sparrow(1 , 4, "M");
    flyingBird.fly();
  }

  public static void moveAnimals(Animal animal) {
    animal.move();
  }
}
