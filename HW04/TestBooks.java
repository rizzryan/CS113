/*
Ryan Welch
HW04
CS 113-010
Professor Spirollari
2/22/18
*/
import java.util.*;

public class TestBooks {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Below is to test the Book class.
    System.out.print("Enter in a book title: ");
    String title1 = scan.nextLine();

    System.out.print("Enter in the number of pages in " + title1 + ": ");
    int pages1 = scan.nextInt();

    System.out.print("Enter in a book title: ");
    String title2 = scan.next();

    System.out.print("Enter in the number of pages in " + title2 + ": ");
    int pages2 = scan.nextInt();

    Book b1 = new Book(title1, pages1);
    Book b2 = new Book(title2, pages2);

    System.out.println(b1);
    System.out.println(b2);

    System.out.println(b1.compareTo(b1.getPages(), b2.getPages()));

    System.out.print("Enter the number of books you read during the summer: ");
    int readBooks = scan.nextInt();

    double avg = 0;

    ArrayList<Book> books = new ArrayList<Book>();

    for (int i = 0; i < readBooks; i++) {
      System.out.println();
      System.out.print("Enter in a book title: ");
      String title = scan.nextLine();

      System.out.print("\n");
      scan.nextLine();

      System.out.print("Enter in the number of pages: ");
      int pages = scan.nextInt();

      books.add(new Book(title, pages));
      avg += books.get(i).getPages();
    }

    for (int i = 0; i < readBooks -1; i++) {
      if (books.get(i).compareTo(books.get(i).getPages(), books.get(i + 1).getPages()) == -1) {
        System.out.print("\t\tInformation about \'smallest\' book: \n");
        System.out.print(books.get(i).toString());
      } else if (books.get(i + 1).compareTo(books.get(i + 1).getPages(), books.get(i).getPages()) == -1) {
        System.out.print("\t\tInformation about \'smallest\' book: \n");
        System.out.println(books.get(i).toString());
      }
    }

    System.out.println("Average page length: " + avg / readBooks + " pages.");
  }
}
