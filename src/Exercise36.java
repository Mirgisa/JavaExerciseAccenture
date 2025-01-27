import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise36 {
    public static void main(String[] args) {
        //36.Write a Java program to get the current time in New York
        ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));

        // Format the time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        String formattedTime = newYorkTime.format(formatter);

        // Print the time
        System.out.println("The current time in New York is: " + formattedTime);

    }
}
