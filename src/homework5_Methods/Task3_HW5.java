package homework5_Methods;

import java.util.Scanner;

public class Task3_HW5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 2+ digits and wait for some magic: ");

        int inputNumber = scan.nextInt();
        int result = 0;
        int print = reversedNumber(inputNumber, result);

        System.out.println("Entered numbers in reverse = " + print);
    }

    public static int reversedNumber(int inputNumber, int result) {
        for (; inputNumber != 0; inputNumber /= 10) {
            int digit = inputNumber % 10;
            result = result * 10 + digit;
        }
        return result;
    }
}




