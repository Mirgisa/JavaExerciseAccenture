import java.util.ArrayList;
import java.util.List;

public class Exercise15 {
    public static void main(String[] args) {
        //15.	Write a Java program to extract a portion of an array list
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int startIndex =2; //inclusive
        int endIndex = 4; //exclusive

        List<Integer> subList = list.subList(startIndex, endIndex);
        System.out.println(subList);

    }

}
