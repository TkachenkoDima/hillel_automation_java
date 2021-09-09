package homework4;

import java.util.Scanner;

public class Task5_HW4 {

        public static void main(String[] args) {
            double[] inputArr = new double[]{1.1D, 2.2D, 3.0D, 4.0D, 5.0D, 6.0D, 7.0D, 8.0D, 9.0D};
            double arrSum = 0.0D;
            double[] var4 = inputArr;
            int var5 = inputArr.length;

            for(int var6 = 0; var6 < var5; ++var6) {
                double i = var4[var6];
                arrSum += i;
            }

            double average = arrSum / (double)inputArr.length;
            System.out.println("Sum of all numbers in the array = " + average);
        }
    }
