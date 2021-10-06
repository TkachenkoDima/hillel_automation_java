package homework3_ConditionalStatements;

import java.util.Scanner;

public class LengthCountByColor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter color name (case sensitive):");
        String colorSymbols = input.nextLine();

        int count = 0;
        for (char c : colorSymbols.toCharArray()) {
            count++;
        }
            switch (colorSymbols) {
                case "Red":
                case "Green":
                case "White":
                case "Pink":
                case "Blue":
                case "Orange":
                case "Yellow":
                System.out.println("Consist of " + count + " symbols");
            break;
            default:
                System.out.println("Sorry, unknown color");
        }
    }
}