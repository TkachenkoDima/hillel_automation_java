package homework3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LengthCountByColor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter color name (case sensitive):");
        String colorSymbols = input.nextLine();

        HashMap color = new HashMap();
        color.put("Red", "3 symbols");
        color.put("Green", "5 symbols");
        color.put("Pink", "4 symbols");
        color.put("White", "5 symbols");
        color.put("Blue", "4 symbols");
        color.put("Orange", "6 symbols");
        color.put("Yellow", "6 symbols");

        switch (colorSymbols) {
            case "Red":
                System.out.println("Consist of " + color.get("Red") + " symbols");
                break;
            case "Green":
                System.out.println("Consist of " + color.get("Green") + " symbols");
                break;
            case "Pink":
                System.out.println("Consist of " + color.get("Pink") + " symbols");
                break;
            case "White":
                System.out.println("Consist of " + color.get("White") + " symbols");
                break;
            case "Blue":
                System.out.println("Consist of " + color.get("Blue") + " symbols");
                break;
            case "Orange":
                System.out.println("Consist of " + color.get("Orange") + " symbols");
                break;
            case "Yellow":
                System.out.println("Consist of " + color.get("Yellow") + " symbols");
                break;
            default:
                System.out.println("Sorry, unknown color");
        }

    }
}