import java.util.ArrayList;

public class Exercise16 {
    public static void main(String[] args) {
        //16.Write a Java program to insert an element into the array list at the first position
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(8);

        System.out.println("Original ArrayList: " + arrayList);

        arrayList.add(0, 1);

        System.out.println("ArrayList after inserting at the first position: " + arrayList);
    }
}
