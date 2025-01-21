import java.util.Collections;
import java.util.LinkedList;

public class Exercise19 {
    public static void main(String[] args) {
        //19.	Write a Java program to shuffle elements in a linked list
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");
        System.out.println("Original LinkedList: " + linkedList);
        //shuffleLinkedList(linkedList);
        Collections.shuffle(linkedList);
        System.out.println("Shuffled LinkedList: " + linkedList);

    }

//    public static void shuffleLinkedList(LinkedList<String> linkedList) {
//        int n = linkedList.size();
//        for (int i = 0; i < n; i++) {
//            int randomIndex = (int) (Math.random() * n);
//            String temp = linkedList.get(i);
//            linkedList.set(i, linkedList.get(randomIndex));
//            linkedList.set(randomIndex, temp);
//        }
//    }
}
