package homework5;

import java.util.Scanner;

public class Task2_HW5 {

 public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);

     System.out.print("Enter the number raised to a power: ");
     int firstNum = scan.nextInt();

     System.out.print("Enter number to a power: ");
     int secondNum = scan.nextInt();

     int myResult = numberInPower(firstNum, secondNum);

     System.out.println(firstNum + " raised to the power of " + secondNum + " = " + myResult);
 }
    public static int numberInPower(int firstNum, int secondNum ) {

        int myResult = 1;
        for(int i = 1; i <= secondNum; i++) {
            myResult *= firstNum;
        }
        return myResult;
    }


}

