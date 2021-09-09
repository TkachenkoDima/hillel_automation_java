package homework5.TasksFromPresentation;


public class Task3 {

    public static void main(String[] args) {

        char [] array = new char[] {'a','b', 'c'};

        transferToAscii(array);
    }

    public static void transferToAscii(char[] array){

        for (int element: array) {
            System.out.println(element);
        }
    }
}