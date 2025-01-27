public class Exercise37 {
    public static void main(String[] args) {
        //37.	Write a Java program to get the last day of the current month
        int month = 1;
        int year = 2025;

        int lastDayOfMonth = getLastDayOfMonth(month, year);
        System.out.println("Last day of the month " + month + "/" + year + ": " + lastDayOfMonth);
    }

    public static int getLastDayOfMonth(int month, int year) {
        switch (month) {
            case 2: // February
                return isLeapYear(year)? 29 : 28;
            case 4: case 6: case 9: case 11: // April, June, September, November
                return 30;
            default: // January, March, May, July, August, October, December
                return 31;
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
