import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise38 {
    public static void main(String[] args) {
        //38.	Write a Java program to add hours to the current time
        LocalDateTime currentTime = LocalDateTime.now();

        int hoursToAdd = 3;

        LocalDateTime updatedTime = currentTime.plusHours(hoursToAdd);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedCurrentTime = currentTime.format(formatter);
        String formattedUpdatedTime = updatedTime.format(formatter);

        System.out.println("Current Time: " + formattedCurrentTime);
        System.out.println("Updated Time: "+hoursToAdd+" hours " + formattedUpdatedTime);



    }
}
