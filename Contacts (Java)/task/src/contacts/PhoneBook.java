package contacts;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
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
        if (contact instanceof ContactPerson contactPerson) {
            System.out.print("Select a field (name, surname, birth, gender, number): ");
            Scanner scanner = new Scanner(System.in);
            String field = scanner.nextLine();
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
                case "birth" -> {
                    System.out.print("Enter number: ");
                    String birthdate = scanner.nextLine();
                    try {
                        contactPerson.setBirthdate(LocalDate.parse(birthdate));
                    } catch (DateTimeParseException e) {
                        contactPerson.setBirthdate(null);
                        System.out.println("Bad birth date!");
                    }
                }
                case "gender" -> {
                    System.out.print("Enter number: ");
                    String gender = scanner.nextLine();
                    try {
                        contactPerson.setGender(Gender.valueOf(gender.toUpperCase()));
                    } catch (IllegalArgumentException e) {
                        contactPerson.setGender(null);
                        System.out.println("Bad gender!");
                    }
                }
                case "number" -> {
                    System.out.print("Enter number: ");
                    String number = scanner.nextLine();
                    if (Contact.isNumberValid(number)) {
                        contactPerson.setNumber(number);
                    } else {
                        contactPerson.setNumber(null);
                        System.out.println("Wrong number format!");
                    }
                }
                default -> throw new IllegalArgumentException();
            }
        } else if (contact instanceof ContactOrg contactOrg) {
            System.out.print("Select a field (address, number): ");
            Scanner scanner = new Scanner(System.in);
            String field = scanner.nextLine();
            switch (field) {
                case "address" -> {
                    System.out.print("Enter address: ");
                    String address = scanner.nextLine();
                    contactOrg.setAddress(address);
                }
                case "number" -> {
                    System.out.print("Enter number: ");
                    String number = scanner.nextLine();
                    if (Contact.isNumberValid(number)) {
                        contactOrg.setNumber(number);
                    } else {
                        contactOrg.setNumber(null);
                        System.out.println("Wrong number format!");
                    }
                }
                default -> throw new IllegalArgumentException();
            }
        }
        contact.setUpdateTime();
        System.out.println("The record updated!");
    }

}
