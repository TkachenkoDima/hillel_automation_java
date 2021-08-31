package homework4;

import java.util.Scanner;

public class Task9_HW4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers u wanna put into array?: ");

        do {
            if (input.hasNextInt()) {
                int num = input.nextInt();
                int[] arr = new int[num];
                System.out.println("Enter " + num + " numbers: ");

                for (int i = 0; i < arr.length; i++) {
                    arr[i] = input.nextInt();
                }
                for (int i = arr.length - 1; i >= 0; i--)
                    System.out.print(arr[i] + " ");
                System.out.println("are the numbers you entered in reverse.");
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