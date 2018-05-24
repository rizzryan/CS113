/*
Ryan Welch
HW03
CS 113-010
Professor Spirollari
2/14/18
*/
import java.util.*;

public class PairOfDice {
  private String color1;
  private String color2;
  private int fVal1;
  private int fVal2;

  public PairOfDice(Die die1, Die die2) {
    color1 = die1.getDieColor();
    color2 = die2.getDieColor();
    fVal1 = die1.getFaceValue();
    fVal2 = die2.getFaceValue();
  }

  public void setColor1(String newColor) {
    color1 = newColor;
  }

  public void setColor2(String newColor) {
    color2 = newColor;
  }

  public String getColor1() {
    return color1;
  }

  public String getColor2() {
    return color2;
  }

  public void setFaceVal1(int val) {
    fVal1 = val;
  }

  public void setFaceVal2(int val) {
    fVal2 = val;
  }

  public int getFVal1() {
    return fVal1;
  }

  public int getFVal2() {
    return fVal2;
  }

  public int roll() {
    fVal1 = (int) (Math.random() * 6) + 1;
    fVal2 = (int) (Math.random() * 6) + 1;
    return fVal1 + fVal2;
  }

  public String toString() {
    String result = "\nColor 1: " + color1 + "\nColor 2: " + color2 + "\n";
    return result;
  }

  public int pairSum() {
    int sum = fVal1 + fVal2;
    return sum;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter in a color: ");
    String c1 = scan.next();
    System.out.print("Enter in a color: ");
    String c2 = scan.next();

    Die d1 = new Die(1, c1);
    Die d2 = new Die(1, c2);
    PairOfDice pair = new PairOfDice(d1, d2);

    System.out.println("Sum of dices: " + pair.roll());
  }

}
