public class Circle extends Shape {
  private final double radius;

  public Circle() {
    this(1);
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return Math.PI * radius * radius;
  }

  @Override
  public double perimeter() {
    return Math.PI * 2 * radius;
  }
}
