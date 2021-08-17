package homework2;

import java.util.Scanner;

public class InchesToMetersConverter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please, enter a value for inches and press Enter: ");
        double inch = scan.nextDouble();
//  Input a value for inch: 1000

        double meters = inch * 0.0254;
        System.out.println(inch + " inches is " + meters + " meters");
    }
}
