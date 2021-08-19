package homework4;

import java.util.Scanner;

public class DrawBox {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.print("Enter height: ");
        int h = input.nextInt();

        System.out.print("Enter width: ");
        int w = input.nextInt();

        for (int i=1; i<=h; i++) {
            for (int j=1; j<=w; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}

