package homework3.TasksFromPresentation;

import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {


        String Username = "Dima";
        String Password = "kek";

        Scanner scan1 = new Scanner(System.in);
        System.out.println("username : ");
        String username = scan1.next();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("password : ");
        String password = scan2.next();

        if (username.equals(Username) && password.equals(Password)) {

            System.out.println("Welcome!");
        } else if (username.equals(Username)) {
            System.out.println("Invalid password!");
        } else if (password.equals(Password)) {
            System.out.println("Invalid username!");
        } else {
            System.out.println("Invalid username & password!");
        }
    }
}