package homework12_Exception.Task5_Validator;

public class WrongLoginException extends Exception {
    String login;

    public WrongLoginException(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }
}
