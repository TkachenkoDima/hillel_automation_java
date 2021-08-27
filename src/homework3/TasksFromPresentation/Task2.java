package homework3.TasksFromPresentation;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter daytime and check response:");

        int dayTime = input.nextInt();

        if ((dayTime >= 18) && (dayTime <= 24)) {
            System.out.println("Good evening");
        } else if (dayTime <= 10) {
            System.out.println("Good morning");
        } else if ((dayTime >= 11) && (dayTime <= 24)) {
            System.out.println("Good day");
        } else {
            System.out.println("enter 0 to 24 and try again");
        }
    }
}