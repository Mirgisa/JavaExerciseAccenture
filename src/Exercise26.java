import java.util.TreeSet;

public class Exercise26 {
    public static void main(String[] args) {
        //26.	Write a Java program to compare two tree sets
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(5);
        set1.add(3);
        set1.add(1);

        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(5);
        set2.add(3);
        set2.add(8);

        System.out.println("Tree Set 1: " + set1);
        System.out.println("Tree Set 2: " + set2);
        //to compare two trees
        System.out.println("Tree Set 1 equals Tree Set 2: " + set1.equals(set2)); //true if both trees have the same elements and in the same order.
        //to find the difference
        TreeSet<Integer> difference = new TreeSet<>(set1);
        difference.removeAll(set2);
        System.out.println("The differences are: " + difference);

        //to find the union
        TreeSet<Integer> union = new TreeSet<>(set1);
        union.addAll(set2);
        System.out.println("The unions are: " + union);

     //to find the intersection
        TreeSet<Integer> intersection = new TreeSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("The intersections are: " + intersection);

    }
}
