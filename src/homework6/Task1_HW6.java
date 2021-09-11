package homework6;

public class Task1_HW6 {
    public static void main(String[] args) {
        String toReverse = "some string ";
        System.out.println(reversedString(toReverse));
    }

    public static String reversedString(String toReverse) {
        StringBuilder result = new StringBuilder();

        for (int i = toReverse.length() - 1; i >= 0; i--) {
            result.append(toReverse.charAt(i));
        }
        return result.toString();
    }
}
