package challenge.arraylist;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\tPhone: " + getPhoneNumber();
    }

    public void updateName(String newName) {
        this.name = newName;
    }

    public void updateNumber(String newNumber) {
        this.phoneNumber = newNumber;
    }
}
