package homework6;

public class Task2_HW6 {
    public static void main(String[] args) {
        String inputString = "Hello world";
        String reversedString = reverse(inputString);
        System.out.println(reversedString);
    }

    public static String reverse(String inputString) {
        String[] words = inputString.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (int i = words.length-1; i >= 0; i--) {
            reversedString.append(words[i]).append(" ");
        }
        return reversedString.toString();
    }
}

