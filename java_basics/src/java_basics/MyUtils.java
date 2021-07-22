package java_basics;

public class MyUtils {
  public static void printSomeJunk(String argument) {
    print("Some bla bla bla " + argument);
  }

  private static void print(String argument) {
    System.out.println(argument);
  }
  
  public static int printSomeJunk(int argument) {
    print("Integer passed in: " + argument);
    return argument;
  }
  
  public static void sum2Numbers(int number1, int number2) {
    print(Integer.toString(number1 + number2));
  }
  
  public int add10(int argument) {
    int result = argument + 10;
    return result;
  }
}
