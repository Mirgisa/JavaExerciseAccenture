import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Exercise21 {
    public static void main(String[] args) {
        //21.Write a Java program to iterate through all elements in a hash list
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 3);

        for(Map.Entry<String,Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

    }
}
