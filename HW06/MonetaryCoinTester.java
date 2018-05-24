/*
Ryan Welch
HW06
CS 113-010
Professor Spirollari
4/5/18
*/
public class MonetaryCoinTester {
  public static void main(String[] args) {
    double avg =  0;
    MonetaryCoin[] arr = new MonetaryCoin[25];

    for (int i = 0; i < arr.length; i++) {
      int val = (int)(Math.random() * 30);
      arr[i] = new MonetaryCoin(val);

      if (arr[i].isHeads() == false) {
        avg += arr[i].getVal();
      }

    }
    avg /= 25;
    System.out.println("Average of coins with TAILS face is: " + avg);

  }
}
