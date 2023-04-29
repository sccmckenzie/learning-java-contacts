package contacts;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public PhoneBook() {

    }

    public int getCount() {
        return contacts.size();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("The record added.");
    }

    public void printCount() {
        System.out.println("The Phone Book has " + contacts.size() + " records.");
    }

    public void listContacts() {
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);

            System.out.println((i + 1) + ". " +
                    contact.getName() + " " +
                    contact.getSurname() + ", " +
                    contact.getNumber());
        }
    }

    public void removeContact(int i) {
        contacts.remove(i - 1);
        System.out.println("The record removed!");
    }

    public void editContact(int i) {
        Contact contact = contacts.get(i - 1);
        System.out.print("Select a field (name, surname, number): ");
        Scanner scanner = new Scanner(System.in);
        String field = scanner.nextLine();
        if (field.equals("name")) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            contact.setName(name);
        } else if (field.equals("surname")) {
            System.out.print("Enter surname: ");
            String surname = scanner.nextLine();
            contact.setSurname(surname);
        } else if (field.equals("number")) {
            System.out.print("Enter number: ");
            String number = scanner.nextLine();
            contact.setNumber(number);
        } else {
            throw new IllegalArgumentException();
        }
        System.out.println("The record updated!");
    }

}
