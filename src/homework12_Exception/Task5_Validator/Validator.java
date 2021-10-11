package homework12_Exception.Task5_Validator;

public class Validator {
    String login = "Kek";
    String password = "123";
    String confirmPassword = "123";
    String regex = "[a-zA-Z0-9]";
    int length = 20;

    public boolean loginUser(String login, String password, String confirmPassword) {
        try {
            if (!login.matches(regex) || login.length() > length || password.length() > length) {
                throw new WrongLoginException("Incorrect login");
            } else if (!password.matches(regex) || !confirmPassword.matches(regex) || !password.equals(confirmPassword)) {
                throw new WrongPasswordException("Incorrect password");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return true;
    }
}