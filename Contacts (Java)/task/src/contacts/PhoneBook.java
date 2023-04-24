package contacts;

import java.util.ArrayList;

public class PhoneBook {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public PhoneBook() {

    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

}
