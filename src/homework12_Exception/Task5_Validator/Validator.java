package homework12_Exception.Task5_Validator;

public class Validator {

    public void loginUser(String login, String password, String confirmPassword, String regex) throws WrongLoginException, WrongPasswordException {
        try {
            if (!login.matches(regex)) {
                throw new WrongLoginException("Incorrect login");
            } else if (!password.matches(regex) || !confirmPassword.matches(regex) || !password.equals(confirmPassword)) {
                throw new WrongPasswordException("Incorrect password");
            }

        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e + " error message");

        }
    }
}