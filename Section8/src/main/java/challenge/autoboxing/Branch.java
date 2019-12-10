package challenge.autoboxing;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;
    private String location;

    public Branch(String name, String location) {
        this.name = name;
        this.location = location;
        customers = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Branch{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public boolean addCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) != null) {
            System.out.println("Customer " + customerName + " already exist");
            return false;
        }

        Customer customer = new Customer(customerName, initialAmount);
        customers.add(customer);
        System.out.println(customer.toString() +
                " is added to " +
                toString());
        return true;
    }

    public boolean transact(String customerName, double amount) {
        Customer customer = findCustomer(customerName);
        if (customer == null) {
            System.out.println("Customer " + customerName + " not found");
            return false;
        } else {
            customer.transact(amount);
            return true;
        }
    }

    public Customer findCustomer(Customer customer) {
        return findCustomer(customer.getName());
    }

    public Customer findCustomer(String customerName) {
        for (Customer customer : customers) {
            if (customerName.equals(customer.getName())) {
                return customer;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void printCustomersList(boolean showTransactions) {
        System.out.println("Customer in " + this.toString());
        for (int i = 0; i < customers.size(); i++) {
            System.out.println((i + 1) + ". " + customers.get(i).toString());
            if (showTransactions) {
                System.out.println("Transactions: " + customers.get(i).getTransactions());
            }
        }
    }
}
