package homework5_Methods;

import java.util.Scanner;

public class Task6_HW5 {
    public static void main(String[] args) {

        System.out.print("Input a number: ");

        multiplicationTable();
    }

    public static void multiplicationTable() {

        Scanner scan = new Scanner(System.in);

        int inputNum = scan.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(inputNum + " x " + (i + 1) + " = " + (inputNum * (i + 1)));
        }
    }
}
