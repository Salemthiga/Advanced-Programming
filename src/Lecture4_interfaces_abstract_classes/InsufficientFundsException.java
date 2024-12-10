package Lecture4_interfaces_abstract_classes;

public class InsufficientFundsException extends Exception {
    private double amount;
    private double balance;

    public InsufficientFundsException(double amount, double balance) {
        super("Insufficient funds:  Balance available " + balance);
        this.amount = amount;
        this.balance = balance;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }
}