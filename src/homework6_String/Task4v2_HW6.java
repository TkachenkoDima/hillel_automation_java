package homework6_String;

public class Task4v2_HW6 {
    public static void main(String[] args) {

        String str = "Hello world, hello Java, hello homework";

        String firstMatch = "ello";
        String secondMatch = "wo";
        int firstCount = 0;
        int secondCount = 0;
        int index = 0;

        while ((index = str.indexOf(firstMatch, index)) != -1) {
            firstCount++;
            index = index + firstMatch.length();
        }
        System.out.println("Substring " + firstMatch + " found " + firstCount+" times!");

        while ((index = str.indexOf(secondMatch, index)) != -1) {
            secondCount++;
            index = index + secondMatch.length();
        }
        System.out.println("Substring " + secondMatch + " found " + secondCount+" times!");
    }
}

