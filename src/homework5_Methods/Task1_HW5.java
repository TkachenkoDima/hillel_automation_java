package homework5_Methods;

import java.util.Scanner;

public class Task1_HW5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many random numbers u wanna see on output?: ");
        int size = scan.nextInt();
        int[] num = randomArray(size);
        printArray(num);
    }

    public static int[] randomArray(int array) {
        int[] arr = new int[array];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20) + 1;
        }
        return arr;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i] + " ");
            }
        }
    }
}

