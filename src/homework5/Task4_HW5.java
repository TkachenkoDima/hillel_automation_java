package homework5;

public class Task4_HW5 {

    public static void main(String[] args) {

        int [] inputArr = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        System.out.println("Sum of given array = " + arraySum(inputArr, sum));
    }

    public static int arraySum(int [] inputArr, int sum) {
        for (int i : inputArr) {
            sum = sum + i;
        }
        return sum;
    }
}
