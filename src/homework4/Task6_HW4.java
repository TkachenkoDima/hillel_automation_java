package homework4;

import java.util.Scanner;

public class Task6_HW4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int dots = 0;
        int lines = 2;

        boolean isNumber = false;

        System.out.print("Enter the number of dots: ");

        do {
            if (input.hasNextInt()) {
                dots = input.nextInt();

                for(int i = 0; i < dots; i++){

                    for(int j= lines; j>0; j--){
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
            } else {
                System.out.print("Please enter a valid number: ");
                input.next();
            }
        } while (!(isNumber));
    }
}