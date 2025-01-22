import java.util.HashSet;

public class Exercise22 {
    public static void main(String[] args) {
        //22.	Write a Java program to convert a hash set to an array
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        System.out.println("Elements in the hash set: "+ hashSet);
        String[] array = hashSet.toArray(new String[0]);

        System.out.println("Elements in the array)");
        for (String element : array) {
            System.out.println(element);
        }

    }
}
