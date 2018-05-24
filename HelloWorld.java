public class HelloWorld {
    public static void main(String[] args) {
      int i = 1;
      for (boolean done = false; !done; i++) {
        if (i > 3) {
          done = true;
        }
        System.out.println(i);
      }
      System.out.println(i);
    }
}
