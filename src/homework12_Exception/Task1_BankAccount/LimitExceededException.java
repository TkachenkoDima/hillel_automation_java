package homework12_Exception.Task1_BankAccount;

public class LimitExceededException extends Exception{

    LimitExceededException(String message) {
        super(message);
    }
}
