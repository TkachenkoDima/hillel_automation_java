package homework5_Methods;

import java.util.Scanner;

public class Task7_HW5 {
    public static void main(String[] args) {

        int lines = 1;

        System.out.print("Enter the number of dots: ");
        stairs(lines);

    }
        public static int stairs (int lines){
            Scanner input = new Scanner(System.in);
            boolean isNumber = false;
            int dots = 0;

            do {
            if (input.hasNextInt()) {
                dots = input.nextInt();

                for(int i = 0; i < dots; i++) {

                    for(int j = lines; j > 0; j--) {
                        System.out.print("#");
                    }
                    System.out.println();
                    lines += 1;
                }
                if (dots < 0) {
                    System.out.print("Please enter a positive number: ");
                }
                else {
                    isNumber = true;
                }
            }
            else {
                System.out.print("Please enter a valid number: ");
                input.next();
            }
        }
        while (!(isNumber));
        return lines;
    }
}
