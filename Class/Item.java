public class Item {
  private String name;
  private double price;
  private int quantity;

  public Item(String itemName, double itemPrice, int numPurchased) {
    name = itemName;
    price = itemPrice;
    quantity = numPurchased;
  }

  public String toString() {
    String result = "Item details:\nName: " + name + "\nPrice: $" + price + "\nQuantity: " + quantity;
    return result;
  }

  public double getPrice() {
    return price;
  }

  public String getName() {
    return name;
  }

  public int getQuantity() {
    return quantity;
  }
}
