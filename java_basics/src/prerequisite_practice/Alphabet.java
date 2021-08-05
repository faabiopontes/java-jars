package prerequisite_practice;

public class Alphabet {
  private static String letters = "ABCDEFGHIJKLMNOPQRSTUVWXZ";

  public static String getLetter(int number) {
    return String.valueOf(letters.charAt(number - 1));
  }

  public static int positionOf(String letter) {
    return letters.indexOf(letter) + 1;
  }
}
