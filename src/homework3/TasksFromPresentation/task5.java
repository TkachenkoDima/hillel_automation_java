package homework3.TasksFromPresentation;

import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {

        String validUsername = "Dima";
        String validPassword = "kek";

        Scanner scan1 = new Scanner(System.in);
        System.out.println("username : ");
        String username = scan1.nextLine();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("password : ");
        String pass = scan2.nextLine();

        if (username.equals(validUsername) && pass.equals(validPassword)) {

            System.out.println("Welcome!");
        } else if (username.equals(validUsername)) {
            System.out.println("Invalid password!");
        } else if (pass.equals(validPassword)) {
            System.out.println("Invalid username!");
        } else {
            System.out.println("Invalid username & password!");
        }
    }
}