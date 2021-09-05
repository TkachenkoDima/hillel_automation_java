package homework5;

import java.util.Scanner;

public class PrintActions {
    public static void printGreetings() {
        System.out.println("Sup, " + askName() + "?");
    }

    public static String askName(){
        System.out.println("Please enter your name: ");

        Scanner scan = new Scanner(System.in);
        String name;
        name = scan.nextLine();
        return name;
    }

    public static String askPhone(){
        System.out.println("Please enter your phone: ");

        Scanner scan = new Scanner(System.in);
        String phone;
        phone = scan.nextLine();
        return phone;
    }

    public static int[] createRandomArray(int array) {
        int[] arr = new int[array];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20) + 1;
        }
        return arr;
    }

    public static int[] printRandomArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
            }
            else {
                System.out.print(array[i] + ", ");
            }
        }
        return array;
    }
}
