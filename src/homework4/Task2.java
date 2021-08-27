package homework4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number raised to a power: ");
        int firstNum = scan.nextInt();

        System.out.print("Enter number to a power: ");
        int power = scan.nextInt();

        int result = 1;

         for(int i = 1; i <= power; i++)
        {
	    result *= firstNum;
        }

        System.out.println(firstNum + " raised to the power of " + power + " = " + result);
    }
}


