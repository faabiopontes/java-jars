package prerequisite_practice;

public class StringsPractice {
  public static void main(String[] args) {
    String firstName = Alphabet.getLetter(6) + Alphabet.getLetter(1) + Alphabet.getLetter(2) + Alphabet.getLetter(9) + Alphabet.getLetter(15);
    String lastName = Alphabet.getLetter(16) + Alphabet.getLetter(15) + Alphabet.getLetter(14) + Alphabet.getLetter(20) + Alphabet.getLetter(5) + Alphabet.getLetter(19);
    String fullName = firstName + " " + lastName;
    System.out.println(fullName);
    
    int positionOfFirstO = fullName.indexOf("O");
    int positionOfSecondO = fullName.indexOf("O", positionOfFirstO + 1);
    int positionOfLastO = fullName.lastIndexOf("O");
    System.out.println("Position of First O: " + positionOfFirstO);
    System.out.println("Position of Second O: " + positionOfSecondO);
    System.out.println("Position of Last O: " + positionOfLastO);

    System.out.println(Alphabet.positionOf("F"));
  }
}
