// import java.math.*;

public class Triangle extends Shape {
  private final double sideA, sideB, sideC;

  public Triangle() {
    this(1,1,1);
  }

  public Triangle(double sideA, double sideB, double sideC) {
    this.sideA = sideA;
    this.sideB = sideB;
    this.sideC = sideC;
  }

  @Override
  public double area() {
    double s = (sideA + sideB + sideC) / 2;
    double a = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    return a;
  }

  @Override
  public double perimeter() {
    return sideA + sideB + sideC;
  }
}
