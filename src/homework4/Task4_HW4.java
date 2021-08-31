package homework4;

public class Task4_HW4 {
    public static void main(String[] args) {

        int [] inputArr = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int arrSum = 0;

        for (int i : inputArr) {
            arrSum = arrSum + i;
        }
        System.out.println("Sum of all numbers in the array = " + arrSum);
    }

}