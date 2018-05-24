/*
Ryan Welch
HW03
CS 113-010
Professor Spirollari
2/14/18
*/
import java.util.*;

public class Die {
  public final int MAX = 6;
  public int facevalue;
  public String color;

  public Die() {
    facevalue = 1;
  }

  public Die(int faceValue, String dieColor) {
    facevalue = faceValue;
    color = dieColor;
  }

  public int roll() {
    facevalue = (int) (Math.random() * MAX) + 1;
    return facevalue;
  }

  public void setFaceValue(int value) {
    facevalue = value;
  }

  public int getFaceValue() {
    return facevalue;
  }

  public void setDieColor(String color) {
    color = color;
  }

  public String getDieColor() {
    return color;
  }

  public String toString() {
    String result = Integer.toString(facevalue);
    return result;
  }

  public String comboDie(Die die1, Die die2) {
    double faceValueAvg = (die1.getFaceValue() + die2.getFaceValue()) / 2;
    String comboColor = die1.getDieColor() + "-" + die2.getDieColor();
    String comboDieResult = "Combo color: " + comboColor + "\nCombo face value: " + faceValueAvg + "\n";
    return comboDieResult;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter in the face value of die 1: ");
    int faceVal1 = scan.nextInt();

    System.out.print("Enter in the color of die 1: ");
    String color1 = scan.next();

    System.out.print("Enter in the face value of die 2: ");
    int faceVal2 = scan.nextInt();

    System.out.print("Enter in the color of die 2: ");
    String color2 = scan.next();

    Die die1 = new Die(faceVal1, color1);
    Die die2 = new Die(faceVal2, color2);
    Die die3 = new Die();

    System.out.print(die3.comboDie(die1, die2));
  }
}
