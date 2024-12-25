import java.util.Scanner;
public class daysToYearsMonthDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
        System.out.println("Enter the number of days : ");
        int days=sc.nextInt();
        int years=days/365;
        int remainingDays=days%365;
        int months = 0;
        for (int i = 0; i < 12; i++) {
            if (remainingDays >= daysInMonth[i]) {
                remainingDays -= daysInMonth[i];
                months++;
            }
        }
        System.out.println("years: "+ years + " months : "+ months + " days : "+ remainingDays);
    }
}

