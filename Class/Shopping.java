import java.util.*;

public class Shopping {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter in the item name: ");
    String name = scan.nextLine();

    System.out.print("Enter in the item price in decimal format: ");
    double price = scan.nextDouble();

    System.out.print("Enter in the quantity of the item: ");
    int quantity = scan.nextInt();

    Item m = new Item(name, price, quantity);
    ShoppingCart cart = new ShoppingCart();

    cart.addToCart(name, price, quantity);

    System.out.println("Price: $" + cart.getTotal());
  }
}
