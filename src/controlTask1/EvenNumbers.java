package controlTask1;

public class EvenNumbers {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        onlyEvenNumbers(array);
    }

    public static void onlyEvenNumbers(int[] array) {

        System.out.println("numbers: ");
        for (int i : array) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}