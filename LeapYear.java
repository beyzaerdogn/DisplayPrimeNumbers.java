import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = input.nextInt();

        if((year%4==0 && year%100 != 0)||(year%400==0))
            System.out.println(year + " is leap year");
        else
            System.out.println(year + " is not leap year");
    }
}
// A year is a leap year if it is divisible by 4 but not by 100, 
// or it is divisible by 400