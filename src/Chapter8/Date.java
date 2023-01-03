package Chapter8;

public class Date {
    private static int day;
    private static int month;
    private static int year;

    private static final int[] maxDayPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public Date(int day, int month, int year) {
        validateDay();
        validateMonth();
        validateLeapYear(day, month, year);
        Date.day = day;
        Date.month = month;
        Date.year = year;
    }

    private static void validateDay() {
        boolean isValidDay = (day <= 0 || day > maxDayPerMonth[month]) && (month == 2 && day >= 29);
        if(isValidDay) throw new IllegalArgumentException("day " + day + " is out of range for the specified month");
        }

    private static void validateMonth() {
        boolean isValidMonth = month < 0 || month > 12;
        if(isValidMonth) throw new IllegalArgumentException("month" + month+ "is out of range");
    }

    private static void validateLeapYear(int day, int month, int year) {
        boolean isFeb = month == 2;
        boolean isValidFeb = !(isFeb && day > 28);
        boolean isFebLeap = (isFeb && day == 29);
        boolean isValidLeapYear = ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));

//        if(isFeb){
//            if (!(isValidFeb && isValidLeapYear)) {
//                throw new IllegalArgumentException("month" + month + "is out of range");
//            }
//        } else if (isFebLeap) {
//
//        }
//
//        if (isFeb) {
//            if () {
//
//            }
//        }

//        if(isValidLeapYear){
//            if(isFebLeap){
//                System.out.println("leap year");
//            }else if(month != 2 ) {
//                System.out.println("Leap Year");
//            }
//            else{
//                System.out.println("FEB of leap-year can't be greater than 29");
//            }
//        }
//        else {
//            if(isValidFeb){
//                System.out.println("Not leap year");
//            }else {
//                System.out.println("FEB of non-leap-year can't be greater than 28");
//            }
//        }
        System.out.println(isValidFeb);
        System.out.println(isFebLeap);
        System.out.println(isValidLeapYear);
//        if (!isValidLeapYear) {
//            throw new IllegalArgumentException(day + " out of range for the specified month and year");
//        } else if (!isFebLeap) {
//            throw new IllegalArgumentException(day + "out of range for the specified month and year");
//        }
//        else throw new IllegalArgumentException(day + "out of range for the specified month and year");

//    }
    }
    public String toString() {
        return String.format("%d/%d/%d", day, month, year);
    }

    public static void main(String[] args) {
        Date date = new Date(28,2,2029);
        System.out.println(date);
    }
}
