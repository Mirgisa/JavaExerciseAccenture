import java.util.HashSet;
import java.util.TreeSet;

public class Exercise23 {
    public static void main(String[] args) {
        //23.	Write a Java program to convert a hash set to a tree set
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(4);
        hashSet.add(2);

        TreeSet<Integer> treeSet = new TreeSet<>(hashSet);

        System.out.println("Element in the trees");
        for (Integer num : treeSet) {
            System.out.println(num);
        }

    }
}
