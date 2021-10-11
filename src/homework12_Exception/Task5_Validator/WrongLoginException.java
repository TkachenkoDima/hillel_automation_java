package homework12_Exception.Task5_Validator;

public class WrongLoginException extends Exception {
    String login;

    public WrongLoginException() {
        login = "Incorrect password";
    }

    public WrongLoginException(String message) {
        super(message);
        login = message;
    }
}
