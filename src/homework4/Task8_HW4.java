package homework4;

import java.util.Scanner;

public class Task8_HW4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = (int) (Math.random() * 10);
        int guess = 0;

        do {
            System.out.print("Enter a number from 0 to 10 and try to guess : ");
            guess = input.nextInt();

            if (guess < number) {
                System.out.println("Higher");
            }
            else if (guess > number) {
                System.out.println("Lower");
            }
            else  {
                System.out.println("Nice");
            }

        } while(guess != number);
    }
}
