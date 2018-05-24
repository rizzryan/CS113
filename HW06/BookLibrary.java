/*
Ryan Welch
HW06
CS 113-010
Professor Spirollari
4/5/18
*/
import java.util.*;
import org.apache.commons.lang3.ArrayUtils;

public class BookLibrary {
  public static void main(String[] args) {
    Book[] library = new Book[10];
    Scanner scan = new Scanner(System.in);

    String options = "\n1. Add a book.\n2. Delete a book.\n3. Change book information (title and/or pages).";
    System.out.print("Welcome to the library. Your options are below." + options);
    int choice = scan.nextInt();

    switch (choice) {
      case 1:
        for (int i = 0; i < library.length; i++) {
          if (ArrayUtils.isEmpty(library)) {
            System.out.print("Enter in the title: ");
            String title = scan.nextLine();
            library[i] = new Book(title);
            // break;
          } else {
            System.out.print("Library is full.");
            break;
          }
        }
      case 2:
        for (int i = 0; i < library.length; i++) {
          if (ArrayUtils.isEmpty(library)) {
            System.out.print("Library is empty.");
            break;
          } else {
            System.out.print("Enter the title you wish to delete: ");
            String deletedTitle = scan.nextLine();
            if (library[i].equals(deletedTitle)) {
              library[i] = null;
            }
          }
        }
      case 3:
        for (int i = 0; i < library.length; i++) {
          if (ArrayUtils.isEmpty(library)) {
            System.out.print("Library is empty.");
            break;
          } else {
            System.out.print("Enter in the title or pages you want to change: ");
            if (scan.hasNextInt()) {
              int changePages = scan.nextInt();
              library[i] = library[i].setPageNumber(changePages);
            } else {
              int changeTitle = scan.nextLine();
              library[i] = library[i].setTitle(changeTitle);
            }
            // String changedTitle
          }
        }
      default:
        System.out.print("Error. No option was chosen.");
    }

    for (int i = 0; i < library.length; i++) {
      System.out.println(library[i]);
    }
  }
}
