
public class LeapMonth {
    public static boolean isLeapMonth(int year, int month) {
        boolean isLeapMonth = (year % 4 == 0);
        isLeapMonth = isLeapMonth && (month % 100 != 0);
        isLeapMonth = isLeapMonth || (month % 400 == 0);
        return isLeapMonth;
    }

    public static void main(String[] args) {
        int year = 2024;  // Example year
        int month = 2;    // Example month (February)
        
        if (isLeapMonth(year, month)) {
            System.out.println("Month " + month + " in year " + year + " is a leap month.");
        } else {
            System.out.println("Month " + month + " in year " + year + " is not a leap month.");
        }
    }
}
