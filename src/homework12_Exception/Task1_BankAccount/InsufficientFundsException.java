package homework12_Exception.Task1_BankAccount;

public class InsufficientFundsException extends Exception{

    private int amount;

    InsufficientFundsException(String message, int amount) {
        super(message);
        this.amount = amount;
    }

    public int getAmount() {
        return this.amount;
    }
}