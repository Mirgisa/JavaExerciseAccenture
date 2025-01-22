import java.util.HashSet;

public class Exercise24 {
    public static void main(String[] args) {
        //24.	Write a Java program to empty an hash set
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(4);
        hashSet.add(2);
        System.out.println("Original HashSet: " + hashSet);
        hashSet.clear();
        System.out.println("Empty HashSet: " + hashSet);
    }
}
