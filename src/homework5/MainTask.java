package homework5;

import java.util.Arrays;
import java.util.Scanner;

public class MainTask {
    public static void main(String[] args) {

        String yourName = PrintActions.askName();

        String yourPhone = PrintActions.askPhone();


        PrintActions.createRandomArray(0);
        Scanner scan = new Scanner(System.in);
        System.out.println("How many random numbers u wanna see on output?: ");
        int size = scan.nextInt();
        int[] num = PrintActions.createRandomArray(size);

        System.out.println("your name "+ yourName);
        System.out.println("ur phone " + yourPhone);
        System.out.println(Arrays.toString(num));
    }
}
