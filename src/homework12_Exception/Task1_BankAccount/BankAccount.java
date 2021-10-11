package homework12_Exception.Task1_BankAccount;

public class BankAccount {

    private int balance = 500;
    private final int limit = 300;

    public void depositMoney(int sum) {
        balance += sum;
        System.out.println("You successfully deposited " + sum + " USD. " +
                "\nCurrent balance is " + getBalance() + " USD.");
    }

    public void withdrawMoney(int sum) {
        try {
            if (sum > limit) {
                throw new LimitExceededException("You tried to withdraw " + sum + " USD, maximum limit to withdraw = " + getLimit() + " USD.");
            } else if (sum <= getBalance()) {
                balance -= sum;
                System.out.println("You successfully withdrew " + sum + " USD. " +
                        "\nCurrent balance is " + getBalance());
            } else {
                System.out.println("You try to withdraw " + sum);
                throw new InsufficientFundsException("You don't have enough money on your account, " +
                        "available sum is: ", getBalance());
            }
        } catch (InsufficientFundsException | LimitExceededException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public int getBalance() {
        return balance;
    }

    public int getLimit() {
        return limit;
    }

    public static void main(String[] args) {
        BankAccount bank = new BankAccount();

        bank.depositMoney(1000);
        bank.withdrawMoney(400);
    }
}