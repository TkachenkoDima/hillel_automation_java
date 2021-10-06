package homework3_ConditionalStatements.TasksFromPresentation;

import java.util.Scanner;

public class Task4_HW3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Count symbols of ur string max 9 symbols: ");

        int outputString = input.nextLine().length();
        int maxLenght = 10;

        if (outputString >= maxLenght){
            System.out.println("maximum symbols limit exceeded.");
        }
        else {
            System.out.println("Your string consists of " + outputString + " symbols");
        }
    }
}
