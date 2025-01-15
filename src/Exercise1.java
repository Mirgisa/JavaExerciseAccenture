public class Exercise1 {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayBookDetails();

        Book book2 = new Book("Book 2", "Author 2");
        book2.displayBookDetails();

        Book book3 = new Book("Book 3", "Author 3", 19.99);
        book3.displayBookDetails();

    }
}
/*
1.	Write a Java program to create a class called "Book" with instance variables title, author, and price.
 Implement a default constructor and two parameterized constructors:



 */
class Book{
    String title;
    String author;
    double price;

    //Default constructor
    public Book(){
        this.title = "No Title";
        this.author = "No Author";
        this.price = 0.0;
    }
    //a.	One constructor takes title and author as parameters.
    public Book(String title, String author){
        this.title=title;
        this.author=author;
    }
    //b.	The other constructor takes title, author, and price as parameters.
    public Book(String title, String author, double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    //c.	Print the values of the variables for each constructor.
    public void displayBookDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

