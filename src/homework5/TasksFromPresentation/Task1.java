package homework5.TasksFromPresentation;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        System.out.println("Enter the number: ");

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        System.out.println(isEven(number));
    }

    public static boolean isEven(int number) {

        return number % 2 == 0;
    }
}
