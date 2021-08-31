package homework4;

import java.util.Scanner;

public class Task3_HW4 {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.print("Enter any symbols to be reversed: ");

            String inputString = scan.nextLine().replaceAll("", " ");

            System.out.println(new StringBuilder(inputString).reverse());
        }
    }

