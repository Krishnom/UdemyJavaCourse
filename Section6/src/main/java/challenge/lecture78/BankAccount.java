package challenge.lecture78;

public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String phoneNumber;
    private String email;
    private final static String DEFAULT = "Default";

    public BankAccount() {
        this(DEFAULT,0.0,DEFAULT,DEFAULT,DEFAULT);
    }

    public BankAccount(String customerName, String phoneNumber, String email) {
        this(DEFAULT,0.0,customerName,phoneNumber,email);
    }

    public BankAccount(String number, double balance, String customerName, String phoneNumber, String email) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String toString(){
        return "Account Info:\n"+
                "Number: "+number +"\n"+
                "Name: "+customerName +"\n"+
                "Email: "+email+"\n"+
                "Phone: "+phoneNumber+"\n"+
                "Balance: "+balance+"\n";
    }
    void deposit(long depositAmount) {
        if (depositAmount < 0) {
            System.out.println("Invalid deposit amount");
            return;
        }

        balance += depositAmount;
        System.out.println("Amount " + depositAmount + " deposited to account");
        printCurrentBalance();
    }

    void printCurrentBalance() {
        System.out.println("Current balance is " + balance);
    }

    public void withdraw(long withdrawAmount) {
        if (withdrawAmount < 0 || withdrawAmount > balance) {
            System.out.println("Invalid withdrawal amount");
            return;
        }

        balance -= withdrawAmount;
        System.out.println("Amount " + withdrawAmount + " debited from you account");
        printCurrentBalance();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}
