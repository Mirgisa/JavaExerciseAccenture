import java.util.TreeMap;

public class Exercise30 {
    public static void main(String[] args) {
        //30.	Write a Java program to search for a key in a Tree Map
        TreeMap<String,Integer> treeMap = new TreeMap<String,Integer>();
        treeMap.put("A", 1);
        treeMap.put("B", 2);
        treeMap.put("C", 3);
        treeMap.put("D", 4);

        String key = "B";
        if (treeMap.containsKey(key)) {
            System.out.println("Key found: " + treeMap.get(key));
        } else {
            System.out.println("Key not found: " + key);
        }
    }
}
