import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter Employee's name: ");
    String name = scan.nextLine();

    System.out.print("Enter Employee's address: ");
    String address = scan.nextLine();

    System.out.print("Enter Employee's phone number: ");
    String number = scan.nextLine();

    System.out.print("Enter Employee's SSN: ");
    String ssn = scan.nextLine();

    System.out.print("Enter Employee's hourly rate: ");
    double rate = scan.nextDouble();

    Employee mike = new Employee(name, address, number, ssn, rate);

    System.out.print("Default vacation days: " + mike.getVacationDays());
  }
}
