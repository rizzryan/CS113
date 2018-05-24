import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter in the number of Executives: ");
    int numExecs = scan.nextInt();

    Executive exec[] = new Executive[numExecs];

    for (int i = 0; i < numExecs; i++) {
      System.out.print("Name of Executive: ");
      String name = scan.next();

      System.out.print("Address of Executive: ");
      String address = scan.next();

      System.out.print("Phone number of Executive: ");
      String number = scan.next();

      System.out.print("SSN of Executive: ");
      String ssn = scan.next();

      System.out.print("Hourly rate of Executive: ");
      double rate = scan.nextDouble();

      exec[i] = new Executive(name, address, number, ssn, rate);

      System.out.print("Enter award bonus: ");
      double bonus = scan.nextDouble();

      try {
        exec[i].awardBonus(bonus);
      } catch (BonusTooHighException e) {
        System.out.print(e);
      }
    }

    System.out.print("\nValid bonuses for Executives");

    for (int j = 0; j < numExecs; j++) {
      if (exec[j].getBonus() > 0) {
        double execBonus = exec[j].getBonus();
        System.out.println("Employee #" + (j + 1) + "\nBonus: " + execBonus + "\nAverage pay: " + exec[j].pay());
      }
    }
  }
}
