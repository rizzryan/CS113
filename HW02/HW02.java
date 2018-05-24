/*
Ryan Welch
HW02
CS 113-010
Professor Spirollari
2/1/18
*/
import java.util.*;

public class HW02 {
  public static void main(String[] args) {
    // Begin PP 1
    Random num = new Random();

    String firstThree = "";
    String midThree = "";
    String lastFour = "";

    for (int x = 0; x < 3 ; x++) {
      int firstThreeDigits = num.nextInt(8);
      firstThree += firstThreeDigits;
    }

    int midThreeDigits = num.nextInt(655);

    if (Integer.toString(midThreeDigits).length() == 3) {
      midThree += midThreeDigits;
    }

    int lastFourDigits = num.nextInt(10000);

    if (Integer.toString(lastFourDigits).length() == 4) {
      lastFour += lastFourDigits;
    }

    int totalLength = firstThree.length() + midThree.length() + lastFour.length();

    if (totalLength == 10) {
      System.out.println("Phone number: (" + firstThree + ")-" + midThree + "-" + lastFour);
    } else {
      System.out.println("Phone number: Not valid.");
    }
    // End PP 1

    // Begin PP 2
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter in your first name: ");
    String fName = scan.nextLine();
    String firstLetter = fName.substring(0,1);

    System.out.print("Enter in your last name: ");
    String lName = scan.nextLine();

    if (lName.length() >= 5) {
      String firstFive = lName.substring(0,5);
      int numRange = num.nextInt(99 - 10 + 1) + 10;

      System.out.print(firstLetter + firstFive + numRange + "\n");
    } else {
      System.out.println("Last name is not at least 5 letters long.");
    }
    // End PP 2

    // Begin PP 3
    int nameCount = 0;
    int namelengthCount = 0;
    String firstLetterString = "";

    for (int i = 0; i < 3; i++) {
      System.out.print("Enter in a first name: ");
      String studentName = scan.nextLine();
      firstLetterString += studentName.substring(0,1);
      namelengthCount += studentName.length();
      nameCount++;
    }
    double outputAverageLength = (double) namelengthCount / nameCount;
    
    System.out.println(outputAverageLength + "\n" + firstLetterString);
    // End PP 3
  }
}
