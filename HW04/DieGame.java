/*
Ryan Welch
HW04
CS 113-010
Professor Spirollari
2/22/18
*/
import java.util.*;

public class DieGame {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Die d1 = new Die();
    Die d2 = new Die();

    int rollSum = 0;
    int userPoints = 0;
    int compPoints = 0;

    while (rollSum < 100) {
      rollSum += (d1.roll() + d2.roll());
      if (rollSum < 100) {
        System.out.println("You did not score 100. Your score: " + rollSum);
        // break;
      } else if (rollSum == 100) {
        System.out.println("You scored: " + rollSum);
      }
    }

    System.out.print("Pick a number between 2 and 12: ");
    int num = scan.nextInt();

    System.out.print("Enter in the number of times you want to roll (Number has to be up to 3): ");
    int rolls = scan.nextInt();

    for (int i = 0; i < rolls; i++) {
      if (num == (d1.roll() + d2.roll())) {
        userPoints += 5;
      } else {
        compPoints += 3;
      }
    }

    if (userPoints > compPoints) {
      System.out.println("You scored " + userPoints + " to the computer's " + compPoints + " points. You won.");
    } else if (userPoints < compPoints) {
      System.out.println("You scored " + userPoints + " to the computer's " + compPoints + " points. You lost.");
    } else {
      System.out.println("You scored " + userPoints + " to the computer's " + compPoints + " points. There was a tie.");
    }
  }
}
