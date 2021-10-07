package homework4_LoopsAndArrays;

import java.util.Random;
import java.util.Scanner;

public class Task10_HW4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many random numbers u wanna see on output?: ");

        do {
            if (input.hasNextInt()) {
                int num = input.nextInt();
                int[] arr = new int[num];

                for (int i = 0; i < arr.length; i++) {
                    Random random = new Random();
                    arr[i] = random.nextInt(100) + 1;
                }
                for (int i = arr.length - 1; i >= 0; i--)
                    System.out.print(arr[i] + " ");
                System.out.println("are the numbers we choose for you.");
                break;
            }
            else {
                System.out.println("Try to input only digit.");
                input.nextLine();
            }
        }
        while (true);
    }
}
