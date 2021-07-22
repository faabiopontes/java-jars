package java_basics;

import other_package.ExampleClass;

public class LearningMethods {
  public static void main(String[] args) {
    System.out.println("first");
    MyUtils.printSomeJunk("second");
    System.out.println("Returned value from MyUtils.printSomeJunk: " + MyUtils.printSomeJunk(42));

    MyUtils myUtils = new MyUtils();
    int add10result = myUtils.add10(20) + 10 - 5;
    
    MyUtils.sum2Numbers(add10result, 7);
    ExampleClass.printDark();
  }
}
