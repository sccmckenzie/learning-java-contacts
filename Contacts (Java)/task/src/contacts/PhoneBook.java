package contacts;

import java.util.ArrayList;

public class PhoneBook {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public PhoneBook() {

    }

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("The record added.");
    }

    public void count() {
        System.out.println("The Phone Book has " + contacts.size() + " records.");
    }

}
