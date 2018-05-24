import java.util.*;
import java.math.*;

public class FindMaxMinTester {
  public static void main(String[] args) {
    FindMaxMin ints = new FindMaxMin();

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter in the number of integers you want to enter into the array: ");
    int length = scan.nextInt();
    int arr[] = new int[length];

    for (int i = 0; i < length; i++) {
      System.out.print("Enter in the integer: ");
      int scannedInt = scan.nextInt();
      arr[i] = scannedInt;
    }

    System.out.println("Maximum value is: " + ints.getMax(arr));
    System.out.println("Minimum value is: " + ints.getMin(arr));
  }
}
