import java.util.LinkedList;

public class Exercise20 {
    public static void main(String[] args) {
        //20.	Write a Java program to copy a linked list to another linked list
        LinkedList<String> originallist = new LinkedList<String>();
        originallist.add("Hello");
        originallist.add("World");
        originallist.add("Java");
        LinkedList<String> copyList = new LinkedList<String>(originallist);
        System.out.println("Original List: " + originallist);
        System.out.println("Copy List: " + copyList);
        copyList.set(2, "program");
        System.out.println("Updated Copy List: " + copyList);
        //System.out.println("Original List: " + list); // observe the changes in the original list as well

    }

}
