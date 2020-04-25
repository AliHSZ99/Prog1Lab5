package prog1lab5;

/**
 * This program is a class encapsulating the concept of a book. The attributes
 * of a book are title, author, ISBN, and year of publishing. The class has a
 * static attribute publisher initialized as “Vanier”, and an amountOfBooks,
 * which is initially zero. Include a constructor, accessors and mutators, and
 * the methods toString and equals. Every time a new object is instantiated, the
 * class variable amountOfBooks is incremented by 1. When a book object is
 * printed, it should output all its attributes in a nice way. Two books are
 * considered equal if they have the same ISBN. Make sure you have at least one
 * method that uses the object reference this. Write a client class to test all
 * the methods in your Book class. Also test if two book objects share the same
 * values for publisher and amountOfBooks.
 *
 * @author Ali Zoubeidi
 */
public class Book {

    private String title;
    private String author;
    private String isbn;
    private int yearPublished;

    private static int countBooks = 0;
    private static final String PUBLISHER = "Vanier";

    public Book() {
        title = "unknown";
        author = "unknown";
        isbn = "unknown";
        countBooks++;
    }

    public Book(String startTitle, String startAuthor,
            String startIsbn, int startYearPublished) {
        title = startTitle;
        author = startAuthor;
        isbn = startIsbn;
        yearPublished = startYearPublished;
        countBooks++;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }

    public Book setIsbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public Book setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
        return this;
    }

    public static int getCountBooks() {
        return countBooks;
    }

    public static String getPublisher() {
        return PUBLISHER;
    }

    @Override
    public String toString() {
        return "Title: " + title
                + "; Author: " + author
                + "; Year Published: " + yearPublished
                + "; ISBN: " + isbn
                + "\nThe publisher is " + PUBLISHER
                + " and the number of books is " + countBooks;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book)) {
            return false;
        } else {
            Book objBook = (Book) o;
            if (isbn.equals(objBook.isbn)) {
                return true;
            } else {
                return false;
            }
        }
    }

}
