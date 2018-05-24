/*
Ryan Welch
HW03
CS 113-010
Professor Spirollari
2/14/18
*/
import java.util.*;
import java.lang.Math;

public class MyMethods {
  public MyMethods() {

  }

  public int surface(int width, int length, int depth) {
    int surfaceArea = 2*(width + length + depth);
    return surfaceArea;
  }

  public double rightTriangle(double sideA, double hypotenuseB) {
    double thirdSide = Math.sqrt((hypotenuseB * hypotenuseB) - (sideA * sideA));
    return thirdSide;
  }

  public static void main(String[] args) {
    MyMethods x = new MyMethods();
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter in a width: ");
    int w = scan.nextInt();

    System.out.print("Enter in a length: ");
    int l = scan.nextInt();

    System.out.print("Enter in a depth: ");
    int d = scan.nextInt();

    System.out.println("Surface area: " + x.surface(w, l, d));

    System.out.print("Enter in the length of side A of the triangle: ");
    double sideA = scan.nextDouble();

    System.out.print("Enter in the length of the hypotenuse for the triangle: ");
    double hyp = scan.nextDouble();

    System.out.println("Side length: " + x.rightTriangle(sideA, hyp));

  }
}
