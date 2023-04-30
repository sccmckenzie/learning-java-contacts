package contacts;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    private final ArrayList<Contact> contacts = new ArrayList<>();

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
            System.out.println((i + 1) + ". " + contact.getShortDescription());
        }
    }

    public void printContactDescription(int i) {
        contacts.get(i - 1).printLongDescription();
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
        if (contact instanceof ContactPerson contactPerson) {
            switch (field) {
                case "name" -> {
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    contactPerson.setName(name);
                }
                case "surname" -> {
                    System.out.print("Enter surname: ");
                    String surname = scanner.nextLine();
                    contactPerson.setSurname(surname);
                }
                case "number" -> {
                    System.out.print("Enter number: ");
                    String number = scanner.nextLine();
                    contactPerson.setNumber(number);
                }
                default -> throw new IllegalArgumentException();
            }
        }
        contact.setUpdateTime();
        System.out.println("The record updated!");
    }

}
