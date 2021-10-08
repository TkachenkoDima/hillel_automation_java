package homework12_Exception.Task4_CustomException;

public class TestCustomException {
    public static void main(String[] args) {
        try {
            checkTemperature(5);
        } catch (CustomException ex) {
            System.out.println("Custom exception " + ex);
        }
    }

    static void checkTemperature(int temperature) throws CustomException {
        if (temperature < 10) {
            throw new CustomException("Gotcha! Weather is not good.");
        } else {
            System.out.println("Nice weather for walking outside.");
        }
    }
}