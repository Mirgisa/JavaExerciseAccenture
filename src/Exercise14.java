import java.util.ArrayList;

public class Exercise14 {
    public static void main(String[] args){
        //14.Write a Java program to sort a given array list
        int[] lists ={5,1,3,6,7,8,9,2};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < lists.length; i++) {
            arrayList.add(lists[i]);
        }
        arrayList.sort(Integer::compareTo);
        System.out.println("Sorted array list: " + arrayList);


    }
}
