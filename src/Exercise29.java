import java.util.HashMap;
import java.util.Map;

public class Exercise29 {
    public static void main(String[] args) {
        //29.	Write a Java program to get the value of a specified key in a map
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        String key = "Two";
        int value = map.getOrDefault(key, -1);
        System.out.println("Value of key '" + key + "': " + value);
    }
}
