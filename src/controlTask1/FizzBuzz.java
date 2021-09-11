package controlTask1;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        System.out.print("Input a number: ");

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        fizzBuzzChecker(number);
    }

    public static void fizzBuzzChecker (int number) {

        if (number % 5 == 0 && number % 7 ==0) {
            System.out.println("FizzBuzz");
        }
        else if (number % 7 == 0) {
            System.out.println("Buzz");
            }
        else if (number % 5 == 0) {
            System.out.println("Fizz");
        }
        else {
            System.out.println(number);
        }
    }
}

