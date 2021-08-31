package homework4;

import java.util.Scanner;

public class Task5_HW4 {
    public static void main(String[] args) {

//      1st method by given array.
/*
        double [] inputArr = new double [] {1.1, 2.2, 3, 4, 5, 6, 7, 8, 9};

        double arrSum = 0;

        for (double i : inputArr) {
            arrSum = arrSum + i;
        }
        double average = arrSum / inputArr.length;

        System.out.println("Sum of all numbers in the array = " + average);
*/

//      2nd method by user input.
        System.out.println("Enter count of numbers: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        double[] arr = new double[n];
        double total = 0;

        for(int i=0; i<arr.length; i++){
            System.out.print("Enter " + (i+1) + " number: ");
            arr[i] = scanner.nextDouble();
        }
        scanner.close();

        for (double v : arr) {
            total = total + v;
        }

        double average = total / arr.length;

        System.out.println("The average is: " + average);
    }

}
