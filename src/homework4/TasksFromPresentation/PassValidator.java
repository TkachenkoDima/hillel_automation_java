package homework4.TasksFromPresentation;

import java.util.Scanner;

public class PassValidator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Knock knock, NEO! Enter Pass:");

        for (int counter = 1; true; counter++) {

            String correctPass = "kek";
            String inputPass = input.nextLine();

            if ((counter == 3) && !inputPass.equals(correctPass)) {
                System.out.println("Sorry, Mr.Andersen, you are busted.");
                return;
            } else if (!inputPass.equals(correctPass)) {
                System.out.println("Wrong pass, try again");
            } else {
                System.out.println("Correct! Follow the white rabbit.");
                break;
            }
        }
    }
}

