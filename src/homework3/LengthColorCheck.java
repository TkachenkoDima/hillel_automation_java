package homework3;

import java.util.Scanner;

public class LengthColorCheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter year to know is it a leap year or not:");
        int year = input.nextInt();

        if ((year % 4 == 0) || year % 400 == 0) {
            System.out.println("Year " + year + " is a leap year");
        }   else {
            System.out.println("Year " + year + " is not a leap year");
        }
    }
}
