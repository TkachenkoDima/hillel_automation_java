package controlTask1;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        System.out.print("Input smth: ");

        Scanner scan = new Scanner(System.in);
        String myString = scan.nextLine();
        String replacedString = replacer(myString);

        System.out.println(replacedString);
    }

    public static String replacer (String myString) {

        if (myString.length() > 30) {
            System.out.println("kek");
        }
        else {
            String firstReplace = myString.replaceAll("[^o]", "@");
            String secondReplace = firstReplace.replaceAll("[o]", "0");
            return secondReplace;
        }
        return myString;
    }
}
