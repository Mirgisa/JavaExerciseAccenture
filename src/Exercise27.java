import java.util.HashMap;

public class Exercise27 {
    public static void main(String[] args) {
        //27.	Write a Java program to remove all mappings from a map
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println("Before removing map "+map);
        map.clear();
        System.out.println("After Removing "+map);
    }
}
