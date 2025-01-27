import java.util.*;

public class Exercise32 {
    public static void main(String[] args) {
        //32.	Write a Java program to get a reverse order view of the keys contained in a given map
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        List<String> keys = new ArrayList<>(map.keySet());
        Collections.reverse(keys);

        for (String key : keys) {
            System.out.println(key);
        }
    }
}
