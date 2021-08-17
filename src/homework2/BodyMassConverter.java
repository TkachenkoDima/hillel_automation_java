package homework2;

import java.util.Scanner;

public class BodyMassConverter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please, enter your weight in pounds: ");
        double weight = scan.nextDouble();
//  Input weight in pounds: 452

        System.out.print("Please, enter your height in inches: ");
        double height = scan.nextDouble();
//  Input height in inches: 72

        double BMI = weight * 0.453592 / ((height * 0.0254) * (height * 0.0254));
        System.out.println("Body Mass Index is " + BMI);
    }
}
