import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise4 {
    public static void main(String[] args) {
        /*
        4.	Write a Java program that reads a list of integers from the user and throws an exception if any numbers are duplicates.
 */
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<Integer>();

        System.out.println("Enter the number of elements in the list:");
        while(true){
            String input = scanner.nextLine();

            if(input.equalsIgnoreCase("done")){
                break;

            }
            try{
                int number = Integer.parseInt(input);
                if (!numbers.add(number)) {
                    throw new DuplicateNumberException("Duplicate number found: " + number);
                }
            } catch (DuplicateNumberException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }

        System.out.println("Unique numbers entered: " + numbers);
    }
        }
        class DuplicateNumberException extends Exception {
            public DuplicateNumberException(String message) {
                super(message);
            }
        }


