import javafx.scene.Node;

import java.util.LinkedList;

public class Exercise17 {
    public static void main(String[] args) {
        //17.	Write a Java program to insert the specified element at the front of a linked list
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");

        System.out.println("Original linked list "+linkedList );
       // String element = "X";
        linkedList.addFirst("X");// or we can pass element as parameter
        linkedList.addLast("Z");
        linkedList.add(3, "G"); // to insert at specific index
        System.out.println("Linked list after inserting at the front: "+linkedList);


    }

}
