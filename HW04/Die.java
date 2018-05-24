/*
Ryan Welch
HW04
CS 113-010
Professor Spirollari
2/22/18
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
}
