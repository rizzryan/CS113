public class ShoppingCart {
  private Item[] cart;
  private int itemCount;
  private double totalPrice;
  private int capacity;

  public ShoppingCart() {
    itemCount = 0;
    capacity = 0;
    totalPrice = 0.00;
  }

  public void increaseSize() {
    Item[] cart2 = new Item[cart.length + 3];
    for (int i = 0; i < cart.length; i++) {
      cart2[i] = cart[i];
    }

    cart = cart2;
  }

  public void addToCart(String itemName, double price, int quantity) {
    if (itemCount == cart.length) {
      increaseSize();
    }

    cart[itemCount] = new Item(itemName, price, quantity);
    itemCount++;
    totalPrice = price * quantity;
  }

  public String toString() {
    String result = "Total for " + itemCount + " items is $" + totalPrice;
    return result;
  }

  public double getTotal() {
    return totalPrice;
  }
}
