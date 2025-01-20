public class Exercise7 {
    public static void main(String[] args) {
        //7.	Write a Java program to find duplicate values in an array of integer values.
        int[] arr ={1,2,3,4,5,6,7,2,3,8,9,2};
        findDuplicates(arr);
    }
    public static void findDuplicates(int[] arr) {
        System.out.println("Duplicate values in the array are: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
