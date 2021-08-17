package homework3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SeasonFinder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter month number to know what season is it: ");
        int month = input.nextInt();

        Map<Integer, String> monthes = new HashMap();
        monthes.put(1, "January");
        monthes.put(2, "February");
        monthes.put(3, "March");
        monthes.put(4, "April");
        monthes.put(5, "May");
        monthes.put(6, "June");
        monthes.put(7, "July");
        monthes.put(8, "August");
        monthes.put(9, "September");
        monthes.put(10, "October");
        monthes.put(11, "November");
        monthes.put(12, "December");

        if (month == 1) {
            System.out.println(monthes.get(1) + " it`s Winter time!");
        } else if (month == 2) {
            System.out.println("Winter time. Brrr, it`s rather cold at " + monthes.get(2));
        } else if (month == 3) {
            System.out.println("Finally Spring " + monthes.get(3));
        } else if (month == 4) {
            System.out.println("Spring time! Prepare to 1st " + monthes.get(4) + " fools day");
        } else if (month == 5) {
            System.out.println("Spring is almost ended, time to prepare for summer. " + monthes.get(5) + " is now");
        } else if (month == 6) {
            System.out.println(monthes.get(6) + " is the first month of Summer");
        } else if (month == 7) {
            System.out.println(monthes.get(7) + " is 2nd month of Summer. Time to take a vacation");
        } else if (month == 8) {
            System.out.println(monthes.get(8) + " is the last month of Summer, don`t waste time!");
        } else if (month == 9) {
            System.out.println(monthes.get(9) + " is the first month of Fall");
        } else if (month == 10) {
            System.out.println(monthes.get(10) + " is Fall mid season");
        } else if (month == 11) {
            System.out.println(monthes.get(11) + " winter is coming... Fall almost ended");
        } else if (month == 12) {
            System.out.println("Winter time! Keep calm and prepare to xMass at " + monthes.get(12));
        }
        else {
            System.out.println("There are only 12 month ia a year");
        }
    }
}