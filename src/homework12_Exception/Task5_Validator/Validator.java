package homework12_Exception.Task5_Validator;

public class Validator {

    String regex = "^[a-zA-Z0-9_]{1,20}$";

    public boolean loginUser(String login, String password, String confirmPassword) {
        try {
            if (!login.matches(regex) || !login.equals(login)) {
                throw new WrongLoginException("Incorrect login");
            } else if (!password.matches(regex) || !confirmPassword.matches(regex) || !password.matches(confirmPassword)) {
                throw new WrongPasswordException("Incorrect password");
            }
            else {
                System.out.println("Success login. Welcome to the Matrix.");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return true;
    }
}