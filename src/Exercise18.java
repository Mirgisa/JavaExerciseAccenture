import java.util.LinkedList;

public class Exercise18 {
    public static void main(String[] args) {
        //18.	Write a Java program to remove a specified element from a linked list
        LinkedList<String> list = new LinkedList<String>();
        list.add("Hello");
        list.add("World");
        list.add("It");
        list.add("Is");
        list.add("Java");
        System.out.println("Linked List before removing element : " + list);
       list.remove("World");
        // Alternative method to remove an element by index for integer
       // list.remove(list.indexOf(0));
        System.out.println("Linked List after removed element : " + list);
    }
}
