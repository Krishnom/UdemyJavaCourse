package challenge.arraylist;

import java.util.ArrayList;

public class Mobile {
    private ArrayList<Contact> contacts = new ArrayList<>();
    private Contact self;

    public Mobile(String name, String phoneNumber) {
        self = new Contact(name, phoneNumber);
    }

    public void addContact(Contact contact) {
        if (findContact(contact.getName()) != null) {
            System.out.println("Contact " + contact.toString() + " already exist");
        } else {
            contacts.add(contact);
            System.out.println("New contact added : " + contact.toString());
        }
    }

    public void modifyContact(String currentName, String newName) {
        Contact contact = findContact(currentName);
        if (contact == null) {
            System.out.println("Contact with name " + currentName + " doesn't exist");
        } else {
            System.out.println("Updating Contact " + contact.toString());
            contact.updateName(newName);
            System.out.println("New contact is " + contact.toString());
        }
    }

    public void removeContact(String name) {
        Contact contact = findContact(name);
        if (contact == null) {
            System.out.println("Contact with name " + name + " doesn't exist");
        } else {
            removeContact(contact);
        }
    }

    private void removeContact(Contact contact) {
        contacts.remove(contact);
    }

    public String getContact(String name) {
        Contact contact = findContact(name);
        if (contact == null) {
            System.out.println("Contact with name " + name + " not found");
            return null;
        } else {
            return contact.toString();
        }
    }

    private Contact findContact(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }

    public void printAllContacts() {
        System.out.println("---------------------------------------");
        System.out.println("My contact list");
        System.out.println(self.toString());
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println(contacts.get(i).toString());
        }
    }
}
