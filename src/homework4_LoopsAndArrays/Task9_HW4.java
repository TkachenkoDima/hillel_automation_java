package homework4_LoopsAndArrays;

import java.util.Scanner;

public class Task9_HW4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers u wanna put into array?: ");

        do {
            if (input.hasNextInt()) {
                int num = input.nextInt();
                int [] arr = new int[num];

                if (num <= 5 && num !=0 ) {
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = i;
                    }
                    for (int j = arr.length - 1; j >= 0; j--)
                        System.out.print(arr[j]+1 + " ");
                    System.out.println("Are the numbers you entered in reverse.");
                    break;
                }
                else {
                    System.out.println("Please input number from 1 to 5: ");
                }
            }
            else {
                System.out.println("Try to input only digit.");
                input.next();
            }
        }
        while (true);
    }
}