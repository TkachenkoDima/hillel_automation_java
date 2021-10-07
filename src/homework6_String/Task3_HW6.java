package homework6_String;

import java.util.Scanner;

public class Task3_HW6 {
    public static void main(String[] args) {
        System.out.print("Input smth: ");

        Scanner scan = new Scanner(System.in);
        String myString = scan.nextLine();
        String replacedString = replacer(myString);

        System.out.println(replacedString);
    }

    public static String replacer (String myString) {
        return myString.replaceAll("\\d", "*");
    }
}
