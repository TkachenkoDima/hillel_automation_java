package homework4;

import java.util.Scanner;

public class PassValidator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int counter = 0; counter < 3; counter++) {
            System.out.println("Knock knock, NEO!");

            String correctPass = "kek";
            String inputPass = input.nextLine();

            if ((counter == 2)) {
                System.out.println("Sorry, Mr.Andersen, you are busted");
                return;
            } else if (!inputPass.equals(correctPass)) {
                System.out.println("Wrong pass, try again");
            } else {
                System.out.println("Correct! Follow the white rabbit");
                break;
            }
        }
    }
}

