package homework5.TasksFromPresentation;

public class Task2 {

    public static void main(String[] args) {
        
        int[] array = new int[] {5, 4, 53, 23, 81, 90, 2, 56};

        int sum = sumArrayElements(array);
        System.out.println("Sum of array elements: " + sum);
    }


    private static int sumArrayElements(int[] inputArray) {
        int maxNum = inputArray[0];
        int minNum = inputArray[0];

        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxNum) {
                maxNum = inputArray[i];
            }
            if (inputArray[i] < minNum) {
                minNum = inputArray[i];
            }
        }
        return minNum + maxNum;
    }
}