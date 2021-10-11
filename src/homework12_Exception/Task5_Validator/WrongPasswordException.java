package homework12_Exception.Task5_Validator;

public class WrongPasswordException extends Exception{
    public String password;

    public WrongPasswordException() {
        password = "Incorrect password";
    }

    public WrongPasswordException(String message) {
        super(message);
        password = message;
    }
}
