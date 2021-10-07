package homework5_Methods;

import java.lang.Math;

import java.util.Scanner;

public class MainTask {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //ask user's name
        String name = PrintActions.askName();
        int nameLength = name.length();

        //print personalized greetings to user
        PrintActions.printGreetings(name);

        //ask user to input any number 1-20 and output as many random numbers as user entered
        System.out.println("Please input the size of the array: ");
        int size = scan.nextInt();
        int[] numbers = PrintActions.createRandomArray(size);
        PrintActions.printRandomArray(numbers);

        //print sum random outputted numbers
        int sumRandom = PrintActions.sumRandomArray(numbers);
        System.out.println("Sum of random array = " + sumRandom);

        //print average from random outputted numbers
        int average = PrintActions.averageArray(numbers);
        System.out.println("Average number of array: " + average);

        //print multiplication table for average number from random outputted numbers
        System.out.println("Here is multi table for number " + PrintActions.multiplicationTable(average));

        //ask user to input any number from 10 to 100
        System.out.println("Enter any number > 10 and < 100");
        int answer = PrintActions.askNumber();
        System.out.println("The number is: " + answer);

        //print reversed input number from 10 to 100
        int reversedNumber = PrintActions.reverseNumber(answer);
        System.out.println("Reversed number is: " + reversedNumber);

        //raise in power itself reversed number
        double reversedNumberInPowerTwo = Math.pow(reversedNumber, 2);
        System.out.println("Powered in 2: " + reversedNumberInPowerTwo);

        //print "stairs" from sum of the numbers in the array divided your username length
        PrintActions.printStairs(sumRandom, nameLength);
    }
}
