public class ShapeTester {
  public static void main(String[] args) {
    double width = 5, length = 7;

    Shape rectangle = new Rectangle(width, length);
    System.out.println("Rectangle width: " + width + " and length: " + length + "\nResulting area: " + rectangle.area() + "\nResulting perimeter: " + rectangle.perimeter());

    double radius = 5;

    Shape circle = new Circle(radius);
    System.out.println("Circle radius: " + radius + "\nResulting area: " + circle.area() + "\nResulting perimeter: " + circle.perimeter());

    double a = 5, b = 3, c = 4;

    Shape triangle = new Triangle(a, b, c);
    System.out.println("Triangle side lengths: " + a + ", " + b + ", " + c + "\nResulting area: " + triangle.area() + "\nResulting perimeter: " + triangle.perimeter());
  }
}
