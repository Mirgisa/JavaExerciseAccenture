import java.util.TreeMap;

public class Exercise31 {
    public static void main(String[] args) {
        //31.Write a Java program to search for a value in a Tree Map
        TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>();
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(4, "Four");


        String value = "Three";
        if(treeMap.containsValue(value)){
            System.out.println("Value found: " +value);

        }
        else{
            System.out.println("Value not found: " + value);
        }

    }
}
