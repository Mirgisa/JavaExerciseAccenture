import java.util.TreeMap;

public class Exercise34 {
    public static void main(String[] args) {
        //34.	Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key
        TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>();
        treeMap.put(10, "Ten");
        treeMap.put(11,"Eleven");
        treeMap.put(12, "Twelve");
        treeMap.put(13, "Thirteen");
        treeMap.put(30, "thirty");


        int givenKey = 25;

        // Get the least key strictly greater than the given key
        Integer leastKey = treeMap.higherKey(givenKey);

        // Display the result
        if (leastKey != null) {
            System.out.println("The least key strictly greater than " + givenKey + " is: " + leastKey);
        } else {
            System.out.println("There is no key strictly greater than " + givenKey);
        }

    }
}
