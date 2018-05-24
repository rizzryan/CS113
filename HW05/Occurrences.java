/*
Ryan Welch
HW05
CS 113-010
Professor Spirollari
3/1/18
*/
import java.util.*;

public class Occurrences {
  public static void main(String[] args) {
    // Scanner is instantiated to read input
    Scanner scan = new Scanner(System.in);
    boolean loop = true;
    int inputNum;

    // Instantiated an ArrayList to store the inputted numbers in
    List<Integer> nums = new ArrayList<Integer>();

    while (loop) {
      System.out.print("Enter in an integer betwee 0 and 50 inclusive: ");
      inputNum = scan.nextInt();

      if (inputNum >= 0 && inputNum <= 50) {
        nums.add(inputNum);
      } else {
        System.out.print("Number was not in between 0 and 50 inclusive. Quitting...\n");

        // Loop is updated to false and while loop ends
        loop = false;
      }
    }

    int frequency;

    System.out.println("Number \t:\tFrequency");

    for (int i = 0; i < nums.size(); i++) {

      // This is used to find the frequency of an element within an ArrayList
      frequency = Collections.frequency(nums, nums.get(i));

      System.out.println("{ " + nums.get(i) + "\t:\t" + frequency + " }");

      // This for loop is needed to delete the duplicate elements in the list
      for (int j = i + 1; j < nums.size(); j++) {
        if (nums.get(i).equals(nums.get(j))) {
          nums.remove(j);
          j--;
        }
      }
    }
  }
}
