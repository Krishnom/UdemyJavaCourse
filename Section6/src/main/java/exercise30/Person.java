package exercise30;

public class Person {
    private int age;
    private String firstName;
    private String lastName;

    public boolean isTeen() {
        return age < 20 && age > 12;
    }

    public String getFullName() {
        String name;
        if (firstName.isEmpty() && lastName.isEmpty()) {
            name = "";
        } else if (firstName.isEmpty()) {
            name = lastName;
        } else if (lastName.isEmpty()) {
            name = firstName;
        } else {
            name = firstName + " " + lastName;
        }
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}