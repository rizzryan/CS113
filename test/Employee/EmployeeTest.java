import java.util.*;

public class EmployeeTest {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter in the Employee ID: ");
    String id1 = scan.next();
    System.out.print("Enter in the Employee age: ");
    int age1 = scan.nextInt();
    // System.out.println();
    System.out.print("Enter in the Employee ID: ");
    String id2 = scan.next();
    System.out.print("Enter in the Employee age: ");
    int age2 = scan.nextInt();

    Employee e1 = new Employee(id1, age1);
    Employee e2 = new Employee(id2, age2);

    System.out.println(e1);
    System.out.println(e2);
    System.out.println("Youngest age is: " + e1.findYoungest(e1.getAge(), e2.getAge()));
    if (e1.equal(e1.getAge(), e2.getAge()) == true) {
      System.out.println("They are the same age.");
    } else {
      System.out.println(e1.getAge() + " is not equal to " + e2.getAge());
    }
  }
}
