public class Array {
  public static void main(String[] args) {
    int counter = 0;
    String[] a = {"b", "a", "l", "l", "o", "o", "n"};

    for (int i = 1; i < a.length; i++) {
      if (a[i].equals(a[i - 1])) {
        counter += 1;
        i++;
      }
    }
    System.out.println("There are " + counter + " pairs.");
  }
}
