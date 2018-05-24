/*
Ryan Welch
HW06
CS 113-010
Professor Spirollari
4/5/18
*/
public class MonetaryCoin extends Coin {
  private int VALUE;

  public MonetaryCoin(int val) {
    this.VALUE = val;
  }

  public int getVal() {
    return this.VALUE;
  }

  public void setVal(int val) {
    this.VALUE = val;
  }

  public String toString() {
    String result = "Value of the coin is: " + getVal();
    return result;
  }
}
