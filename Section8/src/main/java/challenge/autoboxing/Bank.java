package challenge.autoboxing;

import java.util.ArrayList;

public class Bank {
    private final String name;
    ArrayList<Branch> branches = new ArrayList<Branch>();

    public Bank(String name) {
        this.name = name;
    }

    public void addBranch(String name, String location) {
        if (findBranch(name) != null) {
            System.out.println("Branch with name " + name + " already exists.");
        } else {
            Branch newBranch = new Branch(name, location);
            branches.add(newBranch);
            System.out.println("Added  " + newBranch.toString() + " to Bank " + this.name);
        }
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.addCustomer(customerName, initialAmount);
            return true;
        } else {
            System.out.println("Branch not found");
            return false;
        }
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            if (branchName.equals(branches.get(i).getName())) {
                return branches.get(i);
            }
        }
        return null;
    }

    public void transact(String customerName, double amount) {
        Customer customer = getCustomer(customerName);
        if (customer != null) {
            customer.transact(amount);
        } else {
            System.out.println("Customer " + customerName + " does not exists.");
            System.out.println("Cannot execute a transaction.");
        }
    }

    public Customer getCustomer(String customerName) {
        for (int i = 0; i < branches.size(); i++) {
            Branch branch = branches.get(i);
            if (branch.findCustomer(customerName) != null) {
                return branch.findCustomer(customerName);
            }
        }
        return null;
    }

    public void printCustomerList(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            System.out.println("Branch " + branchName + " not found");
        } else {
            branch.printCustomersList(showTransactions);
        }
    }

    public void printCustomerList(boolean showTransactions) {
        for (int i = 0; i < branches.size(); i++) {
            branches.get(i).printCustomersList(showTransactions);
        }
    }
}
