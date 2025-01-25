import java.util.TreeSet;

public class Exercise25 {
    public static void main(String[] args) {
        //25.	Write a Java program to add all the elements of a specified tree set to another tree set
        TreeSet<Integer> treeSet1 = new TreeSet<Integer>();
        treeSet1.add(5);
        treeSet1.add(3);
        treeSet1.add(1);
        treeSet1.add(4);
        treeSet1.add(2);

        TreeSet<Integer> treeSet2 = new TreeSet<Integer>();
        treeSet2.addAll(treeSet1);
        System.out.println("Tree Set 1: " + treeSet1);
        System.out.println("Tree Set 2: " + treeSet2);
    }
}
