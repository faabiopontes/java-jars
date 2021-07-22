package java_basics;

public class MyUtils {
  public static void printSomeJunk(String argument) {
    System.out.println("Some bla bla bla" + argument);
  }
  
  public static int printSomeJunk(int argument) {
    System.out.println("Integer passed in: " + argument);
    return argument;
  }
  
  public static void sum2Numbers(int number1, int number2) {
    System.out.println(number1 + number2);
  }
  
  public static int add10(int argument) {
    int result = argument + 10;
    return result;
  }
}
