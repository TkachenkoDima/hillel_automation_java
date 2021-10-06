package homework3_ConditionalStatements;

import java.util.Scanner;

public class SeasonFinder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter month number to know what season is it: ");
        String month = input.nextLine();

        switch (month) {
            case "12":
            case "1":
            case "2":
                System.out.println("Winter time. Brrr, it`s rather cold.");
                break;
            case "3":
            case "4":
            case "5":
                System.out.println("Spring season, time to wake up after long winter.");
                break;
            case "6":
            case "7":
            case "8":
                System.out.println("Summer! Time to plan your vacation");
                break;
            case "9":
            case "10":
            case "11":
                System.out.println("Fall season, summertime sadness");
                break;
            default:
                System.out.println("Sorry, there are only 12 month ia a year.");
        }
    }
}
