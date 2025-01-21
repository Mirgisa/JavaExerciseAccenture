import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Exercise6 {
    public static void main(String[] args) {
        //6.Write a Java program that reads a list of numbers from a file and throws an exception if any of the numbers are positive
        String filepath = "C:\\Users\\Mirgisa\\AccentureProject\\JavaExercises\\JavaExercisesAccenture\\src\\numbers.txt";
        try {
            List<Integer> numbers = readNumbersFromFile(filepath);
            checkForPositiveNumbers(numbers);
            System.out.println("No positive numbers found in the file.");
        } catch (PositiveNumberException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    public static List<Integer> readNumbersFromFile(String filePath) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                numbers.add(Integer.parseInt(line.trim()));
            }
        }
        return numbers;
    }

    // Method to check for positive numbers
    public static void checkForPositiveNumbers(List<Integer> numbers) throws PositiveNumberException {
        for (int number : numbers) {
            if (number > 0) {
                throw new PositiveNumberException("Positive number found: " + number);
            }
        }
    }
}

    // Custom exception for positive numbers
    class PositiveNumberException extends Exception {
        public PositiveNumberException(String message) {
            super(message);
        }
    }