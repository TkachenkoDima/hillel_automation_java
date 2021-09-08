package homework5;

import java.util.Scanner;

public class PrintActions {

    public static String askName() {

        System.out.println("Please enter your name: ");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public static void printGreetings(String name) {

        System.out.println("Sup, " + name + "?");
    }

    public static int[] createRandomArray(int array) {

        int[] arr = new int[array];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20) + 1;
        }
        return arr;
    }

    public static void printRandomArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static int sumRandomArray(int[] array) {

        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public static int averageArray(int[] array) {

        int sum = 0;
        int average;

        for (int j : array) {
            sum = sum + j;
        }
        average = sum / array.length;
        return average;
    }

    public static int multiplicationTable(int inputNum) {

        for (int i = 0; i < 10; i++) {
            System.out.println(inputNum + " x " + (i + 1) + " = " + (inputNum * (i + 1)));
        }
        return inputNum;
    }

    public static int askNumber() {

        Scanner scan = new Scanner(System.in);

        boolean isNumber = false;
        int guessNumber = 0;

        do {
            if (scan.hasNextInt()) {
                guessNumber = scan.nextInt();

                if (guessNumber < 10) {
                    System.out.print("Please enter a positive number > 10: ");
                } else if (guessNumber > 100) {
                    System.out.print("Please enter a positive number < 100: ");
                } else {
                    isNumber = true;
                }
            } else {
                System.out.print("Please enter a valid number: ");
                scan.next();
            }
        }
        while (!(isNumber));
        return guessNumber;

    }

    public static int reverseNumber(int num) {

        int reversed = 0;

        for (; num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }

    public static void printStairs(int sumRandom, int nameLength) {

        int lines = 2;
        int dots = sumRandom / nameLength;
            for(int i = 0; i < dots; i++) {
                for(int j = lines; j > 0; j--) {
                    System.out.print("#");
                }
                System.out.println();
                lines += 1;
        }
    }
}
