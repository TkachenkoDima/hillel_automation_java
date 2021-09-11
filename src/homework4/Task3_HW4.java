package homework4;

import java.util.Scanner;

public class Task3_HW4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input 2+ positive numbers and press ENTER for some magic: ");

        int inputNum = input.nextInt();
        int reversedNum = 0;

        while (inputNum > 0) {
            int digit = inputNum % 10;
            reversedNum = reversedNum * 10 + digit;
            inputNum = inputNum / 10;
            System.out.print(digit % 10 + " ");
        }
        System.out.println("are the numbers you entered in reverse.");
    }
}

