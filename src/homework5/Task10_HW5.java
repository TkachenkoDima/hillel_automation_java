package homework5;

import java.util.Scanner;

public class Task10_HW5 {
    public static void main(String[] args) {

        separatedArray();
    }
    public static void separatedArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many random numbers separated with comma u wanna see on output?: ");
        int size = scan.nextInt();
        int[] num = PrintActions.createRandomArray(size);
        PrintActions.printRandomArray(num);

    }
}