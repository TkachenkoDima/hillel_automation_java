package homework3.TasksFromPresentation;

import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {

        String Username = "Dima";
        String Password = "kek";

        Scanner scan1 = new Scanner(System.in);
        System.out.println("username : ");
        String user = scan1.nextLine();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("password : ");
        String pass = scan2.nextLine();

        if (user.equals(Username) && pass.equals(Password)) {

            System.out.println("Welcome!");
        } else if (user.equals(Username)) {
            System.out.println("Invalid password!");
        } else if (pass.equals(Password)) {
            System.out.println("Invalid username!");
        } else {
            System.out.println("Invalid username & password!");
        }
    }
}