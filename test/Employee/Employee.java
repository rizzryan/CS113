public class Employee {
  private String eId;
  private int age;

  public Employee(String x, int y) {
    this.eId = x;
    this.age = y;
  }

  public void setValue(String x, int y) {
    this.eId = x;
    this.age = y;
  }

  public int getAge() {
    return this.age;
  }

  public String toString() {
    String result = "Employee id: " + this.eId + "\nEmployee age: " + getAge();
    return result;
  }

  public boolean equal(int a, int b) {
    return a == b;
  }

  public int findYoungest(int a, int b) {
    if (a < b) {
      return a;
    } else {
      return b;
    }
  }
}
