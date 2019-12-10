package challenge.autoboxing;

import java.util.ArrayList;

public class Customer {
    private final String accountNumber;
    private String name;
    private double balance;
    private ArrayList<Double> transactions;

    public Customer(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        transactions = new ArrayList<>();
    }

    public Customer(String name, double balance) {
        this(name, "Default", balance);
    }

    public Customer(String name) {
        this(name, 0.0);
    }

    public void transact(double amount) {
        if (amount < 0 && (balance > amount)) {
            System.out.println("Amount " + amount + " debited from your account.");
        } else if (amount >= 0) {
            System.out.println("Amount " + amount + " credited to your account.");
        } else { //amount to be debited and balance is not sufficient
            System.out.println("Insufficient balance " + balance + " for a debit of " + amount);
            return;
        }
        balance += amount;
        System.out.println("Available Balance is " + balance);
        transactions.add(amount);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void printTransactions() {
        for (Double transaction : transactions) {
            System.out.println(transaction);
        }
    }

    public String getName() {
        return name;
    }
}
