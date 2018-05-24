/*
Ryan Welch
HW08
CS 113-010
Professor Spirollari
4/26/18
*/


public class Methods {

  public Methods() {

  }

  public static void printDigits(int num) {
    if (num / 10 < 1) {
      System.out.println(num);
      return;
    } else {
      System.out.println(num % 10);
      printDigits(num/10);
    }
  }

  public int gcd(int num1, int num2) {
    if (num2 == 0) {
      return num1;
    }

    return gcd(num2, num1 % num2);
  }

  public static void row(int r) {
    for (int i = 0; i < r; i++) {
      if (i == r - 1) {
        for (int j = 0; j <=i; j++) {
          System.out.print(pascal(i, j) + " ");
        }
      }
      System.out.println();
    }
  }

  public static int pascal(int i, int j) {
    if (j == 0) {
      return 1;
    } else if (j == i) {
      return 1;
    } else {
      return pascal(i - 1, j - 1) + pascal(i - 1, j);
    }
  }

  public int[] nthRow(int r) {
    if (r == 1) {
      int[] arr1 = {1};
      return arr1;
    }

    int arr[] = nthRow(r - 1);
    int output[] = new int[arr.length + 1];
    output[0] = output[output.length - 1];
    output[0] = 1;

    for (int i = 1; i < arr.length; i++) {
      output[i] = arr[i] + arr[i - 1];
    }

    return output;
  }

}
