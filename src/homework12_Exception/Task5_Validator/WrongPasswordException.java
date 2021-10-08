package homework12_Exception.Task5_Validator;

public class WrongPasswordException extends Exception{
    public String password;

    public WrongPasswordException(String password) {
    }

    public String getPassword() {
        return password;
    }
}
