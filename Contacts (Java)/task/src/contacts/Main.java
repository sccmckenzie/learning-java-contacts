package contacts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contact contact = new Contact();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the person:");
        contact.setName(scanner.nextLine());
        System.out.println("Enter the surname of the person:");
        contact.setSurname(scanner.nextLine());
        System.out.println("Enter the number:");
        contact.setNumber(scanner.nextLine());

        System.out.println("A record created!");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact(contact);
        System.out.println("A Phone Book with a single record created!");



    }
}
