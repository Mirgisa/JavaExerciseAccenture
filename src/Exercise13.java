import java.util.ArrayList;

public class Exercise13 {
    public static void main(String[] args){
        //13.Write a Java program to search for an element in an array list that enter by user
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        int element = 3;
        if( arrayList.contains(element)) {
            System.out.println("Element found: " + element);
            System.out.println("Index of element: " + arrayList.indexOf(element));
        } else {
            System.out.println("Element not found: ");
        }

    }

}
