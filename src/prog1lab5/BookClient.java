package prog1lab5;

/**
 * This is a client class for the Book class
 *
 * @author Ali Zoubeidi
 */
public class BookClient {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
        Book book = new Book();
        book.setIsbn("123-345-54523");
        System.out.println(book);
        System.out.println(Book.getCountBooks());
        
        Book book2 = new Book("Pomme S", "Ali Zoubeidi", "123-345-54523", 2020);
        System.out.println(book2);
        System.out.println(Book.getCountBooks());
        
        if (book.equals(book2)) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are NOT equal...");
        }
    }
}
