package homework3.TasksFromPresentation;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Count symbols of ur string max 9 symbols: ");

        int outputString = input.nextLine().length();
        int maxLenght = 10;

        if (outputString >= maxLenght){
            System.out.println("maximum symbols limit exceeded.");
        }
        else {
            System.out.println("exampleString value consists of " + outputString + " symbols");
        }
    }
}
