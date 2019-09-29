package challenge.lecture79;

public class VipCustomer {
    private String name;
    private String emailAddress;
    private long creditLimit;

    public VipCustomer() {
        this("Default","Default",100000);
    }

    public VipCustomer(String name, String emailAddress) {
        this(name,emailAddress,100000);
    }

    public VipCustomer(String name, String emailAddress, long creditLimit) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public long getCreditLimit() {
        return creditLimit;
    }
}
