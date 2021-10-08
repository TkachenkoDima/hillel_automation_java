package homework12_Exception.Task2_NullPointerException;

public class NullException {
    public static void main(String[] args) {

        try {
            Integer kek = null;
            System.out.println(kek.toString());
        }
        catch (NullPointerException e) {
            System.out.println("gotcha! Yoooou, son of a Exception!!");
            e.printStackTrace();
        }
    }
}

