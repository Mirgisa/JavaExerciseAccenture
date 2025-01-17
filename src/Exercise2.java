import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args) {
        BookCollection collection = new BookCollection();

        //Creating Books

        Book2 b1 = new Book2("Effective java","Joshua","9780134");
        Book2 b2 = new Book2("Thinking in java","Bruce","978013187");

        //Adding books to collection
        collection.addBook(b1);
        collection.addBook(b2);

        //Display books
        collection.displayBooks();

        //Remove books by isbn
        collection.removeBookByIsbn("9780134");

        //Display books after removal
        System.out.println("Books after removal:");
        collection.displayBooks();



    }
}
/*
2.	Write a Java program to create a class called "Book" with attributes for title, author, and ISBN,
 and methods to add and remove books from a collection.
 */

class Book2 {
    private String title;
    private String author;
    private String isbn;

    public Book2(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    //Getters


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book2{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
class BookCollection{
    private List<Book2> books;
    public BookCollection() {
        this.books = new ArrayList<>();
    }
    //Method to Add a Book
    public void addBook(Book2 book){
        books.add(book);
        System.out.println("Book added: " + book);
    }
    //Method to Remove a Book by isbn
    public void removeBookByIsbn(String isbn){
        for (Book2 book : books) {
            if(book.getIsbn().equals(isbn)){
                books.remove(book);
                System.out.println("Book removed: " + book);
                return;
            }
        }
        System.out.println("Book not found with ISBN: " + isbn);
    }
    //Method to Display all Books
    public void displayBooks(){
        if(books.isEmpty()){
            System.out.println("No books in the collection.");
        }
        else {
            System.out.println(" books in the collection.");
            for (Book2 book : books) {
                System.out.println(book);
            }

        }
    }


}