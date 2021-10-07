package homework5_Methods;

public class Task5_HW5 {
    public static void main(String[] args) {
        System.out.println("Average with int: " + Task5_HW5.averageArr(1, 2, 3, 4, 5));
        System.out.println("Average with double: " + Task5_HW5.averageArr(1.0, 5.4, 2.3, 1.6));
    }

    public static double averageArr(int... array) {
        int sum = 0;
        double average = 0.0;

        for (int i : array) {
            sum += i;
        }
        average = 1.0 * sum/array.length;
        return average;
    }

    public static double averageArr(double... array) {

        double sum = 0.0;
        double average = 0.0;

        for (double i : array) {
            sum += i;
        }
        average = sum/array.length;
        return average;
    }
}
