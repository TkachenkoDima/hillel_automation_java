package homework6;

public class Task4_HW6 {
    public static void main(String[] args) {
        
        String myString = "Hello world, hello Java, hello homework";
        
        int elloCount = (myString.split("ello").length) - 1;
        int woCount = (myString.split("wo").length) - 1;

        System.out.println("String substring = “ello” -> " + elloCount);
        System.out.println("String substring = “wo” -> " + woCount);

    }
}