public class Library {
    public String libraryName;
    public Book book1;
    public Book book2;
    public Book book3;
    public void addBook(Book book, int slot) {
        if (slot == 1) {
            book1 = book;
        } else if (slot == 2) {
            book2 = book;
        } else if (slot == 3) {
            book3 = book;
        }
    }
    public void removeBook(int slot) {
        if (slot == 1) {
            book1 = null;
        } else if (slot == 2) {
            book2 = null;
        } else if (slot == 3) {
            book3 = null;
        }
    }
    public void printLibraryDetails() {
        System.out.println("Library: " + libraryName);
        System.out.println("");
        printBookDetails(book1);
        System.out.println("");
        printBookDetails(book2);
        System.out.println("");
        printBookDetails(book3);
    }
    public void checkBookAvailability(int slot) {
        if (slot == 1) {
            if (book1 == null) {
                System.out.println("Book in slot " + slot + " is not available.");
            } else {
                System.out.println(book1.title + "is available.");
            }
        } else if (slot == 2) {
            if (book2 == null) {
                System.out.println("Book in slot " + slot + " is not available.");
            } else {
                System.out.println(book2.title + "is available.");
            }
        } else if (slot == 3) {
            if (book3 == null) {
                System.out.println("Book in slot " + slot + " is not available.");
            } else {
                System.out.println(book3.title + "is available.");
            }
        }
    }
    public void updateBookPrice(int slot, double newPrice) {
        if (slot == 1 && book1 != null) {
            System.out.println("Updated price of " + book1.title + " to $" + newPrice + ".");
            book1.price = newPrice;
        } else if (slot == 2 && book2 != null) {
            System.out.println("Updated price of " + book2.title + " to $" + newPrice + ".");
            book2.price = newPrice;
        } else if (slot == 3 && book3 != null) {
            System.out.println("Updated price of " + book3.title + " to $" + newPrice + ".");
            book3.price = newPrice;
        } else {
            System.out.println("No book in this slot.");
        }
    }
    public void printBookDetails(Book book) {
        if (book == null) {
            System.out.println("No book in this slot.");
        } else {
            System.out.println("Title: " + book.title);
            System.out.println("Author: " + book.author);
            System.out.println("Publisher: " + book.publisher);
            System.out.println("Year Published: " + book.yearPublished);
            System.out.println("Price: $" + book.price);
            System.out.print("Available: ");
            if (book.isAvailable == false) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}
