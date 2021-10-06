package homework2_VariablesAndOperators;

import java.util.Scanner;

public class SpeedCheck {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please, enter your distance in meters: ");
        float meters = scan.nextFloat();
//  Input distance in meters: 2500

        System.out.print("Please, enter total hour(s): ");
        float hours = scan.nextFloat(); //
//  Input hours: 5

        System.out.print("Please, enter total minutes(s): ");
        float minutes = scan.nextFloat();
//  Input minutes: 56

        System.out.print("Please, enter total second(s): ");
        float seconds = scan.nextFloat();
//  Input seconds: 23

        float speedInMetersPerSecond = meters / ((hours * 3600) + (minutes * 60) + seconds);
        float speedInKmPerHours = (meters / 1000) / (hours + (minutes / 60) + (seconds / 3600));

        System.out.println("Your speed in meters/second is " + speedInMetersPerSecond);
        System.out.println("Your speed in km/h is " + speedInKmPerHours);
    }
}
