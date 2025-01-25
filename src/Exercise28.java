import java.util.HashMap;

public class Exercise28 {
    public static void main(String[] args) {
        //28.	Write a Java program to get a shallow copy of a HashMap instance
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        HashMap<String, Integer> shallowCopy = new HashMap<>(map);
        System.out.println("Original Map: " + map);
        System.out.println("Shallow Copy: " + shallowCopy);

        // Modifying the original map will not affect the shallow copy
        map.put("D", 4);
        System.out.println("Modified Original Map: " + map);
        System.out.println("Shallow Copy: " + shallowCopy);
    }
}
