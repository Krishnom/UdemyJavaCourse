package challenge.autoboxing;

public class BankMain {
    public static void main(String[] args) {
        Bank sbbj = new Bank("SBBJ");

        //create branches
        sbbj.addBranch("SBBJ Jodhpur 1", "Chopasani");
        sbbj.addBranch("SBBJ Jodhpur 2", "Basani");

        //search for a customer
        Customer customer = sbbj.getCustomer("Kistu Paliwal");
        if (customer != null) {
            System.out.println(customer.toString());
        }

        //create some customers
        sbbj.addCustomer("SBBJ Jodhpur 1", "Kistu Paliwal", 1000.0);
        sbbj.addCustomer("SBBJ Jodhpur 2", "Guddu Paliwal", 1000.0);
        sbbj.addCustomer("SBBJ Jodhpur 2", "Omprakash Paliwal", 1000.0);
        sbbj.addCustomer("SBBJ Jodhpur 2", "Manish Paliwal", 1000.0);

        //Let's try to bluff the bank
        sbbj.addCustomer("SBBJ Jodhpur 1", "Kistu Paliwal", 1000.0);

        sbbj.printCustomerList(true);

        //Lets do some shopping
        sbbj.transact("Kistu Paliwal", -950.45);
        sbbj.transact("Omprakash Paliwal", 1001.0);
        sbbj.transact("Omprakashs Paliwal", 1001.0);

        sbbj.printCustomerList(false);
        sbbj.printCustomerList(true);
    }
}
