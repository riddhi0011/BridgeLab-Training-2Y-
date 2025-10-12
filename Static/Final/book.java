
class book {
    private static String libraryName;
    private String title;
    private String author;
    private final String isbn;

    public book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void setLibraryName(String name) { libraryName = name; }
    public static void displayLibraryName() { System.out.println("Library Name: " + libraryName); }

    public void displayBookDetails() {
        if (this instanceof book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("The object is not an instance of the Book class.");
        }
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
}

public class Library {
    public static void main(String[] args) {
        book.setLibraryName("Egmore Library");
        book.displayLibraryName();
        book book1 = new book("Effective Java", "Joshua Bloch", "978-0134685991");
        book1.displayBookDetails();
    }
}
