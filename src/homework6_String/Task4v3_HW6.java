package homework6_String;

public class Task4v3_HW6 {
    public static void main(String[] args) {

        String example = "Hello world, hello Java, hello homework";
        String substring1 = "ello";
        String substring2 = "wo";

        System.out.println("'" + substring1 + "'" + " occurs in string " + counterOfOccursInString(example, substring1) + " times");
        System.out.println("'" + substring2 + "'" + " occurs in string " + counterOfOccursInString(example, substring2) + " times");
    }

    public static int counterOfOccursInString (String example, String substring) {
        return example.split(substring, -1).length-1;
    }
}

