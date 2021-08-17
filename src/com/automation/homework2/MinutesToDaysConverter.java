package com.automation.homework2;

import java.util.Scanner;

public class MinutesToDaysConverter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please, enter number of minutes and press Enter: ");
        int minutes = scan.nextInt();
//  Input the number of minutes: 3456789

        int year = minutes / 525600;
        int day = minutes / 1440 % 365;
        System.out.println(minutes + " minutes is approximately " + year + " years and " + day + " days");
    }
}
