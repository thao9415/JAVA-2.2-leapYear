import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
//        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
//            System.out.println(year + " is not a leap year");
//        } else {
//            System.out.println(year+ " is a leap year");
//        }
        boolean isLeapYear=true;
        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
            isLeapYear=false;
        }
        if (isLeapYear) {
            System.out.println(year+" is a leap year");
        } else {
            System.out.println(year+" is not a leap year");
        }
    }
}
