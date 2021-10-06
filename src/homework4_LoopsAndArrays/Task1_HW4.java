package homework4_LoopsAndArrays;

import java.util.Scanner;

public class Task1_HW4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Input a number: ");

        int inputNum = scan.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(inputNum + " x " + (i+1) + " = " + (inputNum * (i+1)));
        }
    }
}
