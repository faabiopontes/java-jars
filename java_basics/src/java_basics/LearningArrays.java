package java_basics;

public class LearningArrays {
  public static void main(String args[]) {
    double[] values = new double[100];
    values[0] = 1000;
    values[1] = 33.44;
    values[99] = 93432;

    System.out.println(values[0]);

    String[] words = new String[] { "My", "Name", "is", "Fabio"};
    System.out.println(words[3]);

    words = new String[3];
    words[0] = "I";
    words[1] = "am";
    words[2] = "Fabio";
    System.out.println(words[2]);
  }
}
