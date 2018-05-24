/*
Ryan Welch
HW04
CS 113-010
Professor Spirollari
2/22/18
*/
public class Book {
  private String bTitle;
  private int bPages;

  public Book(String title, int pages) {
    this.bTitle = title;
    this.bPages = pages;
  }

  public void setTitle(String title) {
    this.bTitle = title;
  }

  public void setPageNumber(int pageNumber) {
    this.bPages = pageNumber;
  }

  public String getTitle() {
    return this.bTitle;
  }

  public int getPages() {
    return this.bPages;
  }

  public String toString() {
    String bookData = "Book title: " + this.bTitle + "\nNumber of pages in " + this.bTitle + " is: " + this.bPages;
    return bookData;
  }

  public boolean equals(String title1, String title2, int pages1, int pages2) {
    if (title1.equals(title2) && pages1 == pages2) {
      return true;
    } else {
      return false;
    }
  }

  /*
  Returns 1 if page number of book one is greater than page number of book 2.
  Returns -1 if page number of book one is less than page number of book 2.
  Returns 0 if both books have an equal number of page numbers.
  */
  public int compareTo(int pages1, int pages2) {
    if (pages1 > pages2) {
      return 1;
    } else if (pages1 < pages2) {
      return -1;
    } else {
      return 0;
    }
  }
}
