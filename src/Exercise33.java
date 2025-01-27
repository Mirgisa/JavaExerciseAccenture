import java.util.HashMap;
import java.util.Map;

public class Exercise33 {
    public static void main(String[] args) {
        //33.	Write a Java program to get the portion of a map whose keys are strictly less than a given key
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);

        String key = "C";

        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getKey().compareTo(key) < 0) {
                result.put(entry.getKey(), entry.getValue());
            }
        }

        System.out.println("Portion of Map with keys strictly less than " + key + ": " + result);
    }
}
