package controlTask1;

public class Reverse {

    public static void main(String[] args) {
        String myString = "May the force be with you";
        String reversedString = reverse(myString);
        System.out.println(reversedString);
    }

    public static String reverse(String myString) {
        String[] words = myString.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length()-1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        return reversedString;
    }

}
