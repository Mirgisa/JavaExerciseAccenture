public class Exercise35 {
    public static void main(String[] args) {
        //35.	Write a Java program to get the minimum value of year, month, week, date from the current date of a default calendar
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int year = calendar.get(java.util.Calendar.YEAR);
        int month = calendar.get(java.util.Calendar.MONTH) + 1;
        int week = calendar.get(java.util.Calendar.WEEK_OF_MONTH);
        int date = calendar.get(java.util.Calendar.DAY_OF_MONTH);

        System.out.println("Current Date: " + year + "/" + month + "/" + date);
        System.out.println("Minimum Year: " + year);
        System.out.println("Minimum Month: " + month);
        System.out.println("Minimum Week: " + week);
        System.out.println("Minimum Date: " + date);
    }
}
