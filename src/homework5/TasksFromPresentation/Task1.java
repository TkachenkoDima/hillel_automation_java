package homework5.TasksFromPresentation;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        System.out.println(isEven(6));
    }

    public static boolean isEven(int number) {
        System.out.println("Enter the number: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt() % 2 == 0;
    }
}
