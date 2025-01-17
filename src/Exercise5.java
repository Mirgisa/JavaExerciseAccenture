import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        //5.	Write a Java program that reads a file and throws an exception if the file is empty.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file path");
        String filePath = scanner.nextLine();
        scanner.close();
        try {
            File file = new File(filePath);
            if (!file.exists() || file.length() == 0) {
                throw new Exception("File is empty or does not exist" + filePath);
            }
            try {
                Scanner fileScanner = new Scanner(file);
                {
                    System.out.println("File content:");
                }
                while (fileScanner.hasNextLine()) {
                    System.out.println(fileScanner.nextLine());
                }
                fileScanner.close();
            } catch (Exception e) {
                System.err.println("Error reading file: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
// Custom exception class
class EmptyFileException extends Exception {
    public EmptyFileException(String message) {
        super(message);
    }
}


